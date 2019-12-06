package sie2019;


public class SieThread {

    public static void main(String... args) {
        implRunnable();
        extendThread();
    }

    private static void someThreadMethods() {
        Thread.currentThread().isInterrupted();
        Thread.currentThread().interrupt();
    }

    private static void extendThread() {
        new FooThread().start();
    }

    private static void implRunnable() {
        new Thread(new BarRunnable()).start();
    }

    private static class FooThread extends Thread {
        @Override
        public void run() {
            System.out.println("Using extends Thread");
        }
    }

    private static class BarRunnable implements Runnable {
        public void run() {
            System.out.println("Using implements Runnable");
        }
    }
}
