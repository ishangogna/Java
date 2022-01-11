import java.util.Scanner;

class Main{
  public static void main(String args[]){
    //Create a Scanner object
    Scanner obj = new Scanner(System.in);

    //use .nextLine() to get user input
    System.out.println("Enter the username");
    String username = obj.nextLine();
    System.out.println("Username is : " + username);
  }
}
