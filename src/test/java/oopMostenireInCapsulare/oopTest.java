package oopMostenireInCapsulare;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class oopTest {
    @Test
    public void TestMethod() {
        List<String> dotariExterioareLogan = Arrays.asList("Senzori parcare", "Camera video", "Jante 18");
        Dacia Logan = new Dacia("Dacia", "Logan", "rosie", 600, 20001, dotariExterioareLogan);
        Logan.prezentareComandaDacia();
        System.out.println();

        List<String> dotariExterioareF1 = Arrays.asList("Senzori parcare", "Camera video");
        List<String> dotariInterioareF1 = Arrays.asList("Aer conditionat", "Senzori parcare", "Scaune cu incalzire");
        mcLaren F1 = new mcLaren("McLaren","F1","negru",650, 50000, dotariExterioareF1, dotariInterioareF1);
        F1.prezentareComandaMcLaren();
    }
}

//tema: de reprodus pt flori/prajituri/altceva