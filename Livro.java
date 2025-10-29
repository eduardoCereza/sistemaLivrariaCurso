import java.util.Date;

public class Livro {

    Integer id;
    String titulo;

    public Boolean disponivel;
    Date dataCadastro, dataAtualizacao;

    Autor autor;

    public Livro(Integer id, String titulo, Autor autor, boolean disponivel){
        this.autor = autor;
        this.id = id;
        this.titulo = titulo;
        this.disponivel = disponivel;
    }

    public String getAutor() {
        return autor.getNome();
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

}
