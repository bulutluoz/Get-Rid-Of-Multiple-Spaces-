package get_rid_of_mutiple_spaces;

import java.util.ArrayList;
import java.util.List;

public class GetRidOfMultipleSpaces {

	public static void main(String[] args) {
		/* Write java code to get rid of multiple spaces from a string. 
		 * 
		 */

		String input = "I am  learning   Java. I liked  it     very much.";
		
		//1)Long way
		String words[]=input.trim().split("\\s");
		List<String> output2=new ArrayList<>();
		
		String temp;
		for(String each:words) {
			temp=each.trim();
			if(!temp.equals("")) {
				output2.add(temp);	
			}
		}
		
		System.out.println("output as list \n" + output2);
		
		System.out.println("output from long way" );
		for(int i=0;i<output2.size();i++) {
			System.out.print(output2.get(i)+" ");
		}
		System.out.println("");
		//2)The shortest way
		
		String output=input.trim().replaceAll("\\s+", " ");
		System.out.println("output from the Shortest way \n" +output);
		
	}

}
