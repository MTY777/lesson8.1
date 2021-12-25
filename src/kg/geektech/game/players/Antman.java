package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Antman extends Hero{
    public Antman(int health, int damage, String name) {
        super(health, damage, SuperAbility.WILL_INCREASE, name);
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
       boolean will_increase= RPG_Game.random.nextBoolean();
    int healt2 = this.setHealth(220);
    int damage2 = this.setDamage(25);
        for (int i = 0; i < heroes.length; i++) {
            if (will_increase == true){
                this.setHealth(healt2 + 50);
                this.setDamage(damage2 + 50);
                System.out.println("Paul Rudd увеличился");
                break;
            }else if (will_increase == false){
                this.setHealth(healt2 - 50);
                this.setDamage(damage2 - 50);
                System.out.println("Paul Rudd уменьшился");
                break;
            }
        }
    }
}
