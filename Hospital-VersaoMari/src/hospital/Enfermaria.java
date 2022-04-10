 ;package hospital;

import java.util.*;
import java.io.*;
 
public class Enfermaria implements Procedimentos{
    
    
    public Enfermaria(){}
    
    public void ordenaAtendimento(ArrayList<Pacientes> Atendimento){
        Collections.sort(Atendimento, new Comparator<Pacientes>(){
            public int compare(Pacientes p1, Pacientes p2){
                return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());
            }
        });
    }
    
    public void adicionaPacienteAtendimento(ArrayList<Pacientes> Atendimento, HashSet Cadastro){
        Scanner sc = new Scanner(System.in);
        Pacientes atual;
        String entrada;
        String [] info;
        
        System.out.println("\nDigite o nome, cpf, idade, prioridade e motivo da consulta (separado por ', ').");
        entrada = sc.nextLine();
        info = entrada.split(", ");
        
        Atendimento.add(new Pacientes (info[0], info[1], Integer.parseInt(info[2]), Integer.parseInt(info[3]), info[4]));
        if(Atendimento.size()>1) ordenaAtendimento(Atendimento);
        
        atual = Atendimento.get(Atendimento.size()-1);
        adicionaPacienteCadastro(atual, Cadastro);
    }
    
    //Recebe um objeto Pacientes e o adiciona ao cadastro de pacientes caso ele ainda não seja cadastrado
    public void adicionaPacienteCadastro(Pacientes atual, HashSet Cadastro){
        if(!Cadastro.contains(atual)){
            System.out.println("Cadastro de " + atual.getNome() + " não encontrado.");
            Cadastro.add(atual);
            System.out.println("Paciente cadastrado.");
            return;
        }
        System.out.println("Paciente já está cadastrado."); // PatientAlreadyRegistredExpection ?????????
    }
    
    @Override
    public String leCpf(Scanner sc){
        System.out.print("Digite o CPF a ser buscado (0 para cancelar).\n:");
        String acpf;
        acpf = sc.next();
        return acpf;
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
    
    //Recebe a lista de pacientes cadastrados e um Scanner, retorna as informações desse paciente no terminal caso o encontre, do contrário, informa que não há registros desse paciente
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
        if(!find) System.out.println("Não encontramos registros de um paciente com esse CPF."); // CPFNotFoundException ??????????????
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
        System.out.println("\nA lista de atendimentos está vazia.");
    }
    
    public void gerarRelatorio(Medico medico, HashSet<Pacientes> cadastro){
        try{
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(//adaptar endereço para o usado no momento
                    new FileOutputStream("C:\\Users\\joaop\\OneDrive\\Documentos\\NetBeansProjects\\Hospital\\src\\Relatorio.txt")));
        
        bw.write("Relatório do hospital TMJ.\n\nMédico de plantão: " + medico.getNome() + ".\n");
        bw.write("Foram atendidos " + medico.nPacientesAtendidos() + " hoje. Aqui estão eles:\n\n");
        
        for(Pacientes atual : cadastro){
            if(atual.prontuarioVazio()){
                bw.write(atual.toString()+"\nProntuario(s)...\n");
                int nProntuario=1;
                for(String descricao: atual.getProntuario()){
                    bw.write(+nProntuario + "a: " +descricao+"\n");
                    nProntuario++;
                }
                bw.write("\n");
            }
        }
        bw.close();
        
        }catch(IOException error){
            error.printStackTrace();
        }
    }
}