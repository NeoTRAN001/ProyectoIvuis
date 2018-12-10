/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifradoivuis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Wasp
 */
public class ManejoArchivo {
    public void crearArchivo(String text, String publicKey, File fileUser, int base) throws IOException {
        
        FileWriter write;
        
        try {
            write = new FileWriter(fileUser,true);
            write.write(text + " " + publicKey + " " + base);
            write.close();
        } catch (IOException e) {}
    }
    
    public String readFile(String address) throws FileNotFoundException, IOException {
        String text, result = "";
        FileReader f = new FileReader(address);
        try (BufferedReader b = new BufferedReader(f)) {
            while((text = b.readLine()) != null) { result = text; }
        }
        
        return result;
    }
}
