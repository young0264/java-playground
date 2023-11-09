package org.main.designPattern.simpleFactory;

public class PastaMain {
    public static void main(String[] args) {

        PastaStore pastaStore = new PastaStore(new SimplePastaFactory());
        pastaStore.orderPasta("cream"); /** 인스턴스 생성 기능만 뺴준 것 */
    }
}
