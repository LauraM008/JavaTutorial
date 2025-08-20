package oopIncapsularePolimorfism;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class OOPTest {

    @Test
    public void testMethod(){
        List<String> dotariExterioareLogan = Arrays.asList("senzori parcare", "camera video", "jante 18");
        Dacia logan = new Dacia("Dacia", "Logan", "rosu", 800, 13000, dotariExterioareLogan );

        //logan.prezentareComandaDacia();

        logan.setCuloare("Rosu");
        logan.setModel("Sandero");

        logan.prezentareComandaDacia();
        logan.pornesteMotor();
        logan.procesarePlata();
        logan.procesarePlata(true);
        logan.procesarePlata(20);

        System.out.println();

//        List<String> dotariInterioareF1 = Arrays.asList("incalzire in scaune", "bord din piele");
//        List<String> dotariExterioareF1 = Arrays.asList("senzori parcare", "camera video", "jante 22");
//        McLaren f1 = new McLaren("McLaren", "F1", "albastru", 1000, 20000,
//                dotariInterioareF1, dotariExterioareF1);
//
//        f1.prezentareComandaMcLaren();
//        f1.pornesteMotor();

    }
}