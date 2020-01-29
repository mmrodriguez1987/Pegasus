/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JRodriguez.JProperties;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

/**
 * This class manage all the Properties
 * 
 * @author Michael Rodriguez
 */
public class Propmanager {
    
        private String path = null;
        private final Properties prop;

    /**
     * Get the value of path
     *
     * @return the value of path
     */
    public String getPath() {
        return path;
    }
    /**
     * Set the value of path
     *
     * @param path new value of path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     *
     * @param path
     * 
     */
    public Propmanager(String path)  {
        try
        {
            this.path = path;
            prop = new Properties();
            prop.load(getClass().getResourceAsStream(path));       
          
        }
        catch(IOException e) 
        {
            throw new RuntimeException(e);
        }       
    }

    /**
     *
     * @param propiedad
     * @return
     */
    public String getProperties(String propiedad)
    {
        return prop.getProperty(propiedad);
    }
    
    /**
     *
     * @param propiedad
     * @param valor
     */
    public void setProperties(String propiedad, String valor)
    {        
        URL url = this.getClass().getResource(this.path);        
        prop.setProperty(propiedad, valor);       
        try {
            File f = new File(url.getFile()); // da una ruta absoluta al archivo 
            FileOutputStream salida = new FileOutputStream(f);
            prop.store(salida,null);
            
          
            salida.close();
        } 
        catch (Exception e)  {
            System.out.print("Exception al guardar una propiedad: " + e.toString());
        }
        
       
    }
    
}
