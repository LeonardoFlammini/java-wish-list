package org.excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //Variabili
        Scanner scanner = new Scanner(System.in);

        File filepath = new File("./resources/list.txt");

        ArrayList<String> presents = new ArrayList<>();

        boolean stop = false;
        //
        //Eseguibile
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

        for( String present : presents){
            writeToFile(present,filepath);
        }






        scanner.close();
    }

    //Metodi
    private static void writeToFile(String s, File file) {
        // try-with-resources
        try (FileWriter fileWriter = new FileWriter(file, true)) { // Aggiunto 'true' per abilitare l'append
            fileWriter.write(s + "\n"); // Aggiunto '\n' per separare i libri nel file
        } catch (IOException e) {
            System.out.println("Unable to write to file: " + e.getMessage());
        }
    }

    private static void readFile(File file) {
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Unable to read file");
        }
    }
}
