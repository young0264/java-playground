package org.main.basic.functionalInterface.examples;

public class MyFunctinalInterfaceExam3 {
    public static void main(String[] args) {
        MyFunctionalInterfaceWithReturn fi;

        /** Lambda V1 */
        fi = (x, y) -> {
            int result = x + y;
            return result;
        };
        System.out.println(fi.method(2,5));

        /** Lambda V2 */
        fi = (x, y) -> {
            return x + y;
        };
        System.out.println(fi.method(2,5));

        /** Lambda V3 */
        fi = (x, y) -> x + y;
        System.out.println(fi.method(2,5));

        /** Lambda V4 */
        fi = (x, y) -> sum(x, y);
        System.out.println(fi.method(2, 5));
    }

    public static int sum(int x, int y) {
        return x + y;
    }

}
