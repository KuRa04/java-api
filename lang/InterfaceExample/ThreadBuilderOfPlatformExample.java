package lang.InterfaceExample;

public class ThreadBuilderOfPlatformExample {
  public static void main(String[] args) {
    Thread.Builder virtualBuilder = Thread.ofVirtual();

    Thread virtualThread = virtualBuilder
        .name("Virtual-Thread")
        .unstarted(() -> {
          System.out.println(Thread.currentThread().getName() + " is running.");
        });
    virtualThread.start();

    Thread.Builder.OfPlatform platformBuilder = Thread.ofPlatform();

    Thread platformThread = platformBuilder
        .name("Platform-Thread")
        .unstarted(() -> {
          System.out.println(Thread.currentThread().getName() + " is running.");
        });
    platformThread.start();

    try {
      virtualThread.join();
      platformThread.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  /**
   * Thread.Builder (Thread.ofVirtual()):
   * 仮想スレッドを作成
   * 仮想スレッドは軽量で、大量のスレッドを効率的に管理可能
   *
   * Thread.Builder.OfPlatform (Thread.ofPlatform()):
   * プラットフォームスレッドを作成
   * プラットフォームスレッドは従来のJavaスレッドで、OSのスレッドとして管理される
   */
}
