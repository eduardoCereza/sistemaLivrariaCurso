import java.time.LocalDate;

public class Empréstimo{
    int id;
    Livro livro;
    String nomeCliente;
    LocalDate dataEmprestimo, dataDevolucao;

    public Empréstimo(int id, Livro livro, String nomeCliente){
        this.id = id;
        this.livro = livro;
        this.nomeCliente = nomeCliente;
    }

    public String getLivro() {
        return livro.getTitulo();
    }

    public int getId() {
        return id;
    }

    public void setDataEmprestimo(int dia, int mes, int ano) {
        dataEmprestimo = LocalDate.of(ano, mes, dia);
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataDevolucao(int dia, int mes, int ano) {
        dataDevolucao = LocalDate.of(ano, mes, dia);
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

}
