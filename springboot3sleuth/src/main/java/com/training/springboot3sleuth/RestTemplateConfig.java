package com.training.springboot3sleuth;

import java.security.DrbgParameters.Capability;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import brave.Tracing;
import brave.http.HttpTracing;
import brave.spring.web.TracingClientHttpRequestInterceptor;
import io.micrometer.core.instrument.MeterRegistry;

@Configuration
public class RestTemplateConfig {

	
	@Bean
	public HttpTracing create(Tracing tracing) {
	    return HttpTracing
	        .newBuilder(tracing)
	        .build();
	}
	
	@LoadBalanced
	@Bean
	public RestTemplate restTemplate(HttpTracing httpTracing) {
	    return new RestTemplateBuilder()           
	            .interceptors(TracingClientHttpRequestInterceptor.create(httpTracing))
	        .build();
	}

}
