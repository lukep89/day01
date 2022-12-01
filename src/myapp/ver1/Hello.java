package myapp.ver1;

import java.io.Console;

public class Hello {
  public static void main(String[] args) {

    // Get console
    Console cons = System.console();

    // use equals() for String comparison. == is for numbers
    String name = "";
    while (name.trim().length() <= 0) {
      // read from the console, the result is assigned to a variable
      name = cons.readLine("What is your name? ");
    }

    if (name.trim().toLowerCase().equals("fred")) {
      System.out.println("Yabadabado");
    } else if (name.equals("barney")) {
      System.out.println("hello purple barney");
    } else if (name.equals("")) {
      System.out.println("error plase enter name");
    } else {
      // send a greeting to the name with a formatted string
      System.out.printf("hello %s, \n  nice to meet you!\n", name);
    }

  }

}
