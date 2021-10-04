import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Programa {
    public static void main(String[] args) {
        String nome, sobrenome, telefone, logradouro, numero, complemento, bairro, cidade;
        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe o seu nome: ");
        nome = ler.next();

        System.out.printf("Informe o seu sobrenome: ");
        sobrenome = ler.next();

        System.out.printf("Informe o seu telefone: ");
        telefone = ler.next();

        System.out.printf("Informe o seu logradouro: ");
        logradouro = ler.next();

        System.out.printf("Informe o seu telefone: ");
        numero = ler.next();

        System.out.printf("Informe o seu complemento: ");
        complemento = ler.next();

        System.out.printf("Informe o seu bairro: ");
        bairro = ler.next();

        System.out.printf("Informe o seu cidade: ");
        cidade = ler.next();
        pizzaCliente pcliente = new pizzaCliente(logradouro, numero, complemento, bairro, cidade, nome, sobrenome,
                telefone);

        forno forno = new forno();

        Frango frango = new Frango();
        forno.fabricar(frango);

        Camarao camarao = new Camarao();
        forno.fabricar(camarao);

        Map<Pizza, Integer> numberMapping = new HashMap<>();

        numberMapping.put(frango, 1);
        numberMapping.put(camarao, 2);

        numberMapping.putIfAbsent(frango, 3);
        System.out.println(numberMapping);

        pcliente.saudar();
    }
}
