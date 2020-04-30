import org.junit.Assert;
import org.junit.Test;

public class giledeRose_specs {
    @Test
    public void AgedBrie_quality_should_increase_when_two_days_passed() {

        AgedBrie agedBrie = new AgedBrie(10);

        agedBrie.updateQualityWhenPassed(2);

        Assert.assertEquals(12, agedBrie.getQuality());
    }

    @Test
    public void AgedBrie_quality_should_not_increase_when_quality_already_up_50() {

        AgedBrie agedBrie = new AgedBrie(50);

        agedBrie.updateQualityWhenPassed(2);

        Assert.assertEquals(50, agedBrie.getQuality());
    }

    @Test
    public void Sulfuras_quality_should_not_increase_when_two_days_passed() {

        Sulfuras sulfuras = new Sulfuras(50);

        sulfuras.updateQualityWhenPassed(2);

        Assert.assertEquals(50, sulfuras.getQuality());
    }

    @Test
    public void Sulfuras_quality_should_not_increase_when_ten_days_passed() {

        Sulfuras sulfuras = new Sulfuras(50);
        sulfuras.updateQualityWhenPassed(10);
        Assert.assertEquals(50, sulfuras.getQuality());
    }

    @Test
    public void Backstagepass_quality_should_increase_given_sellin_is_10_when_two_days_passed() {

        Backstagepass backstagepass = new Backstagepass(10, 10);
        backstagepass.updateQualityWhenPassed(2);
        Assert.assertEquals(14, backstagepass.getQuality());
    }

    @Test
    public void Backstagepass_quality_should_increase_given_sellin_is_5_when_two_days_passed() {

        Backstagepass backstagepass = new Backstagepass(5, 10);
        backstagepass.updateQualityWhenPassed(2);
        Assert.assertEquals(16, backstagepass.getQuality());
    }

    @Test
    public void Backstagepass_quality_should_be_0_given_sellin_is_0_when_one_days_passed() {

        Backstagepass backstagepass = new Backstagepass(0, 10);
        backstagepass.updateQualityWhenPassed(1);
        Assert.assertEquals(0, backstagepass.getQuality());
    }

    @Test
    public void Backstagepass_quality_should_be_12_given_when_two_days_passed() {

        Backstagepass backstagepass = new Backstagepass(30, 10);
        backstagepass.updateQualityWhenPassed(2);
        Assert.assertEquals(12, backstagepass.getQuality());
    }
}
