package Kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {
        
    public static void main(String[] args) {
        int[] data = {2,3,5,6,4,7,8,1,5,9,7,5,3,6,4};
        Histogram histogram = new Histogram(data);
        Iterator <Map.Entry<Integer,Integer>> entries = histogram.getHistogram().entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer,Integer> entry = entries.next();
            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
        }   
    }
}

