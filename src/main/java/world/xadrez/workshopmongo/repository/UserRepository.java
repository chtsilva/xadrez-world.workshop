package world.xadrez.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import world.xadrez.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
