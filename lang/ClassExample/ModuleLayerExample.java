package lang.ClassExample;

import java.lang.module.Configuration;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ModuleLayerExample {

  public static void main(String[] args) {
    ModuleLayer bootLayer = ModuleLayer.boot();
    System.out.println("Boot Layer: " + bootLayer);

    ModuleLayer currentLayer = ModuleLayer.empty();
    System.out.println("Current Layer: " + currentLayer);

    Configuration configuration = bootLayer.configuration();
    System.out.println("Configuration: " + configuration);

    Set<Module> modules = bootLayer.modules();
    System.out.println("Modules: " + modules);

    ClassLoader classLoader = bootLayer.findLoader("java.base");
    System.out.println("Class Loader: " + classLoader);

    Optional<Module> module = bootLayer.findModule("java.base");
    System.out.println("Module: " + module);

    List<ModuleLayer> layers = bootLayer.parents();
    System.out.println("Layers: " + layers);
  }
}