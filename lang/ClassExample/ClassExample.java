package lang.ClassExample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ClassExample {
  public static void main(String[] args) {
    try {
      Class<?> clazz = Class.forName("java.lang.String");

      System.out.println("Class Name: " + clazz.getName());
      System.out.println("Simple Name: " + clazz.getSimpleName());
      System.out.println("Canonical Name: " + clazz.getCanonicalName());
      System.out.println("Type Name: " + clazz.getTypeName());

      System.out.println("Package: " + clazz.getPackage());

      int modifiers = clazz.getModifiers();
      System.out.println("Modifiers: " + Modifier.toString(modifiers));

      System.out.println("Superclass: " + clazz.getSuperclass());

      Class<?>[] interfaces = clazz.getInterfaces();
      System.out.println("Interfaces: " + Arrays.toString(interfaces));

      Constructor<?>[] constructors = clazz.getConstructors();
      System.out.println("Constructors: " + Arrays.toString(constructors));

      Method[] methods = clazz.getMethods();
      System.out.println("Methods: " + Arrays.toString(methods));

      Field[] fields = clazz.getFields();
      System.out.println("Fields: " + Arrays.toString(fields));

      String str = (String) clazz.getDeclaredConstructor(String.class).newInstance("Hello, World!");
      System.out.println("Instance: " + str);

      Method method = clazz.getMethod("toUpperCase");
      String result = (String) method.invoke(str);
      System.out.println("Result of toUpperCase: " + result);

      Class<?> arrayClass = Class.forName("[Ljava.lang.String;");
      System.out.println("Array Class: " + arrayClass.getName());

      System.out.println("Is Array: " + clazz.isArray());
      System.out.println("Is Primitive: " + clazz.isPrimitive());
      System.out.println("Is Interface: " + clazz.isInterface());
      System.out.println("Is Enum: " + clazz.isEnum());
      System.out.println("Is Annotation: " + clazz.isAnnotation());
      System.out.println("Is Synthetic: " + clazz.isSynthetic());

      System.out.println("Class Loader: " + clazz.getClassLoader());

      System.out.println("Annotations: " + Arrays.toString(clazz.getAnnotations()));

      Method[] declaredMethods = clazz.getDeclaredMethods();
      System.out.println("Declared Methods: " + Arrays.toString(declaredMethods));

      Field[] declaredFields = clazz.getDeclaredFields();
      System.out.println("Declared Fields: " + Arrays.toString(declaredFields));

      Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
      System.out.println("Declared Constructors: " + Arrays.toString(declaredConstructors));

      System.out.println("Declared Annotations: " + Arrays.toString(clazz.getDeclaredAnnotations()));

      Object newInstance = clazz.getDeclaredConstructor().newInstance();
      System.out.println("New Instance: " + newInstance);

      System.out.println("Component Type: " + clazz.getComponentType());

      System.out.println("Protection Domain: " + clazz.getProtectionDomain());

      System.out.println("Protection Domain: " + clazz.getProtectionDomain());

      System.out.println("Signers: " + Arrays.toString(clazz.getSigners()));

      System.out.println("Is Instance: " + clazz.isInstance(new String("Test")));

      System.out.println("Desired Assertion Status: " + clazz.desiredAssertionStatus());

      System.out.println("Enclosing Class: " + clazz.getEnclosingClass());

      System.out.println("Enclosing Constructor: " + clazz.getEnclosingConstructor());

      System.out.println("Enclosing Method: " + clazz.getEnclosingMethod());

      Class<?>[] declaredClasses = clazz.getDeclaredClasses();
      System.out.println("Declared Classes: " + Arrays.toString(declaredClasses));

      System.out.println("Resource: " + clazz.getResource("String.class"));

      System.out.println("Resource As Stream: " + clazz.getResourceAsStream("String.class"));

      System.out.println("Module: " + clazz.getModule());

      System.out.println("Protection Domain: " + clazz.getProtectionDomain());

      System.out.println("Is Instance: " + clazz.isInstance(new String("Test")));

      System.out.println("Desired Assertion Status: " + clazz.desiredAssertionStatus());

      System.out.println("Enclosing Class: " + clazz.getEnclosingClass());

      System.out.println("Enclosing Constructor: " + clazz.getEnclosingConstructor());

      System.out.println("Enclosing Method: " + clazz.getEnclosingMethod());

      System.out.println("Resource: " + clazz.getResource("String.class"));

      System.out.println("Resource As Stream: " + clazz.getResourceAsStream("String.class"));

      System.out.println("Module: " + clazz.getModule());

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}