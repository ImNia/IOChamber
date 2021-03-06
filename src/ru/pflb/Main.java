package ru.pflb;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> pullString = new ArrayList<>();
        String getString;
        if(args.length != 0) {
            String fileName = args[0];
            BufferedReader bufferFile;
            try (FileReader reader = new FileReader(fileName)) {
                bufferFile = new BufferedReader(reader);
                while((getString = bufferFile.readLine()) != null) {
                    pullString.add(getString);
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ввод");

            getString = scanner.nextLine();
            while (!getString.equals("")) {
                pullString.add(getString);
                getString = scanner.nextLine();
            }
        }
        for(int i = 0; i < pullString.size(); i += 2) {
            System.out.println(pullString.get(i));
        }
    }
}
