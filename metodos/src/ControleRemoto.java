public class ControleRemoto {
    public static void main(String[] args) {
        SmartTv minhaTv = new SmartTv();

        minhaTv.ligar();
        minhaTv.desligar();

        // Ligar novamente rsrsrs
        minhaTv.ligar();

        /*
        Se você fizer o teste para aumetar o volume várias vezes,
        ele não passa de 100, pois respeita a condição imposta no if.
         */
        minhaTv.aumentarVolume();
        minhaTv.aumentarVolume();
        minhaTv.aumentarVolume();
        // ... Chame o metodo quantas vezes quiser...

        /*
        Se você fizer o teste para diminuir o volume várias vezes,
        ele não passa de 0, pois respeita a condição imposta no if.
         */
        minhaTv.diminuirVolume();
        minhaTv.diminuirVolume();
        minhaTv.diminuirVolume();
        // ... Chame o metodo quantas vezes quiser...

    };
};
