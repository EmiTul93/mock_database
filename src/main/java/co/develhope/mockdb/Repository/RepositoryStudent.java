package co.develhope.mockdb.Repository;

import co.develhope.mockdb.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryStudent extends JpaRepository <Student, Long> {

}
