package lang.ClassExample;

public class InheritableThreadLocalExample {

  private static final InheritableThreadLocal<String> inheritableThreadLocal = new InheritableThreadLocal<>() {
    @Override
    protected String initialValue() {
      return "Initial Value";
    }

    @Override
    protected String childValue(String parentValue) {
      return parentValue + " (Inherited)";
    }
  };

  public static void main(String[] args) {
    inheritableThreadLocal.set("Parent Value");

    System.out.println("Parent Thread Value: " + inheritableThreadLocal.get());

    Thread childThread = new Thread(() -> {
      System.out.println("Child Thread Value: " + inheritableThreadLocal.get());

      inheritableThreadLocal.set("Child Value");

      System.out.println("Child Thread New Value: " + inheritableThreadLocal.get());

      inheritableThreadLocal.remove();
      System.out.println("Child Thread Value after remove: " + inheritableThreadLocal.get());
    });

    childThread.start();

    try {
      childThread.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Parent Thread Value after child thread: " + inheritableThreadLocal.get());

    inheritableThreadLocal.remove();
    System.out.println("Parent Thread Value after remove: " + inheritableThreadLocal.get());
  }
}