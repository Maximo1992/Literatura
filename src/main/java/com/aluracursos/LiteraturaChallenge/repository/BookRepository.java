package com.aluracursos.LiteraturaChallenge.repository;

import com.aluracursos.LiteraturaChallenge.model.Book;
import com.aluracursos.LiteraturaChallenge.model.LanguagesOptions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByTitleContainsIgnoreCase(String bookName);


    List<Book> findByLanguage(LanguagesOptions language);

    Book findByTitle(String title);


}
