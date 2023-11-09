package org.main.designPattern.simpleFactory;

public class SimplePastaFactory {

    public Pasta makePasta(String type) {
        if (type == "cream") {
            return new CreamPasta();
        } else if (type == "tomato") {
            return new TomatoPasta();
        } else if (type == "oil") {
            return new OilPasta();
        } else if (type == "ragu") {
            return new RaguPasta();
        }
        return null;
    }
}
