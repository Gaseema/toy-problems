
public class test {
	public int first;
	public int second;
	public int largestNumOfThree(double a, int b, int c){
		first = (int) (a > b ? a : b);
		second= (int) (first > c ? first : c);
		return second;
	}
}
