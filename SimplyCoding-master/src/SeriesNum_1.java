
public class SeriesNum_1 {
	static int seriesNum(int n) {
		int num = 0;
//		int sub = 0;
		for(int i=1;i<=n;i++) {
			if(n%2==0)
				num += i;
			else
				num -= i;
		}return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i=1;i<=100;i++) {
		int number = 10;
			int res = seriesNum(number);
			 
				System.out.println(res);
//		}
	}

}
