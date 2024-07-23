package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int N,M;
    public static int[][] gameResult = new int[6][3];
    public static int[][] gameMatch ={{0,1},{0,2},{0,3},{0,4},{0,5},{1,2},{1,3},{1,4},{1,5},{2,3},
            {2,4},{2,5},{3,4},{3,5},{4,5}};
    public static  int answer = 0;
    public static boolean success = false, validInput = true;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = 0; t < 4; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            validInput = true;
            success = false;
            for(int i =0;i<6;i++){
                for (int j = 0; j < 3; j++) {
                    gameResult[i][j] = Integer.parseInt(st.nextToken());
                    if (gameResult[i][j] >= 6) {
                        validInput =false;
                    }
                }
            }
            simulate(0);

            if(success == true && validInput == true) {
                System.out.print("1 ");
            }else {
                System.out.print("0 ");
            }
        }

    }

    private static void simulate(int level) {
        if (success == true) {
            return;
        }
        if (level == 15) {
            success = true;
            return;
        }
        int team1 = gameMatch[level][0];
        int team2 = gameMatch[level][1];

        //승:패 조사
        if(gameResult[team1][0] > 0 && gameResult[team2][2]>0){
            gameResult[team1][0] -=1;
            gameResult[team2][2] -= 1;
            simulate(level +1);
            gameResult[team1][0] += 1;
            gameResult[team2][2] += 1;
        }

        //무:무 조사
        if (gameResult[team1][1] > 0 && gameResult[team2][1] > 0) {
            gameResult[team1][1] -= 1;
            gameResult[team2][1] -= 1;
            simulate(level +1);
            gameResult[team1][1] +=1;
            gameResult[team2][1] +=1;
        }

        if (gameResult[team1][2] > 0 && gameResult[team2][0] > 0) {
            gameResult[team1][2] -=1;
            gameResult[team2][0] -=1;
            simulate(level +1);
            gameResult[team1][2] +=1;
            gameResult[team2][0] +=1;
        }

    }
}
