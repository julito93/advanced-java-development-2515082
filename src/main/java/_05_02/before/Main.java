package _05_02.before;

public class Main {

    public static void main(String[] args) {
        Thread thread1 = new ThreadExample();
        Thread thread2 = new ThreadExample();

        thread1.setName("First thread");
        thread2.setName("Second thread");

        thread1.start();
        thread2.start();
    }

}
