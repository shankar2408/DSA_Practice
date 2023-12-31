package mandatoryHomeWork.week3.day4;

import org.junit.Test;

public class LC_1859_SortingTheSentence {
	/*
	 * 1859. Sorting the Sentence
	 * https://leetcode.com/problems/sorting-the-sentence/
	 */

	@Test
	public void example() {
		String s = "is2 sentence4 This1 a3";
		System.out.println(sortSentence(s));

	}

	@Test
	public void example1() {
		String s = "Myself2 Me1 I4 and3";
		System.out.println(sortSentence(s));

	}

	
	
	 public String sortSentence(String s) {
	        String[] arr = s.split(" ");
	        String[] sorted = new String[arr.length];

	        for (String str : arr) {
	            int len = str.length();
	            int index = str.charAt(len - 1) - '0';
	            //int index = Character.getNumericValue(str.charAt(len - 1));
	            //int index = Integer.parseInt(String.valueOf(str.charAt(len - 1)));  
	            sorted[index - 1] = str.substring(0, len - 1);
	        }
	        return String.join(" ", sorted);
	    }
	}