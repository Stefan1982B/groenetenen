package be.vdab.groeneten.web;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import be.vdab.groeneten.services.WerknemerService;

@Controller
@RequestMapping("werknemers")
class WerknemerController {

	private final WerknemerService service;
	private static final String WERKNEMRS_VIEW = "werknemers/werknemers";

	WerknemerController(WerknemerService service) {
		this.service = service;
	}

	@GetMapping
	ModelAndView lijst(Pageable pageable) {
		return new ModelAndView(WERKNEMRS_VIEW, "page", service.findAll(pageable));
	}
}
