package academico.constructors;

import java.time.temporal.ChronoUnit;
import java.util.Date;

public class AlunoPos extends Aluno {
    String orientador;
    String programa;

    public AlunoPos(String nome, String sobrenome, String ra, String orientador,
                    String programa, Date dataIngresso) {
        super(nome, sobrenome, ra, dataIngresso);
        this.orientador = orientador;
        this.programa = programa;
    }

    public String toString() {
        return    super.toString()
                + "Programa: " + programa + "\n"
                + "Orientador: " + orientador + "\n"
                + "Jubilou?: " + jubilou();
    }

    public boolean jubilou() {
        return !getDataIngresso().toInstant()
                .plus(2 * 365, ChronoUnit.DAYS).isAfter(new Date().toInstant());
    }
}
