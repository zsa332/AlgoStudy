import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();

        for(int i = 0; i < test_case; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int answer = 1;
            //  1의 자리 숫자는 1의 자리 숫자로만 정해지기 때문에 제곱하며 10을 나눠줌
            for(int j = 0 ; j < b; j++){
                answer = answer * a % 10;
            }

            if(answer == 0)answer = 10;
            System.out.println(answer);
        }
    }
}
