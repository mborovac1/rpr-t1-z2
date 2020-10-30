package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    private static int sumaCifara(int x) {
        int suma = 0;
        while(x != 0) {
            suma = suma + (x % 10);
            x = x / 10;
        }
        return suma;
    }

    public static void main(String[] args) {
	    int n;
	    Scanner in = new Scanner(System.in);
        System.out.println("Unesite n: ");
        n = in.nextInt();

        for(int i = 1; i <= n; i++) {
            if(i % sumaCifara(i) == 0)
                System.out.println(+ i);
        }
    }
}
