import java.util.*;

class Solution {
    public List<List<Integer>> countFrequencies(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        
        // Count frequencies
        for(int num : nums) {
            if(map.containsKey(num)) {
                int k = map.get(num);
                map.replace(num, k+1);
            } else {
                map.put(num, 1);
            }
        }

        // Convert map entries to List<List<Integer>>
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            List<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            res.add(pair);
        }
        
        return res;
    }
}
