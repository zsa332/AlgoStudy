import java.util.Scanner;

class Main{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int T = sc.nextInt();
         int[] dp = new int[41];
         dp[0] = 0; 
         dp[1] = 1;
         dp[2] = 1;
         for(int i = 3; i < 41; i++){
             dp[i] = dp[i-1] + dp[i-2];
         }
         
         for(int i = 0; i < T; i++){
             int N = sc.nextInt();
             //	N이 0과 1일 때 예외처리
             if(N == 0)System.out.println("1 0");
             else if(N == 1)System.out.println("0 1");
             else System.out.println(dp[N-1]+ " " + dp[N]);
         }
     }   
}
