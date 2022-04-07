package hospital;

import java.util.Objects;

import java.util.*;

public class Pacientes extends Pessoas{
    private double prioridade;
    private String motivoConsulta;
    private ArrayList<String> prontuario;

    public Pacientes(String nome, String cpf, int idade, int prioridade, String motivo) {
        super(nome, cpf, idade);
        this.prioridade = prioridade;
        this.motivoConsulta = motivo;
    }

    
    
    public ArrayList<String> getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario.add(prontuario);
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
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.prioridade) ^ (Double.doubleToLongBits(this.prioridade) >>> 32));
        // while(hash) {hash = hash+1;}
        return hash;
    }

    public String resumo(){
        return "Paciente: " + getNome() + "\nIdade: " + getIdade() + "\nMotivo da consulta: " + motivoConsulta;
    }

    @Override
    public String toString() {
        return "Paciente: " + getNome() + ", CPF: " + getCpf() + ", idade: " + getIdade() + ", prioridade: " + prioridade;
    }
    

    
}
