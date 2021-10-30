package ba.unsa.etf.rpr;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int x,y,z;
        Scanner ulaz= new Scanner(System.in);
        System.out.println("Unesi broj x:");
        x= ulaz.nextInt();
        y= 2 * x;
        z=2*y;
        System.out.println("Y ="+y + " a z je "+ z);

    }
}
