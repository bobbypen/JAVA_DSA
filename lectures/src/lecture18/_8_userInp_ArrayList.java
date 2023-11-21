package lecture18;
import java.util.*;
public class _8_userInp_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stubort java.u
		Scanner sc = new Scanner (System.in);
		ArrayList<Integer>list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(sc.nextInt());
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(list.get(i));
		}

	}

}
