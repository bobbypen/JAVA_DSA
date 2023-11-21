package lecture18;
import java.util.*;
public class _7_array_List_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		
		//add 
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		System.out.println(list.size());
		
		list.remove(0);
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		list.set(0, 588);
		System.out.println(list);
		
		
		Collections.sort(list);
		System.out.println(list);
	}

}
