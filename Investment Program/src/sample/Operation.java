package sample;

public class Operation {

    private int rent;
    private int electricity;
    private int water;
    private int heat;
    private int estateTax;
    private double maintenancePercent;
    private int maintenance;
    private int sewer;
    private int renovationFee;
    private int houseInsurance;
    private int chimney;
    private int snow;
    private int homeOwnerAssociation;
    private int connectionFee;
    private int pestControl;
    private int estateValueTax;
    private int savingsHomeOwner;
    private int improvementsSavings;
    private int unexpected;
    private int otherExpenses;
    private int loan;
    private int rentWithSpending;
    private int ductibles;
    private int interestDeductible;
    private int taxableIncome;
    private int tax;
    private int totalNonDeductibleExpenses;
    private int totalExpenses;
    private int result;
    private int resultYear;
    private int loanPayment;
    private int administration;

    public void run(){
        calculateRentPerYear(); //run 0.
        calculateRentWithSpending(); //run 1.
        calculateMaintenance(); // run 2.
        calculatedeDuctibles(); // run 3.
        calculateTaxableIncome(); // run 4.
        calculateTax(); // run 5.
        calculateTotalNonDeductibleExpenses(); // run 6.
        calculateTotalExpenses(); // run 7.
        calculateResult(); // run 8.
        calculateResultMonth(); // run 9.
    }

    private void calculateRentPerYear(){
        rent = rent * 12;
    }

    private void calculatedeDuctibles(){
        ductibles = electricity+water+heat+estateTax+ maintenance +sewer+renovationFee+houseInsurance+chimney+snow+homeOwnerAssociation+connectionFee;
    }
    private void calculateRentWithSpending(){
        rentWithSpending = rent+water+electricity+heat;
    }

    private void calculateTaxableIncome(){
        taxableIncome = rentWithSpending-ductibles-interestDeductible;
    }

    private void calculateTax(){
        tax = (int) (taxableIncome*0.22);
    }

    private void calculateTotalNonDeductibleExpenses(){
        totalNonDeductibleExpenses = pestControl+estateValueTax+improvementsSavings+savingsHomeOwner+unexpected+otherExpenses+loanPayment-interestDeductible+administration;
    }

    private void calculateTotalExpenses(){
        totalExpenses = totalNonDeductibleExpenses+ductibles+tax;
    }

    private void calculateResult(){
        resultYear = rentWithSpending-totalExpenses;
    }

    private void calculateResultMonth(){
        result = resultYear/12;
    }

    private void calculateMaintenance(){
        maintenance = (int) (maintenancePercent*rent);
    }




    public String printTotalDeductible(){
        return "Total skattefradragsberetiged = "+ductibles;
    }

    public String printTotalotherExpenses(){
        return "Total ikke fradrageberettigede = "+totalNonDeductibleExpenses;
    }

    public String printTax(){
        return "Skat = "+tax;
    }

    public String printRentWithSpending(){
        return "Husleje med acconto = "+rentWithSpending;
    }
    public String printResult(){
        return "Resultat af drift pr. månede = "+result;
    }

    public String printResultYear(){
        return "Resultat af drift pr. år = "+resultYear;
    }

    public String printTaxDeductible(){
        return "Renter fradragsberettiged = "+interestDeductible;
    }

    public int getAdministration() {
        return administration;
    }

    public void setAdministration(int administration) {
        this.administration = administration;
    }

    public int getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(int maintenance) {
        this.maintenance = maintenance;
    }

    public int getLoanPayment() {
        return loanPayment;
    }

    public void setLoanPayment(int loanPayment) {
        this.loanPayment = loanPayment;
    }

    public int getResultYear() {
        return resultYear;
    }

    public void setResultYear(int resultYear) {
        this.resultYear = resultYear;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getTotalExpenses() {
        return totalExpenses;
    }

    public void setTotalExpenses(int totalExpenses) {
        this.totalExpenses = totalExpenses;
    }

    public int getTotalNonDeductibleExpenses() {
        return totalNonDeductibleExpenses;
    }

    public void setTotalNonDeductibleExpenses(int totalNonDeductibleExpenses) {
        this.totalNonDeductibleExpenses = totalNonDeductibleExpenses;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getInterestDeductible() {
        return interestDeductible;
    }

    public void setInterestDeductible(int interestDeductible) {
        this.interestDeductible = interestDeductible;
    }

    public int getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(int taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public int getDuctibles() {
        return ductibles;
    }

    public void setDuctibles(int ductibles) {
        ductibles = ductibles;
    }

    public int getRentWithSpending() {
        return rentWithSpending;
    }

    public void setRentWithSpending(int rentWithSpending) {
        this.rentWithSpending = rentWithSpending;
    }

    public int getElectricity() {
        return electricity;
    }

    public void setElectricity(int electricity) {
        this.electricity = electricity;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getHeat() {
        return heat;
    }

    public void setHeat(int heat) {
        this.heat = heat;
    }

    public int getEstateTax() {
        return estateTax;
    }

    public void setEstateTax(int estateTax) {
        this.estateTax = estateTax;
    }

    public double getMaintenancePercent() {
        return maintenancePercent;
    }

    public void setMaintenancePercent(double maintenancePercent) {
        this.maintenancePercent = maintenancePercent;
    }

    public int getSewer() {
        return sewer;
    }

    public void setSewer(int sewer) {
        this.sewer = sewer;
    }

    public int getRenovationFee() {
        return renovationFee;
    }

    public void setRenovationFee(int renovationFee) {
        this.renovationFee = renovationFee;
    }

    public int getHouseInsurance() {
        return houseInsurance;
    }

    public void setHouseInsurance(int houseInsurance) {
        this.houseInsurance = houseInsurance;
    }

    public int getChimney() {
        return chimney;
    }

    public void setChimney(int chimney) {
        this.chimney = chimney;
    }

    public int getSnow() {
        return snow;
    }

    public void setSnow(int snow) {
        this.snow = snow;
    }

    public int getHomeOwnerAssociation() {
        return homeOwnerAssociation;
    }

    public void setHomeOwnerAssociation(int homeOwnerAssociation) {
        this.homeOwnerAssociation = homeOwnerAssociation;
    }

    public int getConnectionFee() {
        return connectionFee;
    }

    public void setConnectionFee(int connectionFee) {
        this.connectionFee = connectionFee;
    }

    public int getPestControl() {
        return pestControl;
    }

    public void setPestControl(int pestControl) {
        this.pestControl = pestControl;
    }

    public int getEstateValueTax() {
        return estateValueTax;
    }

    public void setEstateValueTax(int estateValueTax) {
        this.estateValueTax = estateValueTax;
    }

    public int getSavingsHomeOwner() {
        return savingsHomeOwner;
    }

    public void setSavingsHomeOwner(int savingsHomeOwner) {
        this.savingsHomeOwner = savingsHomeOwner;
    }

    public int getImprovementsSavings() {
        return improvementsSavings;
    }

    public void setImprovementsSavings(int improvementsSavings) {
        this.improvementsSavings = improvementsSavings;
    }

    public int getUnexpected() {
        return unexpected;
    }

    public void setUnexpected(int unexpected) {
        this.unexpected = unexpected;
    }

    public int getOtherExpenses() {
        return otherExpenses;
    }

    public void setOtherExpenses(int otherExpenses) {
        this.otherExpenses = otherExpenses;
    }

    public int getLoan() {
        return loan;
    }

    public void setLoan(int loan) {
        this.loan = loan;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }
}
