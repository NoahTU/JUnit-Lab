/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitlab;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
//import java.util.Date;

/**
 *
 * @author tuf52965
 */
public class JunitLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Date d1 = new Date (2009, 12, 25);


        Date d2 = new Date (2010, 12, 25);


        int daysBetween = d1.daysTo(d2);
        System.out.println(daysBetween);
        
        
        Result result = JUnitCore.runClasses(TestJunit.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
    }
    
    
}
