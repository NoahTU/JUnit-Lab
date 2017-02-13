/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitlab;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 *
 * @author tuf52965
 */
public class TestJunit {
    
    Date d1 = new Date (2009, 12, 25);
    Date d2 = new Date (2010, 12, 25);
    Date d3 = new Date (2009, 12, 29);
    Date d4 = new Date (2009, 12, 26);
    Date d5 = new Date (2009, 12, 27);
    Date d6 = new Date (2009, 12, 28);
    
    @Test
   public void testPrintMessage() {
     assertEquals(365, d1.daysTo(d2));
     assertEquals(1, d1.daysTo(d4));
     assertEquals(2, d1.daysTo(d5));
     assertEquals(5, d1.daysTo(d6));
     
     
   }
   
   @Test
   public void errorPrintMessage() {

     assertEquals(6, d1.daysTo(d3));
     
     
   }
}
