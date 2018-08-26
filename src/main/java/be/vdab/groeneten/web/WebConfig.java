package be.vdab.groeneten.web;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

@Configuration
public class WebConfig {
	@Bean
	FixedLocaleResolver localeResolver() {
		return new FixedLocaleResolver(new Locale("fr", "BE"));
	}
}
