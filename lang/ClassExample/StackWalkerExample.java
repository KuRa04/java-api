package lang.ClassExample;

public class StackWalkerExample {
  public static void main(String[] args) {
    StackWalker stackWalker = StackWalker.getInstance();

    stackWalker.forEach(frame -> {
      System.out.println("Class: " + frame.getClassName());
      System.out.println("Method: " + frame.getMethodName());
      System.out.println("Line: " + frame.getLineNumber());
    });
  }
}
