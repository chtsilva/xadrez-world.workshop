package world.xadrez.workshopmongo.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import world.xadrez.workshopmongo.domain.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResouces {

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAll(){
        User maria = new User("1", "Maria Brown", "maria@email.com");
        User alex = new User("2", "Alex Green", "alex@email.com");
        return new ArrayList<>(Arrays.asList(maria, alex));
    };
}
