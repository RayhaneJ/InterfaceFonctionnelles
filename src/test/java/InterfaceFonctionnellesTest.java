import org.junit.jupiter.api.Test;
import org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class InterfaceFonctionnellesTest {
    @Test
    private void sommeIntTest(){
        Somme<Integer> s = (x,y) -> x+y;
    }

    @Test
    private void sommeLongTest(){
        Somme<Long> s = (x,y) -> x+y;
    }

    @Test
    private void sommeDoubleTest(){
        Somme<Double> s = (x,y) -> x+y;
    }

    @Test
    private void sommeStringTest(){
        Somme<Double> s = (x,y) -> x+y;
    }

    @Test
    private void convertListStringTest(){
        ToString<List<String>> t = (x) -> {
            StringBuilder sb = new StringBuilder();
            for(String v : x) {
               sb.append(String.format("%s,", v));
            }
            return sb.toString();
        };
    }

    @Test
    private void convertMapIntTest(){
        ToString<Map<String, Integer>> t = (x) -> {
            StringBuilder sb = new StringBuilder();
            x.forEach((k, v) -> sb.append(String.format("%i:%i", k, v)) );
            return sb.toString();
        };
    }
}
