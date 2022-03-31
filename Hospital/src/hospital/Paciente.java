package hospital;

import java.util.Objects;

public class Paciente {
    private String nome;
    private String cpf;
    private int idade;
    private int gravidade;
    private double prioridade;

    public Paciente(String nome, String cpf, int idade, int gravidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.gravidade = gravidade;
    }
    
    private void DeterminaPrio(){
        if (this.idade>10 || this.idade<45){
            this.prioridade = this.idade*this.gravidade*0.7;
        }
        else {
            this.prioridade = this.idade*this.gravidade;
        }
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
        return Objects.equals(this.cpf, other.cpf);
    }
    
}
