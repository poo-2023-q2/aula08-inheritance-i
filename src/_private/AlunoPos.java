package academico._private;

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
