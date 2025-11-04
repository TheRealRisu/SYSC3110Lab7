public class LifelineSite extends Site{
    protected double rate;
    protected double units;

    public LifelineSite(double units, double rate) {
        this.rate = rate;
        this.units = units;
    }

    public double getBillableAmount(){
        double base = this.units + this.rate;

        double tax = base * Site.TAX_RATE;

        return base + tax;
    }

}
