package Kata2;

import java.util.Map;
import java.util.HashMap;

public class Histogram {
    
    private final int[] data;

    public Histogram(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }
    
    Map<Integer,Integer> getHistogram(){
        Map<Integer,Integer> histogram = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            histogram.put(data[i], histogram.containsKey((Integer)data[i])? histogram.get(data[i]) + 1 : 1);
        }
        return histogram;
    }
}
