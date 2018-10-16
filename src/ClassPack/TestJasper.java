/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPack;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.ws.Holder;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author danushka
 */
public class TestJasper {

    public static void main(String[] args) {

        TestJasper testJasper = new TestJasper();
        testJasper.loadjas();

    }

    private void loadjas() {
        try {
            List<TestHolder> data = new ArrayList<TestHolder>();

            TestHolder th = new TestHolder();
            th.setAge(10);
            th.setName("ODK");
            TestHolder th1 = new TestHolder();
            th1.setAge(10);
            th1.setName("ODK");
            TestHolder th2 = new TestHolder();
            th2.setAge(10);
            th2.setName("ODK");

            data.add(th);
            data.add(th1);
            data.add(th2);

//            System.out.println(data.get(0));
            JRBeanCollectionDataSource bcd = new JRBeanCollectionDataSource(data);

            Map<String, Object> mp = new HashMap();

            mp.put("Bean", bcd);
//            mp.put("KOTBean", bcd0);
            System.out.println(mp);

            InputStream input = getClass().getResourceAsStream("/JReports/BeanTest.jrxml");

            JasperReport jr = JasperCompileManager.compileReport(input);

            JasperPrint jp = JasperFillManager.fillReport(jr, mp, bcd);

            JasperViewer.viewReport(jp);
        } catch (JRException ex) {
            Logger.getLogger(TestJasper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
