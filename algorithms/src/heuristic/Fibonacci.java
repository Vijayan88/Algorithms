package heuristic;

public class Fibonacci {

	public int series(int num) {
		if(num == 0) return 0;
		if(num == 1) return 1;
		else{
			return series(num-1) + series(num-2);
		}
		
	}
}
