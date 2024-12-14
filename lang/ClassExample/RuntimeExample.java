package lang.ClassExample;

public class RuntimeExample {
  public static void main(String[] args) {
    Runtime runtime = Runtime.getRuntime();

    long maxMemory = runtime.maxMemory();
    long totalMemory = runtime.totalMemory();
    long freeMemory = runtime.freeMemory();

    System.out.println("Max Memory: " + maxMemory / 1024 / 1024 + " MB");
    System.out.println("Total Memory: " + totalMemory / 1024 / 1024 + " MB");
    System.out.println("Free Memory: " + freeMemory / 1024 / 1024 + " MB");

    try {
      System.out.println("Exiting the program...");
      runtime.exit(0);
    } catch (SecurityException e) {
      System.out.println("Exit operation was blocked.");
    }
  }
}
