public class BonusService {

    public int calcBonus(int amount, boolean isREgistered) {
        int percent = isREgistered ? 3 : 1;
        long bonus = amount * percent / 100;
        long limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return (int) bonus;
    }

    public long calculate(long amount, boolean registered) {
        return 0;
    }
}
