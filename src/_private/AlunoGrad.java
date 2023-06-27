package _private;

/**
 * The derived class cannot access private properties
 * of the base class. The only option is to use getters, 
 * if they are available.
 */
public class AlunoGrad extends Aluno {
    String curso;

    public String toString() {
        return    "Nome: " + getNome() + "\n"
                + "Sobrenome: " + getSobrenome() + "\n"
                + "RA: " + getRa() + "\n"
                + "Curso: " + curso;
    }
}
