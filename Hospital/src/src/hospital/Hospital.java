package hospital;

import java.io.*;
import java.util.*;

/*
interface de autenticação - JP
classe infermeira - JP
Atualizar classes - JP
menus de secretaria e medico (crud) - Mari
criação de prontuario de paciente
marcações na leitura de arquivo para identificar se é prontuario
excluir gravidade, trabalhar apenas com prioridade (1 a 5) 
definir coleções para atendimento e cadastro
*/


public class Hospital {
    


    public static void main(String[] args) {
        /*
        Implementar login e senha!!!
        */
        
        ArrayList<Pacientes> cadastro = new ArrayList();
        ArrayList<Pacientes> atendimento = new ArrayList();
        Enfermaria enfermaria =  new Enfermaria("Enfermaria", "123");
        Medicos medico = new Medicos("Julia", "12345678912", 27, "Julia", "123"); 

        Pacientes p1 = new Pacientes("a", "1", 0, 0, "a");
        Pacientes p2 = new Pacientes("b", "2", 0, 0, "a");
        Pacientes p3 = new Pacientes("b", "3", 0, 0, "a");
        Pacientes teste;

        cadastro.add(p1);
        cadastro.add(p2);
        cadastro.add(p3);
        
        Scanner sc = new Scanner(System.in);
        
        
        int menu = 0;
        while(menu!=3){    
            switch (menu){
                
                case 0:
                    System.out.println("Menu do hospital TMJ\nDigite o número correspondente ao seu cargo\n(1) Enfermeiro(a)\n(2) Meidico (a)");
                    menu = sc.nextInt();
                    break;
                
                case 1: // ENFERMEIRO
                    System.out.println("Enfermaria\n");
                    menu = 0;
                    break;
                
                    
                    
                case 2: // MÉDICO
                    int menu_medico;
                    System.out.println("Olá, médico(a)! Qual operação deseja realizar?");
                    System.out.println("(1) Acessar a lista de todos os pacientes cadastrados\n(2) Pesquisar por um pacinte (pelo cpf)\n(3) Para ver a fila de pacientes a serem atendidos\n(4) Atender o proximo paciente da fila\n(5) Sair do menu medico.");
                    menu_medico = sc.nextInt();
                    while(menu_medico!=5){
                        
                        
                        switch (menu_medico){
                        
                            case 0:
                            System.out.println("\n\n\n\nQual a proxima operação deseja realizar?");
                            System.out.println("(1) Acessar a lista de todos os pacientes cadastrados\n(2) Pesquisar por um pacinte (pelo cpf)\n(3) Para ver a fila de pacientes a serem atendidos\n(4) Atender o proximo paciente da fila\n(5) Sair do menu medico.");
                            menu_medico = sc.nextInt();
                            break;
                            
                            case 1: // ACESSAR LISTA A LISTA COM O CADASTRO DE TODOS OS PACIENTES
                                medico.lerListaCadastro(cadastro);
                                menu_medico=0;
                                break;

                            case 2: // PESQUISAR POR UM PACIENTE ESPECIFICO USANDO O CPF
                                System.out.print("Digite o CPF a ser buscado\n(caso não saiba, busque na lista de cadastro)\n:");
                                String cpf;
                                cpf = sc.next();
                                System.out.println(cpf);
                                for(int i=0;i<cadastro.size();i++){
                                    teste = cadastro.get(i);
                                    System.out.println(teste.cpf);
                                    if(teste.cpf.equals(cpf)) {
                                        medico.lerPacienteCadastro(cadastro, teste);
                                        break;
                                    }
                                }
                                System.out.println("Não encontramos nenhum paciente com esse CPF");
                                menu_medico=0;
                                break;
                                
                                
                            case 3: // VER A FILA DE ATENDIMENTO
                                medico.lerListaAtendimento(atendimento);
                                System.out.print("Precione enter para seguir");
                                //sc.next();
                                menu_medico=0;
                                break;
                                
                            case 4: // ATENDER O PROXIMO PACIENTE NA FILA
                                medico.atendimento(atendimento, atendimento.get(0), sc);
                                menu_medico=0;
                                break;
                               
                            case 5:
                                System.out.println("Ate a proxima\n");
                                break;

                            default: 
                                System.out.println("Opcao invalida, tente novamente\n");
                                menu_medico=0;
                                break;
                        }
                    }
                    
      
                default:
                    System.out.println("Opcao invalida\n");
                    menu=0;
                    break;
            }
        }   
        
    }    
}
