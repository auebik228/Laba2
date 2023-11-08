package MyPockemons;

import MyMoves.Igglybuff.DreamEater;
import MyMoves.Igglybuff.Sing;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Igglybuff extends Pokemon {
    public Igglybuff(String name, int level) {
        super(name, level);
        super.setType(Type.NORMAL, Type.FAIRY);
        super.setStats(90, 30, 15, 40, 20, 15);
        DreamEater dreamEater = new DreamEater(100,100);
        Sing sing = new Sing(0,55);
        super.setMove(dreamEater,sing);

    }
}
