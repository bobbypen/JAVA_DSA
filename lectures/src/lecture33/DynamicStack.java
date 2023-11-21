package lecture33;

import java.util.*;

import lecture30.Stack_;

public class DynamicStack extends Stack_ {

	@Override
	public void push(int item) throws Exception {
	if (isfull()) {
		int[] a = new int[2*arr.length];
		for (int i = 0; i < arr.length; i++) {
			a[i] = arr[i];
		}
		arr=a;
	}
	super.push(item);
}

	
	public static void main(String[] args) throws Exception {
		DynamicStack ds = new DynamicStack();
		
		ds.push(1);
		ds.push(5);
		ds.push(7);
		ds.push(11);
		ds.push(12);
		ds.Display();
	}
	

}
