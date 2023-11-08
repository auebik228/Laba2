package MyMoves.Wigglytuff;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DazzlingGleam extends SpecialMove {
    public DazzlingGleam (double pow, double acc){

        super(Type.FAIRY,pow,acc);
    }
    @Override
    protected String describe(){
        return "использует DazzlingGleam";
    }
}

