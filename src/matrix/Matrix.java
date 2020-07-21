package matrix;

public class Matrix {

	

			public static void main(String[] args) {
				System.out.println("Printing a MATRIX ...  in reverse mode and done....\n");
				String[][] matrix = { {"a","b","c"},
						                 {"e","f","g"},
						                {"h","i","j"} };
					  
						 for (String[] list : matrix) {
							 for (int i=list.length-1;i>=0;i--) {
								 System.out.print(list[i]);
					  }
					 }
				System.out.println("\nProgram end...");
				System.out.println("\n\n\nProgram end...");
				System.out.println("\n\nProgram ended");
				
				for (int i = 0; i < 10; i++) {
					System.out.print(i * i + " ");
				}

	}

}
