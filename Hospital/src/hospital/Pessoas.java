package hospital;

import java.util.Objects;

public abstract class Pessoas {
    protected String nome;
    protected String cpf;
    protected int idade;

    public Pessoas(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public Pessoas() {
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }
    
}
