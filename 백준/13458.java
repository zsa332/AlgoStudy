import java.util.Scanner;

public class Main {
//  https://www.acmicpc.net/problem/13458
    public static void main(String[] org){
        Scanner sc = new Scanner(System.in);

        //  1. 정보 입력 및 초기 세팅
        int n = sc.nextInt();
        int[] room = new int[n];

        for(int i = 0; i < n; i++){
            room[i] = sc.nextInt();
        }

        int b = sc.nextInt();
        int c = sc.nextInt();

        //  2. 총감독관이 감독하는 학생 재외 후 필요 감독관 계산
        long inspector = 0;
        for(int i = 0; i < n; i++){
            int temp = room[i];
            inspector++;
            if(temp > b){
                temp -= b;
                int share = temp / c;
                if(temp % c > 0)share++;
                inspector += share;
            }
        }

        System.out.println(inspector);
    }
}
