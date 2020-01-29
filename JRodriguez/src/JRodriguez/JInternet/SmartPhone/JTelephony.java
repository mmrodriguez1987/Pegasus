
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JRodriguez.JInternet.SmartPhone;

import JRodriguez.JInternet.Mail.JElectronicMail;
import JRodriguez.JProperties.Propmanager;
import static JRodriguez.JString.JCharacter.Decode;

/**
 *
 * @author Michael Rodriguez
 */
public class JTelephony {
    private Propmanager mn;
    private JElectronicMail x;
    
    public static Object NumbersByAreaCode(String[] sPhone)
    {
        String[][] resp = null;
        String areas = null;
        
        
        for(String i: sPhone) {
            areas += (i.substring(0,3) + ", ");
        }         
        
        for(String i:  (String[])Decode(areas,",")) {
            
            
        } 
        return resp;
    }

    private static Iterable<String> Encode(String areas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void SendReportMassiveMMS(String sPara, String sConCopia, String sMensaje, String asunto){
        mn = new Propmanager("/pegasus/resources/mail.properties");            
        x = new JElectronicMail(mn.getProperties("smtpserver"),  mn.getProperties("port"), true);  
        x.setMailAddressTo(sPara);   
        x.setMailAddressCC(sConCopia);
        x.setMailAddressFrom(mn.getProperties("user0"));
        x.setMailAddressFromPassword(mn.getProperties("pass"));   
        x.setMailMessage(sMensaje);
        x.setMailSubject(asunto);                      
        try{
            x.SendMessage();      
        } catch(Exception m) {           
            System.out.println("Error enviando el reporte");
        }
        
    }
}
