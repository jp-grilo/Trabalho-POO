package hospital;

import java.util.*;

public class Pacientes extends Pessoas{
    private int prioridade;
    private String motivoConsulta;
    private ArrayList<String> prontuario = new ArrayList<>();

    
    public Pacientes(String nome, String cpf, int idade, int prioridade, String motivo) {
        super(nome, cpf, idade);
        this.prioridade = prioridade;
        this.motivoConsulta = motivo;
    }

    
    public boolean prontuarioVazio(){
        return !this.prontuario.isEmpty();
    }
    
    public ArrayList<String> getProntuario() {
        return prontuario;
    }

    public void addProntuario(String prontuario) {
        this.prontuario.add(prontuario);
        System.out.println("\nProntuário atualizado com sucesso!");
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

    public int getPrioridade() {
        return prioridade;
    }
    
        @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoas other = (Pessoas) obj;
        return Objects.equals(this.cpf, other.cpf);
    }
    
        @Override
    public int hashCode() {
        int hash = this.prioridade;
        return hash;
    }

    public String resumo(){
        return "\nPaciente: " + getNome() + "\nIdade: " + getIdade() + "\nMotivo da consulta: " + motivoConsulta;
    }

    @Override
    public String toString() {
        return "\nPaciente: " + getNome() + "\nCPF: " + getCpf() + "\nIdade: " + getIdade();
    }
    
}
