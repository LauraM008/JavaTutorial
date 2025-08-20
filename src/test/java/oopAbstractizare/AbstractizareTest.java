package oopAbstractizare;

import org.testng.annotations.Test;

public class AbstractizareTest {

    @Test

    public void methodTest(){
        AngajatFullTime laura = new AngajatFullTime("Munteanu", "Laura", 28, "Test");
        laura.mergeInConcediu();

        AngajatPartTime ioana = new AngajatPartTime("Muntean", "Ioana", 40, "patron");
        ioana.mergeInConcediu();

    }
}