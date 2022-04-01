package hospital;

import java.io.*;

public class Hospital {

    public static void main(String[] args) {

        try{
            BufferedReader br = new BufferedReader(
                new InputStreamReader(
                    new FileInputStream("C:\\Users\\joaop\\OneDrive\\Documentos\\NetBeansProjects\\Hospital\\src\\Entrada.txt")));
            
            BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                    new FileOutputStream("C:\\Users\\joaop\\OneDrive\\Documentos\\NetBeansProjects\\Hospital\\src\\Saida")));
            
            
            br.close();
            bw.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }  
    }
    
}
