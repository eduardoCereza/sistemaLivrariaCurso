import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {

    private static List<Livro> livros = new ArrayList<>();
    private static List<Autor> autores = new ArrayList<>();
    private static List<Empréstimo> emprestimos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja ver a lista de livros disponíveis?");

        String resposta = scanner.nextLine();

        Autor autor1 = new Autor(1, "Clarice Lispector", 1, 1, 1990);
        Autor autor2 = new Autor(2, "Monteiro Lobato", 21, 06, 1950);

        Livro livro1 = new Livro(1, "A Hora da Estrela", autor1, true);
        Livro livro2 = new Livro(2, "Sítio do Pica-Pau amarelo", autor2, false);

        livros.add(livro1);
        livros.add(livro2);

        autores.add(autor1);
        autores.add(autor2);

        Empréstimo emprestimo;

        switch (resposta){
            case "sim":
                for (Livro livro : livros){
                    if (livro.getDisponivel()){
                        System.out.println(livro.getId() + ". "+ livro.getTitulo() + " - " + livro.getAutor() + "\n");
                        System.out.println("Se deseja escolher um livro, digite o ID correspondente. Senão, digite qualquer letra");

                        int id = scanner.nextInt();
                        scanner.nextLine(); // limpa o Enter deixado no buffer

                        System.out.println("Digite seu nome: ");
                        String nomeCliente = scanner.nextLine();


                        emprestimo = new Empréstimo(id, livro, nomeCliente);
                        emprestimos.add(emprestimo);

                        System.out.println("O empréstimo de ID " + emprestimo.getId() + " do livro "+ emprestimo.getLivro() + " foi realizado com sucesso!");

                        livro.disponivel = false;

                    }
                }
                System.out.println("Obrigado! Sistema está finalizando... Até mais!");
                break;
            case "não":
                System.out.println("Obrigado! Sistema está finalizando... Até mais!");
                break;
        }

    }
}
