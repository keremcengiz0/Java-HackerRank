package JavaHackerRank.Anagrams;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    
	  static boolean isAnagram(String a, String b) {
	        
	        a = a.toLowerCase();
	        b = b.toLowerCase();
	        String reverseB = "";
	        
	        char[] arrA = a.toCharArray();
	        char[] arrB = b.toCharArray();
	        
	        Arrays.sort(arrA);
	        Arrays.sort(arrB);

	        String sortedA = new String(arrA);
	        String sortedB = new String(arrB);
	        
	        return sortedA.equals(sortedB);
	    }

	    public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}
