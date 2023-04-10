package org.week1.week2.day1.lostNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int answer = 0;
        String[] minus = str.split("-");

        for(int i = 0; i < minus.length; i++){
            String[] plus = minus[i].split("\\+");
            int sub = 0;

            for(int j = 0; j < plus.length; j++){
                sub += Integer.parseInt(plus[j]);
            }
            //  i == 0 이면 아직 -가 나오기 전
            if(i == 0)answer = sub;
            else answer -= sub;
        }

        System.out.println(answer);
    }
}
