package kg.geektech.game.players;

public class Berserk extends Hero{
    public Berserk(int health, int damage, String name) {
        super(health, damage,
                SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int damageBosss = boss.getDamage() / 2;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes.length > 0){
              boss.setHealth(boss.getHealth()-damageBosss);
                System.out.println("Берсерк поглотил половину урона босса ");
                break;
            }
        }

    }
}
