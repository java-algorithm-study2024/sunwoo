package org.example;


import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextInt();
        long Y = sc.nextInt();
        int z = (int) (Y*100 / X);
        int ans = -1;
        if ( z < 99){
            ans = (int) Math.ceil((100*Y - X * (z + 1)) / (double) (z - 99));
        }
        System.out.println(ans);
    }
}