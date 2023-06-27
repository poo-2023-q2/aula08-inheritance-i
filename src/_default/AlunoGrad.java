package academico._default;

public class AlunoGrad extends Aluno {
    String curso;

    public String toString() {
        return    "Nome: " + nome + "\n"
                + "Sobrenome: " + sobrenome + "\n"
                + "RA: " + ra + "\n"
                + "Curso: " + curso;
    }
}
