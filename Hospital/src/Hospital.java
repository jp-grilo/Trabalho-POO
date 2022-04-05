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
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Menu do hospital TMJ\nDigite o número correespondente ao seu cargo.\n(1) Medico(a)\n(2) Enfermeiro(a)");
        int menu = sc.nextInt();
        switch (menu){
            case 1: // MÉDICO
                System.out.println("Olá, médico(a)! Qual operação deseja realizar?");
                System.out.println("(1) Acessar relatório de um paciente\n(2) Atualizar prontuário");
                int menu_medico = sc.nextInt();
                switch (menu_medico){
                    case 1: // ACESSAR RELATORIO
                        System.out.println("Digite o CPF do paciente que você deseja acessar o relatório: ");
                        sc.next();
                        // método de printar o prontuario é do MEDICO ou PACIENTE?
                        
                    case 2: // ATUALIZAR PRONTUARIO
                        // método do médico
                }


            
            case 2: // ENFERMEIRO
                
                
        }
               
        
    }    
}
