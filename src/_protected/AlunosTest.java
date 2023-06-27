package _protected;

/**
 * Any class that is in the same package as the base class
 * can access its protected members. Consequently, this test class
 * has access to the protected members of the base class
 * (it does not need to use getters and setters).
 * 
 */
public class AlunosTest {
    public static void main(String[] args) {
        AlunoGrad a1 = new AlunoGrad();
        AlunoPos a2 = new AlunoPos();

        a1.nome = "joao";
        a1.sobrenome= "silva";
        a1.ra = "1234";
        a1.curso = "bcc";

        a2.nome = "maria";
        a2.sobrenome = "pereira";
        a2.ra = "5678";
        a2.programa = "ppgcc";
        a2.orientador = "pedro souza";

        System.out.println(a1);
        System.out.println();
        System.out.println(a2);
    }

}
