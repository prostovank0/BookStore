package com.example.BookStoree;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookStoreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreeApplication.class, args);
	}


	@Bean
	public CommandLineRunner runner(BooksRepository booksRepository){
		return args -> {
			Books book1 = new Books("Pod Igoto", "Ivan Vazov" , 5 , 10);
			Books book2 = new Books("Yan Bibian", "Elin Pelin", 10 , 15);
			Books book3 = new Books("Pijo Penda", "Elin Pelin", 10,20);
			booksRepository.save(book1);
			booksRepository.save(book2);
			booksRepository.save(book3);

			booksRepository.findById(1L).orElseThrow();
		};
	}

}