package academico._default;

public class AlunosTest {
    public static void main(String[] args) {
        AlunoGrad a1 = new AlunoGrad();
        AlunoPos a2 = new AlunoPos();

        a1.nome = "joao";
        a1.sobrenome = "silva";
        a1.ra = "1234";
        a1.curso = "bcc";

        a2.nome = "maria";
        a2.sobrenome = "pereira";
        a2.ra = "5678";
        a2.programa = "ppgcc";
        a2.orientador = "pedro souza";

        System.out.println(a1.toString());
        System.out.println();
        System.out.println(a2.toString());
    }

}
