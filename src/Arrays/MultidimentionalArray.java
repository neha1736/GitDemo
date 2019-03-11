package Arrays;

public class MultidimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[2][2];
		a[0][0] = 7;
		a[0][1] = 1;
		a[1][0] = 4;
		a[1][1] = 9;
		System.out.println(a[1][0]);
		
		int b[][] = {{2,6,5},{4,1,3},{0,7,3}};
		System.out.println(b[1][0]);
		
		System.out.println("----Printing whole array----");
		
		for (int i=0 ; i<b.length ; i++) {
			System.out.println(" ");
			for (int j=0 ; j<b.length ; j++) {
				System.out.print(" " + b[i][j]);
			}
		
		}

	}

}
