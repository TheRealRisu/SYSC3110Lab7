abstract class Site {
    //shared constant
    protected static final double TAX_RATE = 0.2;

    protected double units;
    protected double rate;

    //constructor
    public Site(double units, double rate){
        this.units = units;
        this.rate = rate;
    }

    /**
     * Template method: defines fixed structure
     * @return total billable amount (pulled up from subclass)
     */
    public final double getBillableAmount(){
        double base = getBaseAmount();
        double tax = getTaxAmount(base);
        return base + tax;
    }

    /**
     * ABSTRACT HOOK: implemented by subclass
     * @return base amount
     */
    public abstract double getBaseAmount();

    /**
     * ABSTRACT HOOK: implemented by subclass
     * @param baseAmount base amount
     * @return tax amount
     */
    public abstract double getTaxAmount(double baseAmount);

}
