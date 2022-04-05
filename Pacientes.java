package hospital;

import java.util.Objects;

public class Pacientes extends Pessoas{
    private double prioridade;

    public Pacientes(String nome, String cpf, int idade, int prioridade) {
        super(nome, cpf, idade);
        this.prioridade = prioridade;
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
        final Pacientes other = (Pacientes) obj;
        return Objects.equals(this.getCpf(), other.getCpf());
    }

    @Override
    public String toString() {
        return "Paciente: " + getNome() + ", CPF: " + getCpf() + ", idade: " + getIdade() + ", prioridade: " + prioridade;
    }
    

    
}
