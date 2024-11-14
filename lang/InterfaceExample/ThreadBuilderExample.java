package lang.InterfaceExample;

public class ThreadBuilderExample {

    public static void main(String[] args) {
        Thread.Builder builder = Thread.ofVirtual();

        // スレッドをビルドして開始
        Thread thread1 = builder
                .name("Thread-1")
                .unstarted(() -> {
                    System.out.println(Thread.currentThread().getName() + " is running.");
                });
        thread1.start();

        // 別のスレッドをビルドして開始
        Thread thread2 = builder
                .name("Thread-2")
                .unstarted(() -> {
                    System.out.println(Thread.currentThread().getName() + " is running.");
                });
        thread2.start();

        // スレッドが終了するのを待つ
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}