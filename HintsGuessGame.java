import java.util.Random;
import java.util.Scanner;

class Gerador{
    private int random;
    public int Gerar()
    {
        Random r = new Random();
        random = r.nextInt(100);
        return random;
    }
        
}

class GetUserNumber
{
    private Scanner scan = new Scanner(System.in);
    
    public int Scan(){
        System.out.println("digite um numero");
        int guess = scan.nextInt();
        return guess;
    }
    public void Fechar(){
        scan.close();
    }
}

class Testar
{
    public boolean Teste(int guess, int random){
        if(guess == random)
        {
        return true;
        }
        else
        {
            return false;
        }
    }
}
class Dicas
{
    public String teste(int guess, int random)
    {
        if(guess > random){
            return("Você chutou muito ALTO");
        }else {
            return("Você chutou muito BAIXO");
        }
    }
}

public class HintsGuessGame {
    public static void main(String a[]){
        Gerador gerador = new Gerador();
        GetUserNumber getUser = new GetUserNumber();
        Testar teste = new Testar();
        Dicas dica = new Dicas();
        int x = gerador.Gerar();
        int y = getUser.Scan();

        while (teste.Teste(y, x) != true)
        {
            if (teste.Teste(y, x) == true){break;}
            System.err.println("Você errou,"+dica.teste(y, x)+" agora tente novamente"); 
            y = getUser.Scan();
        }
        System.out.println("parabens você acertou, o numero era: "+x);
        getUser.Fechar();
    }
}

