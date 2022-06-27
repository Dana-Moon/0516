package June24.inven.potion;

public class RedPotion extends Potion {
    public int effect;

    public RedPotion(int hp, int effect) {
        this.effectHP = hp;
        this.effect = effect;
    }

    public int useItem(int invenUseNumber) {
        int result = effectHP * effect;
        return result;
    }
}
