import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1920_원하는정수찾기 {
	static int[] nums;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		nums = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(nums);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			int target = Integer.parseInt(st.nextToken());
			int start = 0;
			int end = N - 1;
			boolean check = false;
			while(start <= end) {
				int mid = (start + end) / 2;
				if(target < nums[mid])end = mid - 1;
				else if(target > nums[mid])start = mid + 1;
				else if(target == nums[mid]) {
					check = true;
					break;
				}
			}
			if(check)System.out.println(1);
			else System.out.println(0);
		}
	}
}
