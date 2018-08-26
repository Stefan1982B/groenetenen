package be.vdab.groeneten.services;

import java.util.Optional;

import be.vdab.groeneten.entities.Offerte;

public interface OfferteService {
	Optional<Offerte> read(long id);
	void create(Offerte offerte);
}
