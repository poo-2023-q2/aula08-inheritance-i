package academico.constructors;

import java.time.temporal.ChronoUnit;
import java.util.Date;

public class AlunoGrad extends Aluno {
    String curso;

    public AlunoGrad(String nome, String sobrenome, String ra, String curso, Date dataIngresso) {
        super(nome, sobrenome, ra, dataIngresso);
        this.curso = curso;
    }

    public String toString() {
        return  super.toString()
                + "Curso: " + curso + "\n"
                + "Jubilou?: " + jubilou();
    }

    public boolean jubilou() {
        return !getDataIngresso().toInstant()
                .plus(10 * 365, ChronoUnit.DAYS).isAfter(new Date().toInstant());
    }
}
