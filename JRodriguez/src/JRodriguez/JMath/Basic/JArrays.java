/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JRodriguez.JMath.Basic;

/**
 *
 * @author Analista
 */
public class JArrays {
    
    /**
     * Do a sequential search in the arrays
     * @param arreglo
     * @param dato
     * @return position in the arrays, return negative if do not exist
     */
    public int ArraySequentialSearch(Object[] arreglo,Object dato){
        int posicion = -1;
        for(int i = 0; i < arreglo.length; i++){//recorremos todo el arreglo
            if(arreglo[i].equals(dato)){//comparamos el elemento en el arreglo con el buscado
                posicion = i;//Si es verdadero guardamos la posicion
                break;//Para el ciclo
            }
        }
        return posicion;
    }
    
        
}
