package lang.ClassExample;

import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;

public class ClassLoaderExample {

  public static void main(String[] args) {
    try {
      ClassLoader classLoader = ClassLoaderExample.class.getClassLoader();

      ClassLoader parentClassLoader = classLoader.getParent();
      System.out.println("Parent ClassLoader: " + parentClassLoader);

      ClassLoader bootstrapClassLoader = parentClassLoader.getParent();
      System.out.println("Bootstrap ClassLoader: " + bootstrapClassLoader);

      URL resource = classLoader.getResource("java/lang/String.class");
      System.out.println("Resource: " + resource);

      InputStream resourceAsStream = classLoader.getResourceAsStream("java/lang/String.class");
      System.out.println("Resource As Stream: " + resourceAsStream);

      Enumeration<URL> resources = classLoader.getResources("java/lang");
      while (resources.hasMoreElements()) {
        System.out.println("Resource: " + resources.nextElement());
      }

      Class<?> clazz = classLoader.loadClass("java.lang.String");
      System.out.println("Loaded Class: " + clazz.getName());

      System.out.println("ClassLoader Name: " + classLoader.getName());

      System.out.println("ClassLoader Path: " + System.getProperty("java.class.path"));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}