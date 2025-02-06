import java.util.*;
public class CountVowels{
	public static void main(String []args){
		Scanner adi= new Scanner(System.in);
		String s= adi.next();
		s=s.toLowerCase();
		
		int c=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
				c++;
			}
		}
		
		System.out.println("Vowel Count: "+c);
		System.out.println("Consonant Count: "+ (s.length()-c));
		
	}
}
