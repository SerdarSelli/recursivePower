import java.util.Scanner;

public class Main {
    static int power (int taban, int us){
        if(us>0){
            return taban * power( taban, us -1);
        }
        else{
            return 1;
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("üssü alınacak taban sayıyı girin");
        int taban = scan.nextInt();
        System.out.println("üs olacak kuvvet sayısını girin");
        int us = scan.nextInt();
        System.out.println(power(taban,us));
    }
}