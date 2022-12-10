package ie.atu.microservices.Repo;

import ie.atu.microservices.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User, Integer> {
    public User findbyId(int Id);
}
