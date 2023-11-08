package MyMoves.Murkrow;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class WingAttack extends PhysicalMove {
    public WingAttack(double pow, double acc) {

        super(Type.FLYING, pow, acc);
    }
    @Override
    protected String describe(){
        return "использует WingAttack";
    }
}