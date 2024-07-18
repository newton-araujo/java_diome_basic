public class MeusTestes {
    
    public static void main(String[] args) {
        String meuNome = "Newton";
        int idade = 31;

        String apresentacao = apresentar(meuNome, idade);

        System.out.println(apresentacao);


        int num1 = 2;
        int num2 = 3;

        int somar = somar(num1, num2);

        System.out.println(somar);
    }

    public static String apresentar (String nome, int idade) {
        return "Meu nome é " + nome + " e tenho " + idade + "anos";
    }

    public static int somar (int num1, int num2) {
        return num1 + num2;
    }
}
