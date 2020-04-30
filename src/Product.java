public abstract class Product {
    protected int sellin;

    protected int quality;

    public int getQuality() {
        return quality;
    }

    public Product(int quality) {
        this.quality = quality;
    }

    public Product(int sellin, int quality) {
        this.sellin = sellin;
        this.quality = quality;
    }

    protected abstract void updateQualityWhenPassed(int days);
}
