package pegasus.marketing.mobile;

import JRodriguez.JDate.DateOperation;
import JRodriguez.JInternet.Mail.JElectronicMail;
import JRodriguez.Utils.Common;
import JRodriguez.JMath.Basic.Functions;
import JRodriguez.JProperties.Propmanager;
import JRodriguez.JString.JCharacter;
import JRodriguez.sql.SqlHelper;
import JRodriguez.sql.db.usa.Dealer;
import JRodriguez.sql.db.usa.USA;
import java.awt.HeadlessException;
import java.awt.Image;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel; 
import javax.swing.text.Document;
import javax.swing.text.MaskFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import pegasus.reports.TechnicalReports;


/*******************************************************
 * @author Michael Rodriguez
 * @version 1.0 11/18/2014
 * @Company Auto Latino Magazine
 *******************************************************/
public class JMMS extends javax.swing.JInternalFrame {

    public String vEmail, vLogActivity = "", CellNumbers[][], gatewaydomain[],blackNumber[],rootNumbers, rootAdsImage, ArchivoLog, strLocalidad, strNumGteRegional, strNumGteGeneral, strNumGteIT,strNumVendedor;     
    public JElectronicMail email;
    public Thread hilo;
    private boolean IsEmail;
    public Propmanager pm;
    private Properties props;
    private ResultSet rsDealer;
    public java.io.File filelog;
    public java.io.FileWriter fw;
    public java.io.BufferedWriter bw;
    public java.io.PrintWriter txt_salida;
    private List<Dealer> objDealer;      
    private USA dba;
    private int nTry;
    private DefaultComboBoxModel dfmDealer;
    private Common c;
    private ThreadMail cg;    
    private TechnicalReports rpt ;
    private DefaultTableModel model;
    public JMMS()   {      
      
        initComponents();      
        c = new Common();
        nTry = 0;
        txtLog.setText("");
        vLogActivity = txtLog.getText();
        pm = new Propmanager("/pegasus/resources/mail.properties"); 
        rbtnConDominio.setSelected(true);
        IsEmail = true;
        rbtnLocCalifornia.setSelected(true);
        try
        {
            
            strLocalidad = "California";
            props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", true);
            props.put("mail.smtp.host",pm.getProperties("smtpserver"));
            props.put("mail.smtp.port", pm.getProperties("port"));          
            cmbMails.setSelectedIndex(1);
            FillDataBase();            
         

        }catch(NumberFormatException | HeadlessException e)  {            
            c.ErrorLeveDialog("Error generado al abrir: " + e.toString() , pm.getProperties("systematitle"));
        } 
    }
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnForm = new javax.swing.JPanel();
        txtCellNumbersFile = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSubject = new javax.swing.JTextField();
        txtAds = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        try{
            mask = new MaskFormatter("###-###-####");
        }catch(Exception es){}
        txtDealerNum = new javax.swing.JFormattedTextField(mask);
        jLabel7 = new javax.swing.JLabel();
        btnSelectImageFile = new javax.swing.JButton();
        btnSelectExcelFile = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        rbtnConDominio = new javax.swing.JRadioButton();
        rbtnSinDominio = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        rbtnLocCalifornia = new javax.swing.JRadioButton();
        rbtnLocMiami = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        cmbDealers = new javax.swing.JComboBox();
        txtVendedorName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtVendedorMail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtZone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        try{
            mask2 = new MaskFormatter("###-###-####");
        }catch(Exception es){}
        txtVendedorPhone = new javax.swing.JFormattedTextField(mask2);
        pnActivity = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableNumbers = new javax.swing.JTable();
        imgAds = new javax.swing.JLabel();
        pnReport = new javax.swing.JPanel();
        toolbarReport = new javax.swing.JToolBar();
        btnShareEmail = new javax.swing.JButton();
        bntPrint = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        htmlViewer = new javax.swing.JEditorPane();
        toolBarMMSForm = new javax.swing.JToolBar();
        btnSend = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnClear = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        cmbMails = new javax.swing.JComboBox();
        barra = new javax.swing.JProgressBar();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Multimedia Message Sending Module");
        setMaximumSize(new java.awt.Dimension(1024, 580));
        setPreferredSize(new java.awt.Dimension(1024, 580));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                close(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1350, 500));
        jTabbedPane1.setRequestFocusEnabled(false);

        txtCellNumbersFile.setText(" ");
        txtCellNumbersFile.setToolTipText("The cell numbers file");
        txtCellNumbersFile.setAutoscrolls(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Excel File:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Ads Name:");

        txtSubject.setEditable(false);
        txtSubject.setToolTipText("Subject of Message");

        txtAds.setText(" ");
        txtAds.setToolTipText("The advertising image file");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Ads File:");

        txtMessage.setColumns(25);
        txtMessage.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        txtMessage.setLineWrap(true);
        txtMessage.setRows(5);
        txtMessage.setToolTipText("Text Message (MMS)");
        txtMessage.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Message:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 10))); // NOI18N
        txtMessage.setMaximumSize(new java.awt.Dimension(216, 90));
        txtMessage.setMinimumSize(new java.awt.Dimension(216, 90));
        txtMessage.setPreferredSize(new java.awt.Dimension(216, 90));
        jScrollPane1.setViewportView(txtMessage);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Dealer Phone:");

        txtDealerNum.setEditable(false);
        txtDealerNum.setToolTipText("The dealer phone contact");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Dealer Name:");

        btnSelectImageFile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSelectImageFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegasus/images/tick.png"))); // NOI18N
        btnSelectImageFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectImageFileActionPerformed(evt);
            }
        });

        btnSelectExcelFile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSelectExcelFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegasus/images/tick.png"))); // NOI18N
        btnSelectExcelFile.setToolTipText("");
        btnSelectExcelFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectExcelFileActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel3.setLayout(new java.awt.GridLayout(1, 2));

        buttonGroup1.add(rbtnConDominio);
        rbtnConDominio.setSelected(true);
        rbtnConDominio.setText("With Domain");
        rbtnConDominio.setToolTipText("");
        rbtnConDominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnConDominioActionPerformed(evt);
            }
        });
        jPanel3.add(rbtnConDominio);

        buttonGroup1.add(rbtnSinDominio);
        rbtnSinDominio.setText("Without Domain");
        rbtnSinDominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSinDominioActionPerformed(evt);
            }
        });
        jPanel3.add(rbtnSinDominio);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Location", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel5.setLayout(new java.awt.GridLayout(1, 2));

        buttonGroup2.add(rbtnLocCalifornia);
        rbtnLocCalifornia.setSelected(true);
        rbtnLocCalifornia.setText("California");
        rbtnLocCalifornia.setToolTipText("");
        rbtnLocCalifornia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCaliforniaActionPerformed(evt);
            }
        });
        jPanel5.add(rbtnLocCalifornia);

        buttonGroup2.add(rbtnLocMiami);
        rbtnLocMiami.setText("Miami");
        rbtnLocMiami.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMiamiActionPerformed(evt);
            }
        });
        jPanel5.add(rbtnLocMiami);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegasus/images/Publicación1.png"))); // NOI18N
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        cmbDealers.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ItemDealerChanged(evt);
            }
        });

        txtVendedorName.setEditable(false);
        txtVendedorName.setToolTipText("Subject of Message");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Exct. Name:");

        txtVendedorMail.setEditable(false);
        txtVendedorMail.setToolTipText("Subject of Message");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Exct. E-mail :");

        txtZone.setEditable(false);
        txtZone.setToolTipText("Subject of Message");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Exec. Phone");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Dealer Zone:");

        txtVendedorPhone.setEditable(false);
        txtVendedorPhone.setToolTipText("The dealer phone contact");

        javax.swing.GroupLayout pnFormLayout = new javax.swing.GroupLayout(pnForm);
        pnForm.setLayout(pnFormLayout);
        pnFormLayout.setHorizontalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(34, 34, 34)
                        .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVendedorMail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtVendedorName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtZone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSubject)
                            .addComponent(txtVendedorPhone)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFormLayout.createSequentialGroup()
                        .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnFormLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(4, 4, 4)
                        .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDealerNum)
                            .addComponent(cmbDealers, 0, 258, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE))
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCellNumbersFile)
                            .addComponent(txtAds))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSelectImageFile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelectExcelFile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel5)
                        .addGap(0, 347, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnFormLayout.setVerticalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLayout.createSequentialGroup()
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbDealers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDealerNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(4, 4, 4)
                        .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtZone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVendedorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVendedorMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtVendedorPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSelectExcelFile, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCellNumbersFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))
                        .addGap(11, 11, 11)
                        .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSelectImageFile, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtAds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("MMS Form", new javax.swing.ImageIcon(getClass().getResource("/pegasus/images/form.png")), pnForm, "Formulario de configuracion de la campaña masiva de textos multimedia"); // NOI18N

        pnActivity.setLayout(new java.awt.BorderLayout());

        jScrollPane3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jScrollPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setMaximumSize(new java.awt.Dimension(400, 18));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(400, 18));

        txtLog.setBackground(new java.awt.Color(204, 204, 204));
        txtLog.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtLog.setPreferredSize(new java.awt.Dimension(500, 18));
        jScrollPane3.setViewportView(txtLog);

        pnActivity.add(jScrollPane3, java.awt.BorderLayout.EAST);

        jScrollPane5.setMaximumSize(new java.awt.Dimension(280, 402));
        jScrollPane5.setMinimumSize(new java.awt.Dimension(280, 402));
        jScrollPane5.setPreferredSize(new java.awt.Dimension(280, 402));

        tableNumbers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tableNumbers);

        pnActivity.add(jScrollPane5, java.awt.BorderLayout.WEST);

        imgAds.setText("jLabel11");
        imgAds.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pnActivity.add(imgAds, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("MMS Recipients", new javax.swing.ImageIcon(getClass().getResource("/pegasus/images/mnuHrmsLiq.png")), pnActivity); // NOI18N

        pnReport.setLayout(new java.awt.BorderLayout());

        toolbarReport.setRollover(true);

        btnShareEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegasus/images/email_send_receive.png"))); // NOI18N
        btnShareEmail.setText("Share By Email");
        btnShareEmail.setToolTipText("Share de PDF File witho another mail sender.");
        btnShareEmail.setFocusable(false);
        btnShareEmail.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnShareEmail.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnShareEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShareEmailActionPerformed(evt);
            }
        });
        toolbarReport.add(btnShareEmail);

        bntPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegasus/images/printer.png"))); // NOI18N
        bntPrint.setText("Print");
        bntPrint.setToolTipText("Print the Document");
        bntPrint.setFocusable(false);
        bntPrint.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bntPrint.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolbarReport.add(bntPrint);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegasus/images/save_as.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.setToolTipText("Save into another location the PDF File");
        btnSave.setFocusable(false);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolbarReport.add(btnSave);

        pnReport.add(toolbarReport, java.awt.BorderLayout.PAGE_START);

        htmlViewer.setContentType("text/html"); // NOI18N
        htmlViewer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(htmlViewer);

        pnReport.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Report", new javax.swing.ImageIcon(getClass().getResource("/pegasus/images/ReportePDF.png")), pnReport, "Aqui se visualiza el Reporte Gerencial de Envio."); // NOI18N

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        toolBarMMSForm.setRollover(true);
        toolBarMMSForm.setMinimumSize(new java.awt.Dimension(375, 32769));

        btnSend.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegasus/images/paper_airplane.png"))); // NOI18N
        btnSend.setText("Send");
        btnSend.setFocusable(false);
        btnSend.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        toolBarMMSForm.add(btnSend);
        toolBarMMSForm.add(jSeparator3);

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegasus/images/garbage_empty.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.setFocusable(false);
        btnClear.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        toolBarMMSForm.add(btnClear);
        toolBarMMSForm.add(jSeparator2);

        cmbMails.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "magazine.engine@carzoneads.com", "magazine.engine1@carzoneads.com", "magazine.engine2@carzoneads.com", "magazine.engine3@carzoneads.com", "magazine.engine4@carzoneads.com", "magazine.engine5@carzoneads.com", "magazine.engine6@carzoneads.com", "magazine.engine7@carzoneads.com", "magazine.engine8@carzoneads.com", "magazine.engine9@carzoneads.com" }));
        cmbMails.setSelectedIndex(1);
        cmbMails.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbMails.setMaximumSize(null);
        cmbMails.setMinimumSize(null);
        cmbMails.setPreferredSize(new java.awt.Dimension(100, 20));
        cmbMails.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ItemMailSelected(evt);
            }
        });
        toolBarMMSForm.add(cmbMails);

        getContentPane().add(toolBarMMSForm, java.awt.BorderLayout.PAGE_START);

        barra.setStringPainted(true);
        getContentPane().add(barra, java.awt.BorderLayout.PAGE_END);

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void FillDataBase() {
        dfmDealer = new DefaultComboBoxModel();
        try {
            dba = new USA();  //strNumGteRegional, strNumGteGeneral, strNumGteIT,strNumVendedor
            if (strLocalidad.equals("California")) {   
                rsDealer = dba.GetDealersInformation(" S.cCodState = 'US001'");
                this.strNumGteRegional = pm.getProperties("nNumGteCalifornia");
            } else { 
                rsDealer = dba.GetDealersInformation(" S.cCodState = 'US002'");
                this.strNumGteRegional = pm.getProperties("nNumGteMiami");
            }            
            objDealer = new ArrayList<Dealer>();      

            while (rsDealer.next()) {              
               
                String namedealer = rsDealer.getString("cNameDealer");                
                Dealer lstDealer = new Dealer( 
                        Long.valueOf(rsDealer.getLong("nNumDealer")),                        
                        rsDealer.getString("cCodDealer"), 
                        namedealer, 
                        rsDealer.getString("cZonas"), 
                        rsDealer.getString("cCodVendedor"),
                        rsDealer.getString("cNombreVendedor"),
                        rsDealer.getString("cTelefonoVendedor"),  
                        rsDealer.getString("cMailVendedor"), 
                        rsDealer.getString("cCodState"), 
                        rsDealer.getString("cStateName"));              
                dfmDealer.addElement(namedealer);
                objDealer.add(lstDealer);                
            }           
            rsDealer.close();
            cmbDealers.setModel(dfmDealer);
        } catch (SQLException ex) {
             c.ErrorLeveDialog("Error al cargar el Combo Dealers:\n"+ ex.toString()  , pm.getProperties("systematitle"));     
        }  finally {
            if (SqlHelper.resultquery != null) try { SqlHelper.resultquery.close(); } catch(Exception e) { System.out.println("resultquery; Se ha generado el siguiente error" + e.toString());}
            if (SqlHelper.statement != null) try { SqlHelper.statement.close(); } catch(Exception e) { System.out.println("statement; Se ha generado el siguiente error" + e.toString());}
            if (SqlHelper.conn != null) try { SqlHelper.conn.close(); } catch(Exception e) { System.out.println("conn; Se ha generado el siguiente error" + e.toString());}
        }
        
    }
    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
       
        if (nTry < 1) {           
            ArchivoLog = "JMMS_LogFile_"+ strLocalidad+ "_" + cmbDealers.getSelectedItem() + "_" +DateOperation.GetDateLog() + ".log";            
            filelog = new java.io.File(ArchivoLog);
            ArchivoLog = filelog.getAbsolutePath();    
            nTry +=1;

            try {
                fw = new java.io.FileWriter(filelog);
                bw = new java.io.BufferedWriter(fw);
                txt_salida = new java.io.PrintWriter(bw);
            } catch (java.io.IOException ex) {
              c.ErrorLeveDialog( "Error al crear el Archivo Log:\n\n"+ ex.toString(), pm.getProperties("systematitle"));     
            }
        }
        vLogActivity = vLogActivity + "\nIntento de envio: \t" + nTry;
        vLogActivity = vLogActivity + "\nBegint Process: \t\t" + DateOperation.GetDateFull();
        vLogActivity = vLogActivity + "\nComputadora: " + System.getProperty("user.name");        
        vLogActivity = vLogActivity +  "\nEngine: \t'" + vEmail + "'";
        vLogActivity = vLogActivity + (IsEmail == true ?  "\nTipo de Envio: \t\tCon Dominios" : "\nTipo de Envio: \t\tSin Dominios");   
        vLogActivity = vLogActivity + (strLocalidad.equals("California") ? "\nUbicacion: \t\tCalifornia" : "\nUbicacion: \t\tMiami");
        vLogActivity = vLogActivity + "\nImage File: '" + rootAdsImage + "'";    
        vLogActivity = vLogActivity + "\nExcel File: '" + rootNumbers + "'";   
        vLogActivity = vLogActivity + "\nCantidad de Numeros: '" + CellNumbers.length + "'";   
        vLogActivity = vLogActivity + "\nDealer Name:\t\t" + cmbDealers.getSelectedItem();
        vLogActivity = vLogActivity + "\nDealer Phone:\t\t" + txtDealerNum.getText();
        vLogActivity = vLogActivity + "\nMessage:\n" + txtMessage.getText() + "\n";
        
        txtLog.setText(vLogActivity);
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); //ubica el cursor al final
        
        txt_salida.println(vLogActivity);
        
        
        String valSubject = JCharacter.ValidateSubjectMMS(txtSubject.getText());
        String valMessage = JCharacter.ValidateMMS(txtMessage.getText());
               
        if (valSubject != null) {
            c.ErrorLeveDialog( valSubject, pm.getProperties("systematitle"));
        }
        else {
            if (txtDealerNum.getText() == null){
               c.ErrorLeveDialog("The 'Dealer Name' can not be empty",  pm.getProperties("systematitle"));
            } else {
                if (valMessage != null && txtDealerNum.getText() != null) {
                    c.ErrorLeveDialog(valMessage, pm.getProperties("systematitle"));
                } else {
                    this.setTitle(pm.getProperties("systematitle") + " ==>> " + cmbDealers.getSelectedItem().toString().toUpperCase()+ " <<==");
                    this.jTabbedPane1.setSelectedIndex(1);
                    cg = new ThreadMail();                   
                    cg.start();
                }      
            }            
        } 
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        
    }//GEN-LAST:event_btnClearActionPerformed
    
    private void LlenarTabla(Object[][] args) {
       
        model = (DefaultTableModel) tableNumbers.getModel();  
  
        try {
            for (int r=0; r < args.length-1 ; r++) {
                model.addRow(new Object[] {args[r][0], args[r][1].equals("1")});
            } 
            tableNumbers.setModel(model);
        } catch (Exception s) {
            c.ErrorLeveDialog("Error llenando el JTable, detalles del error:\n"+ s.toString(),pm.getProperties("systematitle")); 
        }
        tableNumbers.getColumnModel().getColumn(0).setPreferredWidth(200);
        for(int i=0; i <= args.length - 1; i++)  {
            System.out.println("Numero: " + CellNumbers[i][0] + " -  Estado: " +  CellNumbers[i][1]  );
        }
    }
    private void btnSelectExcelFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectExcelFileActionPerformed
        int i;
        
        try
        {
            if (this.strNumVendedor.length() <= 0) {
                c.ErrorLeveDialog("<html>Antes de cargar el archivo se debem especificar los <b><font color=RED>DATOS DE LA CAMPAÑA</font></b></html>",pm.getProperties("systematitle"));                    
            } else {
               // LimpiarTabla();
                JFileChooser chooser = new JFileChooser();
                //Show only the excel files
                String[] EXTENSION=new String[]{"xls","xml","xlsm","xlsx"};
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files",EXTENSION);
                chooser.setFileFilter(filter);
                chooser.setDialogTitle("Select the Excel File");
                chooser.setAcceptAllFileFilterUsed(false);
                chooser.setSize(250, 150);
                chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                chooser.showOpenDialog(rootPane);
            
                if (chooser.getSelectedFile() != null)
                {
                    this.rootNumbers = chooser.getSelectedFile().getPath();
                    this.txtCellNumbersFile.setText(rootNumbers);

                    java.io.InputStream ExcelFileToRead = new java.io.FileInputStream(rootNumbers);
                    XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead);
                    XSSFSheet sheet = wb.getSheetAt(0);
                    CellNumbers =  new String[sheet.getPhysicalNumberOfRows()+8][2];     


                    if ((sheet.getRow(0).getCell(0).getCellType() > 0) && !IsEmail) {
                        c.ErrorLeveDialog("<html>El archivo de excel contiene numeros <font color=red><b>CON DOMINIOS</b></font>. Para numeros <font color=red><b>CON DOMINIOS</b></font> seleccione <font color=red><b>'With Domain'</b></font></html>",pm.getProperties("systematitle"));
                        this.txtCellNumbersFile.setText("");
                    } else {
                        if (!(sheet.getRow(0).getCell(0).getCellType() > 0) && IsEmail) { 
                             c.ErrorLeveDialog("<html>El archivo de excel contiene numeros  <font color=red><b>SIN DOMINIOS</b></font>. Para numeros <font color=red><b>SIN DOMINIOS</b></font> seleccione <font color=red><b>'Without Domain'</b></font></html>",pm.getProperties("systematitle"));
                             this.txtCellNumbersFile.setText("");
                        } else {
                            if (IsEmail) {

                                CellNumbers[0][0] = pm.getProperties("nNumGteGeneral");   //GERENTE GENERAL     
                                CellNumbers[0][1] = "0";                               
                                CellNumbers[1][0] = strNumGteRegional ;  //GERENTE REGIONAL     
                                CellNumbers[1][1] = "0";  
                                CellNumbers[2][0] = pm.getProperties("nNumGteIT"); //GERENTE DE IT   
                                CellNumbers[2][1] = "0";   
                                CellNumbers[3][0] = strNumVendedor; //VENDEDOR
                                CellNumbers[3][1] = "0";     

                                for(i=4; i <= CellNumbers.length-5; i++)
                                {
                                    XSSFCell cell = sheet.getRow(i-4).getCell(0);
                                    if (cell != null) {     
                                        CellNumbers[i][0] = cell.getStringCellValue();       
                                        CellNumbers[i][1] = "0";
                                    }                  
                                }   
                                CellNumbers[i][0] = pm.getProperties("nNumGteGeneral");      
                                CellNumbers[i][1] = "0";  

                                CellNumbers[i+1][0] = strNumGteRegional;     
                                CellNumbers[i+1][1] = "0";  

                                CellNumbers[i+2][0] = pm.getProperties("nNumGteIT");      
                                CellNumbers[i+2][1] = "0";    

                                CellNumbers[i+3][0] = strNumVendedor;   
                                CellNumbers[i+3][1] = "0"; 


                            } else { //Numeros Sin dominios
                                CellNumbers[0][0] = pm.getProperties("nNumGteGeneral").substring(0, 10);                   
                                CellNumbers[0][1] = "0";
                                CellNumbers[1][0] = strNumGteRegional.substring(0, 10);                   
                                CellNumbers[1][1] = "0";
                                CellNumbers[2][0] = pm.getProperties("nNumGteIT").substring(0, 10);                   
                                CellNumbers[2][1] = "0";
                                CellNumbers[3][0] = strNumVendedor.substring(0, 10);     
                                CellNumbers[3][1] = "0";

                                for(i=4; i <= CellNumbers.length-5; i++)
                                {
                                    XSSFCell cell = sheet.getRow(i-4).getCell(0);
                                    if (cell != null)
                                    {    
                                        CellNumbers[i][0] = new DecimalFormat("##########").format(cell.getNumericCellValue());  
                                        CellNumbers[i][1] = "0";
                                    }                  
                                }   
                                CellNumbers[i][0] = pm.getProperties("nNumGteGeneral").substring(0, 10);                   
                                CellNumbers[i][1] = "0";    
                                CellNumbers[i+1][0] = strNumGteRegional.substring(0, 10);                 
                                CellNumbers[i+1][1] = "0";   
                                CellNumbers[i+2][0] = pm.getProperties("nNumGteIT").substring(0, 10);                 
                                CellNumbers[i+2][1] = "0";   
                                CellNumbers[i+3][0] = strNumVendedor.substring(0, 10);        
                                CellNumbers[i+3][1] = "0";   
                            } 
                            LlenarTabla(CellNumbers);                            
                        }
                    } 
                }
            }            
        }
        catch (Exception e)     {
             c.ErrorLeveDialog("Se ha generado un error al leer el archivo de Excel: " + e.toString(), pm.getProperties("systematitle"));
        }
    }//GEN-LAST:event_btnSelectExcelFileActionPerformed

    private void btnSelectImageFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectImageFileActionPerformed
        try
        {
            JFileChooser chooser = new JFileChooser();
            //Show only the excel files
            String[] EXTENSION=new String[]{"jpg","png","jpe","gif"};
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Images Files",EXTENSION);
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Select the Image Ads File");
           
            //chooser.setCurrentDirectory = (System.getProperty("user.home") + System.getProperty("line.separator")+ "Music");
            chooser.setAcceptAllFileFilterUsed(false);
            chooser.setSize(250, 150);
            chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            chooser.showOpenDialog(null);

            if (chooser.getSelectedFile() != null)
            {
                if (chooser.getSelectedFile().length() < 100000) {                   
                
                    rootAdsImage = chooser.getSelectedFile().getPath();
                    txtAds.setText(rootAdsImage);
                    ImageIcon icon = new ImageIcon(chooser.getSelectedFile().toString());
                    Icon ic = new ImageIcon(icon.getImage().getScaledInstance(imgAds.getWidth(),imgAds.getHeight(),Image.SCALE_DEFAULT));
                    imgAds.setIcon(ic);
                } else {
                     c.ErrorLeveDialog("El tamaño de la imagen no pueda superar los 100 Kb.", pm.getProperties("systematitle"));
                }
            }
        }
        catch (Exception e)     {
             c.ErrorLeveDialog("Error al seleccionar archivo:\n\n "+ e.toString(), pm.getProperties("systematitle"));
        }
    }//GEN-LAST:event_btnSelectImageFileActionPerformed

    private void ItemMailSelected(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ItemMailSelected
        // TODO add your handling code here:
         if (evt.getSource()==cmbMails) {  
            if(cmbMails.getSelectedItem().toString() != null) {
                vEmail = (String)cmbMails.getSelectedItem();
                System.out.println("\nSe ha elegido el correo: " + vEmail );
            }
        }
    }//GEN-LAST:event_ItemMailSelected

    private void rbtnConDominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnConDominioActionPerformed
        IsEmail = rbtnConDominio.isSelected();     
        System.out.println("\nIsEmail" + rbtnConDominio.isSelected() );
    }//GEN-LAST:event_rbtnConDominioActionPerformed

    private void rbtnSinDominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSinDominioActionPerformed
        IsEmail = !(rbtnSinDominio.isSelected());      
        System.out.println("\nIsEmail" + !rbtnSinDominio.isSelected() );
    }//GEN-LAST:event_rbtnSinDominioActionPerformed

    private void ItemDealerChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ItemDealerChanged
        String strDealer = null;
        try {
            if (evt.getSource()== cmbDealers ) {  
                if(cmbDealers.getSelectedItem().toString() != null) {
                    strDealer = (String)cmbDealers.getSelectedItem();
                    System.out.println("\nSe ha elegido el Dealer: " + strDealer );               

                    Iterator<Dealer> itrDealer = objDealer.iterator();
                    while(itrDealer.hasNext()){
                        Dealer deal = itrDealer.next();
                        if(strDealer.equals(deal.getNameDealer())) {
                            txtDealerNum.setText(String.valueOf(deal.getNumDealer()));
                            txtVendedorName.setText(deal.getNombreVendedor());
                            txtVendedorMail.setText(deal.getMailVendedor());
                            txtVendedorPhone.setText(deal.getTelefonoVendedor());
                            txtZone.setText(deal.getZonas());
                            txtSubject.setText(deal.getCodDealer());                
                            strNumVendedor = deal.getTelefonoVendedor();
                            //strNumGteRegional, strNumGteGeneral, strNumGteIT,strNumVendedor
                            String formattedNumber = String.format("%s-%s-%s",String.valueOf(deal.getNumDealer()).substring(0, 3),String.valueOf(deal.getNumDealer()).substring(3, 6),String.valueOf(deal.getNumDealer()).substring(6, 10));

                            txtMessage.setText("!Ahorre Dinero!\n!Big Savings!\nLlame ahora\n" + formattedNumber +"\n<< Call Now >>\nauto-latino.com");
                        }                  
                    }
                }
            }
        } catch (Exception e) {
            c.ErrorLeveDialog("Error al conectarse a la BD:\n\n "+ e.toString(), pm.getProperties("systematitle"));
        }
        
    }//GEN-LAST:event_ItemDealerChanged

    private void rbtnCaliforniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCaliforniaActionPerformed
        strLocalidad = "California";
        FillDataBase();
    }//GEN-LAST:event_rbtnCaliforniaActionPerformed

    private void rbtnMiamiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMiamiActionPerformed
        strLocalidad = "Miami";
        FillDataBase();
    }//GEN-LAST:event_rbtnMiamiActionPerformed

    private void close(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_close
        if (JOptionPane.showConfirmDialog(rootPane, "<html>¿Realmente desea <b><font color=red>CANCELAR</font></b> el envio de <b><font color=red>" + this.cmbDealers.getSelectedItem() + "</font></b></html>?", pm.getProperties("systematitle"), JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            this.dispose();
        }    
    }//GEN-LAST:event_close

    private void btnShareEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShareEmailActionPerformed
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));     
        String s = "file://localhost/" + CreateRptGerencial();
        try {
            htmlViewer.setPage(new URL(s));
        } catch (java.io.IOException ex) {
            Logger.getLogger(JMMS.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
             this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));     
        }
    }//GEN-LAST:event_btnShareEmailActionPerformed
    
    private String CreateRptGerencial() {
       
        String NombreRptHTML = null, NombreRptPDF = null;
        java.io.File file, file2;
        java.io.FileWriter fws;
        java.io.BufferedWriter buferwriter;
        java.io.PrintWriter misalida;
        try {
            rpt = new TechnicalReports((String)cmbDealers.getSelectedItem(),this.txtAds.getText(),"https://dl.dropboxusercontent.com/s/ec9nhnpco56ao19/Logo_Allure.png?dl=0",
                "3113 West 70 Terrace",this.txtDealerNum.getText(),(rbtnLocMiami.isSelected()) ? "Miami" : "California", (String)cmbMails.getSelectedItem(), 
                IsEmail ? "USA" : "Ring Central Box",String.valueOf(CellNumbers.length),  this.txtCellNumbersFile.getText(), this.txtAds.getText(),
                this.strNumVendedor, this.txtMessage.getText(),CellNumbers); 
            

            NombreRptHTML = "File_" + cmbDealers.getSelectedItem().toString().replace(" ", "") + "_" +DateOperation.GetDateLog() + ".html";
            file = new java.io.File(NombreRptHTML);
            NombreRptHTML =  file.getAbsolutePath();

            fws = new java.io.FileWriter(file);
            buferwriter = new java.io.BufferedWriter(fws);
            misalida = new java.io.PrintWriter(buferwriter);
            misalida.println(rpt.GetHTML());
            misalida.close();   
            
            NombreRptPDF = "ReportGerencia_" + cmbDealers.getSelectedItem().toString().replace(" ", "") + "_" +DateOperation.GetDateLog() + ".pdf";
            file2 = new java.io.File(NombreRptPDF);
            NombreRptPDF =  file2.getAbsolutePath();
            c.createPDF(NombreRptPDF,NombreRptHTML);
            return NombreRptHTML;
        }
        catch(Exception s) {            
            c.ErrorCriticoDialog("Error critico generando el Reporte de Gerencia" + s.toString(), pm.getProperties("systematitle"));  
             System.out.println(s.toString());
            return NombreRptHTML;
        }        
      
    }
    class ThreadMail extends Thread {
        public void run() {
            try{               
                txtLog.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
                btnSend.setEnabled(false);
                btnClear.setEnabled(false);
                cmbMails.setEnabled(false);
                txtMessage.setEnabled(false);
                txtDealerNum.setEnabled(false);
                cmbDealers.setEnabled(false);
                btnSelectExcelFile.setEnabled(false);
                btnSelectImageFile.setEnabled(false);        
                
                gatewaydomain = (String[])JCharacter.Decode(pm.getProperties("gateway"), ",");
                blackNumber = (String[])JCharacter.Decode(pm.getProperties("blacklistphone"), ",");       
                
                int tenv = (IsEmail) ? CellNumbers.length : (CellNumbers.length * gatewaydomain.length), cont = 0, min   = 0; 
                double porcentaje = 0;
                barra.setValue(min);
                barra.setMinimum(min);
                barra.setMaximum(100);          
                
                for (int j = 0; j < CellNumbers.length; j++) { //Recorriendo los numeros telefonicos    
                    if(CellNumbers[j][1].equals("0")) { //Si aun no se le ha enviado correo
                        if (IsEmail) //ENVIANDO A NUMEROS CON DOMINIOS SEGUROS
                        {
                            cont+=1;  
                            porcentaje = ((Math.sqrt(cont) / Math.sqrt(tenv)) * 100.00);

                            Session session = Session.getInstance(props, new Authenticator() {
                                    @Override
                                    protected PasswordAuthentication getPasswordAuthentication() { return new PasswordAuthentication(vEmail, pm.getProperties("pass")); }});

                            Message message = new MimeMessage(session);
                            message.setFrom(new InternetAddress(vEmail));
                            MimeBodyPart mbp1 = new MimeBodyPart();
                            mbp1.setText(txtMessage.getText());
                            MimeBodyPart mbp2 = new MimeBodyPart();
                            FileDataSource fds = new FileDataSource(rootAdsImage);
                            mbp2.setDataHandler(new DataHandler(fds));
                            mbp2.setFileName(fds.getName());
                            Multipart mp = new MimeMultipart();
                            mp.addBodyPart(mbp1);
                            mp.addBodyPart(mbp2);
                            message.setContent(mp);
                            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(CellNumbers[j][0]));
                            message.setSubject(txtSubject.getText());
                            Transport.send(message);                        
                            Thread.sleep(Functions.RandomInteger(3000,5000));
                            vLogActivity = vLogActivity +  "\n  MMS to: '" +  CellNumbers[j][0].substring(0, 10) + "'   -    Porcentaje: " + Functions.RoundtoDouble(porcentaje) + " %   -   Hour: " + DateOperation.GetHour();
                            txt_salida.println("MMS to: '" + CellNumbers[j][0] + "'   - Porcentaje: " + Functions.RoundtoDouble(porcentaje) + " % -  Hour: " + DateOperation.GetHour());

                            txtLog.setText(vLogActivity); 
                            txtLog.setCaretPosition(txtLog.getDocument().getLength()); //ubica el cursor al final   
                            System.out.println("Se ha enviado SMS al Numero : " +  CellNumbers[j][0] + "\t Contador: " + cont + "\t Porcentaje: " + Functions.RoundtoDouble(porcentaje) + " % \t Total Envios: " + tenv);

                            barra.setValue(Functions.RoundtoInt(porcentaje));
                        } else { //ENVIANDO A NUMBEROS DONDE NO SE SABE EL DOMINIO
                            vLogActivity = vLogActivity +  "\nSending...MMS to Number: '" +   CellNumbers[j][0] + "' - Time: " + DateOperation.GetHour() + " <<==>> ** " + Functions.RoundtoDouble(porcentaje) + " **";
                            txtLog.setText(vLogActivity); 
                            txtLog.setCaretPosition(txtLog.getDocument().getLength());
                            for (String gtw1 : gatewaydomain) { //Recorriendo los dominios
                                if ( CellNumbers[j][0] != null){ 
                                    cont+=1;  
                                    porcentaje = ((Math.sqrt(cont) / Math.sqrt(tenv)) * 100.00);

                                    Session session = Session.getInstance(props, new Authenticator() { 
                                        @Override
                                        protected PasswordAuthentication getPasswordAuthentication() { return new PasswordAuthentication(vEmail, pm.getProperties("pass")); }
                                    });

                                    Message message = new MimeMessage(session);
                                    message.setFrom(new InternetAddress(vEmail));
                                    MimeBodyPart mbp1 = new MimeBodyPart();
                                    mbp1.setText(txtMessage.getText());
                                    MimeBodyPart mbp2 = new MimeBodyPart();
                                    FileDataSource fds = new FileDataSource(rootAdsImage);
                                    mbp2.setDataHandler(new DataHandler(fds));
                                    mbp2.setFileName(fds.getName());
                                    Multipart mp = new MimeMultipart();
                                    mp.addBodyPart(mbp1);
                                    mp.addBodyPart(mbp2);
                                    message.setContent(mp);
                                    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse( CellNumbers[j][0] + gtw1));
                                    message.setSubject(txtSubject.getText());

                                    Transport.send(message);

                                    Thread.sleep(Functions.RandomInteger(3000,5000));
                                    vLogActivity = vLogActivity +  "\n\t  Gateway Domain: '" +  gtw1 + "' ==>> " + Functions.RoundtoDouble(porcentaje)+ " %";
                                    txt_salida.println("\t  Gateway Domain: '" +  gtw1 + "' ==>> " + Functions.RoundtoDouble(porcentaje)+ " %");
                                    txtLog.setText(vLogActivity);                                 
                                    txtLog.setCaretPosition(txtLog.getDocument().getLength()); //ubica el cursor al final                              
                                    barra.setValue(Functions.RoundtoInt(porcentaje));  
                                }
                            }
                        }
                        CellNumbers[j][1] = "1";
                        LlenarTabla(CellNumbers);
                    }
                }                
                
                vLogActivity = vLogActivity + "\nProcess finished: " + DateOperation.GetHour();
                txt_salida.println("Process finished: " + DateOperation.GetHour());
                txtLog.setText(vLogActivity);
                txtLog.setCaretPosition(txtLog.getDocument().getLength()); //ubica el cursor al final                            
                EnviarRPT("Massive Sending Report - " + cmbDealers.getSelectedItem(), txtLog.getText(),rootAdsImage);                             
                 c.TareaCompletadaDialog("Envio completado exitosamente!!", pm.getProperties("systematitle"));
            } catch(Exception m) {
                vLogActivity = vLogActivity + "\nError en el proceso Massivo: " + DateOperation.GetHour();            
                vLogActivity = vLogActivity + ("\nMensaje que muestra el compilador: " + m.getMessage()); 
                vLogActivity = vLogActivity + ("\nDetalles del error: " + m.toString());
                
                txt_salida.println("\nError en el proceso de envio: " + DateOperation.GetHour());
                txt_salida.println("\nMensaje que muestra el compilador: " + m.getMessage()); 
                txt_salida.println("\nDetalles del error: " + m.toString());
               
                txtLog.setText(vLogActivity);
                txtLog.setCaretPosition(txtLog.getDocument().getLength()); //ubica el cursor al final
                EnviarRPT("Massive Sending Report - " + cmbDealers.getSelectedItem() + " - BreakPoint ", txtLog.getText(),rootAdsImage);           
                btnSend.setEnabled(true);
                btnClear.setEnabled(true);                
              
                btnSelectExcelFile.setEnabled(true);
                btnSelectImageFile.setEnabled(true);
                barra.setValue(0);
                c.ErrorCriticoDialog("Error Critico, la tarea CADUCO!!!!\n\nDetalles del error: " + m.toString(), pm.getProperties("systematitle"));
            }
            finally {
                txt_salida.close();
                btnSend.setEnabled(true);
                btnClear.setEnabled(true);
                cmbMails.setEnabled(true);
                txtMessage.setEnabled(true);
                txtDealerNum.setEnabled(true);
                cmbDealers.setEnabled(true);
                btnSelectExcelFile.setEnabled(true);
                btnSelectImageFile.setEnabled(true);
                barra.setValue(0);
                txtLog.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            }
        }
    }
     
    class ThreadCleanMail extends Thread {
        public void run(){
            
            try {                
                email = new JElectronicMail(pm.getProperties("smtpserver"), pm.getProperties("port"), true);
                email.setMailAddressFrom(vEmail);
                email.setMailAddressFromPassword(pm.getProperties("pass"));  
                email.EmptyInbox(true);
               
                
            } catch(Exception m) {
                JOptionPane.showMessageDialog(null,"Error al vaciar el INBOX: " + m.toString(), "Error",JOptionPane.ERROR_MESSAGE);
            } finally {
                
            }            
        }
    }
    
    private void EnviarRPT(String pSubject, String msg, String attach) {
        try {
            String logy = "\nUser Name: " +  System.getProperty("user.name");
            Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(pm.getProperties("user0"), pm.getProperties("pass"));
                }
            });

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(pm.getProperties("user0")));

            MimeBodyPart mbp1 = new MimeBodyPart();
            mbp1.setText(msg + logy);

            MimeBodyPart mbp2 = new MimeBodyPart();

            FileDataSource fds = new FileDataSource(attach);
        
            mbp2.setDataHandler(new DataHandler(fds));

            mbp2.setFileName(fds.getName());

            Multipart mp = new MimeMultipart();
            mp.addBodyPart(mbp1);
            mp.addBodyPart(mbp2);
         
            message.setContent(mp);
            if (rbtnLocMiami.isSelected()) {
                 message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(pm.getProperties("emailfabricio"))); 
            } else {
                 message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(pm.getProperties("emailmauricio"))); 
            }
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(pm.getProperties("emailmichael")));
            message.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(pm.getProperties("emailjuan")));
            message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(pm.getProperties("emailrudy")));            
            message.setSubject(pSubject);
            Transport.send(message); // String pDirExcelFile, String pDirImageFile, String pExecutive, String pTexto, String[][] matriz           
           // htmlVisor.setText(CreateRptGerencial());
           this.htmlViewer.setPage(CreateRptGerencial());
            
        }catch(Exception s) {
            c.ErrorCriticoDialog("Error generando el REPORTE DE ENVIO.\n\nDetalles del error: " + s.toString(), pm.getProperties("systematitle"));           
            vLogActivity = vLogActivity + "\nError in massive sending: (" + DateOperation.GetHour() + ") :" + s.toString();
            txtLog.setText(vLogActivity);
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
    }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra;
    private javax.swing.JButton bntPrint;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSelectExcelFile;
    private javax.swing.JButton btnSelectImageFile;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnShareEmail;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cmbDealers;
    private javax.swing.JComboBox cmbMails;
    private javax.swing.JEditorPane htmlViewer;
    private javax.swing.JLabel imgAds;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnActivity;
    private javax.swing.JPanel pnForm;
    private javax.swing.JPanel pnReport;
    private javax.swing.JRadioButton rbtnConDominio;
    private javax.swing.JRadioButton rbtnLocCalifornia;
    private javax.swing.JRadioButton rbtnLocMiami;
    private javax.swing.JRadioButton rbtnSinDominio;
    private javax.swing.JTable tableNumbers;
    private javax.swing.JToolBar toolBarMMSForm;
    private javax.swing.JToolBar toolbarReport;
    private javax.swing.JTextField txtAds;
    private javax.swing.JTextField txtCellNumbersFile;
    private MaskFormatter mask;
    private javax.swing.JFormattedTextField txtDealerNum;
    public javax.swing.JTextPane txtLog;
    private javax.swing.JTextArea txtMessage;
    private javax.swing.JTextField txtSubject;
    private javax.swing.JTextField txtVendedorMail;
    private javax.swing.JTextField txtVendedorName;
    private MaskFormatter mask2;
    private javax.swing.JFormattedTextField txtVendedorPhone;
    private javax.swing.JTextField txtZone;
    // End of variables declaration//GEN-END:variables
}
