package hospital;

public class Medico extends Pessoa{
    private int crm;
    private int tempoAtendimento;

    public Medico(int crm, int tempoAtendimento, String nome, String cpf, int idade) {
        super(nome, cpf, idade);
        this.crm = crm;
        this.tempoAtendimento = tempoAtendimento;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public int getTempoAtendimento() {
        return tempoAtendimento;
    }

    public void setTempoAtendimento(int tempoAtendimento) {
        this.tempoAtendimento = tempoAtendimento;
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
}
