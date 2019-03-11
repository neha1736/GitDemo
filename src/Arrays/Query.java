package Arrays;

public class Query {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Find out which row has the min number and the maximum number for the same column");
		int a[][] = {{1,2,3},{4,5,8},{7,6,0}};
		int t = a[0][0];

		int u = 0;
		int v = 0;
		
		for (int i= 0; i < 3; i++) {
			for(int j= 0; j < 3; j++) {
				if (a[i][j] < t) {
					t = a[i][j];
					u = i+1;
				}
				
			}
		}
		System.out.println("The row for the min number is:" + u);

		int s = a[u-1][0];
		for (int i = 0; i < a.length; i++) {
			if (a[u-1][i] > s) {
				s = a[u-1][i];
				v = i+1;
			}
		}
		System.out.println("The column with the maximum munber for row "+u+" is "+v);
	}

}
