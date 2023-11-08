package MyPockemons;

import MyMoves.Honchkrow.NightSlash;

public class    Honchkrow extends Murkrow{
    public Honchkrow(String name, int level) {
        super(name, level);
        super.setStats(100,125,52,105,52,71);
        NightSlash nightSlash = new NightSlash(70,100);
        super.addMove(nightSlash);
    }
}
