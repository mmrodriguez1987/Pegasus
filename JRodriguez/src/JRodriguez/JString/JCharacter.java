/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JRodriguez.JString;

import java.util.ArrayList;

/**
 *
 * @author Michael Rodriguez
 */
public class JCharacter {
    
    /**
     * This MEthor validate the MMMS Message, restricting his contain
     * @param MMS variable that contain the MMS
     * @return null if is correct or an String containing the error message
     */
    public static String ValidateMMS(String MMS)
    { 
        if(MMS.length() > 400){
            return "The message can not be greater than 400 characters";
        } 
        else{
            if (MMS.length() == 0) {
                return "The message can empty";
            } else {
                //if (MMS.contains("\n")){
                    //return "The message can not contain newlines";
                //}else{
                    return null;
                //} 
            } 
        } 
    }
    
    public static String ValidateSubjectMMS(String subject)
    { 
        if(subject.length() > 20){
            return "The Subject can not be greater than 10 characters";
        } 
        else{
            if (subject.length() == 0) {
                return "The message can empty";
            } else {
                if (subject.contains(" ")){
                    return "The message can not contain spaces";
                }else{
                    return null;
                } 
            } 
        } 
    }
    
    /**
     * This method decode any string with a separator
     * @param var Variable
     * @param delimiter Character delimiter
     * @return An String[] that contain the operation result 
     */
    public static Object Decode(String var, String delimiter)
    {
        String[] parts = var.split(delimiter);
        return parts;
    }
    
    /**
     * This method encode any string with a separator
     * @param var Variable
     * @param delimiter Character delimiter
     * @return An String joined with a delimiter
     */
    public static String Encode(String[] var, String delimiter)
    {
        String encoded="";
        for (String v : var) {
            encoded += v + delimiter;
        }
        encoded = encoded.substring(0, encoded.length()-1);        
        return encoded;
    }

    
    
}
