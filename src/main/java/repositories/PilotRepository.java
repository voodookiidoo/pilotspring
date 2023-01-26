package repositories;


import model.Pilot;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository
public interface PilotRepository extends JpaRepository<Pilot, Integer> {

	Pilot save(Pilot pilot);

	void deleteById(int id);

}
