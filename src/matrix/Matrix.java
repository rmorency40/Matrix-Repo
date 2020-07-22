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
				
						 System.out.println("\nLoop starting ...");
				for (int i = 0; i < 10; i++) {
					System.out.print(i * i + " ");
				}
				System.out.println("\n\n");
				for (int n= 0; n < 12; n++) {
					System.out.print(n  + n + " ");
				}
				
				System.out.println("\n\n\nProgram end...");
				System.out.println("\n\nProgram ended");
	}

}
