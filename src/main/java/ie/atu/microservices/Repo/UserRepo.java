package ie.atu.microservices.Repo;

import ie.atu.microservices.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepo extends MongoRepository<User, Integer> {
    @Override
    Optional<User> findById(Integer integer);
}
