package _default;

/**
 * Derived class, can access default-modified attributes
 * in the base class, because it is the same package as 
 * the base class.
 */
public class AlunoPos extends Aluno {
    String orientador;
    String programa;

    public String toString() {
        return    "Nome: " + nome + "\n"
                + "Sobrenome: " + sobrenome + "\n"
                + "RA: " + ra + "\n"
                + "Programa: " + programa + "\n"
                + "Orientador: " + orientador;
    }
}
