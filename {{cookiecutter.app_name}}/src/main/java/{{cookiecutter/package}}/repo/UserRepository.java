package {{cookiecutter.package}}.repo;

import {{cookiecutter.package}}.data.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends PagingAndSortingRepository<User, UUID> {
    User findById(@Param("id") String id);
    List<User> findByFirstName(@Param("firstName") String name);
    List<User> findByLastName(@Param("lastName") String name);
}
