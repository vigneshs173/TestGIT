public class DemoClass extends Thread{

    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println("Thread 1");
        }
    }

    public static void main(String[] args) {

        DemoClass t1 = new DemoClass();
        Thread t2 = new Thread(()->{
            for(int i=0; i<10; i++)
                System.out.println("Thread 2");
        });


        t1.start();
        t2.start();

        for(int i=0; i<10; i++) {
            System.out.println("Main Thread");
        }

    }
}
