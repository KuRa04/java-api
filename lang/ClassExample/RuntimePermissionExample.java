package lang.ClassExample;

import java.security.Permission;

public class RuntimePermissionExample {
  public static void main(String[] args) {
    Permission permission = new RuntimePermission("setSecurityManager");

    if (permission != null) {
      System.out.println("Permission granted: " + permission.getName());
      System.out.println("Permission granted: " + permission.getActions());
      System.out.println("Permission granted: " + permission.implies(permission));
    }
  }
}
