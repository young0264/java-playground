package org.main.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PlantExam {
    public static void main(String[] args) {
        ArrayList<Integer> plants = new ArrayList<>(List.of(2, 3, 1, 2)); // 며칠간 물을 안주면 죽는지 정보(2면 2일때 물 안주면 죽음)
        ArrayList<Integer> watered = new ArrayList<>(List.of(3, 1, 2, 1, 4, 1)); //물을 주는 plant의 idx 정보
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

    // 풀이
    private static List<Integer> solve(ArrayList<Integer> plants, ArrayList<Integer> watered) {
        int N = plants.size(), M = watered.size();
        int[] plantLife = new int[N]; // plant 의 생명(생존) 정보
        for (int i = 0; i < N; i++) {
            plantLife[i] = plants.get(i);
        }
//        ArrayList<Integer> plants = new ArrayList<>(List.of(2, 3, 1, 2));
//        ArrayList<Integer> watered = new ArrayList<>(List.of(3, 1, 2, 1, 4, 1));
//        ArrayList<Integer> answer = new ArrayList<>(List.of(4, 2, 2, 2, 2, 1));
        for (int i = 0; i < M; i++) {
            if (plantLife[watered.get(i) - 1] >= i + 1) {
                plantLife[watered.get(i) - 1] = i + 1 + plants.get(watered.get(i) - 1);
            }
        }
        System.out.println("plantLife : " + Arrays.toString(plantLife));
        int[] answer = new int[M];
        Arrays.fill(answer, N);
        System.out.println(Arrays.toString(answer));
        for (int i = 0; i < N; i++) {
            if (plantLife[i] <= M) {  //살아남지 못하는 plant에 대해서 -1로 update
                answer[plantLife[i] - 1]--;
            }
        }
        System.out.println(Arrays.toString(answer));

        int dieCount = 0; // 단조감소이기 때문
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

    // MS 풀이
    private static ArrayList<Integer> solve2(ArrayList<Integer> plants, ArrayList<Integer> watered) {
        int N = plants.size(), M = watered.size();
        int[] time = new int[N];
        int[] result = new int[M + 1];
        for (int i = 0; i < N; ++i) {
            int cur = plants.get(i);
            if (cur <= M) {
                --result[cur]; // 이때 물을 안주면 죽는 개수 체크
            }
        }
        System.out.println(Arrays.toString(result));
        for (int i = 1; i <= M; ++i) {
            int idx = watered.get(i - 1) - 1;
            int dis = i - time[idx]; // 물을 안준 시점
            int value = plants.get(idx);
            if (dis <= value) { // 물을 0이 되기 전에 준 경우 풀
                int nxt = time[idx] + value;
                if (nxt <= M) {
                    ++result[nxt];
                }
                time[idx] = i;
                nxt = i + value;
                if (nxt <= M) {
                    --result[nxt];
                }
            }
        }
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 1; i <= M; ++i) {
            result[i] += result[i - 1];
            answer.add(result[i] + N);
        }
        return answer;
    }
}