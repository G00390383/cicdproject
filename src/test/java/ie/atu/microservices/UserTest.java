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
        User Shan = new User(1,"Shannon",12345678L,370,"shannongf74@gmail.com",40L);
        assertEquals("Shannon",Shan.getName());
    }

    @Test
    void testName_fail(){
        Exception e_message = assertThrows(IllegalArgumentException.class, () -> Joe = new User(2,"JT", 12345678L, 700, "shannongf74@gmail.com",20L));
        assertEquals("Name must be 3 characters or longer",e_message.getMessage());
    }

    @Test
    void testPpsn_success() {
        User Shan = new User(3,"Shannon",12345678L,370,"shannongf74@gmail.com",23L);
        assertEquals(12345678L,Shan.getPpsnNo());
    }

    @Test
    void testPpsn_fail() {
        Exception e_message = assertThrows(IllegalArgumentException.class, () -> Joe = new User(4,"Joe", 12348L, 700, "shannongf74@gmail.com",24981L));
        assertEquals("PPSN number must be 8 or 9 characters long",e_message.getMessage());
    }

    @Test
    void testCreditscr_success()
    {
        User Shan = new User(5,"Shannon",12345678L,370,"shannongf74@gmail.com",3498L);
        assertEquals(370,Shan.getCreditScore());
    }

    @Test
    void testCreditscr_fail()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class,() -> Joe = new User(6,"Joe",12345678L,900,"shannongf74@gmail.com",312L));
        assertEquals("Credit score can only be between 300 and 850",e_message.getMessage());
    }

    @Test
    void testEmail_success()
    {
        User Shan = new User(7,"Shannon",12345678L,370,"shannongf74@gmail.com",48230L);
        assertEquals("shannongf74@gmail.com",Shan.getEmailId());
    }

    @Test
    void testEmail_fail()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class,() -> Joe = new User(8,"Joe",12345678L,400,"shannongf74@yahoo.com",124341L));
        assertEquals("Only gmail and atu emails accepted",e_message.getMessage());
    }

    @Test
    void testId_success()
    {
        User Shan = new User(9,"Shannon",12345678L,370,"shannongf74@gmail.com",431L);
        assertEquals(9,Shan.getId());
    }

    @AfterAll
    static void afterAll() {

    }
}