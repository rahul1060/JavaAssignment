import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TextMatRep {
	public static void main(String ...z) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		int n = sc.nextInt();
		ArrayList<Integer> pa = new ArrayList<>();
		sc.nextLine();
		while(n-- > 0) {
			String pat = sc.nextLine();
			for(int i=0; i<text.length(); i++) 
			{
			int j, k = i;
			for(j=0; j<pat.length() && k < text.length(); j++) 
				{
			if(text.charAt(k) == pat.charAt(j))
			k++;
			else
				break;
				}
			if(j == pat.length())
				pa.add(i);
			}
		}
			Collections.sort(pa);
			for(Integer i : pa)
				System.out.print(i + " ");
	}
	
	
}