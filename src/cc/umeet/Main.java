package cc.umeet;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] arrays = {{1, 2, 3, 4}, {3, 6, 7, 2}};
        System.err.println(Arrays.deepToString(arrays));
	// doing some tests here
        System.out.println(Arrays.deepToString(arrays));
        String[] strings = {"Name", "Gender"};
        System.out.println(Arrays.deepToString(strings));
        Arrays.sort(strings);
        System.out.println(Arrays.deepToString(strings));


    }

}
