package lectures;

import beans.Person;
import java.util.List;
import java.util.stream.IntStream;
import mockdata.MockData;
import org.junit.Test;
import org.omg.CORBA.IDLTypeOperations;

public class Lecture2 {

  @Test
  public void range() throws Exception {
    for (int i = 0; i < 10 ; i++) {
      System.out.print(i);
    }

    System.out.println("=============================");

    IntStream.range(0,10).forEach(System.out::print);
    System.out.println("=============================");
    IntStream.rangeClosed(0,10).forEach(System.out::print);
  }

  @Test
  public void rangeIteratingLists() throws Exception {
    List<Person> people = MockData.getPeople();
    /*
    IntStream.range(0,people.size())
            .forEach(i -> {
              Person p = people.get(i);
              System.out.println(p);
            });

     */

    people.stream().limit(5).forEach(System.out::println);


  }

  @Test
  public void intStreamIterate() throws Exception {
      IntStream.iterate(0, operand -> operand + 1)
          .filter(number -> number % 2 == 0)
          .limit(20)
          .forEach(System.out::println);
  }
}
