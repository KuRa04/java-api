package lang.ClassExample;

public class CharacterSubsetExample {

  static class MySubset extends Character.Subset {
    protected MySubset(String name) {
      super(name);
    }
  }

  public static void main(String[] args) {
    MySubset subset1 = new MySubset("Subset1");
    MySubset subset1_a = subset1;
    MySubset subset2 = new MySubset("Subset2");

    // サブセットの比較
    System.out.println("subset1.equals(subset2): " + subset1.equals(subset2));

    // サブセットの比較 同じインスタンスのアドレスを参照しているため
    System.out.println("subset1.equals(subset1_a): " + subset1.equals(subset1_a));

    // サブセットのhashCodeを取得
    System.out.println("subset1.hashCode(): " + subset1.hashCode());
    System.out.println("subset2.hashCode(): " + subset2.hashCode());

    // サブセットの名前を取得
    System.out.println("subset1.toString(): " + subset1.toString());
    System.out.println("subset2.toString(): " + subset2.toString());
  }
}