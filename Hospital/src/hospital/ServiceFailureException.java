package hospital;

import java.util.*;

class ServiceFailureException extends Exception {
    public ServiceFailureException(ArrayList<Pacientes> listaAtendimento, Pacientes paciente){
        System.out.println("O paciente "+ paciente.getNome() + " não pode ser removido da lista de atendimento...");
        
        if(!listaAtendimento.isEmpty()){
            System.out.println("Lista de atendimentos:");
            Pacientes atual;
            for(int i =0; i<listaAtendimento.size();i++){
                atual=listaAtendimento.get(i);
                System.out.println(atual.getNome());
            }
        }
        else System.out.println("\nA lista de atendimentos esta vazia");
        
        ArrayList<Pacientes> clone = new ArrayList();
        
        for(int i=1; i<listaAtendimento.size();i++){
            Pacientes atual=listaAtendimento.get(i);    
            clone.add(atual);
        }
        listaAtendimento=clone;
        System.out.println("Erro corrigido");
        if(!listaAtendimento.isEmpty()){
            System.out.println("Nova lista de atendimentos:");
            Pacientes atual;
            for(int i =0; i<listaAtendimento.size();i++){
                atual=listaAtendimento.get(i);
                System.out.println(atual.getNome());
            }
        }
        else System.out.println("\nAgora a lista de atendimentos esta vazia");
    }
}
