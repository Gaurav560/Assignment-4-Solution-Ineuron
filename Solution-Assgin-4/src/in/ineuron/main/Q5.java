package in.ineuron.main;

public class Q5 {

	public static void main(String[] args) {
		// program to check whether two strings are Anagram or Not

		// count variable to count no of characters present in smaller length array
		int count = 0;
		int count1 = 0;

		// 1st string
		String str1 = "abababa1";

		// converting string to LOWERCASE
		String str2 = str1.toLowerCase();

		// converting string to character array to use index based approach
		char[] arr1 = str2.toCharArray();

		// 1st string
		String str3 = "ab";

		// converting string to LOWERCASE(making new string because strings are immutable)
		String str4 = str3.toLowerCase();

		// converting string to character array use index based approach
		char[] arr2 = str4.toCharArray();

		// checking which array length is small .after finding which array is smaller in
		// size,we compare each
		// element of smaller array to larger array elements.if each element of smaller
		// array matches in larger array,then it is anagram otherwise not

		if (arr1.length > arr2.length) {

			// traversing through smaller array
			for (int i = 0; i < arr2.length; i++) {

				// traversing through larger array
				for (int j = 0; j < arr1.length; j++) {
					if (arr2[i] == arr1[j]) {

						// increasing the count variable ,if element matches in both array
						count++;
						break;
					}

				}

			}
			System.out.println("count::"+count);

			if (count == arr2.length) {

				for (int i = 0; i < arr1.length; i++) {
					for (int j = 0; j < arr2.length; j++) {
						if (arr1[i] == arr2[j]) {
							count1++;
							break;
						}

					}

				}
				System.out.println("count1::"+count1);

				if (count1 == arr1.length) {
					System.out.println("anagram");
				} else {
					System.out.println("not anagram ");
				}
			}

		} 
		
		
		
		
		
		//***************************************************************************************
		
		//else condition means if arr1 is smaller in size  or equal in size to arr2
	
		else {
			
			// traversing through smaller array
			for (int i = 0; i < arr1.length; i++) {

				// traversing through larger array
				for (int j = 0; j < arr2.length; j++) {
					if (arr1[i] == arr2[j]) {

						// increasing the count variable ,if element matches in both array
						count++;
						break;
					}

				}

			}
			System.out.println("count::"+count);

			if (count == arr1.length) {

				for (int i = 0; i < arr2.length; i++) {
					for (int j = 0; j < arr1.length; j++) {
						if (arr2[i] == arr1[j]) {
							count1++;
							break;
						}

					}

				}System.out.println("count1::"+count1);

				if (count1 == arr2.length) {
					System.out.println("anagram");
				} else {
					System.out.println("not anagram ");
				}
			}

		}

	}

}
