package MyMoves.Igglybuff;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    public DreamEater(double pow, double acc){
        super(Type.PSYCHIC,pow,acc);
    }
    @Override
    protected void applyOppDamage(Pokemon var1, double var2) {
        if(var1.getCondition()==Status.SLEEP){
            super.applyOppDamage(var1,var2);
        }
    }
    @Override
    protected void applySelfEffects(Pokemon var1) {
        var1.setMod(Stat.HP, (int) (-0.5*var1.getStat(Stat.HP)));
    }
    @Override
    protected String describe(){
        return "использует DreamEater";
    }
    }



