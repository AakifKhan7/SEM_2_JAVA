package Chapter2.PB69.package1;

import java.util.Scanner;

public class Student {
    private String name;
    private int[] marks = new int[5];
    private int total;
    private float percentage;

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        name = sc.nextLine();

        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        sc.close();
    }

    public void calculateResult() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
        percentage = (float) total / 5;
    }

    public void displayResult() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}
