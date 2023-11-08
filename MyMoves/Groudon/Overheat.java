package MyMoves.Groudon;

import ru.ifmo.se.pokemon.*;

public class Overheat extends SpecialMove {
    public Overheat(double pow, double acc){

        super(Type.FIRE,pow,acc);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
          Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, -2);
          p.addEffect(e);
    }
    @Override
    protected String describe(){
        return "использует Overheat";
    }
}
