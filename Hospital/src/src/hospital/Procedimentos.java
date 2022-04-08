package hospital;

import java.util.*;

public interface Procedimentos {
    boolean logar(String username, String password);
    void lerPacienteCadastro(ArrayList<Pacientes> listaCadastro, Pacientes paciente);
    void lerListaCadastro(ArrayList<Pacientes> listaCadastro);
}
