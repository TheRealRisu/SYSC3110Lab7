public class LifelineSite extends Site{

    public LifelineSite(double units, double rate) {
        super(units, rate);
    }

    /**
     * implements lifeline calculation units * rate
     * @return units * rate
     */
    @Override
    public double getBaseAmount(){
        return this.units * this.rate;
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
