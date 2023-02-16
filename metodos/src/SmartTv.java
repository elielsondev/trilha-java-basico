
// Vamos criar um exemplo de uma classe para representar uma SmartTV onde:
public class SmartTv {
    // Ela tenha as características: ligada (boolean), canal (int) e volume (int);
    boolean ligada = false;
    int canal = 22;
    int volume = 100;
    
    // Nossa TV poderá ligar e desligar e assim mudar o estado ligada;
    public void ligar() {
        ligada = true;
        System.out.println(ligada ? "TV Ligada" : "TV Desligada");
    }

    public void desligar() {
        ligada = false;
        System.out.println(ligada ? "TV Ligada" : "TV Desligada");
    }

    // Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
        // O volume deve apenas de 0 a 100;
    public void aumentarVolume() {
        if(volume >= 0 && volume <= 100)
            volume ++;
        System.out.println("Volume: " + 100);
    }

    // Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.
        // Os canais são de 1 a 100

        /* OBS: Caso a tv esteja no canal 1 e o usuário volte 1 canal,
        o canal sitonizado será o 100.
        Porém se a tv estiver no canal 100 e o usuário avançar um canal,
        o canal sitonizado será o 1.
         */
}
