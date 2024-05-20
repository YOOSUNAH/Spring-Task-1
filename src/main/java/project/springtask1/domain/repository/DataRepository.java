package project.springtask1.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.springtask1.domain.entity.Data;

public interface DataRepository extends JpaRepository<Data, Long> {

}
