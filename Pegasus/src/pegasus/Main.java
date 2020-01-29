package pegasus;

import com.l2fprod.common.swing.plaf.LookAndFeelAddons;
import com.l2fprod.common.swing.plaf.windows.WindowsLookAndFeelAddons;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*******************************************************
 * @author Michael Rodriguez
 * @version 1.0 11/18/2014
 * @Company Auto Latino Magazine
 *******************************************************/
public class Main {
   
    public static Frame fr;

    public static void main(String[] args) throws UnsupportedLookAndFeelException {        
        try {
            Class.forName("com.jtattoo.plaf.luna.LunaLookAndFeel");   
            UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
            LookAndFeelAddons.setAddon(LookAndFeelAddons.getBestMatchAddonClassName()); 
            UIManager.put("win.xpstyle.name", "luna");
            LookAndFeelAddons.setAddon(WindowsLookAndFeelAddons.class);  
        } 
      
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
        }
                
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                fr = new Frame();
                fr.setVisible(true);
            }
        });
        
    }
    
}
