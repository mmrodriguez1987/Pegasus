/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JRodriguez.Utils;


import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
 
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import java.io.File;


/**
 *
 * @author Analyst
 */
public class Common {
    
    public void InformationDialog(String message,String title)
    {
        PlaySound("InformationDialog.wav"); 
      
        JOptionPane.showMessageDialog(null,message,title, JOptionPane.INFORMATION_MESSAGE,new ImageIcon(getClass().getResource("/JRodriguez/resources/Confirmacion.png")));	
    }
    
    public void ErrorCriticoDialog(String message,String title)
    {
        PlaySound("Infected.wav");
        JOptionPane.showMessageDialog(null,message,title, JOptionPane.ERROR_MESSAGE,new ImageIcon(getClass().getResource("/JRodriguez/resources/Emoticon.gif")));	
    }
    
    public void ErrorLeveDialog(String message,String title)
    {
        PlaySound("errorMsg.wav");
        JOptionPane.showMessageDialog(null,message,title, JOptionPane.ERROR_MESSAGE,new ImageIcon(getClass().getResource("/JRodriguez/resources/Error.png")));	
    }
    
    public void TareaCompletadaDialog(String message,String title)
    {
        PlaySound("Completado.wav");
        JOptionPane.showMessageDialog(null,message,title, JOptionPane.INFORMATION_MESSAGE,new ImageIcon(getClass().getResource("/JRodriguez/resources/Confirmacion.png")));	
    }
    
    public void PlaySound(String sound)
    {
        File FileSound = new File(getClass().getResource("/JRodriguez/resources/" +sound).getPath());
        AudioFileFormat AFF;
        AudioInputStream AIS;
       
        try
        {
            AFF = AudioSystem.getAudioFileFormat(FileSound);
            AIS = AudioSystem.getAudioInputStream(FileSound);
            AudioFormat af = AFF.getFormat();				

            DataLine.Info info = new DataLine.Info(
            Clip.class,
            AIS.getFormat(), ((int) AIS.getFrameLength() * af.getFrameSize()));

            Clip ol = (Clip) AudioSystem.getLine(info);
            ol.open(AIS); ol.loop(0);  		
        }
        catch(Exception e1){}      
    }
    
    public void createPDF (String pdfFilename, String File_To_Convert) throws IOException, DocumentException
    {
 
        //path for the PDF file to be generated
      
        PdfWriter pdfWriter = null;
   
        //create a new document
        Document document = new Document();



            //get Instance of the PDFWriter
            pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(pdfFilename));

            //document header attributes
            document.addAuthor("AutoLatino Magazine");
            document.addCreationDate();
            document.addProducer();
            document.addCreator("www.auto-latino.com");
            document.addTitle("Pegasus Systems - Report");
            document.setPageSize(PageSize.LETTER);

            //open document
            document.open();

            //To convert a HTML file from the filesystem
           
            FileInputStream fis = new FileInputStream(File_To_Convert);

            //URL for HTML page
            //URL myWebPage = new URL("http://www.auto-latino.com");
           // InputStreamReader fis = new InputStreamReader(myWebPage.openStream());

            //get the XMLWorkerHelper Instance
            XMLWorkerHelper worker = XMLWorkerHelper.getInstance();
            //convert to PDF
            worker.parseXHtml(pdfWriter, document, fis);

            //close the document
            document.close();
            //close the writer
            pdfWriter.close();
 
           
 
    }
    
    
    
}
