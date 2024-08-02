package org.main.basic.functionalInterface.functions;
import java.util.function.*;

/**
 * 인터페이스 명 : Operator -> 여기에선 IntBinaryOperator 사용
 * 추상메서드 명 : R applyAs(T t)
 * API 설명 : 매개값을 연산후 결과 return
 **/
public class OperatorExam {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 7, 6, 5};

        int sumRes = Operation.circ(numbers, (leftParam, rightParam) -> {
            return leftParam + rightParam;
        });
        System.out.println("sumRes : "+ sumRes);

        int mulRes = Operation.circ(numbers, (leftParam, rightParam) -> {
            return leftParam * rightParam;
        });
        System.out.println("mulRes : "+ mulRes);

    }

    private class Operation{
        static int circ(int[] arr, IntBinaryOperator oper) {
            int startNum = 0;
            int result = arr[startNum];

            for (int i = startNum + 1; i < arr.length; i++) {
                result = oper.applyAsInt(result, arr[i]);
            }
            return result;
        }
    }
}
