import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11047_동전개수의최솟값 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] coins = new int[N];
		for(int i = 0; i < N; i++) {
			coins[i] = Integer.parseInt(br.readLine());
		}
		
		int curMoney = K;
		int coinNum = 0;
		int i = coins.length-1;
		while(curMoney != 0) {
			coinNum += curMoney / coins[i];
			curMoney = curMoney % coins[i];
			i--;
		}
		
		System.out.println(coinNum);
	}
}
