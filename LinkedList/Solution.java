package JavaHackerRank.List;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {

	 public static void main(String[] args) {
	        
	        Scanner input = new Scanner(System.in);
	        int n = input.nextInt();
	        int index;
	        
	        LinkedList<Integer> linkedList = new LinkedList<Integer>();
	            
	        for(int i = 0; i<n; i++) {
	            int number = input.nextInt();
	            linkedList.add(number);
	        }
	        
	        int q = input.nextInt();
	        String process = "";
	        
	        for(int i = 0; i<q; i++) {
	        	process = input.next();
	           if(process.equals("Insert")) {
	        	   index = input.nextInt();
	        	   int newNumber = input.nextInt();
	        	   linkedList.add(index, newNumber);
	           }
	           
	           if(process.equals("Delete")) {
	        	   index = input.nextInt();
	        	   linkedList.remove(index);
	           }
	        }
	        
	        for(Integer num : linkedList) {
	        	System.out.print(num + " ");
	        }
	    }

}
