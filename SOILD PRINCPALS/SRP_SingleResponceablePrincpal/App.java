package SRP_SingleResponceablePrincpal;

import java.util.Scanner;

public class App {
   
    public static void main(String[] args) {
        TextManuplator textManuplator = new TextManuplator("helrojfiodjoif");
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.next();
        scanner.close();
        textManuplator.setText(inputText);
    }
    
}
