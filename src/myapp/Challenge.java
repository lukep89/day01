package myapp;

import java.io.Console;


public class Challenge {
  public static void main(String[] args) {

    String input = "";
    Integer total = 0;
    Integer counter = 0;

    Console cons = System.console();

    while (!input.equals("stop")) {

      input = cons.readLine("Enter a number: ");
      input = input.trim();

      if (input.equals("stop")) {
        // exit the loop
        break;
      } 
      else {
        Integer num = Integer.parseInt(input);

        total += num;
        // System.out.println(total);
        counter++;
      }
    }
    System.out.printf("The total of %d values is: %d\n", counter, total);
  }
}
