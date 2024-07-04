package org.example;

<<<<<<< HEAD
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
=======
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
>>>>>>> origin


public class Main {
<<<<<<< HEAD

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] info = new int[n];
        for (int i = 0; i < n; i++) {
            info[i] = sc.nextInt();
        }
        int low = 0,max = 0;
        for (int i = 0; i < info.length; i++) {
            if (info[i] > max) {
                max= info[i];
            }
        }
        int answer = -1;
        while(low < max){
            int mid = (low + max)/2;
            int tree = Arrays.stream(info)
                    .map(x -> x-mid).filter(x -> x>= 0).sum();
           if ( tree >= m){
                low = mid + 1;
            }else{
                max = mid;
            }
        }
        System.out.println(answer-1);
=======
    static int[] x_scale = {0, -1, 0, 1};
    static int[] y_scale = {1,0, -1, 0};
    static boolean[][] visit;

    static int meter;
    public static int dfs(int x, int y){
        int count = 1;
        for (int i = 0; i < 4; i++) {
            int n_x =x+ x_scale[i];
            int n_y =y+ y_scale[i];
            if(n_x>=0 && n_y>=0 && n_x<meter && n_y <meter){
                if(!visit[n_x][n_y]) {
                    visit[n_x][n_y] = true;
                    count += dfs(n_x, n_y);
                }
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        meter = Integer.parseInt(br.readLine());
        ArrayList<Integer> count_list = new ArrayList<>();
        visit = new boolean[meter][meter];
        for (int i = 0; i < meter; i++) {
            String str = br.readLine();
            for (int j = 0; j < meter; j++) {
                if (str.charAt(j)=='0') visit[i][j] = true;
            }
        }
        int all_count = 0;
        for (int i = 0; i < meter; i++) {
            for (int j = 0; j < meter; j++) {
                if(!visit[i][j]){
                    visit[i][j] = true;
                    all_count+=1;
                    count_list.add(dfs(i, j));
                }
            }
        }
        Collections.sort(count_list);
        System.out.println(all_count);
        for (int i : count_list) {
            System.out.println(i);
        }
>>>>>>> origin
    }
}