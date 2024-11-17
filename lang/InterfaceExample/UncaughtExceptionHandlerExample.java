package lang.InterfaceExample;

public class UncaughtExceptionHandlerExample {
  
    public static void main(String[] args) {
        Thread.UncaughtExceptionHandler handler = new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Uncaught exception in thread '" + t.getName() + "': " + e.getMessage());
            }
        };

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " is running.");
            throw new RuntimeException("Intentional Exception");
        };

        Thread thread = new Thread(task);
        thread.setUncaughtExceptionHandler(handler);
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}