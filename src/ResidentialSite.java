public class ResidentialSite extends Site{

    public ResidentialSite(double units, double rate) {
        super(units, rate);
    }

    /**
     * implements residential calculation units * rate
     * @return units * rate * 0.5
     */
    @Override
    public double getBaseAmount(){
        return this.units * this.rate * 0.5;
    }

    /**
     * Tax Calculations
     * @param baseAmount base amount
     * @return total tax amount
     */
    @Override
    public double getTaxAmount(double baseAmount) {
        return baseAmount * Site.TAX_RATE;
    }

}
