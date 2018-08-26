package be.vdab.groeneten.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import be.vdab.groeneten.entities.Filiaal;
import be.vdab.groeneten.repositories.FiliaalRepository;

@Service
@Transactional(readOnly = true, isolation = Isolation.READ_COMMITTED)
class DefaultFiliaalService implements FiliaalService {
	private final FiliaalRepository filiaalRepository;

	DefaultFiliaalService(FiliaalRepository filiaalRepository) {
		this.filiaalRepository = filiaalRepository;
	}

	@Override
	public List<Filiaal> findByPostcode(int van, int tot) {
		return filiaalRepository.findByAdresPostcodeBetweenOrderByAdresPostcode(van, tot);
	}
}
