package lang.ClassExample;

public class SystemExample {
  public static void main(String[] args) {
    long currentTime = System.currentTimeMillis();
    System.out.println("Current Time in Milliseconds: " + currentTime);

    long startTime = System.nanoTime();
    System.out.println("Start Time (nanoseconds): " + startTime);

    int[] src = { 1, 2, 3, 4, 5 };
    int[] dest = new int[5];
    System.arraycopy(src, 0, dest, 0, src.length);
    System.out.print("Array copied: ");
    for (int num : dest) {
      System.out.print(num + " ");
    }
    System.out.println();

    String javaVersion = System.getProperty("java.version");
    System.out.println("Java Version: " + javaVersion);

    System.setProperty("my.custom.property", "HelloWorld");
    System.out.println("Custom Property: " + System.getProperty("my.custom.property"));

    String path = System.getenv("PATH");
    System.out.println("PATH Environment Variable: " + path);


    System.gc();
    System.out.println("Garbage Collection Requested");

    String exampleString = "Test String";
    int hashCode = System.identityHashCode(exampleString);
    System.out.println("Identity Hash Code of 'Test String': " + hashCode);

    long endTime = System.nanoTime();
    System.out.println("End Time (nanoseconds): " + endTime);
    long duration = endTime - startTime;
    System.out.println("Time taken (nanoseconds): " + duration);

    String lineSeparator = System.lineSeparator();
    System.out.println("Line Separator: [" + lineSeparator + "]");
  }
}
