package com.alaa.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.alaa.jpa.models.Author;
import com.alaa.jpa.models.Video;
import com.alaa.jpa.repositories.AuthorRepository;
import com.alaa.jpa.repositories.VideoRepository;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	// @Bean
	public CommandLineRunner commandLineRunner(
		AuthorRepository authorRepository,
		VideoRepository videoRepository
		) {
		return args -> {
			// var author = Author.builder()
			// .firstname("alaa")
			// .lastname("ali")
			// .age(30)
			// .email("alaa@gmlmlfsmls.com")
			// .build();
			// authorRepository.save(author);

			var video = Video.builder()
			.name("Alaa")
			.length(5)
			.build();
			videoRepository.save(video);
		};
	}
}
