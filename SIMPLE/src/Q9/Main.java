package Q9;
class Odd extends Thread {
    int n;

    Odd(int n) {
        this.n = n;
    }

    public void run() {
        for (int i = 1; i <= n; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Even extends Thread {
    int n;

    Even(int n) {
        this.n = n;
    }

    public void run() {
        for (int i = 2; i <= n; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 10;
        new Odd(n).start();
        new Even(n).start();
    }
}