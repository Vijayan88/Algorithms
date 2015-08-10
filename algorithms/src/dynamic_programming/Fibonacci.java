package dynamic_programming;

public class Fibonacci {

	public static void main(String[] args) {
		int num = 21;
		int results[] = new int[num];
		results[0]= 0;
		results[1]=1;
		for(int i = 2;i<num;i++){
			results[i]=results[i-1] + results[i-2];
		}
		
		System.out.println(results[num-1]);
		
	}
}
