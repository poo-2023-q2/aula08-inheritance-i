package constructors;

import java.util.Date;

/**
 * The derived class has a construtor that initialize
 * both is its own properties and the properties
 * of the base class.
 * The first line of constructor must be a call to the
 * base class constructor.
 * 
 */
public class AlunoGrad extends Aluno {
    String curso;

    public AlunoGrad(String nome, String sobrenome, String ra, String curso, Date dataIngresso) {
        super(nome, sobrenome, ra, dataIngresso);
        this.curso = curso;
    }

    public String toString() {
        return  super.toString()
                + "Curso: " + curso + "\n";
    }
}
