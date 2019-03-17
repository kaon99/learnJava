package streams;


import com.sun.corba.se.spi.orb.Operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTask {
    public static void main(String[] args){


        int array[] = {5, 35, 245, 12, 643, 1, 46, 34};
        ArrayList a  = new ArrayList();
        a.add(12);
        a.add(12);
        a.add(12);
        a.add(12);
        int g = array[1];

        System.out.println(  Arrays.stream(array).average().getAsDouble());
        System.out.println(Arrays.stream(array).min().getAsInt());
        Arrays.stream(array).filter(id-> array[id]==0).iterator();


    }
}
