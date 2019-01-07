package cifradoivuis;

import java.util.Random;

public class crearDiccionario {
    public String publicKey = "";
    private final String abecedario;
    private String abecedarioIvuis = "";
    private final int[] indiceAbecedario;
    private int base = 30;
    
    public crearDiccionario () {
        abecedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ abcdefghijklmnñopqrstuvwxyz0123456789¿?áéíóú,.:¡!()~°¬";
        indiceAbecedario = new int[abecedario.length()];
        
        for(int i = 0; i < indiceAbecedario.length; i++) { // Para que al comparar si el número aleatorio ya existe en todo el arreglo
            indiceAbecedario[i] = -1; // Este ya tenga con que compararlo, sino daría problemas
        }
    }
    
    private void generarIndice(int id) {
        Random r = new Random(System.currentTimeMillis()); // sello de tiempo
        int nRandom;
        boolean existe;
        
        do { // Comprobar si el número creado ya existe dentro de indiceAlfabeto
           nRandom = r.nextInt(abecedario.length());    
           existe = false;
           
           for(int i = 0; i < indiceAbecedario.length; i++) {
               if(nRandom == indiceAbecedario[i]) {
                   existe = true;
                   break;
               }
           }
        }while(existe);
        
        r.setSeed(System.currentTimeMillis()); // Refrescar datos del aleatorio
        indiceAbecedario[id] = nRandom;
    }
    
    private String separador() 
    {
        String[] separadorLetra = 
        {"u","v","w","x","y","z","A","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        Random r = new Random();
        return separadorLetra[r.nextInt(separadorLetra.length - 1)];
    }
    
    public String generarDiccionario(int keyPrivate, int numericanBase) {
        char[] cadenaAbecedario = abecedario.toCharArray();
        char ascii;
        String all = "";
        String n;
        base = numericanBase;
        // Generar la llave pública
        for(int i = 0; i < abecedario.length(); i++) { // Asignar los números aleartorios del arreglo
            generarIndice(i); // por medio de la función generarIndice
            publicKey += Integer.toString((indiceAbecedario[i]+keyPrivate),base) + separador();
        }
        // Genera el diccionario Ivuis
        for(int i = 0; i < abecedario.length(); i++) {
            ascii = (char)(indiceAbecedario[i]+keyPrivate);
            abecedarioIvuis += ascii;
            
            n = Integer.toString((indiceAbecedario[i]+keyPrivate),base);
            
            all += cadenaAbecedario[i] + " : " + indiceAbecedario[i] + " : " + n + " : " + ascii + "\n";
        }
        
        return all;
    }
    
    public String crearCifrado(String texto) {
        Crypto c = new Crypto();
        String resultado = c.CrearCifrado(texto, abecedario, abecedarioIvuis);
        
        return resultado;
    }
    
    public String descifrar(String texto, String publicK, int numericanBase) {
        Crypto c = new Crypto();
        String resultado = c.descifrarMensaje(texto, publicK, abecedario, numericanBase);
        return resultado;
    }
}