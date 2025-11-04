public class ResidentialSite extends Site{
    protected double rate;
    protected double units;

    public ResidentialSite(double units, double rate) {
        this.rate = rate;
        this.units = units;
    }

    public double getBillableAmount(){
        double base = this.units + this.rate * 0.5;

        double tax = base * Site.TAX_RATE;

        return base + tax;
    }

}
