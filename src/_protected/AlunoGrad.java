package _protected;

/**
 * The derived class always has access to the protected members
 * of the the base class (even if it was in a different package
 * than the base class).
 * 
 */
public class AlunoGrad extends Aluno {
    String curso;

    public String toString() {
        return    "Nome: " + nome + "\n"
                + "Sobrenome: " + sobrenome + "\n"
                + "RA: " + ra + "\n"
                + "Curso: " + curso;
    }
}
