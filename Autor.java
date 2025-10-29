import java.time.LocalDate;
import java.util.Date;

public class Autor {

    Integer id;
    String nome;
    LocalDate dataNascimento;

    public Autor(int id, String nome, int dia, int mes, int ano ){
        this.id = id;
        this.nome = nome;
        dataNascimento = LocalDate.of(ano, mes, dia);
    }

    public Integer getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }


    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}
