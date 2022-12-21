import java.util.Random;

class DadosPersongens {
    Random random = new Random();
    int Hp;
    int Atk;
    int Def;
    int Armdef;
    int Armatk;
    
    public DadosPersongens(int hp, int atk, int def, int armdef, int armatk) {
        Hp = hp;
        Atk = atk;
        Def = def;
        Armdef = armdef;
        Armatk = armatk;
        
    }
    public int D20(){
        int d20 = random.nextInt(20);
        return d20;
    }
}
