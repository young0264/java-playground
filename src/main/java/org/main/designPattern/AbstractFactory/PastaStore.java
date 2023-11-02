package org.main.designPattern.AbstractFactory;

public class PastaStore {
    SimplePastaFactory simplePastaFactory = new SimplePastaFactory();

    public PastaStore(SimplePastaFactory simplePastaFactory) {
        this.simplePastaFactory = simplePastaFactory;
    }

    public void orderPasta(String type) {
        Pasta pasta = simplePastaFactory.makePasta(type);
        pasta.prepare();
        pasta.cook();
        pasta.pack();
    }
}
