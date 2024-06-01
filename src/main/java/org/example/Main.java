package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int answer = str.length();
        for(int i=0;i<str.length();i++){
            if(isPalind(str.substring(i))){
                break;
            }
            answer+=1;
        }
        System.out.println(answer);
    }
    private static boolean isPalind(String s){
        int start = 0;
        int last = s.length()-1;
        while(start <= last){
            if(s.charAt(start) != s.charAt(last))
                return false;
            start++;
            last--;
        }
        return true;
    }
}