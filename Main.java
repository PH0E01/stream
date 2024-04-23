import java.util.Arrays;
import java.util.*;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.*;

public class Main extends StreamMain{
    public static void main (String[] args){
        int[] arr = new int[]{1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        List<Integer> intList = new ArrayList<Integer>(arr.length);

        for (int i=0; i<arr.length; i++)
        {
            intList.add(arr[i]);
        }


        intList.removeIf(n -> (n < 0));
        intList.removeIf(n -> (n % 2 != 0));
        Collections.sort(intList);
        System.out.println(intList);

        StreamMain st = new StreamMain();
        st.streamMain();




    }
}
