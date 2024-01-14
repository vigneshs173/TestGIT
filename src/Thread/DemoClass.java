package Thread;

public class DemoClass extends Thread{

    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println("Thread 1");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        DemoClass t1 = new DemoClass();
        Thread t2 = new Thread(()->{
            for(int i=0; i<10; i++)
                System.out.println("Thread 2");
        });

        Thread t3 = new Thread(()->{
            for(int i=0; i<10; i++)
                System.out.println("Thread 3");
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        for(int i=0; i<10; i++) {
            System.out.println("Main Thread");
        }

    }
}
