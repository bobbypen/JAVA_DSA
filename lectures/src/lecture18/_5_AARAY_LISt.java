package lecture18;
import java.util.*;
public class _5_AARAY_LISt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		list.add(10);
		list.add(10);
		list.add(10);
		System.out.println(list);
		
		
		System.out.println(list.size());
		
		list.add(1,20);
		System.out.println(list);
		
		
		System.out.println(list.get(2));
		
		
		
		System.out.println(list.remove(1));
		
		
		
		System.out.println(list);
		
		
		
		System.out.println(list.set(1, -11));
		
		
		System.out.println(list);
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
		for (int i : list) {
			System.out.println(i);
		}
		
		
	}

}
