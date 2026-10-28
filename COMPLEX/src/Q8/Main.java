package Q8;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Hashtable<String, String> h = new Hashtable<>();

        BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA LAB\\INTERNAL\\Names.txt"));
        String s;

        while ((s = br.readLine()) != null) {
            String[] a = s.split("\t");
            h.put(a[0], a[1]);
            h.put(a[1], a[0]);
        }
        br.close();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name or phone number: ");
        String key = sc.nextLine();

        if (h.containsKey(key))
            System.out.println("Corresponding value: " + h.get(key));
        else
            System.out.println("Record not found");
    }
}