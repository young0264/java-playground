package org.main.java_performance_tuning_story.using_synchronized;

public class Contribution {
    private int amount = 0;

    public void donate() {
        amount++;
    }

    public int getTotal() {
        return amount;
    }
}
