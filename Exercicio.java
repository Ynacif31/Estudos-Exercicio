import java.io.IOException;

public class Exercicio {

    public static void main(String[] args) throws IOException {
        
        int dias = 400;

        int anos = dias / 365;
        dias %= 365;
        int meses = dias / 30;
        dias %= 30;

        System.out.println(anos + "ano(s)");
        System.out.println(meses + "mes(es)");
        System.out.println(dias + "dia(s)");


    }
}
