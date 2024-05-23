package org.excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> presents = new ArrayList<>();

        boolean stop = false;


        while(!stop){
            System.out.println("What present do you want?");
            String present = scanner.nextLine();
            presents.add(present);
            System.out.println("Size of the list: " + presents.size());
            System.out.println("Do you want to stop? y/n");
            String choice = scanner.nextLine();
            while (!choice.equals("y") && !choice.equals("n"))
            {
                System.out.println("Invalid choice. Please enter 'y' or 'n'.");
                choice = scanner.nextLine();
            }
            switch (choice){
                case "y":
                    stop = true;
                    break;
                case "n":
                    break;
            }
        }






        scanner.close();
    }
}
