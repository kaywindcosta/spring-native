package com.kaywin;

import com.kaywin.model.Book;
import com.kaywin.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringNativeApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(SpringNativeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("StartApplication...");

		bookService.saveBook(new Book("Java"));
		bookService.saveBook(new Book("Node"));
		bookService.saveBook(new Book("Node"));
		bookService.saveBook(new Book("Python"));
		bookService.saveBook(new Book("Go"));
		bookService.saveBook(new Book("C"));
		bookService.saveBook(new Book("C++"));
		bookService.saveBook(new Book("Node"));
		bookService.saveBook(new Book(".Net"));
		bookService.saveBook(new Book("JavaScript"));
		bookService.saveBook(new Book("Perl"));
		bookService.saveBook(new Book("Ruby"));
		bookService.saveBook(new Book("Elixir"));
		bookService.saveBook(new Book("Erlang"));
		bookService.saveBook(new Book("Haskell"));
		bookService.saveBook(new Book("Haxe"));
		bookService.saveBook(new Book("Rust"));
		bookService.saveBook(new Book("Lua"));
		bookService.saveBook(new Book("Scala"));
		bookService.saveBook(new Book("D"));
		bookService.saveBook(new Book("Clojure"));
		bookService.saveBook(new Book("Objective-C"));
		bookService.saveBook(new Book("Swift"));
		bookService.saveBook(new Book("kdb+/Q"));
		bookService.saveBook(new Book("Delphi"));
		bookService.saveBook(new Book("PHP"));
		bookService.saveBook(new Book("Crystal"));
		bookService.saveBook(new Book("1C"));
		bookService.saveBook(new Book("PostgreSQL"));
		bookService.saveBook(new Book("Ada"));
		bookService.saveBook(new Book("Kotlin"));
		bookService.saveBook(new Book("OCaml"));
		bookService.saveBook(new Book("CFML"));
		bookService.saveBook(new Book("PowerShell"));
		bookService.saveBook(new Book("Deno"));
		bookService.saveBook(new Book("MySQl"));
		bookService.saveBook(new Book("Oracle"));
		bookService.saveBook(new Book("Kubernetes"));
		bookService.saveBook(new Book("Docker"));
		bookService.saveBook(new Book("Angular JS"));
		bookService.saveBook(new Book("Spring Boot"));
		bookService.saveBook(new Book("Spring"));
		bookService.saveBook(new Book("AOP"));
		bookService.saveBook(new Book("OOPS"));
		bookService.saveBook(new Book("Algorithm"));



		log.info("\nfindAll()");


		bookService.findAllBooks().forEach(x -> System.out.println(x));

		log.info("\nfindById(1L)");
		bookService.findById1(1l).ifPresent(x -> System.out.println(x));

		System.out.println("\nfindByName('Node')");
		bookService.findByName("Node").forEach(x -> System.out.println(x));
	}
}
