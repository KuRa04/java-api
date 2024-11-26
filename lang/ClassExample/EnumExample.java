package lang.ClassExample;

import java.util.Collection;
import java.util.List;

public class EnumExample {

  public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
  }

  public static void main(String[] args) {
    Day day = Day.MONDAY;

    System.out.println("Name: " + day.name());

    System.out.println("Ordinal: " + day.ordinal());

    Day anotherDay = Day.FRIDAY;
    System.out.println("CompareTo: " + day.compareTo(anotherDay));

    System.out.println("ToString: " + day.toString());

    System.out.println("Declaring Class: " + day.getDeclaringClass());

    Collection<Day> daysCollection = List.of(Day.values());
    daysCollection.forEach(d -> System.out.println("Day: " + d));

    Day parsedDay = Day.valueOf("WEDNESDAY");
    System.out.println("Parsed Day: " + parsedDay);

    System.out.println("Enum.valueOf(Day.class, \"SUNDAY\"): " + Enum.valueOf(Day.class, "SUNDAY"));

    System.out.println("Enum Type: " + day.getClass().getSuperclass());
  }
}