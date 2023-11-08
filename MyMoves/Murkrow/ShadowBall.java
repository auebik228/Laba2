package MyMoves.Murkrow;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall(double pow, double acc){

        super(Type.GHOST,pow,acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect e = new Effect().chance(0.2).stat(Stat.SPECIAL_DEFENSE, -1);
        p.addEffect(e);
    }
    @Override
    protected String describe(){
        return "использует ShadowBall";
    }
}
