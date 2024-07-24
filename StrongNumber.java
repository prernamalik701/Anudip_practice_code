package prernaLabs;

import java.util.Scanner;

public class StrongNumber {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = scanner.nextInt();

    if (isStrongNumber(num)) {
      System.out.println(num + " is a strong number.");
    } else {
      System.out.println(num + " is not a strong number.");
    }

    scanner.close();
  }

  public static boolean isStrongNumber(int num) {
    int originalNum = num;
    int sum = 0;
    int temp = num; 
    while (temp > 0) {
      int digit = temp % 10;
      int factorial = 1;
      for (int i = 1; i <= digit; i++) {
        factorial *= i;
      }
      sum += factorial;
      temp /= 10;
    }

    return sum == originalNum;
  }
}
