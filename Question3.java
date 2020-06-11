package assgnment6;

public class Question3 {

	public static void main(String[] args) {

		 int row = 7;
		
		for (int  i=0 ; i < row; i++ ) {
			
			for (int j = 0 ;j < i; j++ ) {
				System.out.print(" ");
			}
			for(int k = i+1 ; k <= row ;k++  ) {
				System.out.print(k+ " " );
			}
			System.out.println();
		}
		
		row -= 1 ;
		for (int i = 1; i <= row; i++) {
			
			for (int j = 1; j <= row -i ; j++) {
				System.out.print(" ");
			}
			for (int k = 7-i ; k <= 7 ; k++ ) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
