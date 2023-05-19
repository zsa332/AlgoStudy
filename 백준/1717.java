import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1717_집합표현 {
	static int[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new int[n+1];
		for(int i = 0; i <= n; i++) {
			arr[i] = i;
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int action = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(action == 0) {
				Union(a,b);
			}
			else if(action == 1) {
				if(checkSame(a,b))System.out.println("YES");
				else System.out.println("NO");
			}
		}
	}

	private static int Find(int target) {
		if(target == arr[target])return target;
		else {
			return arr[target] = Find(arr[target]);
		}
	}

	private static void Union(int a, int b) {
		a = Find(a);
		b = Find(b);
		if(a != b) {
			arr[b] = a;
		}
	}
	
	private static boolean checkSame(int a, int b) {
		a = Find(a);
		b = Find(b);
		if(a == b)return true;
		else return false;
	}
}
