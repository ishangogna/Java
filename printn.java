import java.util.Scanner;

class Printn{
  public static void main(String args[]){
    Scanner obj = new Scanner(System.in);

    System.out.println("Enter the nunmber : ");
    int n = obj.nextInt();

    for(int i=1; i<=n;i++){
      System.out.println("Number : " + i);
    }
  }


}
