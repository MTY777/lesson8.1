package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Hacker extends Hero{
    public Hacker(int health, int damage, int superAbility, String name) {
        super(health, damage, SuperAbility.HACK, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean round = RPG_Game.random.nextBoolean();
int damage_boss = boss.getDamage()- RPG_Game.random.nextInt(50);
        for (int i = 0; i < heroes.length; i++) {
            if (round){
            boss.setHealth(boss.getHealth()-damage_boss);
            i=RPG_Game.random.nextInt(heroes.length);
            heroes[i].setHealth(heroes[i].getHealth()+damage_boss);
            System.out.println("JC зобрал " + damage_boss);
            break;
            }else {
                System.out.println("JC не забрал");
                break;
            }
        }
    }
}
