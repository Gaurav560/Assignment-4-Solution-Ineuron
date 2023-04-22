package in.ineuron.main;
public class Q3 {

	public static void main(String[] args) {
		// check whether 2552 is PALINDROME or not 
		int count=0;
		// a string
		String palindromeCheck = "2552";
		char[] arr=palindromeCheck.toCharArray();

		for (int i = 0; i < arr.length/2; i++) {
			
			if (arr[i]==arr[arr.length-1-i]) {
		count++;
			}else {
				System.out.println("not a palindrome number.");
				break;
			}
			
		}if (count==arr.length/2) {
			System.out.println("palindrome number");
		}
	}

}
