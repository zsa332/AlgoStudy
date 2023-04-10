package org.week1.day3.change;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //  보유한 동전배열
        int[] change_arr = {500, 100, 50, 10, 5, 1};
        int change = 1000 - sc.nextInt();

        int answer = 0;
        //  잔돈의 갯수 카운트
        for(int i = 0; i < change_arr.length; i++){
            answer += change / change_arr[i];
            change = change % change_arr[i];
        }

        System.out.println(answer);
    }
}