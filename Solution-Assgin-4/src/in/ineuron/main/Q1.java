package in.ineuron.main;
import java.io.Console;
import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		// a program to remove duplicate characters from a string

		// a string
		String name = "AbraCaDabra";
		String name1 = name.toLowerCase();
		
		
		// changing to character array
		char[] array = name1.toCharArray();
		List<Character> list=new ArrayList<Character>();
		for (char c : array) {
			list.add(c);
		}
//		List<Character> list1=new ArrayList<Character>();
//		list1.addAll(list);
//		System.out.println(list1);

		// traversing the array with for loop
		//abracadabra
		for (int i = 0; i < list.size(); i++) {
			for (int j = i+1; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					list.remove(j);
				
				}
			}
			
		}	
	
		String string="";
		for (int i = 0; i < list.size(); i++) {
			string=string+list.get(i);
			//System.out.println(((Object)list.get(i)).getClass().getSimpleName());
		}System.out.println(string);
	}

}
