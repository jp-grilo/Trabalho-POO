package hospital;

public class Medicos extends Pessoas{
    private int tempoAtendimento;
    private int tempoDisponivel;

    public Medicos(String nome, String cpf, int idade,int tempoAtendimento) {
        super(nome, cpf, idade);
        this.tempoAtendimento = tempoAtendimento;
    }

    public int getTempoAtendimento() {
        return tempoAtendimento;
    }

    public void setTempoAtendimento(int tempoAtendimento) {
        this.tempoAtendimento = tempoAtendimento;
    }

    public int getTempoDisponivel() {
        return tempoDisponivel;
    }

    public void setTempoDisponivel(int tempoDisponivel) {
        this.tempoDisponivel = tempoDisponivel;
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
        return "Medico: " + this.getNome() + ", CPF: " + this.getCpf() + ", idade: " + this.getIdade() + ", tempo de atendimento (minutos):" + tempoAtendimento;
    }
    
    
}
