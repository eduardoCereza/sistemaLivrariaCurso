import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja ver a lista de livros disponíveis?");

        String resposta = scanner.nextLine();

        switch (resposta){
            case "sim":
                break;
            case "não":
                System.out.println("Obrigado! Sistema está finalizando... Até mais!");
                break;
        }

    }
}
