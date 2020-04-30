public class Backstagepass extends Product {
    private final int availableDays;

    public Backstagepass(int sellin, int quality) {
        super(sellin, quality);
        this.availableDays = sellin;
    }

    public void updateQualityWhenPassed(int days) {
        int needSellOutDay = availableDays - days;
        if (needSellOutDay >= 10) {
            quality += days;
        } else if (needSellOutDay >= 5) {
            quality += days * 2;
        } else if (needSellOutDay >= 0) {
            quality += days * 3;
        } else {

            quality = 0;
        }
    }
}
