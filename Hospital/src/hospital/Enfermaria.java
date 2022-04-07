 ;package hospital;

import java.util.*;
import java.util.Scanner;

public class Enfermaria implements Procedimentos{
    
    private String userName;
    private String passWord;
    private boolean autenticado=false;
    
    private ArrayList<Pacientes> cadastro; //Lista de todos os paciêntes já atendidos no hospital tmj
    private ArrayList<Pacientes> atendimento; //

    public Enfermaria(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }
    
    /*Recebe um objeto Pacientes e o adiciona ao cadastro de pacientes*/
    public ArrayList adicionaPacienteCadastro(Pacientes p){
        cadastro.add(p);
        return cadastro;
        //lista main =  metodo(paciente);
    }
    
    public ArrayList adicionaPacienteAtendimento(Pacientes p, ArrayList<Pacientes> Atendimento){
        this.atendimento=Atendimento;
        atendimento.add(p);
        return atendimento;
        //lista main = metodo(paciente);
    }
    
    //Recebe a lista de pacientes cadastrados e retorna os pacientes da lista no terminal
    @Override
    public void lerListaCadastro(ArrayList listaCadastro) {
        if(listaCadastro.size()!=0){
            Iterator i = listaCadastro.iterator();
            while (i.hasNext()){
                System.out.println(i.next()); 
            }
            return;
        }
        throw new UnsupportedOperationException("Not supported yet."); //ajeitar a exceção
    }
    
    //Recebe a lista de pacientes cadastrados e um paciente específico, retorna as informações desse paciente no terminal
    @Override
    public void lerPacienteCadastro(ArrayList listaCadastro, Pacientes paciente){
        if(listaCadastro.contains(paciente)){
            System.out.println(paciente);
            return;
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean logar(String username, String password) {
        if(!this.autenticado){
            if(this.userName==username && this.passWord==password){ 
                this.autenticado=true;
                return true;
            }
            return false;
        }
        return true;
    }

    
}