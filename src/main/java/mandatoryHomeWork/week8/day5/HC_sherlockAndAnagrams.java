package mandatoryHomeWork.week8.day5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HC_sherlockAndAnagrams {
	
	 public static int sherlockAndAnagrams(String s) {
		    // Write your code here
	HashMap<String, Integer> mp = new HashMap<>();
    int ans = 0;

    for (int i = 0; i < s.length(); i++) {
        int window = i + 1;
        int left = 0, right = 0;
        while (right <= s.length()) {
            if (right - left == window) {
                String ref = s.substring(left, right);
                char[] ch = ref.toCharArray();
                Arrays.sort(ch);
                ref = String.valueOf(ch);
                if (!mp.containsKey(ref)) {
                    mp.put(ref, 0);
                }
                mp.put(ref, mp.get(ref) + 1);
                left++;
            } else {
                right++;
            }
        }
    }


    for (Map.Entry<String, Integer> entry : mp.entrySet()) {
        int num = entry.getValue();
        if(num != 1) ans += (num*(num-1))/ 2;
    }

    return ans;
}

}