package _default;

/**
 * Derived class, can access default-modified attributes
 * in the base class, because it is the same package as 
 * the base class.
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
