package dynamic_programming;

public class Fibonacci {

	public int series(int num) {
		int results[] = new int[num+1];
		results[0]= 0;
		results[1]=1;
		for(int i = 2;i<=num;i++){
			results[i]=results[i-1] + results[i-2];
		}
		
		return (results[num]);
		
	}
}
