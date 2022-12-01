package myapp;

public class ToDo {
  public static void main(String[] args) {
    
    // create an array of 3 String element
    String[] tasks = new String[3];

    tasks[0] = "running";
    tasks[1] = "eating";
    tasks[2] = "sleeping";

    /* 
     System.out.println(tasks);
     System.out.println(tasks[0]);
     System.out.println(tasks[3]);
     System.out.println("the size of array is: " + tasks.length);
    */

    // use a while loop to print all the lements in an array
    Integer i = 0;
    while (i < tasks.length){
      System.out.printf("%d : %s\n",i, tasks[i]);
      i++;
    }
  }
  
}
