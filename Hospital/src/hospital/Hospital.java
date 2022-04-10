package hospital;

import java.io.*;
import java.util.*;


public class Hospital {
    


    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {

        
        HashSet<Pacientes> cadastro = new HashSet();
        ArrayList<Pacientes> atendimento = new ArrayList();
        Enfermaria enfermaria =  new Enfermaria();
        Medico medico = new Medico("Julia", "12345678912", 27);        
        Scanner sc = new Scanner(System.in);

        int menu = 0;
        while(menu!=3){    
            switch (menu){
                
                case 0:
                    System.out.println("\n\n------------Menu do hospital TMJ-------------\nDigite o número correspondente ao seu cargo\n(1) Enfermeiro(a)\n(2) Médico(a)\n(3) Para encerrar o programa e gerar o relatório");
                    menu = sc.nextInt();
                    if(menu==3 && !atendimento.isEmpty()){
                        System.out.println("Não é possível encerrar o espediente sem atender a todos os pacientes");
                        menu=0;
                    }
                    break;
                    
                case 1: // ENFERMEIRO
                    int menu_enfermaria;
                    System.out.println("\n\n------------------Menu enfermaria-------------------\n");
                    System.out.print("(1) Adicionar um paciente a lista de atendimento.\n(2) Acessar a lista de todos os pacientes cadastrados.\n(3) Pesquisar por um pacinte (via cpf).\n(4) Para ver a fila de pacientes a serem atendidos.\n(5) Sair do menu enfermaria.\n:");
                    menu_enfermaria = sc.nextInt();
                    
                    while(menu_enfermaria!=5){
                        switch(menu_enfermaria){
                        
                            //menu padrão
                            case 0:
                                System.out.println("\n\n----------Qual a proxima operação deseja realizar?-----------");
                                System.out.print("(1) Adicionar um paciente a lista de atendimento.\n(2) Acessar a lista de todos os pacientes cadastrados.\n(3) Pesquisar por um pacinte (via cpf).\n(4) Para ver a fila de pacientes a serem atendidos.\n(5) Sair do menu enfermaria.\n:");
                                menu_enfermaria = sc.nextInt();

                            break;
                            
                            //adicionar o paciente a fila de atendimento. Caso o paciente não conste no sistema de cadastro, ele deverá ser cadastrado antes de ser adicionado a fila de atendimento
                            case 1:                        
                                enfermaria.adicionaPacienteAtendimento(atendimento, cadastro);
                                
                                menu_enfermaria=0;
                            break;
                            
                            //Mostra uma lista com todos os pacientes cadastrados e seus dados
                            case 2:
                                enfermaria.lerListaCadastro(cadastro);
                                menu_enfermaria=0;
                            break;
                            
                            //Pesquisa por um paciente específico pelo cpf. Caso exista, mostra seus dados no terminal, caso não, retorna uma mensagem de erro.1
                            case 3:
                                enfermaria.lerPacienteCadastro(cadastro, sc);
                                menu_enfermaria=0;
                            break;
                            
                            //Mostra a lista de pacientes a serem atendidos em seguida.
                            case 4:
                                enfermaria.lerListaAtendimento(atendimento);
                                menu_enfermaria=0;
                            break;
                            
                            default: 
                                System.out.println("Opcao invalida\n");
                                menu_enfermaria=0;
                            break;

                        }
                    }
                System.out.println("Até a próxima!\n");
                menu=0;
                break;
                    
                case 2: // MÉDICO
                    int menu_medico;
                    System.out.println("\n\n----------------Menu do médico(a)----------------");
                    System.out.print("(1) Acessar a lista de todos os pacientes cadastrados\n(2) Pesquisar por um pacinte (pelo cpf)\n(3) Para ver a fila de pacientes a serem atendidos\n(4) Atender o proximo paciente da fila\n(5) Sair do menu medico.\n:");
                    menu_medico = sc.nextInt();
                    
                    while(menu_medico!=5){
                        switch (menu_medico){
                            case 0:
                                System.out.println("\n\n--------Qual a proxima operação deseja realizar?---------");
                                System.out.print("(1) Acessar a lista de todos os pacientes cadastrados\n(2) Pesquisar por um pacinte (pelo cpf)\n(3) Para ver a fila de pacientes a serem atendidos\n(4) Atender o proximo paciente da fila\n(5) Sair do menu medico.\n:");
                                menu_medico = sc.nextInt();
                            break;
                            
                            case 1: // ACESSAR LISTA A LISTA COM O CADASTRO DE TODOS OS PACIENTES
                                medico.lerListaCadastro(cadastro);
                                menu_medico=0;
                                break;

                            case 2: // PESQUISAR POR UM PACIENTE ESPECIFICO USANDO O CPF
                                medico.lerPacienteCadastro(cadastro, sc);
                                menu_medico=0;
                            break;
                                
                            case 3: // VER A FILA DE ATENDIMENTO
                                medico.lerListaAtendimento(atendimento);
                                menu_medico=0;
                            break;
                                
                            case 4: // ATENDER O PROXIMO PACIENTE NA FILA
                                medico.atendimento(atendimento, atendimento.get(0));
                                menu_medico=0;
                            break;

                            default: 
                                System.out.println("Opcao invalida\n");
                                menu_medico=0;
                            break;
                        }
                    }
                System.out.println("Até a próxima!\n");
                menu=0;
                break;
                    
                default:
                    System.out.println("Opcao invalida\n");
                    menu=0;
                break;
            }
        }  
        System.out.println("Encerrando o espediente e gerando o relatório do dia. Até uma próxima!");
        enfermaria.gerarRelatorio(medico, cadastro);        
    }    
}
