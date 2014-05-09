/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sample;

import java.util.concurrent.TimeoutException;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import junit.framework.TestCase;

/**
 *
 * @author Hp
 */
public class UtilsJunit4Test extends TestCase {
    
    public UtilsJunit4Test(String testName) {
        super(testName);
    }

    /**
     * Test of concatWords method, of class Utils.
     */
    public void concatWordsCheck() {
        System.out.println("* UtilsJUnit3Test: concatWords()");
        /*String[] words = null;
        String expResult = "";
        String result = Utils.concatWords(words);
        assertEquals(expResult, result);*/
        assertEquals("bugün   benimdogumgunum" ,Utils.concatWords("bugün   ","benim","dogum","gunum"));
        assertEquals("AuraBilisim", Utils.concatWords("Aura","Bi","li","si"));
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of computeFactorial method, of class Utils.
     */
    /*public void testComputeFactorial() {
        System.out.println("computeFactorial");
        //int number = 0;
       // String expResult = "";
       // String result = Utils.computeFactorial(number);
        assertEquals("120", Utils.computeFactorial(5));
        assertEquals("1", Utils.computeFactorial(1));
        assertEquals("1", Utils.computeFactorial(0));
        assertEquals("24", Utils.computeFactorial(-5));
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
    //@Test(timeout=1000) junit4 te olcak. junitteki thread.sleep(1000)
    public void testWithTimeout() {
         System.out.println("* UtilsJUnit4Test: test method 2 - testWithTimeout()");
        final int factorialOf = 1 + (int) (30000 * Math.random());
        System.out.println("computing " + factorialOf + '!');
    
    }
    
    //@Test(expected=IllegalArgumentException.class)
    public void testExpectedException() {
        System.out.println("* UtilsJUnit3Test: test method 3 - testExpectedException()");
            final int factorialOf = -5;
            System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
        
}
    
    /**
     * Test of normalizeWord method, of class Utils.
     */
    /*public void testNormalizeWord() {
        System.out.println("normalizeWord");
        String word = "";
        String expResult = "";
        String result = Utils.normalizeWord(word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
    //@Ignore
    //@Test
    public void testTemporarilyDisabled() throws Exception {
        System.out.println("* UtilsJUnit3Test: test method 4 - checkExpectedException()");
        assertEquals("Malm\u00f6", Utils.normalizeWord("Malmo\u0308"));
    }
    
    /*@Override
    protected void setUp() throws Exception {
        super.setUp();
        System.out.println("* UtilsJUnit3Test: setUp() method");
}

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        System.out.println("* UtilsJUnit3Test: tearDown() method");
    }*/
    
}
