package com.mongo.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootApplication(scanBasePackages="api")
@EnableMongoRepositories(basePackages ="api")
public class MongoApplication implements CommandLineRunner {
	@Autowired
	private MongoTemplate mongoTemplate; 
	
	public static void main(String[] args) {
		SpringApplication.run(MongoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.print("kousik"+mongoTemplate.getCollectionNames());
		// TODO Auto-generated method stub
		
	}

}
