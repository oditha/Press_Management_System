package ClassPack;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateForm {

    private static SimpleDateFormat sdf0;
    private static SimpleDateFormat sdf1;
    private static SimpleDateFormat cursdf;
    private static SimpleDateFormat cursdf0;
    private static SimpleDateFormat cursdftime;
    private static SimpleDateFormat cursdf4;
    private static SimpleDateFormat cursdf5;
    private static SimpleDateFormat cursdf6;
    private static SimpleDateFormat Time;
    private static SimpleDateFormat orderNo;

    public static String currentdate() {

        if (cursdf0 == null) {

            cursdf0 = new SimpleDateFormat("yyyy/MM/dd");

        }

        return cursdf0.format(new Date());

    }
    public static String OrderNo() {

        if (orderNo == null) {

            orderNo = new SimpleDateFormat("yyyyMMdd");

        }

        return orderNo.format(new Date());

    }
    public static String TimeNow() {

        if (Time == null) {

            Time = new SimpleDateFormat("hh:mm:ss a");

        }

        return Time.format(new Date());

    }
    public static String currentdateTime() {

        if (cursdftime == null) {

            cursdftime = new SimpleDateFormat("yyyy/MM/dd");

        }

        return cursdftime.format(new Date());

    }
    public static String currentmonth() {

        if (cursdf5 == null) {

            cursdf5 = new SimpleDateFormat("yyyy/MM");

        }

        return cursdf5.format(new Date());

    }
    public static String currentyear() {

        if (cursdf6 == null) {

            cursdf6 = new SimpleDateFormat("yyyy");

        }

        return cursdf6.format(new Date());

    }
    public static String currentdateFolder() {

        if (cursdf4 == null) {

            cursdf4 = new SimpleDateFormat("yyyy-MM-dd");

        }

        return cursdf4.format(new Date());

    }
    
    public static String setdate() {

        if (cursdf == null) {

            cursdf = new SimpleDateFormat("yyyy/MM/dd");

        }

        return cursdf.format(new Date());

    }
    
//    public static String convertDate(String date) throws ParseException{
//    
//        if (sdf0==null) {
//            
//            sdf0 = new SimpleDateFormat("dd.MM.yyyy");
//            
//        }
//        
//        if (sdf1==null) {
//            
//            sdf1 = new SimpleDateFormat("dd/MM/yyyy");
//            
//        }
//        
//    
//        Date format = sdf0.parse(date);
//        
//        
//        
//        return sdf1.format(format);
//        
//    
//    }

    
    public static void main(String[] args) throws ParseException {
        
        currentdate();
    }

    public static Date setdate(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
