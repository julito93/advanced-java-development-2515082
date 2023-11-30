package _06_02.before;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("PLease enter your name");
        String name = scanner.nextLine();
        System.out.println(name);

        System.out.println("PLease enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter your Occupation: ");
        String occupation = scanner.nextLine();
        System.out.println(occupation);
    }

}
