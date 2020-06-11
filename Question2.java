package assgnment6;

public class Question2 {

	public static void main(String[] args) {

		int row = 7 ;
		
		for(int i = 0; i < row  ;i++   ) {
			
			for (int j = 1; j <= row-i ;j++ ) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		row = 6;
		for(int  i = 1; i <= row  ;i++   ) {
			
			for (int j = 1; j <= (i +1); j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
