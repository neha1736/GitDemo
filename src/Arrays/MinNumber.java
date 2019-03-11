package Arrays;

public class MinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][] = {{2,6,5},{4,1,3},{-1,7,3}};
		
		int k = b[0][0];
		for(int i = 0; i< b.length; i++) {
			for(int j = 0; j< b.length; j++) {
				if (k > b[i][j]) {
					k = b[i][j];
				}
			}
		}
		System.out.println(k);

	}

}
