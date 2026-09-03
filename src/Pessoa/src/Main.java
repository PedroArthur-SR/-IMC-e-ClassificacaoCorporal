import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem Vindo ao IMC e Classificação Corporal\nPrimeiro, digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Agora, digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.println("Sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("Sua altura: ");
        double altura = entrada.nextDouble();

        System.out.println("E seu peso: ");
        double peso = entrada.nextDouble();

        Pessoa pessoa = new Pessoa(nome, sobrenome, idade, altura, peso);
        pessoa.calculaImc();
        System.out.println("O imc do "+nome+" "+sobrenome+" é igual à: "+pessoa.getImc());
        System.out.println(pessoa.informaObesidade());
    }
}
