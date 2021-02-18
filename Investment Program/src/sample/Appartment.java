package sample;

public class Appartment {

    private int value;
    int cash;
    private double appreciationHistoricaly;
    private double appreciationExpected;
    private double inflation;
    private int valueHistoricaly;
    private int valueExpected;
    private int profitHistoricaly;
    private int profitExpected;
    private int profitHistoricalyInflation;
    private int profitExpectedInflation;
    private int improvementsAccount;
    private int improvementsPayment;
    private int year;
    private String address;
    private int zip;
    private String city;


    Loan loan = new Loan();
    TakeOver takeOver = new TakeOver();
    Operation operation = new Operation();


    public void run(){
        loan.run();
        setInterestDeductibleInOperation(); // must run after loan.run()
        setLoanPaymentInOperation(); // must run after loan.run()
        operation.run(); //must run after setDedutibleInOperation()
        takeOver.run();
        calculateCash();
    }


    private void setInterestDeductibleInOperation(){
        operation.setInterestDeductible((loan.getMortgageInterestDuctible()+loan.getBanLoanIntrestDuctible())*12);
    }

    private void setLoanPaymentInOperation(){
        operation.setLoanPayment(loan.getTotalPayment()*12);
    }

    private void calculateCash(){
        cash = loan.getImprovements() + takeOver.getTakeOverCost() + loan.getDeposit();
    }
    public String printCash(){

        return " Samlet kontant = " +cash;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double getAppreciationHistoricaly() {
        return appreciationHistoricaly;
    }

    public void setAppreciationHistoricaly(double appreciationHistoricaly) {
        this.appreciationHistoricaly = appreciationHistoricaly;
    }

    public double getAppreciationExpected() {
        return appreciationExpected;
    }

    public void setAppreciationExpected(double appreciationExpected) {
        this.appreciationExpected = appreciationExpected;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getInflation() {
        return inflation;
    }

    public void setInflation(double inflation) {
        this.inflation = inflation;
    }

    public int getValueHistoricaly() {
        return valueHistoricaly;
    }

    public void setValueHistoricaly(int valueHistoricaly) {
        this.valueHistoricaly = valueHistoricaly;
    }

    public int getValueExpected() {
        return valueExpected;
    }

    public void setValueExpected(int valueExpected) {
        this.valueExpected = valueExpected;
    }

    public int getProfitHistoricaly() {
        return profitHistoricaly;
    }

    public void setProfitHistoricaly(int profitHistoricaly) {
        this.profitHistoricaly = profitHistoricaly;
    }

    public int getProfitExpected() {
        return profitExpected;
    }

    public void setProfitExpected(int profitExpected) {
        this.profitExpected = profitExpected;
    }

    public int getProfitHistoricalyInflation() {
        return profitHistoricalyInflation;
    }

    public void setProfitHistoricalyInflation(int profitHistoricalyInflation) {
        this.profitHistoricalyInflation = profitHistoricalyInflation;
    }

    public int getProfitExpectedInflation() {
        return profitExpectedInflation;
    }

    public void setProfitExpectedInflation(int profitExpectedInflation) {
        this.profitExpectedInflation = profitExpectedInflation;
    }

    public int getImprovementsAccount() {
        return improvementsAccount;
    }

    public void setImprovementsAccount(int improvementsAccount) {
        this.improvementsAccount = improvementsAccount;
    }

    public int getImprovementsPayment() {
        return improvementsPayment;
    }

    public void setImprovementsPayment(int improvementsPayment) {
        this.improvementsPayment = improvementsPayment;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
