package mac.javarss.blog.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mac.javarss.blog.jpa.entity.Blog;
import mac.javarss.blog.jpa.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

	List<Blog> findByUser(User user);

}
