package org.main.basic.generic;

import org.junit.jupiter.api.Test;

public class GenericBasic {


    public class Box<T> {
        private T t;

        public T get() {
            return t;
        }

        public void set(T t) {
            this.t = t;
        }

    }

    @Test
    public void boxExam() {
        Box<String> box1 = new Box<String>();
        box1.set("hello");

        String str = box1.get();

        Box<Integer> box2 = new Box<>();
        box2.set(6);
        int value = box2.get();
    }

    public class Product<T, M> {
        private T seriesNum;
        private M model;

        public T getSeriesNum() {
            return this.seriesNum;
        }

        public M getModel() {
            return this.model;
        }

        public void setSeriesNum(T seriesNum) {
            this.seriesNum = seriesNum;
        }

        public void setModel(M model) {
            this.model = model;
        }
    }

    @Test
    public void productExam() {

        Product<Integer, String> product1 = new Product<Integer, String>();
        product1.setSeriesNum(1);
        product1.setModel("스마트TV");
        int seriesNum1 = product1.getSeriesNum();
        String model1 = product1.getModel();

        Product<Integer, String> product2= new Product<Integer, String>();
        product2.setSeriesNum(2);
        product2.setModel("디젤");
        int seriesNum2 = product2.getSeriesNum();
        String model2 = product2.getModel();

    }

}
