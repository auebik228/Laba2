package MyPockemons;

import MyMoves.Groudon.FireBlast;
import MyMoves.Groudon.FocusBlast;
import MyMoves.Groudon.Overheat;
import MyMoves.Groudon.ShadowClaw;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Groudon extends Pokemon {
    public Groudon(String name, int level){
        super(name, level);
        super.setType(Type.GROUND);
        super.setStats(100,150,140,100,90,90);
        Overheat overheat = new Overheat(130,90);
        FocusBlast focusBlast = new FocusBlast(120,70);
        FireBlast fireBlast = new FireBlast(110,85);
        ShadowClaw shadowClaw = new ShadowClaw(70,100);
        super.setMove(overheat,focusBlast,fireBlast, shadowClaw);



    }
}
