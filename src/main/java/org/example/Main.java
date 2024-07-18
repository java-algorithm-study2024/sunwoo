package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int max = Integer.MIN_VALUE;
    static Pair[] pairs;
    static int Num;
    static int answer = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Num = Integer.parseInt(br.readLine());
        pairs = new Pair[Num];
        for (int i = 0; i < Num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int endure = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            pairs[i] = new Pair(endure, weight);
        }
        crush(0,0);
        System.out.println(max);
    }

    private static void crush(int wp, int cnt) {
        // 마지막 계란까지 다 들어보면 종료
        if (wp == Num) {
            max = Math.max(max,cnt);
            return;
        }
        //손으로 든 계란이 이미 깨졌거나 모든 계란이 다 깨져있다면
        if(pairs[wp].endure <= 0 || cnt == Num -1){
            crush(wp + 1,cnt);
            return;
        }
        int nCnt = cnt;
        for (int i = 0; i < Num; i++) {
            if(i == wp) continue;
            if(pairs[i].endure <= 0 ) continue;
            pairs[wp].endure -= pairs[i].weight;
            pairs[i].endure -= pairs[wp].weight;
            if(pairs[wp].endure <= 0){
                cnt ++;
            }
            if(pairs[i].endure <= 0 ){
                cnt ++;
            }
            crush(wp +1, cnt);
            pairs[i].endure += pairs[wp].weight;
            pairs[wp].endure += pairs[i].weight;
            cnt = nCnt;
        }



    }


}
class Pair{
    int endure;
    int weight;

    Pair(int endure, int weight) {
        this.endure = endure;
        this.weight = weight;
    }
}
