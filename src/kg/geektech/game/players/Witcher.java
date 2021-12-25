package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Witcher extends Hero{
    public Witcher(int health, int damage, String name) {
        super(health, damage, SuperAbility.RESURRECTION, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean Shans = RPG_Game.random.nextBoolean();
        for (int i = 0; i < heroes.length; i++) {
if (heroes[i].getHealth()==0 && heroes[i]!=this){
    int hp = this.setHealth(this.getHealth());
    heroes[i].setHealth(hp);
    this.setHealth(0);
    System.out.println("Witcher передал свою жизнь герою: "+ heroes[i].getName());
    break;

}

        }

        }
    }


