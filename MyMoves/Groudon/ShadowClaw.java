package MyMoves.Groudon;

import Main.Program;
import ru.ifmo.se.pokemon.*;

import javax.script.ScriptContext;

public class ShadowClaw extends PhysicalMove {
    public ShadowClaw(double pow, double acc){

        super(Type.GHOST,pow,acc);
    }
    @Override
    protected double calcCriticalHit(Pokemon var1, Pokemon var2) {
        if (var1.getStat(Stat.SPEED) / (512.0 / 3 ) > Math.random()) {
            return 2.0;
        } else {
            return 1.0;
        }
    }
    @Override
    protected String describe(){
        return "использует ShadowClaw";
    }
}

