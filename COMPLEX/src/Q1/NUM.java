package Q1;

import java.util.Random;

class Num extends Thread {
    public void run() {
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int n = r.nextInt(100);
            System.out.println("Number: " + n);

            if (n % 2 == 0)
                new Sq(n).start();
            else
                new Cu(n).start();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Sq extends Thread {
    int n;
    Sq(int n) {
        this.n = n;
    }
    public void run() {
        System.out.println("Square: " + (n * n));
    }
}

class Cu extends Thread {
    int n;
    Cu(int n) {
        this.n = n;
    }
    public void run() {
        System.out.println("Cube: " + (n * n * n));
    }
}

public class NUM {
    public static void main(String[] args) {
        new Num().start();
    }
}