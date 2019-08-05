package com.ulta.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MessageResource {
	
	@Value("${no.data}")
	private String message;
	
	@Value("${error.code}")
	private String errorCode;
	
	@GetMapping("/message")
	public String message(){
		
		return new StringBuilder().
					append(message).
					toString();
	}

}
