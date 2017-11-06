import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if (a >= 1 && a <= 12) {
               if (a >= 3 && a <= 5) {
                System.out.println("Spring");
            } else if (a >= 6 && a <= 8) {
                System.out.println("Summer");
            } else if (a >= 9 && a <= 11) {
                System.out.println("Autumn");
            } else
                System.out.println("Winner");
        }
    }
}
