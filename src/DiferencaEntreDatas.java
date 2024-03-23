import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DiferencaEntreDatas {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {


            
            // Definindo o formato das datas
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            // Convertendo as strings para LocalDate
            LocalDate dataInicial = LocalDate.parse("23-03-2021", formatter);
            LocalDate dataFinal = LocalDate.parse("15-04-2024", formatter);

            // Calculando a diferença entre as datas
            long diferencaEmDias = ChronoUnit.DAYS.between(dataInicial, dataFinal);

            // Criando a interface gráfica
            JFrame frame = new JFrame("Diferença Entre Datas");
            JLabel label = new JLabel("A diferença entre as datas é de " + diferencaEmDias + " dias.");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(label);
            frame.pack();
            frame.setLocationRelativeTo(null); // Centralizar a janela
            frame.setVisible(true);
        });
    }
}
