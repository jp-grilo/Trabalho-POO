package hospital;

import java.util.*;

public interface Procedimentos {
    public String lerCpf(Scanner sc);
    public void lerPacienteCadastro(HashSet<Pacientes> listaCadastro,Scanner sc);
    void lerListaCadastro(HashSet<Pacientes> listaCadastro);
    public void lerListaAtendimento(ArrayList<Pacientes> listaAtendimento);
}
