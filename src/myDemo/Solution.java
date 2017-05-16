package myDemo;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter String : ");
		String fullString = in.nextLine();
		
		StringBuilder sb= null;
		boolean continueFlag = false;
		
		do {
			sb= new StringBuilder();
			continueFlag = false;
			for (int i = 0; i < fullString.length(); i++) {
				String curr = fullString.charAt(i) + "";

				int count = 1;
				boolean innerFlag = false;

				do {
					int nextIndex = i + 1;
					if (nextIndex < fullString.length()) {
						//check for next char
						String tempNext = fullString.charAt(nextIndex) + "";

						//if it is same as curr char , continue searching till char is different or string end reches
						if (tempNext.equals(curr)) {
							continueFlag= true;
							count++;
							innerFlag = true;
							i = nextIndex;
						} else
							innerFlag = false;
					} else
						innerFlag = false;
				} while (innerFlag);

				if (count % 2 != 0) {
					sb.append(curr);
				}

			} 
			fullString= sb.toString();
		} while (continueFlag);
		
		
		String finalString = sb.toString();
		if (finalString.length()>0) {
			System.out.println("Final Output : "+sb.toString());
		} else {
			System.out.println("Empty String");
		}
		
	}
}