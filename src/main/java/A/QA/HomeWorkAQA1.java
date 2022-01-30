package A.QA;

import java.util.Scanner;

public class HomeWorkAQA1 {

    public static void main(String[] args) {
        System.out.println("Please add your first name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Please add the hobby you most love: ");
        String hobby = scanner.next();

        System.out.println("Your name is " + name + " and your favourite hobby is " + hobby);
    }
}
