package lecture;

public class Tableof7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		int i = 1;
		int x;
		while(i<=n) {
			x = i * 7;
			if(x%4==0) {
				i++;
			}else {
				System.out.println(x);
				i++;
			}
			
			
		}
		
		

	}

}
