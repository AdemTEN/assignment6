package assgnment6;

public class Question6 {

	public static void main(String[] args) {

		int row = 5;
		
		for (int i = 1; i <= row  ; i++  )  {
			int number = i;
			for (int j = 1; j <= i; j++  ) {
				
				System.out.print(number+ " ");
				
				number = number + row - j;
				
				
				
				
			}
			
			
	System.out.println();
			
		}
		
	
		
	}

}
