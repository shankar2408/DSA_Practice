package mandatoryHomeWork.week8.day4;

import java.util.*;

import org.junit.Test;

public class HC_MarsExploration {

	@Test
	public void example1() {
		String s="SOSSPSSQSSOR";
		System.out.println(marsExploration(s));
	}
	
	@Test
	public void example2() {
		String s="SOSSOT";
		System.out.println(marsExploration(s));
	}
	
	@Test
	public void example3() {
		String s="SOSSOSSOS";
		System.out.println(marsExploration(s));
	}
	
	public static int marsExploration(String s) {
		int len = s.length()/3;
	    String b = "";
	    while(len>0){
	        b+= "SOS";
	        len--;
	    }
	     int count = 0;
	     
	     for(int i = 0 ; i<s.length();i++){
	         if(s.charAt(i)!=b.charAt(i)) 
	        	 count++;
	         
	     }
	      return count;
	    }

	}
