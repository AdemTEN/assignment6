package assgnment6;

public class Question4 {

	public static void main(String[] args) {

		int row = 9;
		int number = 0;
		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= i; j++) {

				if (j % 2 == 0) {
					number = 0;
					System.out.print(number);
				} else {
					number = 1;
					System.out.print(number);
				}

			}
			System.out.println();
		}

	}

}
