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

    };
};
