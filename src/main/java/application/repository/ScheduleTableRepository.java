package application.repository;

import application.model.ScheduleTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ScheduleTableRepository extends CrudRepository<ScheduleTable, Long> {

    Optional<ScheduleTable> findById(Long id);
}
