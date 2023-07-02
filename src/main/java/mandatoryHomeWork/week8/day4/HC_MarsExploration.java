package mandatoryHomeWork.week8.day4;

import java.util.*;

import org.junit.Test;

public class HC_MarsExploration {

	@Test
	public void example1() {
		String s="SOSSPSSQSSOR";
		marsExploration(s);
	}
	
	@Test
	public void example2() {
		String s="SOSSOT";
		marsExploration(s);
	}
	
	@Test
	public void example3() {
		String s="SOSSOSSOS";
		marsExploration(s);
	}
	
	public static int marsExploration(String s) {
   int size=s.length();
        int count=0;
        
        for(int i=0;i<size;i++){
            if(s.charAt(i)=='S' || s.charAt(i)=='O'){
                count++;
            }
        }
        
        return size-count;

    }
}
