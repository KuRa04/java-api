package lang.ClassExample;

import java.io.IOException;
import java.lang.module.ModuleDescriptor;
import java.util.Set;

public class ModuleExample {

  public static void main(String[] args) throws IOException {
    Module module = ModuleExample.class.getModule();

    System.out.println("Module Name: " + module.getName());

    System.out.println("Class Loader: " + module.getClassLoader());

    System.out.println("Layer: " + module.getLayer());

    ModuleDescriptor descriptor = module.getDescriptor();
    System.out.println("Descriptor: " + descriptor);

    Set<String> packages = module.getPackages();
    System.out.println("Packages: " + packages);

    System.out.println("Resource: " + module.getResourceAsStream("module-info.class"));

    System.out.println("Resource As Stream: " + module.getResourceAsStream("module-info.class"));

    System.out.println("Annotations: " + module.getAnnotations());

    System.out.println("Declared Annotations: " + module.getDeclaredAnnotations());

    System.out.println("Layer: " + module.getLayer());

    System.out.println("Descriptor: " + descriptor);

    System.out.println("Packages: " + packages);

    System.out.println("Resource: " + module.getResourceAsStream("module-info.class"));

    System.out.println("Resource As Stream: " + module.getResourceAsStream("module-info.class"));

    System.out.println("Annotations: " + module.getAnnotations());

    System.out.println("Declared Annotations: " + module.getDeclaredAnnotations());

    System.out.println("Layer: " + module.getLayer());

    System.out.println("Descriptor: " + descriptor);

    System.out.println("Packages: " + packages);

    System.out.println("Resource: " + module.getResourceAsStream("module-info.class"));

    System.out.println("Resource As Stream: " + module.getResourceAsStream("module-info.class"));

    System.out.println("Annotations: " + module.getAnnotations());

    System.out.println("Declared Annotations: " + module.getDeclaredAnnotations());

    System.out.println("Layer: " + module.getLayer());

    System.out.println("Descriptor: " + descriptor);

    System.out.println("Packages: " + packages);

    System.out.println("Resource: " + module.getResourceAsStream("module-info.class"));
  }
}