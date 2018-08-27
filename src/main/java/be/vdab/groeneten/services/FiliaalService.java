package be.vdab.groeneten.services;

import java.util.List;

import org.springframework.stereotype.Service;

import be.vdab.groeneten.entities.Filiaal;

public interface FiliaalService {
	List<Filiaal> findByPostcode(int van, int tot); 
	void delete(long id);
	void create(Filiaal filiaal);
	void update(Filiaal filiaal);
}
