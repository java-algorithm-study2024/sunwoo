package org.example;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        LinkedList<Integer> arr = new LinkedList<>();
        for(int i=0;i<a;i++){
            arr.add(i+1);
        }
        int count = 0;
        while(arr.size() != 0){
            if(count % b == 0) {
                arr.remove(count);

            }
        }

    }
}