package lang.ClassExample;

public class ThreadExample {
  public static void main(String[] args) {
    Thread thread1 = new Thread(new RunnableTask(), "Thread 1");
    Thread thread2 = new Thread(new RunnableTask(), "Thread 2");

    thread1.start();
    thread2.start();

    System.out.println("Thread 1 Name: " + thread1.getName());
    System.out.println("Thread 2 Name: " + thread2.getName());

    System.out.println("Thread 1 Priority: " + thread1.getPriority());
    System.out.println("Thread 2 Priority: " + thread2.getPriority());

    thread1.setPriority(Thread.MAX_PRIORITY);
    thread2.setPriority(Thread.MIN_PRIORITY);

    try {
      Thread.sleep(1000); // 1秒待機
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Is Thread 1 alive? " + thread1.isAlive());
    System.out.println("Is Thread 2 alive? " + thread2.isAlive());

    try {
      thread1.join(); // thread1 が終了するまで待機
      thread2.join(); // thread2 が終了するまで待機
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Is Thread 1 alive after join? " + thread1.isAlive());
    System.out.println("Is Thread 2 alive after join? " + thread2.isAlive());
  }

  static class RunnableTask implements Runnable {
    @Override
    public void run() {
      Thread currentThread = Thread.currentThread();
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(currentThread.getName() + " has finished execution.");
    }
  }
}
