
package mx.itson.brocoli.negocio;

/**
 * contiene métodos oara trabajar con un tipo de dato String
 * @author Agustin 
 */


public class Operacion {
    /**
     * separa una cadena de texto a partir de la expresión guión medio.
     * @param valor cadena de texto que será separado a partir de la expresion dada.
     * @return Array de String en donde cada psición representa una division de la cadena de texto.
     */
    public String[] separar(String valor){
        
        String [] elementos = valor.split("-");
        return elementos;
        
    }
    
    
    
}