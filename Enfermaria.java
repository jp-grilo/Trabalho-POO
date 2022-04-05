package hospital;

import java.util.*;
import java.util.Scanner;

public class Enfermaria extends Pessoas{
    
    private HashSet<Pacientes> cadastro;
    private HashSet<Pacientes> atendimento;
    
    public Enfermaria() {
    }
    
    public HashSet adicionaPacienteCadastro(Pacientes p){
        cadastro.add(p);
        return cadastro;
        //lista main =  metodo(paciente);
    }
    
    public HashSet adicionaPacienteAtendimento(Pacientes p, HashSet<Pacientes> Atendimento){
        this.atendimento=Atendimento;
        atendimento.add(p);
        return atendimento;
        //lista main = metodo(paciente);
    }
    
    public void leListaCadastro(HashSet<Pacientes> Cadastro){
        Iterator i = Cadastro.iterator();
        while (i.hasNext()){
            System.out.println(i.next()); 
        }
    }
}