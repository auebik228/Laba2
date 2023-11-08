package MyMoves.Igglybuff;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Sing extends StatusMove {
    public Sing(double pow, double acc){

        super(Type.GHOST,pow,acc);
    }
    @Override
    protected void applyOppEffects(Pokemon var1) {
        Effect.sleep(var1);
    }
    @Override
    protected String describe(){
        return "использует Sing";
    }

}
