package be.vdab.groeneten.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import be.vdab.groeneten.entities.Werknemer;

public interface WerknemerService {
	Page<Werknemer> findAll(Pageable pageable); 
}
