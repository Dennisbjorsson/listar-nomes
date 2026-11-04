import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //  Criando uma lista de nomes

        List<String> nomes = Arrays.asList(
                 "André",
                "Bruno",
                "Adreia",
                "Amanda",
                "Tyr",
                "Arthur",
                "Daniel"
        );

        //  Implementando a interface funcional com Lambda

        FiltroNome filtro = nome -> nome.startsWith("A");

        //  Aplicando o filtro utilizando Stream API
        System.out.println("Nomes que começam com a letra A:");

        nomes.stream()
                .filter(nome -> filtro.testar(nome))
                .forEach(System.out::println);

    }
}