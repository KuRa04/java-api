package lang.InterfaceExample;

public class ThreadBuilderOfVirtualExample {

  public static void main(String[] args) {
    Thread.Builder.OfVirtual builder = Thread.ofVirtual();

    Thread virtualThread1 = builder.name("Virtual-Thread-1").unstarted(() -> {
      System.out.println(Thread.currentThread().getName() + " is running.");
    });
    virtualThread1.start();

    Thread virtualThread2 = builder.name("Virtual-Thread-2").unstarted(() -> {
      System.out.println(Thread.currentThread().getName() + " is running");
    });
    virtualThread2.start();

    try {
      virtualThread1.join();
      virtualThread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}