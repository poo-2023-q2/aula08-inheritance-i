package _private;

/**
 * The derived class cannot access private properties
 * of the base class. The only option is to use getters, 
 * if they are available.
 */
public class AlunoPos extends Aluno {
    String orientador;
    String programa;

    public String toString() {
        return    "Nome: " + getNome() + "\n"
                + "Sobrenome: " + getSobrenome() + "\n"
                + "RA: " + getRa() + "\n"
                + "Programa: " + programa + "\n"
                + "Orientador: " + orientador;
    }
}
