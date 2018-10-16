/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPack;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Danushka
 */
public class PreviosMonth {

  //  public static String date;

    
    public static String pre(String date){
     
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, -1);
        date = format.format(cal.getTime());
       
       
        return date;
       
    
    
    
    
    
    }
    
    
//    public static void main(String[] args) {
//       
//    }

}
