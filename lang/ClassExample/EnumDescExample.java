package lang.ClassExample;

import java.lang.Enum.EnumDesc;

public class EnumDescExample {

  public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
  }

  public static void main(String[] args) {
    Day day = Day.MONDAY;

    EnumDesc<Day> enumDesc = day.describeConstable().orElseThrow();

    System.out.println("Name: " + enumDesc.constantName());
  }
}