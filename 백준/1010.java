import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int test_case = sc.nextInt();

        for(int i = 0; i < test_case; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int answer = 1;
            //  n == m 이면 경우의 수가 1개
            if(n == m)answer = 1;
            else{
                //  nCr 계산
                for(int j = 0; j < n; j++){
                    answer *= m-j;
                    answer /= 1+j;
                }
            }
            System.out.println(answer);
        }
    }
}
