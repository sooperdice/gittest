package coreJava;

public class nestedLoops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// nested loops works - pyramid triangle
//		int k = 1; // initialise k as 1 to iterate this value
//		for (int i = 1; i <= 4; i++) // (outer for loop) this block will loop for 4 times
//		{
//			 //System.out.println( "outer loop started");
//			for (int j = 1; j <= 5-i; j++) // inner loop runs 4 times
//			{
//				System.out.print( k);  //print on same line
//				System.out.print("\t"); //print with space between
//				k++;
//			}
//			 System.out.println("");  // print blank new line after inner loop
//		}
//	}

	// Example on pyramid Triangle reverse

//	public class loop2demo {
//
//		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int k=1;
			for (int i = 1; i < 5; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(k* 3);
					System.out.print("\t");
					k++;
				}
				System.out.println("");

			}
		}

	

}
