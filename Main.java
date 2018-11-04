package Testowe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner jajo = new Scanner(System.in);

//        System.out.println("Enter a line of text");
//        String line = jajo.nextLine();
//        System.out.println("You have just entered" + " " + line);

//        System.out.println("Do your job");
//        String line1 = jajo.nextLine();
//        System.out.println("You have just entered" + " " + line1);

//        System.out.println("\"Ello\"");

        System.out.println("This riddle has just begun");
        System.out.println("Enter a number I do have on my mind from 0 - 20");

        int value = 0;

        while (value != 13) {
            value = jajo.nextInt();

            System.out.println("try again");
        } else {
        System.out.println("You've got it you bastard 13 is the one:)");
    }
}

