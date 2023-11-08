package MyPockemons;

import MyMoves.Jigglybuff.HyperVoice;

public class Jigglybuff extends Igglybuff {
    public Jigglybuff(String name, int level) {
        super(name, level);
        super.setStats(115,45,20,45,25,20);
        HyperVoice hyperVoice = new HyperVoice(90,100);
        super.addMove(hyperVoice);
    }
}
