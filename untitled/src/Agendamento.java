import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class Agendamento {
    public static void main(String[] args) {
        LocalDate base = LocalDate.of(2025, 6, 1);
        int dias = 7;
        LocalDate novaData = base.plusDays(dias * 2 - 3);
        System.out.println(novaData.getDayOfMonth());

        //Segunda questão com datas:
        LocalDate hoje = LocalDate.of(2025, 6, 9);
        LocalDate prazo = hoje.plusDays(10);
        System.out.println("\n" + prazo);

        //Terceira questão com datas:
        LocalDate data = LocalDate.of(2025, 6, 10);
        int diasUteis = 0;

        while (diasUteis < 7) {
            data = data.plusDays(1);
            boolean fimDeSemana = data.getDayOfWeek() == DayOfWeek.SATURDAY || data.getDayOfWeek() == DayOfWeek.SUNDAY;
            boolean feriado = data.equals(LocalDate.of(2025, 6, 15));

            if (!fimDeSemana && !feriado) {
                diasUteis++;
            }
        }

        System.out.println("\n" + data);

        //Quarta questão com tempo e hora:
        LocalTime envio = LocalTime.of(23, 0);
        LocalTime limite = LocalTime.of(22, 59);

        if (!envio.isBefore(limite)) {
            System.out.println("\nEntrega fora do horário.");
        } else {
            System.out.println("\nTarefa enviada com sucesso.");
        }
    }
}


