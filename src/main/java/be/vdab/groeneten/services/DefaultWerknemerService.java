package be.vdab.groeneten.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import be.vdab.groeneten.entities.Werknemer;
import be.vdab.groeneten.repositories.WerknemerRepository;

@Service
@Transactional(readOnly = true, isolation = Isolation.READ_COMMITTED)
public class DefaultWerknemerService implements WerknemerService {

	private final WerknemerRepository repository;

	DefaultWerknemerService(WerknemerRepository repository) {
		this.repository = repository;
	}

	@Override
	public Page<Werknemer> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}
}
