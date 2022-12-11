package ie.atu.microservices.Controller;

import ie.atu.microservices.Exceptions.UserNotFoundException;
import ie.atu.microservices.Model.User;
import ie.atu.microservices.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepo repo;

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user)
    {
        if(repo.existsById(user.getId()))
        {
            throw new IllegalStateException("User Id taken!");
        }
        else {
            repo.save(user);
        }
        return "Added Successfully";
    }

    @GetMapping("/allUsers")
    public List<User> getUsers()
    {
        return repo.findAll();
    }

    @GetMapping("/findUser/{id}")
    public Optional<User> getUser(@PathVariable(value = "id") int id) throws UserNotFoundException
    {
        Optional<User> user;
        if(repo.existsById(id))
        {
           user = repo.findById(id);
        }
        else {
            throw new UserNotFoundException(id);
        }
        return user;
    }

    @PutMapping("findUser/{id}")
    public ResponseEntity<User> updateUserPpsn(@PathVariable(value = "id") int id, @RequestBody Long ppsn)
            throws UserNotFoundException
    {
        User user = repo.findById(id)
                .orElseThrow(()-> new UserNotFoundException(id));
        user.setPpsnNo(ppsn);
        final User updatedUser = repo.save(user);
        return ResponseEntity.ok(updatedUser);
    }

    @PutMapping("findUser/{id}")
    public ResponseEntity<User> updateUserCreditScore(@PathVariable(value = "id") int id, @RequestBody int creditScore)
            throws UserNotFoundException
    {
        User user = repo.findById(id)
                .orElseThrow(()-> new UserNotFoundException(id));
        user.setCreditScore(creditScore);
        final User updatedUser = repo.save(user);
        return ResponseEntity.ok(updatedUser);
    }

    @PutMapping("findUser/{id}")
    public ResponseEntity<User> updateUserName(@PathVariable(value = "id") int id, @RequestBody String name)
            throws UserNotFoundException
    {
        User user = repo.findById(id)
                .orElseThrow(()-> new UserNotFoundException(id));
        user.setName(name);
        final User updatedUser = repo.save(user);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id)
    {
        String response;
        if(repo.existsById(id))
        {
            repo.deleteById(id);
            response = "User deleted successfully";
        }
        else
        {
            response = "Failed to delete user";
            throw new UserNotFoundException(id);
        }
        return response;
    }
}
