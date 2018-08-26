package be.vdab.groeneten.repositories;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import be.vdab.groeneten.entities.Werknemer;

public interface WerknemerRepository extends JpaRepository<Werknemer, Long> {
//	@Override
//	@EntityGraph(Werknemer.MET_FILIAAL)
//	List<Werknemer> findAll(Sort sort);

	@Override
	@EntityGraph(Werknemer.MET_FILIAAL)
	Page<Werknemer> findAll(Pageable pageable);
}
