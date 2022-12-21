public class Jogo {
    public static void main(String[] args) throws Exception {
        DadosPersongens humano = new DadosPersongens(null, 0, 0, 0, 0, 0);
        humano.Hp = 10;
        humano.Atk = 10;
        humano.Def = 10;
        humano.Armdef = humano.Def + 4;
        humano.Psc = 2;


        DadosPersongens orc = new DadosPersongens(null, 0, 0, 0, 0, 0);
        orc.Hp = 8;
        orc.Def = 10;
        
        while(!(humano.Hp <= 0) && !(orc.Hp != 0)){

                System.out.println("rodada");

            
            }
            
        }
    }

