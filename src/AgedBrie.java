public class AgedBrie extends Product {

    public AgedBrie(int quality) {
        super(quality);
    }

    public void updateQualityWhenPassed(int days) {
        if (quality + days <= 50) {
            quality += days;
        }
    }
}
