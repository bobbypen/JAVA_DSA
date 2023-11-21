package lecture21;

public class _4_lexicon_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		lexico(0,n);
	}
public static void lexico(int curr,int n) {
	//for loop k i ko bha bana skte h
	if (curr>n) {
		return;
	}
	System.out.println(curr);
	int i = 0;
	if(curr==0) {
		i=1;
	}
	for (; i <=9; i++) {
		lexico(curr * 10 + i,n);
	}
}
}
