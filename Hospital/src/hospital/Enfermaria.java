package hospital;

import java.util.*;
import java.util.Scanner;

public class Enfermaria extends Pessoas{
    
    ArrayList<Pacientes> cadastro;
    ArrayList<Pacientes> atendimento;

    public Enfermaria(ArrayList<Pacientes> pacientes) {
        this.cadastro = pacientes;
    }
    
    public Enfermaria() {
    }
    
    public ArrayList adicionaPacienteCadastro(Pacientes p){
        cadastro.add(p);
        return cadastro;
        //lista main =  metodo(paciente);
    }
    
    public ArrayList addPaciente(Pacientes p, int gravidade){
        p.setGravidade(gravidade);
        atendimento.add(p);
        return cadastro;
        //lista main =  metodo(paciente);
    }
    
    public void removePaciente(Pacientes p){
        
    }
}
