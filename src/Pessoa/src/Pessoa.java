
public class Pessoa{
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double imc;

    public Pessoa(String nome, String sobrenome, int idade, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
    public void calculaImc(){
        this.imc = peso / (altura * altura);
    }

    public String informaObesidade(){
        if (imc <= 18.5){
            return "ABAIXO DO PESO";
        }
        if (imc > 18.5 && imc <= 24.9){
            return "PESO NORMAL";
        }
        if (imc > 24.9 && imc <= 29.9){
            return "SOBREPESO";
        }
        if (imc > 29.9 && imc <= 34.9){
            return "OBESIDADE GRAU 1";
        }
        if (imc > 34.9 && imc <= 39.9){
            return "OBESIDADE GRAU 2";
        }
        else{
            return "OBESIDADE GRAU 3";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
}