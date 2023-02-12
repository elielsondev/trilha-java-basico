public class Operadores {
    public static void main(String[] args) throws Exception {
        // Operadores de Atribuição (=):
        String mensagem = "Deus é bom o tempo todo, e o tempo todo Deus é bom";
        System.out.println(mensagem);

        // Operadores aritmétcos (+), (-), (*), (/) e (%):
        int numero1 = 10;
        int numero2 = 2;

        int soma = numero1 + numero2;

        int subtracao = numero1 - numero2;

        int multiplicacao = numero1 * numero2;

        int divisao = numero1 / numero2;

        int modulo = numero1 % numero2;

        System.out.println(soma); // 12
        System.out.println(subtracao); // 8
        System.out.println(multiplicacao); // 20
        System.out.println(divisao); // 5 
        System.out.println(modulo); // 0

        // OBS: O operador (+) também concatena com Strings:

        String nome = "Elielson";

        String sobrenome = "Nascimento";
        
        String nomeSobrenome = nome + " " + sobrenome;
        
        System.out.println(nomeSobrenome); // Elielson Nascimento

        // Veja o que pode acontecer se concatenarmos int com String:
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao); // 31

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao); // 1111

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao); // 1111
        
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao); // 1111
        
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao); // 13
    }
}
