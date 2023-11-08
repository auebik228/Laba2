package MyPockemons;

import MyMoves.Wigglytuff.DazzlingGleam;

public class Wigglytuff extends Jigglybuff{

    public Wigglytuff(String name, int level) {
        super(name, level);
        super.setStats(140,70,45,85,50,45);
        DazzlingGleam dazzlingGleam = new DazzlingGleam(80,100);
        super.addMove(dazzlingGleam);
    }
}
