package Book;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {

  //компаратор, который позволит сортировать книги по названию,
  // при одинаковых названиях - по автору (и там, и там - по алфавиту)

  @Override
  public int compare(Book o1, Book o2) {
    if (!o1.getTitle().equals(o2.getTitle())) { // если названия не совпадают, то
      return o1.getTitle().compareTo(o2.getTitle()); // сравнение книг - то же самое, что сравнение
      // названий
    }
    // сюда мы попадаем, только если названия совпали
    return o1.getAuthor().compareTo(o2.getAuthor()); // сравнение книг - то же самое, что
    // сравнение авторов
  }
}
