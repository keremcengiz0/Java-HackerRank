package JavaHackerRank.DuplicateWords;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
	public static void main(String[] args) {
		String pattern = "(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+";
		Pattern r = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE); // Düzenli ifadeyi derleyerek bir Pattern
																		// nesnesi oluşturuluyor.
																		// Pattern.CASE_INSENSITIVE bayrağı,
																		// büyük-küçük harf duyarlılığını devre dışı
																		// bırakmak için kullanılıyor, yani tekrar eden
																		// kelimelerin
																		// büyük veya küçük harfle yazılmış olmalarına
																		// bakılmadan eşleştirme yapılıyor.

		Scanner input = new Scanner(System.in);

		int n = Integer.parseInt(input.nextLine()); 

		while (n > 0) { 
			String sentence = input.nextLine(); 

			Matcher m = r.matcher(sentence); 	// Cümleyi düzenli ifade ile eşleştirmek için bir Matcher nesnesi oluşturuluyor

			while (m.find()) { 				
				sentence = m.replaceAll("$1"); 	// Tekrar eden kelimeler, ilk halleri ile değiştirilir
			}

			System.out.println(sentence); 
			n--; 
		}
	}

}
