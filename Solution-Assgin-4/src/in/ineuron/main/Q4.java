package in.ineuron.main;

public class Q4 {

	public static void main(String[] args) {
		// count number of constants,vowels and special characters in a string
		int vowel = 0;
		int constant = 0;
		int specialCharacter = 0;
		int numbers = 0;
		String str = "skdaeiuoAnamikaIsBeautiful@@!%^123";
		String str1 = str.toLowerCase();
		System.out.println(str1);
		char[] array = str1.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 'a' || array[i] == 'e' || array[i] == 'i' || array[i] == 'o' || array[i] == 'u') {
				vowel++;
			} else if (array[i] == 'b' || array[i] == 'c' || array[i] == 'd' || array[i] == 'f' || array[i] == 'g'
					|| array[i] == 'h' || array[i] == 'j' || array[i] == 'k' || array[i] == 'l' || array[i] == 'm'
					|| array[i] == 'n' || array[i] == 'p' || array[i] == 'q' || array[i] == 'r' || array[i] == 's'
					|| array[i] == 't' || array[i] == 'v' || array[i] == 'w' || array[i] == 'x' || array[i] == 'y'
					|| array[i] == 'z') {
				constant++;
			} else if (array[i] == '0' || array[i] == '1' || array[i] == '2' || array[i] == '3' || array[i] == '4'
					|| array[i] == '5' || array[i] == '6' || array[i] == '7' || array[i] == '8' || array[i] == '9') {

				numbers++;
			} else {
				specialCharacter++;
			}

		}
		System.out.println("no of vowels in the string is ::"+vowel);
		System.out.println("no of consonants in the string is ::"+constant);
		System.out.println("no of special characters in the string is ::"+specialCharacter);
		
		
		
		
	}


	}

