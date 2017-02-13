/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitlab;

/**
 *
 * @author tuf52965
 */
public class Date {
    int year, day, month;
    
public Date(int a, int b, int c){
      this.year=a;
      this.month=b;
      this.day=c;
        
}
    
    
public int daysTo(Date d){
int days= 0;

int x, y, z, a, b, c;

x= d.year*365;
y= d.month*30;
z= d.day;

a= this.year*365;
b=this.month*30;
c=this.day;

days=(x+y+z)-(a+b+c);

return days;
}


}