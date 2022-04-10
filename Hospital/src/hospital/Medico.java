package hospital;

import java.util.*;

public class Medico extends Pessoas implements Procedimentos{
    private ArrayList<Pacientes> pacientesAtendidos = new ArrayList<>();
    
    public Medico(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
    }
    
    public int nPacientesAtendidos(){
        return pacientesAtendidos.size();
    }
    
    
    @Override
    public String leCpf(Scanner sc){
        System.out.print("Digite o CPF a ser buscado(0 para cancelar).\n:");
        String acpf;
        acpf = sc.next();
        return acpf;
    }
    
    /*Recebe a fila de atendiemtno, um objeto Pacientes e o scanner e adiciona uma String diagnóstico para a lista de prontuário desse objeto, 
    além disso tamém remove o paciente da fila de atendimento (não confundir com o Cadastro).*/
    public void atendimento(ArrayList filaAtendimento, Pacientes paciente){
        Scanner sc = new Scanner(System.in);
        System.out.println(paciente.resumo());
        System.out.println("Qual o diagnostico do paciente?");
        String prontuario = sc.nextLine(); /*implementar exceção de prontuario vazio*/
        paciente.addProntuario(prontuario);
        pacientesAtendidos.add(paciente);
        boolean remove = filaAtendimento.remove(paciente); /*implementar exceção caso falha ocorra*/
    }

    //Recebe a lista de pacientes cadastrados e retorna os pacientes da lista no terminal
    @Override
    public void lerListaCadastro(HashSet<Pacientes> listaCadastro) {
        if(!listaCadastro.isEmpty()){
            Iterator i = listaCadastro.iterator();
            while (i.hasNext()){
                System.out.println(i.next()+"\n"); 
            }
        }
    }
    
    //Recebe a lista de pacientes cadastrados e um paciente específico, retorna as informações desse paciente no terminal
    @Override
    public void lerPacienteCadastro(HashSet<Pacientes> listaCadastro,Scanner sc){
        String acpf = leCpf(sc);
        if("0".equals(acpf)){
            System.out.println("Cancelando busca.");
            return;
        }
        boolean find=false;
        for (Pacientes atual : listaCadastro){
            if(atual.cpf.equals(acpf)){
                System.out.println(atual);
                find=true;
                break;
            }
        }
        if(!find) System.out.println("Não encontramos registros de um paciente com esse CPF");
    }
    
    
    @Override
    public void lerListaAtendimento(ArrayList<Pacientes> listaAtendimento){
        if(!listaAtendimento.isEmpty()){
            System.out.println("\nLista de atendimentos:");
            Pacientes atual;
            for(int i =0; i<listaAtendimento.size();i++){
                atual=listaAtendimento.get(i);
                System.out.println(atual.getNome());
                
            }
            return;
        }
        System.out.println("\nA lista de atendimentos esta vazia");
    }

    
    
    
    
    
    
    
    
    
    
    
    @Override
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public String getCpf() {
        return super.getCpf();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public String toString() {
        return "Medico: " + this.getNome() + ", CPF: " + this.getCpf() + ", idade: " + this.getIdade();
    }

    
    
}
