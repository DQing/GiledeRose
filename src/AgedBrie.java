public class AgedBrie {
    private int quality;

    public AgedBrie(int quality) {
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
    }

    public void updateQualityWhenPassed(int days) {
        if (quality + days <= 50) {
            quality += days;
        }
    }
}
