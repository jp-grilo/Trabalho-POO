package hospital;

import java.util.*;

public class Medicos extends Pessoas implements Procedimentos{
    private Pacientes paciente;
    private String userName;
    private String passWord;
    
    public Medicos(String nome, String cpf, int idade, String username, String password) {
        super(nome, cpf, idade);
        this.userName=username;
        this.passWord=password;
    }
    
    /*Recebe a fila de atendiemtno, um objeto Pacientes e o scanner e adiciona uma String diagnóstico para a lista de prontuário desse objeto, 
    além disso tamém remove o paciente da fila de atendimento (não confundir com o Cadastro).*/
    public void atendimento(ArrayList filaAtendimento, Pacientes paciente, Scanner sc){
        paciente.resumo();
        System.out.println("Qual o diagnostico do paciente?");
        String prontuario = sc.nextLine(); /*implementar exceção de prontuario vazio*/
        paciente.setProntuario(prontuario);
        boolean remove = filaAtendimento.remove(paciente); /*implementar exceção caso falha ocorra*/
    }
    
    //Recebe a fila de atendimento e itera sobre ela para listar todos os elementos contidos.
    public void verFilaAtendimento(ArrayList filaAtendimento){
        Iterator i = filaAtendimento.iterator();
        while (i.hasNext()){
            System.out.println(i.next()); 
        }
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
    
    //recebe uma String de username e password e retorna a validade dessas credenciais
    @Override
    public boolean logar(String username, String password) {
        if(this.userName==username && this.passWord==password) return true;
        return false;
    }
    
    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf);
    }

    @Override
    public String getCpf() {
        return super.getCpf();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome); 
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
