package sit.int204.devooplab12.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.int204.devooplab12.entites.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
