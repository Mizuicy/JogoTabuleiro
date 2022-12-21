import java.util.Random;

class DadosPersongens {
    Random random = new Random();
    public int Hp;
    public int Atk;
    public int Def;
    public int Armdef;
    public int Psc;
    

    public DadosPersongens(Random random, int hp, int atk, int def, int armdef, int psc) {
        this.random = random;
        this.Hp = hp;
        this.Atk = atk;
        this.Def = def;
        this.Armdef = armdef;
        this.Psc = psc;
    }

   
    public int D20(){
        int d20 = random.nextInt(0,21);
        return d20;
    }

    public int D12(){
        int d12 = random.nextInt(0 ,12);
        return d12;
    }

    public int D8(){
        int d8 = random.nextInt(0,8);
        return d8;
    }

    public boolean isDead()  {
        return this.Hp <= 0;
}
}
