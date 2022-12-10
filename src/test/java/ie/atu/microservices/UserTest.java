package ie.atu.microservices;

import ie.atu.microservices.Model.User;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User Joe;

    @BeforeEach
    void setUp() {

    }

    @Test
    void testName_success() {
        User Shan = new User("Shannon",12345678L,370,"shannongf74@gmail.com");
        assertEquals("Shannon",Shan.getName());
    }

    @Test
    void testName_fail(){
        Exception e_message = assertThrows(IllegalArgumentException.class, () -> Joe = new User("JT", 12345678L, 700, "shannongf74@gmail.com"));
        assertEquals("Name must be 3 characters or longer",e_message.getMessage());
    }

    @Test
    void testPpsn_success() {
        User Shan = new User("Shannon",12345678L,370,"shannongf74@gmail.com");
        assertEquals(12345678L,Shan.getPpsnNo());
    }

    @Test
    void testPpsn_fail() {
        Exception e_message = assertThrows(IllegalArgumentException.class, () -> Joe = new User("Joe", 12348L, 700, "shannongf74@gmail.com"));
        assertEquals("PPSN number must be 8 or 9 characters long",e_message.getMessage());
    }

    @Test
    void testCreditscr_success()
    {
        User Shan = new User("Shannon",12345678L,370,"shannongf74@gmail.com");
        assertEquals(370,Shan.getCreditScore());
    }

    @Test
    void testCreditscr_fail()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class,() -> Joe = new User("Joe",12345678L,900,"shannongf74@gmail.com"));
        assertEquals("Credit score can only be between 300 and 850",e_message.getMessage());

    }
    @AfterAll
    static void afterAll() {

    }
}