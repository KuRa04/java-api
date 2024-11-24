package lang.ClassExample;

public class ClassValueExample {

  // ClassValueのサブクラスを定義
  private static final ClassValue<String> classValue = new ClassValue<>() {
    @Override
    protected String computeValue(Class<?> type) {
      return "Class name: " + type.getName();
    }
  };

  public static void main(String[] args) {
    String value1 = classValue.get(String.class);
    String value2 = classValue.get(Integer.class);

    System.out.println("Value for String.class: " + value1);
    System.out.println("Value for Integer.class: " + value2);

    classValue.remove(String.class);

    String value3 = classValue.get(String.class);
    System.out.println("Value for String.class after removal: " + value3);
  }
}