public class ResidentialSite extends Site{

    public ResidentialSite(double units, double rate) {
        super(units, rate);
    }

    //extracted method
    private double getBaseAmount(){
        return this.units * this.rate * 0.5;
    }

    //extracted method
    private double getTaxAmount(double base){
        return base * Site.TAX_RATE;
    }

    //common template for pulling up
    public double getBillableAmount(){
        double base = getBaseAmount();

        double tax = getTaxAmount(base);

        return base + tax;
    }

}
