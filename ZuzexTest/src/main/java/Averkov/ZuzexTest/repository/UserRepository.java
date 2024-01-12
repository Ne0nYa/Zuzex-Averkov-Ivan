package Averkov.ZuzexTest.repository;

import Averkov.ZuzexTest.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    boolean existsByUsername(String userName);
}