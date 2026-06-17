public class filme{

    public static void main(String[] args){
        System.out.println("Bem vindos ao TecFlix");
        System.out.println("Filme: + Velozes + Furiosos 2003");

        int anoDeLancamento = 2003;
        System.out.println("Ano de Lançamento " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 6.4;

        //Media calculada pelas notas do Luiz, rafael e Renan
        double media = (8.6 + 9.5 + 10) / 3;
        System.out.println("A Média que o Segundo Tec deu " + media);

        String sinopse;

        sinopse = """
                O filme do Velozes e Furiosos 2
                estrelado por Brian O'Conner.
                o Filme tem nota mediana
                e foi lançado em meados de 2003.
                """;

                System.out.println(sinopse);
    }
}