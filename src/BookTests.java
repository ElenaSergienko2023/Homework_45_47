import Book.Book;
import Book.PagesComparator;
import Book.TitleComparator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class BookTests {

  @Test
  public void BookWithNegativePages() {
//    boolean exceptionThrown = false;
//    try {
//      Book b = new Book("", "", -5);
//    } catch (IllegalArgumentException e) {
//      exceptionThrown = true;
//    }
//    assertTrue(exceptionThrown);
    assertThrowsExactly(IllegalArgumentException.class, () -> new Book("", "", -5));
  }

  @Test
  public void BookPagesTitlesComparator() {
    // arrange - упорядочить, установить
    Book book1 = new Book("Book", "A", 5);
    Book book2 = new Book("Book", "B", 5);
    Book book3 = new Book("Book", "B", 25);

    List<Book> actual = new ArrayList<>();
    actual.add(book3);
    actual.add(book1);
    actual.add(book2);

    List<Book> expected = new ArrayList<>();
    expected.add(book3);
    expected.add(book1);
    expected.add(book2);

    // act - выполнить действие
    actual.sort(new PagesComparator());

    // assert - сравнить результат с правильным
    assertEquals(expected, actual);
  }

  @Test
  public void BookTitleAuthorComparator() {

    Book book1 = new Book("Book", "A", 5);
    Book book2 = new Book("Cook", "B", 5);
    Book book3 = new Book("Took", "B", 25);

    List<Book> actual = new ArrayList<>();
    actual.add(book3);
    actual.add(book1);
    actual.add(book2);

    List<Book> expected = new ArrayList<>();
    expected.add(book1);
    expected.add(book2);
    expected.add(book3);

    actual.sort(new TitleComparator());

    assertEquals(expected, actual);

  }




}
