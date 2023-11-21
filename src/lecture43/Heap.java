package lecture43;

import java.util.*;

public class Heap {

	private ArrayList<Integer> ll = new ArrayList<>();

	public void Add(int item) {
		ll.add(item);
		unheapify(ll.size() - 1);
	}

	private void unheapify(int ci) {
		int pi = (ci - 1) / 2;
		if (ll.get(pi) > ll.get(ci)) {
			Swap(pi, ci);
			unheapify(pi);

		}

	}

	private void Swap(int i, int j) {
		int ith = ll.get(i);
		int jth = ll.get(j);
		ll.set(i, jth);
		ll.set(i, ith);
	}

	public int size() {
		return ll.size();

	}

	public int get() {
		return ll.get(0);
	}

	public void Display() {
		System.out.println(ll);
	}

	public int remove() {
		Swap(0, ll.size() - 1);
		int rv = ll.remove(ll.size() - 1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi) {
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;
		if (rci < ll.size()  &&  ll.get(mini)>ll.get(lci)) {
			mini = lci;
		}
		
		
		if (rci < ll.size() &&  ll.get(mini)>ll.get(rci)) {
			mini = rci;
	}
		
		if (mini != pi) {
			Swap(mini,pi);
			downheapify(mini);
		}

}
	
	
	
	

}