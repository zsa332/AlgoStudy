import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class P11724_연결개수 {
	static ArrayList<ArrayList<Integer>> graph;
	static boolean[] visited;
	
	public static void dfs(int cur) {
		visited[cur] = true;
		for(int i = 0; i < graph.get(cur).size(); i++) {
			if(!visited[graph.get(cur).get(i)]) {
				dfs(graph.get(cur).get(i));
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		graph = new ArrayList<>();
		for(int i = 0; i <= N; i++) {
			graph.add(new ArrayList<>());
		}
		for(int i = 0; i < M; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		
		int answer = 0;
		visited = new boolean[N+1];
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 1; i <= N; i++) {
			if(!visited[i]) {
				queue.add(i);
				visited[i] = true;
				while(!queue.isEmpty()) {
					int cur = queue.poll();
					ArrayList<Integer> curList = graph.get(cur);
					for(int j = 0; j < curList.size(); j++) {
						if(!visited[curList.get(j)]) {
							visited[curList.get(j)] = true;
							queue.add(curList.get(j));
						}
					}
				}
				answer++;
			}
//			if(!visited[i]) {
//				dfs(i);
//				answer++;
//			}
//			if(!visited[i]) {
//				stack.push(i);
//				while(!stack.isEmpty()) {
//					int cur = stack.pop();
//					if(!visited[cur]) {
//						visited[cur] = true;
//						for(int j = 0; j < graph.get(cur).size(); j++) {
//							stack.push(graph.get(cur).get(j));
//						}
//					}
//				}
//				answer++;
//			}
		}
		
		
		
		
		System.out.println(answer);
	}
	
}
