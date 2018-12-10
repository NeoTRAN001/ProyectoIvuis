package cifradoivuis;

import java.util.StringTokenizer;
/**
 *
 * @author Neo
 */
public class Crypto {
    public String CrearCifrado(String texto, String abecedario, String abecedarioIvuis) {
        char[] arrayTexto = texto.toCharArray();
        char[] arrayAbecedario = abecedario.toCharArray();
        char[] arrayAbecedarioIvuis = abecedarioIvuis.toCharArray();
        
        String result = "";
        
        for(int i = 0; i < arrayTexto.length; i++) {
            for(int j = 0; j < arrayAbecedario.length; j++) {
                if(arrayTexto[i] == arrayAbecedario[j]) result += arrayAbecedarioIvuis[j];
            }
        }
        return result;
    }
    
    private String separarPublickey(String publicKey) {
        String[] separadorLetra = {"u","v","w","x","y","z","A","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String keySplit = "";
        for(int i = 0; i < separadorLetra.length; i++) {
            keySplit = publicKey.replaceAll(separadorLetra[i], " ");
            publicKey = keySplit;
        }
        return keySplit;
    }
    
    public String descifrarMensaje(String texto, String publicK, String diccionario, int base) {
        char[] arraytextoSplit = texto.toCharArray();
        char[] arrayDiccionario = diccionario.toCharArray();
        
        String keySplit = separarPublickey(publicK);
        
        StringTokenizer tokens = new StringTokenizer(keySplit," ");
        String resultado = "";
        
        Integer [] nAscii = new Integer[arrayDiccionario.length];
        int indice = 0;
        
        while(tokens.hasMoreTokens()) {
            nAscii[indice] = Integer.parseInt(tokens.nextToken(),base);
            indice++;
        }
        
        for(int i = 0; i < arraytextoSplit.length; i++) {
             for(int j = 0; j < nAscii.length; j++) {
                 if((int)arraytextoSplit[i] == nAscii[j]) {
                     resultado += arrayDiccionario[j];
                 }
             }
        }
        
        return resultado;
    }
}
