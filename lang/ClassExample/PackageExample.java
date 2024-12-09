package lang.ClassExample;

public class PackageExample {
  public static void main(String[] args) {
    // 例として、java.utilパッケージの情報を取得
    Package[] pkg = Package.getPackages();

    if (pkg != null) {
      // パッケージ名を表示
      System.out.println("Package Name: " + pkg[0].getName());
      System.out.println("Specification Version: " + pkg[0].getSpecificationVersion());
      System.out.println("Specification Title: " + pkg[0].getSpecificationTitle());
      System.out.println("Implementation Version: " + pkg[0].getImplementationVersion());
      System.out.println("Implementation Title: " + pkg[0].getImplementationTitle());
      System.out.println("Implementation Vendor: " + pkg[0].getImplementationVendor());
    } else {
      System.out.println("Package not found.");
    }
  }
}