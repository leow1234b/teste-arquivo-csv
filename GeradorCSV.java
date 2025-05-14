import java.io.FileWriter;
import java.io.IOException;

public class GeradorCSV {
    public static void main(String[] args) {
        String caminhoArquivo = "dados.csv";

        try (FileWriter writer = new FileWriter(caminhoArquivo)) {
            // Cabeçalho
            writer.append("Nome,Idade,Email\n");

            // Dados
            writer.append("João,30,joao@email.com\n");
            writer.append("Maria,25,maria@email.com\n");
            writer.append("Carlos,40,carlos@email.com\n");

            System.out.println("Arquivo CSV criado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever o arquivo CSV: " + e.getMessage());
        }
    }
}
