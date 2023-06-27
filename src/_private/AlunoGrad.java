package academico._private;

public class AlunoGrad extends Aluno {
    String curso;

    public String toString() {
        return    "Nome: " + getNome() + "\n"
                + "Sobrenome: " + getSobrenome() + "\n"
                + "RA: " + getRa() + "\n"
                + "Curso: " + curso;
    }
}
