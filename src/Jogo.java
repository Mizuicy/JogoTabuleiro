public class Jogo {
    public static void main(String[] args) throws Exception {
        DadosPersongens humano = new DadosPersongens(0, 0, 0, 0, 0);
        humano.Hp = 10;
        humano.Atk = 10;
        humano.Def = 10;
        humano.Armdef = humano.Def + 4;
        humano.Armatk = humano.Atk + 2;

        DadosPersongens orc = new DadosPersongens(0, 0, 0, 0, 0);
        orc.Hp = 8;
        orc.Atk = 12;
        orc.Def = 10;
        orc.Armatk = 8;
        
        while(humano.Hp >= 0 && orc.Hp >= 0){
            for(int i=0; i < humano.Hp; i++){
                System.out.println("Primeiro rodada");
                System.out.println(humano.D20());


            }
        }
    }
}
