package MyMoves.Honchkrow;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class NightSlash extends PhysicalMove {
    public NightSlash(double pow, double acc) {

        super(Type.DARK, pow, acc);
    }

    @Override
    protected double calcCriticalHit(Pokemon var1, Pokemon var2) {
        if (var1.getStat(Stat.SPEED) / (512.0 / 3) > Math.random()) {
            return 2.0;
        } else {
            return 1.0;
        }
    }
    @Override
    protected String describe(){
        return "использует NightSlash";
    }
}
