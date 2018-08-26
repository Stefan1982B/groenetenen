package be.vdab.groeneten.services;

import java.util.List;

import org.springframework.stereotype.Service;

import be.vdab.groeneten.entities.Filiaal;

public interface FiliaalService {
	List<Filiaal> findByPostcode(int van, int tot); 
}
