package hospital;

import java.io.*;
import java.util.*;

public class Hospital {

    public static void main(String[] args) {

        try{
            //Leitor do arquivo contendo os pacientes
            BufferedReader brp = new BufferedReader(
                new InputStreamReader(
                    new FileInputStream("C:\\Users\\joaop\\OneDrive\\Documentos\\NetBeansProjects\\Hospital\\src\\Pacientes.txt")));
            //Leitor do arquivo contendo os médicos
            BufferedReader brm = new BufferedReader(
                new InputStreamReader(
                    new FileInputStream("C:\\Users\\joaop\\OneDrive\\Documentos\\NetBeansProjects\\Hospital\\src\\Medicos.txt")));
            
            /*BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                    new FileOutputStream("C:\\Users\\joaop\\OneDrive\\Documentos\\NetBeansProjects\\Hospital\\src\\Saida")));*/
            /*bw.close();*/
            
            
            int count=0;
            String s;
            String [] array;
            
            List nomes = new ArrayList<>(); //lista dos nomes dos pacientes a serem atendidos no hospital
            List cpfs = new ArrayList<>(); // lista dos cpfs dos pacientes a serem atendidos no hospital
            List idades = new ArrayList<>(); //lista das idades dos pacientes a serem atendidos no hospital
            List gravidades = new ArrayList<>(); //lista  das gracidades dos acidentes dos pacientes a serem atendidos no hospital
            
            while((s = brp.readLine())!=null){
                array = s.split(", ");
                for(String current : array){
                    
                    switch (count) {
                        case 0:
                            //nome
                            nomes.add(current);
                            count=1;
                            break;
                            
                        case 1:
                            //cpf
                            cpfs.add(current);
                            count=2;
                            break;
                            
                        case 2:
                            //idade
                            idades.add(current);
                            count=3;
                            break;
                            
                        default:
                            //gravidade
                            gravidades.add(current);
                            count=0;
                            break;
                    }
                }   
            }
            
            Pacientes p0 = new Pacientes((String)nomes.get(0), (String)cpfs.get(0), Integer.parseInt((String) idades.get(0)), Integer.parseInt((String)gravidades.get(0)));
            Pacientes p1 = new Pacientes((String)nomes.get(1), (String)cpfs.get(1), Integer.parseInt((String) idades.get(1)), Integer.parseInt((String)gravidades.get(1)));
            
            
            nomes.clear();
            cpfs.clear();
            idades.clear();
            List tempoAtendimento = new ArrayList<>();
            
            while((s = brm.readLine())!=null){
                array = s.split(", ");
                for(String current : array){
                    
                    switch (count) {
                        case 0:
                            //nome
                            nomes.add(current);
                            count=1;
                            break;
                            
                        case 1:
                            //cpf
                            cpfs.add(current);
                            count=2;
                            break;
                            
                        case 2:
                            //idade
                            idades.add(current);
                            count=3;
                            break;
                            
                        default:
                            //Tempo que o médico leva para atender seus pacientes, calculado em minutos
                            tempoAtendimento.add(current);
                            count=0;
                            break;
                    }
                }   
            }
            
            Medicos m0 = new Medicos((String)nomes.get(0), (String)cpfs.get(0), Integer.parseInt((String) idades.get(0)), Integer.parseInt((String) tempoAtendimento.get(0)));
            
            
            System.out.println(p0);
            System.out.println(p1);
            System.out.println(m0);
            
            
            brp.close();
            brm.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }  
    }
    
}
