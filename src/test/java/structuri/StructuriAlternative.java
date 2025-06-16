package structuri;

import org.testng.annotations.Test;

import static com.sun.tools.classfile.Module_attribute.RequiresEntry.length;
import static java.lang.System.out;

public class StructuriAlternative {

    // Structuri alternative : If (conditie 1...conditie n) Then ... Else, Switch...case
    // Putem avea mai multe conditii intre paranteze care se delimiteaza folosind operatorii logici: &&, ||, !
    // Nu este obligatoriu ca un If sa aibe Else
    // Putem adauga mai multe structuri de tipul If cu ajutorul lui Else folosind Else/If


    @Test
    public void testMethod() {
        /*celMaiMareNumar(25,26);
        celMaiMareNumar(26, 25);
        celMaiMareNumar(10,10);
        celMaiMareNumar(0,-1);
        celMaiMareNumar(-3,-1); */

        /*nrPar(25);
        nrPar(2);
        nrPar(0);
        nrPar(-1);
        nrPar(1234567890); */

        /*lungimeParola("1234567");
        lungimeParola("12345678");
        lungimeParola("123456789111112");
        lungimeParola("1234567891111123");
        lungimeParola("");*/
        lungimeParolav2("alaBalaaaa#3");
        lungimeParolav2("alaBalaaaa#");
        lungimeParolav2("alaBalaaaa3");
        lungimeParolav2("alabalaaaa3");

    }

    // Verificam care este numarul cel mai mare dintre doua valori

    public void celMaiMareNumar(int nr1, int nr2) {

        if (nr1 > nr2) {
            System.out.println("Cel mai mare numar dintre " + nr1 + " si " + nr2 + " este: " + nr1);
        } else {
            System.out.println("Cel mai mare numar dintre " + nr1 + " si " + nr2 + " este: " + nr2);
        }
        ;
    }

    //Verificam daca un numar este par
    //Daca vrem sa lucram cu catul unei impartiri folosim / (divide)
    //Daca vrem sa lucram cu restul unei impartiri folosim % (modulo)
    public void nrPar(int nr) {
        if (nr % 2 == 0) {
            System.out.println("Numarul " + nr + " este par");
        } else {
            System.out.println("Numarul " + nr + " este impar");
        }
    }

    //Verificam daca un numar este par si pozitiv
    public void nrParv2(int nr) {
        if (nr % 2 == 0) {
            if (nr > 0) {
                System.out.println("Numarul " + nr + " este par pozitiv");
            } else {
                System.out.println("Numarul " + nr + " este par negativ");
            }
        } else {
            if (nr % 2 == 1) {
                if (nr > 0) {
                    System.out.println("Numarul " + nr + " este impar pozitiv");
                } else {
                    System.out.println("Numarul " + nr + " este impar negativ");
                }

            } else {
                System.out.println("Numarul " + nr + " este zero");
            }
        }


    }


    //Verificam daca lungimea unei parole este cuprinsa intre 8 si 15 caractere
    public void lungimeParola(String parola) {
        if (parola.length() >= 8 && parola.length() <= 15) {
            System.out.println("Parola " + parola + " are lungimea intre 8 si 15 caractere");
        } else {
            System.out.println("Parola " + parola + " nu are lungimea intre 8 si 15 caractere");
        }
    }

    //Adaugam extra verificari legat de continutul parolei
    //Aceste verificari se focuseaza pe faptul ca parola trebuie sa contina: un caracter mare, o cifra, un caracter special
    public void lungimeParolav2(String parola) {
        if (parola.length() >= 8 && parola.length() <= 15) {
            if (parola.matches(".*[0-9].*") && parola.matches(".*[^a-zA-Z0-9].*") &&
                    parola.matches(".*[^a-zA-Z0-9].*")) {
                System.out.println("Parola " + parola +  " este validă și respectă toate criteriile.");
            } else {
                System.out.println("Parola " + parola +  " trebuie să conțină cel puțin o cifră, un caracter special (!@#$%^&*()\"{}[]||) și o literă mare.");
            }
        }
        else {
            System.out.println("Parola " + parola + " nu are lungimea între 8 și 15 caractere.");
        }
    }


}