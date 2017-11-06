import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();
        int d=scn.nextInt();
        if(1<=m && m<=12 && 1<=d && d<=31){
            if(1==m && d>=21||m==2 && d<=18){
                System.out.println("Aquarius");
            } else if(2==m && d>=19||3==m && d<=20){
                System.out.println("Pisces");
            } else if(3==m && d>=21||4==m && d<=20){
                System.out.println("Aries");
            } else if(4==m && d>=21||5==m && d<=21){
                System.out.println("Taurus");
            } else if(5==m && d>=22||6==m && d<=21){
                System.out.println("Gemini");
            } else if(6==m && d>=22||7==m && d<=22){
                System.out.println("Cancer");
            } else if(7==m && d>=23||8==m && d<=23){
                System.out.println("Leo");
            } else if(8==m && d>=24||9==m && d<=23){
                System.out.println("Virgo");
            } else if(9==m && d>=24||10==m && d<=23){
                System.out.println("Libra");
            } else if(10==m && d>=24||11==m && d<=22){
                System.out.println("Scorpio");
            } else if(11==m && d>=23||12==m && d<=21){
                System.out.println("Sagittarius");
            } else if(12==m && d>=22||1==m && d<=20){
                System.out.println("Capricorn");
            }
        }
    }
}
