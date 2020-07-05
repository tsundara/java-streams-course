package lectures;


import static org.assertj.core.api.Assertions.assertThat;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.junit.Test;

public class Lecture4 {

  @Test
  public void distinct() throws Exception {
    final List<Integer> numbers = ImmutableList.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);
    List<Integer> distinctnumbers = numbers.stream().distinct().collect(Collectors.toList());

    System.out.println(distinctnumbers);

  }

  @Test
  public void distinctWithSet() throws Exception {
    final List<Integer> numbers = ImmutableList.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);

    //Just set data structure
    Set<Integer> dnums = numbers.stream().collect(Collectors.toSet());
    System.out.println(dnums);

    //Convert set data strucutre to list
    List<Integer> newList = new ArrayList<Integer>();
    newList.addAll(dnums);
    System.out.println(newList);


  }
}
