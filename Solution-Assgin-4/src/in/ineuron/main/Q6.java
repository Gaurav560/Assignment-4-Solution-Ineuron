package in.ineuron.main;

public class Q6 {

	public static void main(String[] args) {
		// program to check whether a strings are PANGRAM or Not
//PANGRAM-if it contains all the alphabets in the string 
		// count variable to count no of characters present in array

		String string = "The quick brown fox jumps over the lazy dog";
		// removing the white spaces .using string.replaceAll method .use regex \\s

		
		if (CheckPangram(string)==true) {
			System.out.println("pangram");

		} else {
			System.out.println("not pangram");
		}

	}

	public static boolean CheckPangram(String str) {
boolean f=true;
		String str1 = str.replaceAll("\\s", "");

		String str2 = str1.toLowerCase();
System.out.println(str2);
		// creating a boolean array of name flag
//a boolean array has default value false in its indexes 
		boolean[] fl= new boolean[26];

		int index = 0;
		for (int i = 0; i < str2.length(); i++)

		{
			if ('a' <= str2.charAt(i) && str2.charAt(i) <= 'z') {
				index = str2.charAt(i) - 'a';
				System.out.println(index);

			} else {
				continue;
			}
			fl[index] = true;
		}

		System.out.println(fl[25]);
		for (int i = 0; i <= 25;i++) 
			{
			if (fl[i] == false)
			{	
				f=false;
			}
				


	}return f;
		
	}

}
