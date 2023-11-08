package MyMoves.Groudon;

import Main.Program;
import Main.Program;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class FireBlast extends SpecialMove {
    public FireBlast(double pow, double acc){

        super(Type.FIGHTING,pow,acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if(Program.chance(0.1)){
            Effect.burn(p);
        }
        }

    @Override
    protected String describe(){
        return "использует FireBlast";
    }
}
