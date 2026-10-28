package Q10;

import java.util.Scanner;

class Negative extends Exception {
    Negative(String s) {
        super(s);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        try {
            if (n < 0)
                throw new Negative("Negative number not allowed");

            System.out.println("Number: " + n);
        } catch (Negative e) {
            System.out.println(e.getMessage());
        }
    }
}
