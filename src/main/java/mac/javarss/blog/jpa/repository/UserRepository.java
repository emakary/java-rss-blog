package mac.javarss.blog.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mac.javarss.blog.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
