package com.ecom.store.config;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

@Component
public class AuditorAwareConfig implements AuditorAware<String> {

	public Optional<String> getCurrentAuditor() {
		return Optional.of("Anonymous User");
	}
}
