package org.main.api.ui;

import java.util.Scanner;

public class UI {
  private final Scanner sc = new Scanner(System.in);

  public void start(){
    System.out.println("\nWelcome to the text editor app!\n");
    System.out.print("""
        Choose an option:
        1. View text
        2. Replace text commands
        3. Wrap text commands
        4. Capitalize commands
        5. Script commands
        6. Exit
        """);

    int option = sc.nextInt();

    while(option != 6){
    switch (option){
      case 1 -> viewText();
      case 2 -> replaceText();
      case 3 -> wrapText();
      case 4 -> capitalizeText();
      case 5 -> scriptCommands();
      default -> System.out.println("Invalid option");
    }
      System.out.print("""
        Choose an option again:
        1. View text
        2. Replace text commands
        3. Wrap text commands
        4. Capitalize commands
        5. Script commands
        6. Exit
        """);
    option = sc.nextInt();
    }

    System.out.println("Application closed.");
  }

  private void viewText(){
    System.out.println("Enter text:");
    String text = sc.nextLine();
    System.out.println(text);
  }

  private void replaceText(){
  }

  private void wrapText(){
  }

  private void capitalizeText(){
  }

  private void scriptCommands(){
  }
}
