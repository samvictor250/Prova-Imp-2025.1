import java.util.Scanner;

public class Sistema{
    public static Scanner input = new Scanner(System.in);
    public static Pessoa[] lista = new Pessoa[5];
    public static int QTD = 0;
    // Cadastro de Pessoas
    public static void cadastar(){
        if(QTD < lista.length){
            lista[QTD] = new Pessoa();

            System.out.println("Digite seu nome: ");
            String nomePessoa = input.nextLine();
            lista[QTD].nome = nomePessoa;
            
            System.out.printf("Olá %s, digite sua idade:\n", nomePessoa);
            int idadePessoa = input.nextInt();

            lista[QTD].idade = idadePessoa;
            if(idadePessoa > 0){
                System.out.println("Agora digite seu peso: ");
                double pesoPessoa = input.nextDouble();
                lista[QTD].peso = pesoPessoa;
                
                System.out.println("Para finalizar sua altura: ");

                double alturaPessoa = input.nextDouble();
                lista[QTD].altura = alturaPessoa;
                input.nextLine(); //Buffer de limpeza
                QTD++;
            } else {System.out.println("Idade invalida, Cadastro não realizado.");
            }
        }
    }
    // --- Questão 1 (Função Auxiliar de Busca) ---

    // --- Questão 1 (Função Principal) ---

    // --- Questão 2 (Função Auxiliar IMC) ---

    // --- Questão 2 (Função Principal) ---

    // --- Questão 3 ---

    // --- Questão 4 ---

    // --- Questão 5 ---
    
    // --- Método Principal (Executor do Sistema) ---
    
        // Teste de Cadastro (Q1)
        
        // Teste de Impressão (Q2)
        
        // Você pode adicionar mais testes aqui para Q3, Q4, Q5
    public static void main(String[] args){
        // Teste de verificação
        cadastar();
        System.out.println("Quantidade de pessoas cadastradas: "+ QTD);
    }
}
