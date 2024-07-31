package org.main.basic.generic;

public class VarianceWithArray {
    public static void print(Object[] arr) {
        for (Object obj : arr) {
            System.out.println(obj);
        }
    }
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3};
        print(integers); // [1, 2, 3]
    }

}
