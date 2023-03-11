import domain.ClinicoGeral;
import domain.Desenvolvedor;
import domain.Pediatra;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        var dev = new Desenvolvedor("Camila Xi",
                "camilaxi@gmail.com",
                123456,
                LocalDate.of(2015, 9, 10),
                Arrays.asList("Java", "PHP", "Go", "Spring"));

        var ped = new Pediatra("Gabriel Prado",
                "gabriel@gmail.com",
                456789,
                LocalDate.of(2017, 1, 12),
                67891011);

        var cli = new ClinicoGeral("Gabriel Prado",
                "gabriel@gmail.com",
                101112,
                LocalDate.of(2002, 12, 12),
                123432123);

        System.out.println(dev.getInformacoes());
        System.out.println(ped.getInformacoes());

        ped.executaAtendimento(dev);
        cli.executaAtendimento(ped);
    }
}