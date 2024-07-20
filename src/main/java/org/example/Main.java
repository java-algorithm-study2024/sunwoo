package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int max = 0;
    static int L;
    static int C;
    static String mogroup = "aeiou";
    static int mo;
    static int ja;
    static String [] words;
    static Stack<String> password = new Stack<>();
    static ArrayList<String> answer;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        answer = new ArrayList<>();
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        words = br.readLine().split(" ");
        Arrays.sort(words);
        func(0);
        for (String str : answer) {
            System.out.println(str);
        }

    }

    private static void func(int idx) {

        if(password.size() == L){
            if(mo>0 && ja>1){
            answer.add(password_maker());
            return;
            }
            return;
        }

        for (int i = 0; i < C; i++) {
            if (!password.isEmpty()) {
                if(password.peek().compareTo(words[i])>=0){
                    continue;
                }
            }
            if(mogroup.contains(words[i])){
                mo++;
            }else{
                ja++;
            }
            password.add(words[i]);
            func(i);
            password.pop();
            if(mogroup.contains(words[i])){
                mo--;
            }else{
                ja--;
            }
        }

    }

    private static String password_maker() {
        StringBuilder temp = new StringBuilder();
        for (String str : password) {
            temp.append(str);
        }
        return temp.toString();
    }

}
