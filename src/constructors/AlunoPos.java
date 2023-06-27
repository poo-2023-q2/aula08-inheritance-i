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
public class AlunoPos extends Aluno {
    String orientador;
    String programa;

    public AlunoPos(String nome, String sobrenome, String ra, String orientador,
                    String programa, Date dataIngresso) {
        super(nome, sobrenome, ra, dataIngresso);
        this.orientador = orientador;
        this.programa = programa;
    }

    public String toString() {
        return    super.toString()
                + "Programa: " + programa + "\n"
                + "Orientador: " + orientador + "\n";
    }
}
