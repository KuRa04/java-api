package lang.ClassExample;

public class ObjectExample {

  public static void main(String[] args) {
    Object obj1 = new Object();
    Object obj2 = new Object();

    System.out.println("obj1.toString(): " + obj1.toString());
    System.out.println("obj2.toString(): " + obj2.toString());

    System.out.println("obj1.equals(obj2): " + obj1.equals(obj2));
    System.out.println("obj1.equals(obj1): " + obj1.equals(obj1));

    System.out.println("obj1.hashCode(): " + obj1.hashCode());
    System.out.println("obj2.hashCode(): " + obj2.hashCode());

    System.out.println("obj1.getClass(): " + obj1.getClass());
    System.out.println("obj2.getClass(): " + obj2.getClass());

    Thread thread1 = new Thread(() -> {
      synchronized (obj1) {
        try {
          System.out.println("Thread1 is waiting.");
          obj1.wait();
          System.out.println("Thread1 is notified.");
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });

    Thread thread2 = new Thread(() -> {
      synchronized (obj1) {
        try {
          System.out.println("Thread2 is notifying.");
          obj1.notify();
          System.out.println("Thread2 is notified.");
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });

    thread1.start();
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}