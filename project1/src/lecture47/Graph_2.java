package lecture47;
import java.util.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_2 {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph_2(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	
	
	public void BFT() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		for(int key: map.keySet()) {
			if (visited.contains(key)) {
				continue;
				
			}
			q.add(key);
			while(!q.isEmpty()) {
				//1. remove
				int rv = q.poll();
				
				//2. if already then ignore
				if (visited.contains(rv)) {
					continue;
					
				}
				//3. marked visited
				
				visited.add(rv);
				
				//4. self work
				
				System.out.println(rv + " ");
				//5. add nbrs
				
				for(int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}		
			}
		
	}
	
	
	public void DFT() {
		Stack<Integer> st = new Stack<>();  //dfs mien stack use krenge
		HashSet<Integer> visited = new HashSet<>();
		for(int key: map.keySet()) {
			if(visited.contains(key)) {
				continue;
			}
		
		st.add(key);
		while(!st.isEmpty()) {
			// 1) remove
			int rv = st.pop();    //dfs mien push aajayega becoz stack use krenge
			//if already then Ignore
			if(visited.contains(rv)) {
				continue;
			}
			// 3) marked visited
			visited.add(rv);
			// 4) self work
			System.out.print(rv + " ");
			// 5) Add neighbours
			for(int nbrs: map.get(rv).keySet()) {
				if(!visited.contains(nbrs)) {
					st.push(nbrs);   //dfs mien push hoga
				}
			}
		}
	}
	}
	
	
	
	
	
	
	
}
