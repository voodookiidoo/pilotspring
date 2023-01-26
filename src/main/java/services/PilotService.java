package services;

import model.Pilot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repositories.PilotRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class PilotService {

	private final PilotRepository pilotRepository;

	@Autowired
	public PilotService(PilotRepository PilotRepository) {
		this.pilotRepository = PilotRepository;
	}

	public List<Pilot> findAll() {
		return pilotRepository.findAll();
	}

	@Transactional
	public void save(Pilot Pilot) {
		pilotRepository.save(Pilot);
	}

	@Transactional
	public void delete(int id) {
		pilotRepository.deleteById(id);
	}

	@Transactional
	public Object findOne(int id) {
		return null;
	}
}
