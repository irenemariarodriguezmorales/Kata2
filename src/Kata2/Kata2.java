package Kata2;

import java.util.Iterator;
import java.util.Map;

public class Kata2 {
        
    public static void main(String[] args) {
        Integer[] data = {2,3,5,6,4,7,8,1,5,9,7,5,3,6,4};
        String[] data2 = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        Histogram histogram = new Histogram(data2);
        Iterator <Map.Entry<String,Integer>> entries = histogram.getHistogram().entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String,Integer> entry = entries.next();
            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
        }   
    }
}

