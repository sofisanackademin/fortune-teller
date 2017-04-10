package se.nackademin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TranslatorTest {
    private Translator generateTestData() {
        Translator trans = new Translator();
        trans.setA(5);
        trans.setB(8);
        trans.setC(2);
        trans.setD(1);
        trans.setE(7);
        return trans;
    }
    
    @Test
    public void testSkapaSpådom() {
        Translator trans = generateTestData();
        assertEquals("Furtune tell incorrect", 
                "Din framtid är hård. Du borde sluta röra. Vi ser att du snart kommer att skaffa en fotboja. Snart kommer du vilja ljuga, men då är det viktigt att du är vacker.", 
                trans.skapaSpådom());
    }
    

}
