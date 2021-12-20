package com.company;

public class Arrays {
    //int[] scores = {70, 75, 80, 95};
    public static String test() {
        return "test!";
    }

    /*Prints out all elements within given array*/
    public static String toString(int[] array) {
        //case1: if null array
        if (array == null)
            return "null";

        //case2: empty array
        int iMax = array.length - 1;
        if (iMax == -1)
            return "[]";

        //case3: valid array
        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(array[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }

}
