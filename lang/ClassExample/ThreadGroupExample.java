package lang.ClassExample;

public class ThreadGroupExample {
  public static void main(String[] args) {
    ThreadGroup group = new ThreadGroup("MyThreadGroup");

    System.out.println("ThreadGroup Name: " + group.getName());

    System.out.println("Maximum Threads in Group: " + group.getMaxPriority());

    Thread thread1 = new Thread(group, new RunnableTask(), "Thread 1");
    Thread thread2 = new Thread(group, new RunnableTask(), "Thread 2");

    thread1.start();
    thread2.start();

    System.out.println("Is Thread 1 part of group? " + (thread1.getThreadGroup() == group));
    System.out.println("Is Thread 2 part of group? " + (thread2.getThreadGroup() == group));

    Thread[] threads = new Thread[group.activeCount()];
    group.enumerate(threads);
    System.out.println("Threads in the group:");
    for (Thread t : threads) {
      System.out.println(t.getName());
    }

    group.interrupt();

    System.out.println("Active Threads in Group: " + group.activeCount());

    group.list();
  }

  static class RunnableTask implements Runnable {
    @Override
    public void run() {
      try {
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " has finished execution.");
      } catch (InterruptedException e) {
        System.out.println(Thread.currentThread().getName() + " was interrupted.");
      }
    }
  }
}
