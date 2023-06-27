package constructors;

import java.util.Calendar;

/**
 * The calls to the derived class constructor
 * must include values for its own properties
 * as well as for the properties of the base class.
 * 
 */
public class AlunosTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(2010, Calendar.FEBRUARY, 20);
        AlunoGrad a1 = new AlunoGrad("joao", "silva", "1234",
                "bcc", calendar.getTime());

        calendar.set(2020, Calendar.FEBRUARY, 13);
        AlunoPos a2 = new AlunoPos("maria", "pereira", "5678",
                "ppgcc", "pedro souza", calendar.getTime());

        System.out.println(a1.toString());
        System.out.println();
        System.out.println(a2.toString());
    }

}
