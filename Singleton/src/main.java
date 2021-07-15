public class main{

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadFoo());
        Thread thread2 = new Thread(new ThreadBar());
        thread1.start();
        thread2.start();
    }

    static class ThreadFoo implements Runnable{
        @Override
        public void run(){
            Singleton singleton = null;
            try {
                singleton = Singleton.getInstance(new car("Cruze", "Chevy"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(singleton.value.toString());
        }

    }

    static class ThreadBar implements Runnable {
        @Override
        public void run(){
            Singleton singleton = null;
            try {
                singleton = Singleton.getInstance(new car("Flex", "Ford" ));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(singleton.value.toString());
        }
    }

}
