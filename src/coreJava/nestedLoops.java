package coreJava;

public class nestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// nested loops works -

		for (int i = 1; i <= 4; i++) // (outer for loop) this block will loop for 4 times
		{
			 System.out.println( "outer loop started");
			for (int j = 1; j <= 4; j++) // inner loop runs 4 times
			{
				System.out.print("inner loop");  //print on same line
				System.out.print("\t");
				
			}
			 System.out.println( "outerloop finished");
		}
	}

	// Example on pyramid Triangle

//	public class loop2demo {
//
//		public static void main(String[] args) {
//			// TODO Auto-generated method stub
//			// int k=1;
//			for (int i = 1; i < 5; i++) {
//				for (int j = 1; j <= i; j++) {
//					System.out.print(j);
//					System.out.print("\t");
//					// k++;
//				}
//				System.out.println("");
//
//			}
//		}
//
//	}

}
