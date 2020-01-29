/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JRodriguez.JInternet.Mail;


import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


/**
 *
 * @author Michael
 */
public class JElectronicMail {
    
    private String mailAddressTo = null;
    private String mailAddressCCO = null;
    private String mailAddressCC = null;
    private String mailAddressFrom = null;
    private String mailAddressFromPassword = null;
    private String mailSMTPHost = null;    
    private String mailSMTPPort = null;
    private String mailSubject = null;    
    private String mailMessage = null;
    private boolean mailTLS = true;
    private String mailAttachment = null;    
    private Session session;
    private Properties props;
    private Message message;
   
     
    public void setMailAttachment(String mailAttachment) { 
        this.mailAttachment = mailAttachment; 
    }       
    public void setMailTLS(boolean mailTLS) {
        this.mailTLS = mailTLS; 
    }  
    public void setMailAddressFromPassword(String mailAddressFromPassword) {
        this.mailAddressFromPassword = mailAddressFromPassword;
    }
    public void setMailSMTPPort(String mailSMTPPort) {
        this.mailSMTPPort = mailSMTPPort;
    }
    public void setMailSMTP(String mailSMTP) {
        this.mailSMTPHost = mailSMTP;
    }
    public void setMailAddressCC(String mailAddressCC) {
        this.mailAddressCC = mailAddressCC;
    }
    public void setMailAddressCCO(String mailAddressCCO) {
        this.mailAddressCCO = mailAddressCCO;
    } 
    public void setMailMessage(String mailMessage) {
        this.mailMessage = mailMessage;
    }
    public void setMailAddressTo(String mailAddressTo) {
        this.mailAddressTo = mailAddressTo;
    }
    public String getMailSubject() {
        return mailSubject;
    }

    public void setMailSubject(String mailSubject) {
        this.mailSubject = mailSubject;
    }
    
    public void setMailAddressFrom(String mailaddres) {
        this.mailAddressFrom = mailaddres;
    }

    /**
     *  Constructor that Initialize the class
     * 
     * @param smtpHost SMTP Server Electronic Mail
     * @param port Port
     * @param tls true if is enable the TLS Encrypt message 
     */
    public JElectronicMail(String smtpHost, String port, boolean tls)
    {
        try
        {            
            mailSMTPHost = smtpHost;
            mailSMTPPort = port;
            mailTLS = tls;

            props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", mailTLS  ? "true" : "false");
            props.put("mail.smtp.host",mailSMTPHost);
            props.put("mail.smtp.port", mailSMTPPort);

            
         }        
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * Method to send message
     */
    public void SendMessage()
    {       
        try
        {   
            
            //{
            session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(mailAddressFrom, mailAddressFromPassword);
                }
            });
            
            message = new MimeMessage(session);
            message.setFrom(new InternetAddress(mailAddressFrom));

            // create and fill the first message part
            MimeBodyPart mbp1 = new MimeBodyPart();
            mbp1.setText(mailMessage);

            // create the second message part
            MimeBodyPart mbp2 = new MimeBodyPart();

            // attach the file to the message
            FileDataSource fds = new FileDataSource(mailAttachment);
            mbp2.setDataHandler(new DataHandler(fds));
            mbp2.setFileName(fds.getName());

            // create the Multipart and add its parts to it
            Multipart mp = new MimeMultipart();
            mp.addBodyPart(mbp1);
            mp.addBodyPart(mbp2);
            // add the Multipart to the message
            message.setContent(mp);
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mailAddressTo));

            if (mailAddressCCO != null) {
                message.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(mailAddressCCO));
            }

            if (mailAddressCC != null) {
                message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(mailAddressCC));
            }            
            message.setSubject(mailSubject);
            Transport.send(message);                       
        } catch (Exception z) {
            System.out.println("Internet conexion error: " + z.toString()); 
        }
        
    }
    
    /**
     * This method will empty the mailbox
     * @param allFolrder if is true all sub-folder will be deleted
     */
    public void EmptyInbox(boolean allFolrder)
    {
        try {
            session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(mailAddressFrom, mailAddressFromPassword);
                }
            });
            
            // Crear un Store indicando el protocolo de acceso y conectarse a él
            Store store = session.getStore("pop3");
            store.connect(mailSMTPHost, mailAddressFrom, mailAddressFromPassword);            
            Folder INBOXfolder = store.getFolder("INBOX");           
            INBOXfolder.open(Folder.READ_WRITE);           
            INBOXfolder.delete(allFolrder); 
            INBOXfolder.close(true);
            store.close();
        }
        catch(MessagingException me) {
            throw new RuntimeException(me);
        }
    }
    
    /**
     * This method delete all message in box but not the folders
     */
    public void EmptyInbox()
    {
        EmptyInbox(false);        
    }

}
