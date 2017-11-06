import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        if(a%400==0||(a%4==0 && a%100!=0)){
            System.out.println("Bissextile year");
        }
        else {
            System.out.println("Common year");
        }
    }
}
