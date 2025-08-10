package oopMostenireInCapsulare;

import java.util.List;

public class mcLaren extends Masina {
    public List<String> dotariExterioare;
    public List<String> dotariInterioare;

    public mcLaren(String marca, String model, String culoare, int caiPutere, int pret, List<String> dotariInterioare, List<String> dotariExterioare) {
        super(marca, model, culoare, caiPutere, pret);
        this.dotariInterioare = dotariInterioare;
        this.dotariExterioare = dotariExterioare;
    }

    public void prezentareComandaMcLaren() {
        prezentareComandaMasina();
        System.out.println("Dotari exterioare McLaren:");
        for (int i = 0; i < dotariExterioare.size(); i++) {
            System.out.println(i + ". " + dotariExterioare.get(i));
        }
        System.out.println("Dotari interoare McLaren:");
        for (int i = 0; i < dotariInterioare.size(); i++) {
            System.out.println(i + ". " + dotariInterioare.get(i));
        }

    }
}
