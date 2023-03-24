package Book;

import java.util.ArrayList;
import java.util.List;

public class HomeworkMain {

  // Создайте класс `Book.Book` (книга), в конструктор которого передавайте автора, название книги и
  // количество страниц.
  //
  // Реализуйте интерфейс для сравнения книг: они должны сортироваться по авторам, а если авторы
  // совпадают - по названиям (и там, и там - по алфавиту, "в словарном порядке").
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();

    books.add(new Book("Author B", "Book.Book 3", 250));
    books.add(new Book("BAuthor", "Book.Book 2", 251));
    books.add(new Book("Author 3", "Book.Book 2", 250));

//    Collections.sort(books);
//    System.out.println("По алфавиту:");
//    for (Book.Book b : books) {
//      System.out.println(b);
//    }
    System.out.println("Книги по алфавиту (по названию):");
    books.sort(new TitleComparator());
    for (Book b : books) {
      System.out.println(b);
    }

    System.out.println("Книги по страницам (по убыванию):");
    books.sort(new PagesComparator());
    for (Book b : books) {
      System.out.println(b);
    }

  }
}
