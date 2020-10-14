package Kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2{
    
        public static void main(String[] args) {
        int[] data = {2,3,5,6,4,7,8,1,5,9,7,5,3,6,4};
        Map<Integer,Integer> histogram = new HashMap<>();
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }

        for (Integer key : histogram.keySet()) {
            System.out.println("Key: " + key + ", Value: " + histogram.get(key));
        }
    }   
}

