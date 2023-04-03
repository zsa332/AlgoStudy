package org.week1.day1.Resignation;

import java.util.Scanner;

public class Main {
//  https://www.acmicpc.net/problem/14501
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        //  1. 정보 입력 및 초기 세팅
        int n = sc.nextInt();
        int[] days = new int[n];
        int[] price = new int[n];
        int[] dp = new int[n+1];

        for(int i = 0; i < n; i++){
            days[i] = sc.nextInt();
            price[i] = sc.nextInt();
        }
        //  2. dp를 활용하여 날짜별 최대 이익 계산
        for(int i = 0; i < n; i++){
            if(i+days[i] < n+1){
                dp[i+days[i]] = Math.max(price[i]+dp[i], dp[i+days[i]]);
            }
            dp[i + 1] = Math.max(dp[i+1], dp[i]);
        }

        System.out.println(dp[n]);
    }
}
