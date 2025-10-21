package com.alaa.jpa;

// import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.Bean;

// import com.alaa.jpa.models.Author;
// import com.alaa.jpa.repositories.AuthorRepository;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	// @Bean
	// public CommandLineRunner commandLineRunner(AuthorRepository authorRepository) {
	// 	return args -> {
	// 		var author = Author.builder()
	// 		.firstname("alaa")
	// 		.lastname("ali")
	// 		.age(30)
	// 		.email("alaa@gmlmlfsmls.com")
	// 		.build();
	// 		authorRepository.save(author);
	// 	};
	// }
}
