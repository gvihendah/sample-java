package ke.co.safaricom;


import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What year were you born?");
    int birthYear = scanner.nextInt();
    System.out.println("You were alive during this years: ");
    for (int year = birthYear; year < 2023; year++) {
      if (year % 4 == 0) {
        System.out.println(year);
      }
    }
  }
}



