package Main;

import MyPockemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Program{
    public static void main(String[] args) {
        Battle b = new Battle();
        Groudon groudon = new Groudon("Бычара",1);
        Murkrow murkrow = new Murkrow("Ворон", 1);
        Honchkrow honchkrow = new Honchkrow("Наследник",1);
        Igglybuff igglybuff = new Igglybuff("Милый",1);
        Jigglybuff jigglybuff = new Jigglybuff("Еще милее",1);
        Wigglytuff wigglytuff = new Wigglytuff("Самый милый",1);
        b.addAlly(groudon);
        b.addAlly(murkrow);
        b.addAlly(honchkrow);
        b.addFoe(igglybuff);
        b.addFoe(jigglybuff);
        b.addFoe(wigglytuff);
        b.go();
    }
    public static boolean chance(double d){
        return d > Math.random();
    }
}
