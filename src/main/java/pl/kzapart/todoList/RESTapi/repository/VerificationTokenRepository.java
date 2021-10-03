package pl.kzapart.todoList.RESTapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kzapart.todoList.RESTapi.model.VerificationToken;

@Repository
public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {
}
