package com.hub.profile.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

@Configuration
public class AmazonConfig {

	@Bean
	public AmazonS3 awsS3() {
		AWSCredentials awsCredentials = new BasicAWSCredentials("AKIATQOZ344RBO3Z37PJ", "XliiLM/TutCz0TgY9nU/nQ53luQOTuSBuQUlvUeu");
		return AmazonS3ClientBuilder
				.standard()
				.withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
				.withRegion(Regions.AP_SOUTH_1)
				.build();
	}
	
}
