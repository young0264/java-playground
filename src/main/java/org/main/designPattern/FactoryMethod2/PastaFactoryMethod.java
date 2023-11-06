package org.main.designPattern.FactoryMethod;

public class PastaFactoryMethod extends FoodFactory {

    @Override /** 확장시 OCP 위반 -> 추상 팩토리 패턴 */ 밥먹고와서
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
