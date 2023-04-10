package org.week1.week2.day1.virus;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<ArrayList<Integer>> network;
    static boolean[] visited;
    static int answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  입력 및 초기화
        int N = sc.nextInt();
        int M = sc.nextInt();

        network = new ArrayList<>();

        for(int i = 0; i < N; i++){
            network.add(new ArrayList<>());
        }
        for(int i = 0; i < M; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            network.get(a).add(b);
            network.get(b).add(a);
        }

        visited = new boolean[N];
        answer = -1;
        dfs(0);

        System.out.println(answer);
    }

    public static void dfs(int current){
        visited[current] = true;
        answer++;
        //  연결된 컴퓨터에서 방문하지 않은 컴퓨터로 이동
        for(int i : network.get(current)){
            if(!visited[i]){
                dfs(i);
            }
        }
    }
}
