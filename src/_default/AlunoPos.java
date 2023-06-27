package academico._default;

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
