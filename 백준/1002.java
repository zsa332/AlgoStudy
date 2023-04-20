import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        int answer;
        for(int i = 0; i < T; i++){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double r1 = sc.nextDouble();
            
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double r2 = sc.nextDouble();
            
            double distance = Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2));
            double r_sum = r1 + r2;
            answer = 0;
            // 동심원
            if(distance == 0){
            	// 반지름이 같을 때
                if(r1 == r2)answer = -1;
                // 반지름이 다를 때
                else answer = 0;
            }
            // 동심원이 아닐 때
            else if(distance > 0){
            	// 반지름의 합이 원의 중심 간의 거리 보다 작을 때
                if(r_sum < distance)answer = 0;
                // 반지름의 합과 원의 중심 간의 거리가 같을 때
                else if(r_sum == distance)answer = 1;
                // 반지름의 합이 원의 중심 간의 거리보다 클 때
                else if(r_sum > distance){
                	// 하나의 원이 다른 원을 감싸고 있을 때
                    if(r1 + distance < r2|| r2 + distance < r1)answer = 0;
                    // 감싸진 원과 감싼 원이 닿아 있을 때
                    else if(r1 + distance == r2 || r2 + distance == r1)answer = 1;
                    // 감싸진 원이 감싼 원을 넘어가 있을 때
                    else answer = 2;
                }
            }
            System.out.println(answer);
        }
    }
}
