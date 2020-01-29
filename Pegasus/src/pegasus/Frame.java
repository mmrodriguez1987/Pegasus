
package pegasus;

import pegasus.marketing.mobile.JMMS;
import JRodriguez.JMedia.JWallpaper;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import pegasus.marketing.mobile.JCoustomerDataBase;
import pegasus.marketing.mobile.JMassiveEmail;
import pegasus.posting.JActivityControl;


/*******************************************************
 * @author Michael Rodriguez
 * @version 1.0 11/18/2014
 * @Company Auto Latino Magazine
 *******************************************************/
public class Frame extends javax.swing.JFrame {
    //private Propmanager prop;

   
    public Frame() {
        initComponents();
        //prop = new Propmanager("/pegasus/resources/mail.properties");    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        PanelLateral = new com.l2fprod.common.swing.JTaskPane();
        panelMarketingMovil = new com.l2fprod.common.swing.JTaskPaneGroup();
        lnkMMSCampaign = new com.l2fprod.common.swing.JLinkButton();
        lnkMMSCampaign.addActionListener(new MultimediaMessage());
        lnkEmailCampaign = new com.l2fprod.common.swing.JLinkButton();
        lnkEmailCampaign.addActionListener(new ElectronicMail());
        lnkMMSCampaign1 = new com.l2fprod.common.swing.JLinkButton();

        linkBDD = new com.l2fprod.common.swing.JLinkButton();
        lnkEmailCampaign.addActionListener(new CoustomerDataBase());
        panelMarketingSocilaMedia = new com.l2fprod.common.swing.JTaskPaneGroup();
        lnkPostControl = new com.l2fprod.common.swing.JLinkButton();
        lnkPostControl.addActionListener(new ActivityControl());
        lnkCampaignDesign = new com.l2fprod.common.swing.JLinkButton();
        panelAbout = new com.l2fprod.common.swing.JTaskPaneGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLinkButton1 = new com.l2fprod.common.swing.JLinkButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Pegasus - Expert Marketing Media System");
        setIconImage(new ImageIcon(getClass().getResource("/pegasus/images/Icon.png")).getImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 255));
        jDesktopPane1.setBorder(new JWallpaper("/pegasus/images/FondoDefault.jpg"));
        this.setExtendedState(Frame.MAXIMIZED_BOTH);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PanelLateral.setBackground(new java.awt.Color(255, 255, 255));

        panelMarketingMovil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegasus/images/iphone.png"))); // NOI18N
        panelMarketingMovil.setTitle("Online Marketing");

        lnkMMSCampaign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegasus/images/email_air.png"))); // NOI18N
        lnkMMSCampaign.setText("MMS Marketing Campaign");
        panelMarketingMovil.getContentPane().add(lnkMMSCampaign);

        lnkEmailCampaign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegasus/images/email_at_sign.png"))); // NOI18N
        lnkEmailCampaign.setText("Email Marketing Campaign");
        panelMarketingMovil.getContentPane().add(lnkEmailCampaign);

        lnkMMSCampaign1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegasus/images/facebook.png"))); // NOI18N
        lnkMMSCampaign1.setText("Social Media Management");
        panelMarketingMovil.getContentPane().add(lnkMMSCampaign1);

        linkBDD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegasus/images/pill_red.png"))); // NOI18N
        linkBDD.setText("Coustomer DataBase");
        panelMarketingMovil.getContentPane().add(linkBDD);

        PanelLateral.add(panelMarketingMovil);

        panelMarketingSocilaMedia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegasus/images/3.png"))); // NOI18N
        panelMarketingSocilaMedia.setTitle("Stadistic Management");

        lnkPostControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegasus/images/pill_red.png"))); // NOI18N
        lnkPostControl.setText("Activity Control");
        lnkPostControl.setToolTipText("");
        panelMarketingSocilaMedia.getContentPane().add(lnkPostControl);

        lnkCampaignDesign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegasus/images/3.png"))); // NOI18N
        lnkCampaignDesign.setText("Reports");
        lnkCampaignDesign.setToolTipText("");
        panelMarketingSocilaMedia.getContentPane().add(lnkCampaignDesign);

        PanelLateral.add(panelMarketingSocilaMedia);

        panelAbout.setTitle("About");

        jLabel1.setText("Auto Latino Magazine");
        panelAbout.getContentPane().add(jLabel1);

        jLabel2.setText("MCTS. Michael Rodriguez");
        panelAbout.getContentPane().add(jLabel2);

        jLabel3.setText("Version: 1.16");
        panelAbout.getContentPane().add(jLabel3);

        jLinkButton1.setForeground(java.awt.Color.blue);
        jLinkButton1.setText("About Developer");
        panelAbout.getContentPane().add(jLinkButton1);

        PanelLateral.add(panelAbout);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegasus/images/iphone.png"))); // NOI18N
        jMenu1.setText("Online Marketing");

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegasus/images/email_air.png"))); // NOI18N
        jMenuItem8.setText("MMS Marketing Campaign");
        jMenu1.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegasus/images/email_at_sign.png"))); // NOI18N
        jMenuItem9.setText("Email Marketing Campaign");
        jMenu1.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegasus/images/facebook.png"))); // NOI18N
        jMenuItem10.setText("Social Media Campaign");
        jMenu1.add(jMenuItem10);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegasus/images/pill_red.png"))); // NOI18N
        jMenuItem11.setText("Coustomer Database");
        jMenu1.add(jMenuItem11);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegasus/images/3.png"))); // NOI18N
        jMenu2.setText("Stadistic Management");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Look and Feel");

        jMenuItem3.setText("Acryl");
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Aero");
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Aluminium");
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Bernstein");
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Fast");
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Help");

        jMenuItem1.setText("Content");
        jMenu4.add(jMenuItem1);

        jMenuItem2.setText("About");
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addComponent(PanelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_close
        // TODO add your handling code here:
         if (JOptionPane.showConfirmDialog(rootPane, "<html><b>¿Desea realmente salir del sistema?</b><html>","Pegasus - Expert Marketing Media System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_close
    
    
    class CoustomerDataBase implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
            JCoustomerDataBase jdb = new JCoustomerDataBase();
            jdb.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            jdb.setClosable(true);             
            jdb.setVisible(true);       
            jDesktopPane1.add(jdb);
            jdb.show();
            jdb.toFront();
        }
    }
    
    class MultimediaMessage implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JMMS sms = new JMMS();       
            sms.setVisible(true);       
            jDesktopPane1.add(sms);
            sms.show();
            sms.toFront();
        }        
    }
    
    class PostingControl implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
//            JPostControl posting = new JPostControl();
//            posting.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//            posting.setClosable(true);             
//            posting.setVisible(true);       
//            jDesktopPane1.add(posting);
//            posting.show();
//            posting.toFront();
        }
    }
    
    class ActivityControl implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JActivityControl activity = new JActivityControl();
            activity.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            activity.setClosable(true);             
            activity.setVisible(true);       
            jDesktopPane1.add(activity);
            activity.show();
            activity.toFront();
        }
    }
    
    class ElectronicMail implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e){
            JMassiveEmail email = new JMassiveEmail();
            email.setClosable(true);       
            jDesktopPane1.add(email);
            email.show();
            email.toFront();
        }
    }   
    
   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.l2fprod.common.swing.JTaskPane PanelLateral;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private com.l2fprod.common.swing.JLinkButton jLinkButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private com.l2fprod.common.swing.JLinkButton linkBDD;
    private com.l2fprod.common.swing.JLinkButton lnkCampaignDesign;
    private com.l2fprod.common.swing.JLinkButton lnkEmailCampaign;
    private com.l2fprod.common.swing.JLinkButton lnkMMSCampaign;
    private com.l2fprod.common.swing.JLinkButton lnkMMSCampaign1;
    private com.l2fprod.common.swing.JLinkButton lnkPostControl;
    private com.l2fprod.common.swing.JTaskPaneGroup panelAbout;
    private com.l2fprod.common.swing.JTaskPaneGroup panelMarketingMovil;
    private com.l2fprod.common.swing.JTaskPaneGroup panelMarketingSocilaMedia;
    // End of variables declaration//GEN-END:variables
}
