package org.example.codingtest;

class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean ans = false;
        if(ineq == "<") {
            if(eq == "=") ans = n<=m;
            else ans = n<m;
        }else{
            if(eq == "=") ans = n>=m;
            else ans = n>m;
        }
        if (ans) return 1;
        return 0;
    }
}