package lecture48;

//2
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dijkstra_Algo {
	HashMap<Integer , HashMap<Integer , Integer>> map;
	
	public Dijkstra_Algo(int v) {
		map = new HashMap<>();
		for(int i=1; i<=v; i++ ) {
			map.put(i , new HashMap<>());
		}
	}
	
	public void AddEdge(int v1 , int v2 , int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	
	class DijkstraPair {
		int vtx;
		String Acqvtx;
		int cost;
		
		public DijkstraPair(int vtx , String string , int cost) {
			this.vtx = vtx;
			this.Acqvtx = string;
			this.cost = cost;
		}
		public String toString() {
			return this.vtx + " @ "+this.Acqvtx+ " "+ this.cost;
		}
	}
	
	public void Dijkstra() {
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {

			@Override
			public int compare(DijkstraPair o1, DijkstraPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		
		
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new DijkstraPair(1 , "1" ,0));             //1 ko 1 ke through with cost 0
		while(!pq.isEmpty()) {
			//1.remove
			DijkstraPair rp = pq.poll();
			//2.ignore
			if(visited.contains(rp.vtx)) {
				continue;
			}
			//3.Marked visited
			visited.add(rp.vtx);
			//4.Self work
			System.out.println(rp);
			//5. Add NBRS
			for(int nbrs : map.get(rp.vtx).keySet()) {                     //uske neighbous mile
				if(!visited.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs);
					pq.add(new DijkstraPair(nbrs, rp.Acqvtx+nbrs, rp.cost+cost));
				}
			}
		}
	}
	public static void main(String[] args) {
		Dijkstra_Algo p = new Dijkstra_Algo(7);
		p.AddEdge(1, 2, 2);
		p.AddEdge(2, 3, 2);
		p.AddEdge(1, 4, 2);
		p.AddEdge(4, 3, 5);
		p.AddEdge(4, 5, 1);
		p.AddEdge(5, 6, 3);
		p.AddEdge(5, 7, 7);
		p.AddEdge(6, 7, 2);
		p.Dijkstra();
	}

}