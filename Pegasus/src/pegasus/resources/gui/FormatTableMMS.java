package pegasus.resources.gui;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
///**
// *
// * @author Analyst
//
// */
public class FormatTableMMS extends DefaultTableCellRenderer{    
    Font normal = new Font("Tahoma",Font.PLAIN,11);
    Font negrilla = new Font("Tahoma",Font.BOLD,11);
    Font cursiva = new Font("Tahoma",Font.ITALIC,11);

    @Override 
    public Component getTableCellRendererComponent (JTable table, Object value, boolean selected, boolean focused, int row, int column ) 
    {
        setEnabled(table == null || table.isEnabled()); 
        
        setBackground(Color.WHITE);//color de fondo
        table.setFont(normal);//tipo de fuente
        table.setForeground(Color.black);//color de texto
                
        String val = String.valueOf(table.getValueAt(row,column));
        Boolean v = Boolean.parseBoolean(String.valueOf(table.getValueAt(row,1)));
               
        //Si la celda contiene los numeros del personal de AUTOLATINO
        if(val.contains("3237029087") || val.contains("7863550502") || val.contains("7863075854") || val.contains("3056101530") || val.contains("7609859167")) {     
            
            table.setFont(negrilla);        
            setForeground(Color.BLACK);
            setBackground(Color.ORANGE); 
        }  
        
      
        if(v.equals(true)){
            setBackground(Color.GREEN);         
        }     
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);         
        return this;
    }
}