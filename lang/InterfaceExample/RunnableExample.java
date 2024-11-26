package lang.InterfaceExample;

public class RunnableExample implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(Thread.currentThread().getName() + " - Count: " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args) {
    RunnableExample runnableExample = new RunnableExample();

    Thread thread1 = new Thread(runnableExample, "Thread-1");
    Thread thread2 = new Thread(runnableExample, "Thread-2");

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("All threads have finished.");
  }
}