package br.com.tessaro.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("limits2-service")
public class Configuration {
	private int minimum;
	private int maximum;
}
