package coreJava;

import java.util.ArrayList;

public class uniqueNonDuplicate {
	
public static void main(String[] args) {
		
	// Input array
	int a[] = {4, 6, 7, 43, 43, 4, 7};
	
	// Lists to store unique and duplicate numbers
	ArrayList<Integer> uniqueNumbers = new ArrayList<Integer>();
	ArrayList<Integer> duplicateNumbers = new ArrayList<Integer>();
	
	// Iterate through each element in the array
	for (int i = 0; i < a.length; i++) {
		
		// Check if the current element is already a duplicate
		if (!duplicateNumbers.contains(a[i])) {
			
			// Check if the current element is in the list of unique numbers
			if (!uniqueNumbers.contains(a[i])) {
				
				// If not in unique list, add to the list of unique numbers
				uniqueNumbers.add(a[i]);
			} else {
				// If already in unique list, remove from unique and add to duplicate list
				uniqueNumbers.remove(Integer.valueOf(a[i]));  // Remove from unique if it was added previously
				duplicateNumbers.add(a[i]);  // Add to duplicate list
			}
		}
	}
	
	// Print the list of non-duplicate numbers
	System.out.println("Non-duplicate numbers: " + uniqueNumbers);
}
}