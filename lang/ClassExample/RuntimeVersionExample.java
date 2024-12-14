package lang.ClassExample;

public class RuntimeVersionExample {
  public static void main(String[] args) {
    Runtime.Version version = Runtime.version();

    System.out.println("Major Version: " + version.patch());
    System.out.println("Minor Version: " + version.update());
    System.out.println("Security Version: " + version.pre());
    System.out.println("Build Version: " + version.build());
  }
}
