package oopMostenireInCapsulare;

public class Masina {

    //oop = object oriented programming
    //avem patru concepte: mostenire, incapsulare, abstractizare, polimorfism
    //mostenire = conceptul prin care o clasa parinte este mostenita de una sau mai multe clase
    //in java o clasa copil poate mosteni o singura clasa parinte
    //cand copilul mosteneste parintele, copilul trebuie sa apeleze constructorul din parinte
    //copilul apelease constructorul din parinte folosind 'super'
    //ca sa folosim mostenirea apelam la cuvantul 'extends'
    //cand copilul mosteneste parintele, copilul are acces la variabile/metode din interiorul parintelui daca sunt public/protected

    public String marca;
    public String model;
    public String culoare;
    public int caiPutere;
    public int pret;

    public Masina(String marca, String model, String culoare, int caiPutere, int pret) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.caiPutere = caiPutere;
        this.pret = pret;
    }

    public void prezentareComandaMasina() {
        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul masinii este " + model);
        System.out.println("Culoarea masinii este " + culoare);
        System.out.println("Numarul de cai putere al masinii este " + caiPutere);
        System.out.println("Pretul masinii este " + pret);
    }
}
