package org.main.java_performance_tuning_story.using_synchronized;

public class ContributeTest {
    public static void main(String[] args) {
        Contributor[] crs = new Contributor[10];

        //기부자와 기부 단체 초기화
        for (int loop = 0; loop < 10; loop++) {
            Contribution contribution = new Contribution();
            crs[loop] = new Contributor(contribution, " Contributor" + loop);
        }

        //기부 실행
        for (int i = 0; i < 10; i++) {
            crs[i].start();
        }
    }
}
