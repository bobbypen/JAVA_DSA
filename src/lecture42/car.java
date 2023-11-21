package lecture42;

public class car {//implements Comparable<car>{

	int price;
	int speed;
	String color ;
	
	public car() {
		
	}
	
	
	
	
	public car (int price, int speed,String color) {
		this.price = price;
		this.speed = speed;
		this.color = color;
		
	}
		
		@Override
		
		public String toString() {
			return "p :" + this.price + "S :" + this.speed +"C :" + this.color;
		}
		
		
//		@Override
//		public int compareTo(car o) {
////			return this.price - o.price;
//			//return this.speed - this.speed;
////			return this.color.compareTo(o.color);
//			
//			
//		}
		
	}
	
