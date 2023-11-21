package assignment2;

public class Q_8celsius {

	public static void main(String[] args) {
		int min =0;
		int max = 100;
		int step = 20;
		
	int	i = min;
		while (i<=max) {
			int c = (int)((0.55/*5.0/9*/)*(i-32));
			System.out.println(i  + " " + c);
			
			
			i = i+step;
		}
		
		
	}
}
