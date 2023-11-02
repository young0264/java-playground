package org.main.designPattern.AbstractFactory;

public class PastaMain {
    public static void main(String[] args) {

        PastaStore pastaStore = new PastaStore(new SimplePastaFactory());
        pastaStore.orderPasta("cream");
    }
}
