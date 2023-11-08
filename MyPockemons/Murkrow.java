package MyPockemons;

import MyMoves.Groudon.FireBlast;
import MyMoves.Groudon.FocusBlast;
import MyMoves.Groudon.Overheat;
import MyMoves.Groudon.ShadowClaw;
import MyMoves.Murkrow.ShadowBall;
import MyMoves.Murkrow.Swagger;
import MyMoves.Murkrow.WingAttack;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Murkrow extends Pokemon {
    public Murkrow(String name, int level){
        super(name, level);
        super.setType(Type.DARK,Type.FLYING);
        super.setStats(60,85,42,85,42,91);
        ShadowBall shadowBall = new ShadowBall(80,100);
        Swagger swagger = new Swagger(0,85);
        WingAttack wingAttack = new WingAttack(60,100);
        super.setMove(shadowBall,swagger,wingAttack);
    }
}
