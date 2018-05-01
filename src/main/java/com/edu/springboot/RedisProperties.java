package com.edu.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="redis")
public class RedisProperties {
 public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}

public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}

private String host;
 private int port;
 
}
