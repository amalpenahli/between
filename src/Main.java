import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Scanner  scan=new Scanner(System.in);
       int a  = scan.nextInt();

       switch(a){
           case 1,2,3,4,5 -> System.out.println("eded 1-5 araligindadir");
           case 6,7,8,9,10 ->System.out.println("eded 5-10 araligindadir");
           default-> System.out.println("eded 10-dan  boyukdur");

       }
    }
}