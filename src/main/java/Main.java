import Models.DadosReceita;

import java.util.Scanner;

public class Main {
    static DadosReceita dadosReceita = new DadosReceita();

    public static void main(String[] args) {
        int opcao = 0;

        do{
            System.out.println("|--------- Menu Principal ---------|");
            System.out.println("|1 - Cadastra Receitas             |");
            System.out.println("|2 - Consulta Todas Receitas       |");
            System.out.println("|9 - Sair                          |");
            System.out.println("|----------------------------------|");
            System.out.print("Digite uma opção...: ");
            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();

            menu(opcao);

        }while(opcao != 9);

    }
    public static void menu(int opcao) {
        Scanner scanner = new Scanner(System.in);
        switch (opcao) {
            case 1:
                dadosReceita.getDadosDeEntrada();
                break;
            case 2:
                dadosReceita.getConsultaReceitas();
                break;
            case 9:
                break;
            default:
                System.out.println("Opção Inválida, tente novamente...");
        }
    }
}
