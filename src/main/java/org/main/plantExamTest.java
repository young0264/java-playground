package org.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class plantExamTest {
    public static void main(String[] args) {
        ArrayList<Integer> plants = new ArrayList<>(List.of(2, 3, 1, 2));
        ArrayList<Integer> watered = new ArrayList<>(List.of(3, 1, 2, 1, 4, 1));
        ArrayList<Integer> answer = new ArrayList<>(List.of(4, 2, 2, 2, 2, 1));
        List<Integer> result = solve(plants, watered);
        if (answer.size() != result.size()) {
            System.out.println("Wrong Answer");
        } else {
            boolean flag = true;
            for (int i = 0; i < answer.size(); ++i) {
                if (answer.get(i) != result.get(i)) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("Correct");
            } else {
                System.out.println("Wrong Answer");
            }
        }
    }
    private static List<Integer> solve(ArrayList<Integer> plants, ArrayList<Integer> watered) {
        int N = plants.size(), M = watered.size();
        int[] plantLife = new int[N];
        for (int i = 0; i < N; i++) {
            plantLife[i] = plants.get(i);
        }
        for (int i = 0; i < M; i++) {
            if (plantLife[watered.get(i) - 1] >= i + 1) {
                plantLife[watered.get(i) - 1] = i + 1 + plants.get(watered.get(i) - 1);
            }
        }
        int[] answer = new int[M];
        Arrays.fill(answer, N);
        System.out.println("answer : " + Arrays.toString(answer));

        for (int i = 0; i < N; i++) {
            if (plantLife[i] <= M) {
                answer[plantLife[i] - 1]--;
            }
        }

//        for (int i = 0; i < N; i++) {
//            System.out.println(plantLife[i]);
//        }

        System.out.println("answer : " + Arrays.toString(answer));

        int dieCount = 0;
        for (int i = 0; i < M; i++) {
            if (answer[i] != N) {
                dieCount += N - answer[i];
            }
            answer[i] = N - dieCount;
        }
        return Arrays.stream(answer)
                .boxed()
                .collect(Collectors.toList());
    }
}
