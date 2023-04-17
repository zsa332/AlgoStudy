import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        LinkedList<Integer> deque = new LinkedList<>();
        
        for(int i = 1; i <= N; i++){
            deque.offer(i);
        }
        
        int[] nums = new int[M];
        for(int i = 0; i < M; i++){
            nums[i] = sc.nextInt();
        }
        
        int answer = 0;
        for(int target : nums){
            int target_loc = deque.indexOf(target);
            int half_loc = deque.size()/2;
            
            //	오른쪽으로 이동할때 더 가까운 경우
            if(target_loc <= half_loc){
                while(deque.peek() != target){
                    deque.addLast(deque.pollFirst());
                    answer++;
                }
            }
            //	왼쪽으로 이동할때 더 가까운 경우
            else{
                while(deque.peek() != target){
                    deque.addFirst(deque.pollLast());
                    answer++;
                }
            }
            deque.removeFirst();
        }
        System.out.println(answer);
    }
}
