package org.main.designPattern.factoryMethod2;

public class PastaStore {
    PastaFactoryMethod simplePastaFactory;

    public PastaStore(PastaFactoryMethod simplePastaFactory) {
        this.simplePastaFactory = simplePastaFactory;
    }

    /** 팩터리메서드 패턴 : 오버라이딩 한 메서드가 객체를 반환하는 패턴 */
    public void orderPasta(String type) {
        Pasta pasta = simplePastaFactory.makePasta(type);

        pasta.prepare();
        pasta.cook();
        pasta.pack();
    }
}
