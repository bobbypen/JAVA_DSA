package lecture27;
import java.util.*;
public class _4_random_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int si = 10;
		int ei = 100;
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int item = r.nextInt(ei-si+1)+si;
			System.out.println(item);
		}
		
	}

}
