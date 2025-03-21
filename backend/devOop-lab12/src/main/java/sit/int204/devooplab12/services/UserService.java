package sit.int204.devooplab12.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sit.int204.devooplab12.entites.User;
import sit.int204.devooplab12.repositories.UserRepository;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAllUser() {
        return repository.findAll();
    }
}
