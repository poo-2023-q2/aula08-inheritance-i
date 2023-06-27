package _private;

/**
 * Testing the creation of classes in the hierarchy.
 */
public class AlunosTest {
    public static void main(String[] args) {
        AlunoGrad a1 = new AlunoGrad();
        AlunoPos a2 = new AlunoPos();

        a1.setNome("joao");
        a1.setSobrenome("silva");
        a1.setRa("1234");
        a1.curso = "bcc";

        a2.setNome("maria");
        a2.setSobrenome("pereira");
        a2.setRa("5678");
        a2.programa = "ppgcc";
        a2.orientador = "pedro souza";

        System.out.println(a1.toString());
        System.out.println();
        System.out.println(a2.toString());
    }

}
