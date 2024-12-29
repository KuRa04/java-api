package lang.ClassExample;

public class ThreadLocalExample {
  // ThreadLocal インスタンスを作成
  private static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 1);

  public static void main(String[] args) {
    Thread thread1 = new Thread(() -> {
      System.out.println("Thread 1: Initial value: " + threadLocal.get());
      threadLocal.set(10); // スレッド1の値をセット
      System.out.println("Thread 1: After setting value: " + threadLocal.get());
    });

    Thread thread2 = new Thread(() -> {
      System.out.println("Thread 2: Initial value: " + threadLocal.get());
      threadLocal.set(20); // スレッド2の値をセット
      System.out.println("Thread 2: After setting value: " + threadLocal.get());
    });

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Main Thread: Final value: " + threadLocal.get());
  }
}
