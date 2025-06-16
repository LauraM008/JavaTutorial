package obiectConstructor;

import org.testng.annotations.Test;

public class ObiectTest {

    @Test
    public void testMethod(){
        Masina lauraDacia = new Masina("Dacia","Papuc","10L/100km","alb",3000,250,"10 000km");
        lauraDacia.prezentareComandaMasina();
        lauraDacia.taxaGreutate();
        System.out.println();

        Masina lauraSkoda = new Masina("Skoda","Octavia","12L/100km","gri",5000,180,"35 000km");
        lauraSkoda.prezentareComandaMasina();
        lauraSkoda.culoare="rosie";
        lauraSkoda.caiPutere=400;
        lauraSkoda.prezentareComandaMasina();
        lauraSkoda.taxaGreutate();
        System.out.println();

        Masina lauraBMW = new Masina("BMW","Bun","20L/100km","mov",2000,300,"13 000km",30000);
        lauraBMW.prezentareComandaMasina();
        lauraBMW.taxaGreutate();

    }
}
