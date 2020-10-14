package Kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2{

    public static void main(String[] args) {
        int[] data = {2,3,5,6,4,7,8,1,5,9,7,5,3,6,4};
        Map<Integer,Integer> histogram = new HashMap<>();
        
        for(int i = 0; i < data.length; i++) {
            if(histogram.containsKey((Integer)data[i])) {
                histogram.put(data[i], histogram.get(data[i]) + 1);
            } else {
                histogram.put(data[i], 1);
            }
        }
        
        for(Integer key : histogram.keySet()) {
            System.out.println("Key: " + key + ", Value: " + histogram.get(key));
        }
    }
}