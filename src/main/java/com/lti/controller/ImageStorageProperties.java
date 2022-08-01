package com.lti.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "file")
public class ImageStorageProperties {

	 private String uploadDir;

	    public String getUploadDir() {
	        return uploadDir;
	    }

	    public void setUploadDir(String uploadDir) {
	        this.uploadDir = uploadDir;
	    }
	
}
