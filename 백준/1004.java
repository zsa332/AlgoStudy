import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for(int i = 0; i < T; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            
            int n = sc.nextInt();
            
            int answer = 0;
            for(int j = 0; j < n; j++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int r = sc.nextInt();
                
                //	출발지점, 도착지점과 행성원점과의 거리
                double start = Math.sqrt(Math.pow(x1-x, 2) + Math.pow(y1-y, 2));
                double end = Math.sqrt(Math.pow(x2-x, 2) + Math.pow(y2-y,2));
                if((start < r || end < r)&&!(start < r && end < r))answer++;
            }
            
            System.out.println(answer);
        }
    }
}
