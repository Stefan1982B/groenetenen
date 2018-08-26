package be.vdab.groeneten.services;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import be.vdab.groeneten.entities.Offerte;
import be.vdab.groeneten.repositories.OfferteRepository;

@Service
@Transactional(readOnly = true, isolation = Isolation.READ_COMMITTED)
class DefaultOfferteService implements OfferteService {
	private final OfferteRepository offerteRepository;

	DefaultOfferteService(OfferteRepository offerteRepository) {
		this.offerteRepository = offerteRepository;
	}

	@Override
	public Optional<Offerte> read(long id) {
		return offerteRepository.findById(id);
	}

	@Override
	@Transactional(readOnly = false, isolation = Isolation.READ_COMMITTED)
	public void create(Offerte offerte) {
		offerteRepository.save(offerte);
		
	}
	
}
