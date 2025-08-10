package compozitie;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class CompozitieTest {

    @Test
    public void testMethod(){
        Living livingMuntean = new Living("camera de zi", 30,"camera principala", "Samsung",
                "de piele","masa scumpa" );

        Bucatarie bucatarieDeVaraMunteanu = new Bucatarie("bucatarie de vara", 10, "bucatarie pt facut mici", "am aragaz",
                "LG", "Beko");
        Bucatarie bucatarieInteriorMuntean = new Bucatarie("bucatarie interior", 10, "bucatarie pt iarna", "am aragaz",
                "LG", "Samsung");
        List<Bucatarie> bucatarieList = Arrays.asList(bucatarieDeVaraMunteanu, bucatarieInteriorMuntean);

        Dormitor dormitorMuntean = new Dormitor("dormitor", 20, "dormitor principal", "patXL",
                "televizor cu PS5", "nu detin fotoliu", "nu detin noptiere");
        List<Dormitor> dormitorList = Arrays.asList(dormitorMuntean);


        Baie baieExterioara= new Baie("baie exterioara", 5, "baie de serviciu", "nu am cada",
                "nu am cabina", "am wc");
        Baie baieInterioara= new Baie("baie principala", 6, "baie principala", "am cada",
                "nu am cabina", "am wc");
        List<Baie> baieList = Arrays.asList(baieExterioara, baieInterioara);

        Casa casaMuntean = new Casa(livingMuntean, bucatarieList, dormitorList,baieList );
        casaMuntean.prezentareGeneralaCasa();
    }
}