package _protected;

/**
 * The base class has protected properties.
 */
public class Aluno {
    protected String nome;
    protected String sobrenome;
    protected String ra;

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

    public void setRa(String ra) {
        if (!ra.matches("\\d+"))
            throw new IllegalArgumentException("RA must be a number");
        this.ra = ra;
    }
}
