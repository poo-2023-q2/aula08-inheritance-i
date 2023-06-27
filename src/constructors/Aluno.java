package constructors;

import java.util.Date;

/**
 * The base class has a simple constructor
 * to initialize its properties.
 */
public class Aluno {
    private String nome;
    private String sobrenome;
    private String ra;
    private Date dataIngresso;

    public Aluno(String nome, String sobrenome, String ra, Date dataIngresso) {
        setNome(nome);
        setSobrenome(sobrenome);
        setRa(ra);
        setDataIngresso(dataIngresso);
    }

    public String toString() {
        return  "Nome: " + getNome() + "\n"
                + "Sobrenome: " + getSobrenome() + "\n"
                + "RA: " + getRa() + "\n"
                + "Ingresso: " + getDataIngresso().toString() + "\n";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRa() {
        return ra;
    }

    public Date getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(Date dataIngresso) {
        if (dataIngresso.after(new Date())) {
            throw new IllegalArgumentException("Data de ingresso no futuro.");
        }
        this.dataIngresso = dataIngresso;
    }

    public void setRa(String ra) {
        if (!ra.matches("\\d+"))
            throw new IllegalArgumentException("RA must be a number");
        this.ra = ra;
    }
}
