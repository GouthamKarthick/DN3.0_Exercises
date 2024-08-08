package Week_2_Exercises.Spring_Maven.LibraryManagement.src.main.java.com.library.repository;

import Week_2_Exercises.Spring_Maven.LibraryManagement.com.library.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
