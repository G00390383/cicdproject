package ie.atu.microservices.Repo;

import ie.atu.microservices.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends MongoRepository<User, Integer> {

    Optional<User> findById(int id);
}
