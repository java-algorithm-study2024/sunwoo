package org.example;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Deque<Integer> que = new ArrayDeque<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();
            switch (S) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    que.add(num);
                    break;
                case "pop":
                    if(que.isEmpty()) {
                        System.out.println("-1");
                    }else{
                        System.out.println(que.poll());
                    }
                    break;
                case "size" :
                    System.out.println(que.size());
                    break;
                case "empty" :
                    if (que.isEmpty()) System.out.println("1");
                    else System.out.println("0");
                    break;
                case "front" :
                    if (que.isEmpty()) System.out.println("-1");
                    else System.out.println(que.peek());
                    break;
                case "back" :
                    if (que.isEmpty()) System.out.println("-1");
                    else System.out.println(que.peekLast());
                    break;
            }
        }

    }
}