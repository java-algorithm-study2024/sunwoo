package org.example.codingtest;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    static boolean[][] visit;
    Queue<int[]> que = new ArrayDeque<>();
    static int[] dx = {0 , -1 , 0, 1};
    static int[] dy = {1 , 0 , -1 , 0};
    static int[] target = new int[2];
    static int answer = 0;
    static int[][] static_maps;
    public int bfs(int x, int y){
        int count = 1;
        int cx = 0;
        int cy = 0;
        while(answer !=0){
            for(int i = 0;i<4;i++){
                cx = x + dx[i];
                cy = y + dy[i];
                if (cx>=0 && cy >= 0 && cx < target[0] && cy < target[1]){
                    if(!visit[cx][cy] && static_maps[cx][cy] == 1){
                        if(cx == target[0]-1 && cy == target[1]-1){
                            answer = count;
                        }
                        visit[cx][cy] = true;
                        que.add(new int[]{cx,cy});
                    }
                }
            }
            int [] temp = que.poll();
            cx = temp[0];
            cy = temp[1];
            if(cx == -1 && cy == -1){
                count +=1;
                que.add(new int[]{-1,-1});
            }

        }
        return answer;
    }
    public int solution(int[][] maps) {
        int answer = 0;
        target[0] = maps.length;
        target[1] = maps[0].length;
        visit = new boolean[maps.length][maps[0].length];
        static_maps = new int[target[0]][target[1]];
        que.add(new int[]{-1,-1});
        answer = bfs(0, 0);
        return answer;
    }
}