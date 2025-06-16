package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {
    //acesta este un comentariu
    //clasa = sablon specific unei entitati care contine variabile si metoda
    //intr-un fisier java recunoastem o clasa dupa cuvantul "class"
    //o clasa trebuie sa aiba un nume
    //variabilele/metodele unei clase se regasesc intre acolade
    //intr-un fisier java putem avea mai multe clase diferentiate prin nume
    //nu este un practice bun sa avem mai multe clase intr-un fisier java
    //variabila = proprietatea unei clase
    //variabilele pot sa fie de doua feluri: globale si locale
    //variabila globala = variabila care este prezenta peste tot in fisierul java
    //variabila globala = public tipVariabila numeVariabile
    //o variabila poate sau nu sa primeasca o valoare
    //variabila locala = variabila care este prezenta doar in locul in care a fost definita
    //variabila locala = tipVariabila numeVariabila
    //metoda = actiunea unei clase
    //metodele pot sa fie de doua feluri: void si return
    //metoda void = metoda care afiseaza rezultatul codului scris
    //metoda voi = public void numeMetoda (){}

    public String nume;
    public String prenume;
    public int varsta;
    public String adresa;
    public double inaltime;
    public float greutate;
    public char sex;
    public boolean areBursa;

    @Test

    public void prezentareStudent(){
        nume="Munteanu";
        prenume="Laura";
        varsta=23;
        adresa="Str. Campului 15, bl. 13 BIS";
        inaltime=1.75;
        greutate=55.45f;
        sex='F';
        areBursa=true;

        System.out.println("Numele este "+nume);
        System.out.println("Prenumele este "+prenume);
        System.out.println("Varsta este "+varsta);
        System.out.println("Adresa este "+adresa);
        System.out.println("Inaltimea este "+inaltime);
        System.out.println("Greutatea este "+greutate);
        System.out.println("Sexul este "+sex);
        System.out.println("Are bursa? "+areBursa);
    }
}
