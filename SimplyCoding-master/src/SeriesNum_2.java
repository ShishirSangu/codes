
public class SeriesNum_2 {
	static int seriesNum(int n) {
		int sum =0;
		for(int i=9;i<=n;i+=4) {
			sum = sum + i;
		}return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 20;
		int res = seriesNum(number);
		 
			System.out.println(res);

	}

}
