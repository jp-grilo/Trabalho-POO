package hospital;

import java.util.Objects;

public class Paciente extends Pessoa{
    private int gravidade;
    private double prioridade;

    public Paciente(String nome, String cpf, int idade, int gravidade) {
        super(nome, cpf, idade);
        this.gravidade = gravidade;
        prio(idade, gravidade);
    }
    
    protected void prio(int idade, int gravidade){
        if(idade>13 && idade<61){
            this.prioridade=idade*gravidade;
        }else{
            this.prioridade=idade*gravidade*1.2;
        }
        
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
        final Paciente other = (Paciente) obj;
        return Objects.equals(this.getCpf(), other.getCpf());
    }

    @Override
    public String toString() {
        return "Paciente:" + getNome() + ", CPF: " + getCpf() + ", idade: " + getIdade() + ", gravidade: " + gravidade + ", prioridade: " + prioridade;
    }
    

    
}
