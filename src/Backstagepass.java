public class Backstagepass {
    private int sellin;
    private int availableDays;

    private int quality;

    public Backstagepass(int sellin, int quality) {
        this.sellin = sellin;
        this.availableDays = sellin;
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
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
