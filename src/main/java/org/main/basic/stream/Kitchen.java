package org.main.basic.stream;

//public class Kitchen implements Comparator {
public class Kitchen implements Comparable<Kitchen> {
    private String type;
    private int capacity;

    public Kitchen(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public int compareTo(Kitchen o) {
        return Integer.compare(this.capacity, o.capacity);
    }
}
