package Book;

import java.util.Comparator;

public class PagesComparator implements Comparator<Book> {

  //компаратор, который позволит сортировать книги по убыванию количества страниц,
  // а при совпадающем объёме - по названиям ("по возрастанию", по алфавиту).
  @Override
  public int compare(Book o1, Book o2) {
    if (o1.getPages() != (o2.getPages())) { // если кол-во страниц не совпадает, то
      return (int) Math.signum(o2.getPages() - o1.getPages());// сравнение книг - то же
      // самое, что
          // сравнение кол-ва страниц
    }
    // сюда попадем, если названия совпали
      return o1.getTitle().compareTo(o2.getTitle()); //сравнение названий
    }

}
