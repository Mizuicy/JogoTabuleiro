public class Jogo {
    public static void main(String[] args) throws Exception {
        DadosPersongens humano = new DadosPersongens();
        humano.Atk = 10;
        humano.Def = 10;
        humano.Armdef = humano.Def + 4;
        humano.Armatk = humano.Atk + 2;

        DadosPersongens orc = new DadosPersongens();
        orc.Atk = 12;
        orc.Def = 10;
        orc.Armatk = 8;
        
        if (humano.Armatk >= orc.Def){
            
        }
    }
}
