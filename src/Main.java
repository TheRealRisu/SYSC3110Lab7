public class Main {
    public static void main(String[] args) {
        final double UNITS = 100.0;
        final double RATE = 5.0;

        //run code

        Site residential = new ResidentialSite(UNITS, RATE);
        double residentialTotal = residential.getBillableAmount();
        System.out.printf("Residential Site Total: $%.2f\n", residentialTotal); // Expected: $300.00

        Site lifeline = new LifelineSite(UNITS, RATE);
        double lifelineTotal = lifeline.getBillableAmount();
        System.out.printf("Lifeline Site Total: $%.2f\n", lifelineTotal);
    }
}