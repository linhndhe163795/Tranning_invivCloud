import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                LocalDateTime time = LocalDateTime.now();
                try {
                    System.out.println("Giờ: " + time.getHour() + " Phút: " + time.getMinute() + " Second: " + time.getSecond());
                    Thread.sleep(1000);
                    run();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
    }
}
