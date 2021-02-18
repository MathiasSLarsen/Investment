package sample;

public class Loan {

    private int deposit;
    private double depositProcent;
    private int bankLoan;
    private double bankLoanIntrest;
    private int bankLoanPaymet;
    private double bankLoanProcent;
    private int bankLoanMonths = 120;
    private int mortgage;
    private double mortgageIntrest;
    private int mortgagePayment;
    private double mortgageprocent;
    private int mortgageMonths = 360;
    private boolean gracePeriode10Years;
    private int improvements;
    private int price;
    private int totalPayment;
    private double rate;
    private int mortgageInterestDuctible;
    private int banLoanIntrestDuctible;




    public void run(){
        calculateLoans();
        calculateBankLoanPayment();
        calculateMortgagePayment();
        calculateTotalPayment();
        calculateInterest();
    }

    private void calculateLoans(){
        //bankloan=1.03573*Price*bankLoanProcent+3863.28
        //x=1.02042*h*p+3806.19
        double tempDouble = price * bankLoanProcent +0.0035*price+ 3730;
        this.bankLoan = (int) (tempDouble+tempDouble*0.01474194);
        //x=1.0015*h*p+9143.74
        tempDouble = price * mortgageprocent + 0.0200141*price+9143.74;
        this.mortgage = (int) ((price*mortgageprocent+0.015701*price+9130)*0.98687499);
    }



    private void calculateBankLoanPayment(){
        double i = bankLoanIntrest/12;
        bankLoanPaymet = (int) ((bankLoan*i*Math.pow((1+i),bankLoanMonths))/(Math.pow((1+i),bankLoanMonths)-1));
    }

    private void calculateMortgagePayment(){
        double i = mortgageIntrest/12;
        double j = rate/12;

        if(gracePeriode10Years){
            mortgagePayment = (int) ((mortgage*(i+j)*Math.pow((1+(i+j)),120)));
        }else {
            mortgagePayment = (int) ((mortgage*(i+j)*Math.pow((1+(i+j)),mortgageMonths))/(Math.pow((1+(i+j)),mortgageMonths)-1));
        }
    }
    private void calculateInterest(){
        double i = mortgageIntrest/12;
        double j = rate/12;
        mortgageInterestDuctible = (int) (mortgage*(mortgageIntrest+rate)*0.33/12);
        banLoanIntrestDuctible = (int) (bankLoan*bankLoanIntrest*0.33/12);
    }

    private void calculateTotalPayment(){
        totalPayment = mortgagePayment+bankLoanPaymet;
    }

    public String printTotalPayment(){
        int temp = totalPayment-banLoanIntrestDuctible-mortgageInterestDuctible;
        return "Samlet ydelse = "+totalPayment+ "/" + temp;
    }
    public String printDeposit(){
        return "Udbetaling = "+deposit;
    }
    public String printMortgagePayment(){
        int temp = mortgagePayment-mortgageInterestDuctible;
        return "Månedelig ydelse realkreditlån = "+mortgagePayment+"/"+temp;
    }

    public String printBankLoanPayment(){
        int temp = bankLoanPaymet-banLoanIntrestDuctible;
        return "Månedlig ydelse banklån = "+bankLoanPaymet+"/"+temp;
    }

    public String printBankLoan(){
        return "Banklån = " +bankLoan;
    }

    public String printMortgage(){
        return  "Realkreditlån = "+mortgage;
    }


    public int getMortgageInterestDuctible() {
        return mortgageInterestDuctible;
    }

    public void setMortgageInterestDuctible(int mortgageInterestDuctible) {
        this.mortgageInterestDuctible = mortgageInterestDuctible;
    }

    public int getBanLoanIntrestDuctible() {
        return banLoanIntrestDuctible;
    }

    public void setBanLoanIntrestDuctible(int banLoanIntrestDuctible) {
        this.banLoanIntrestDuctible = banLoanIntrestDuctible;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }

    public int getImprovements() {
        return improvements;
    }

    public void setImprovements(int improvements) {
        this.improvements = improvements;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public double getDepositProcent() {
        return depositProcent;
    }

    public void setDepositProcent(double depositProcent) {
        this.depositProcent = depositProcent;
    }

    public int getBankLoan() {
        return bankLoan;
    }

    public void setBankLoan(int bankLoan) {
        this.bankLoan = bankLoan;
    }

    public double getBankLoanIntrest() {
        return bankLoanIntrest;
    }

    public void setBankLoanIntrest(double bankLoanIntrest) {
        this.bankLoanIntrest = bankLoanIntrest;
    }

    public int getBankLoanPaymet() {
        return bankLoanPaymet;
    }

    public void setBankLoanPaymet(int bankLoanPaymet) {
        this.bankLoanPaymet = bankLoanPaymet;
    }

    public double getBankLoanProcent() {
        return bankLoanProcent;
    }

    public void setBankLoanProcent(double bankLoanProcent) {
        this.bankLoanProcent = bankLoanProcent;
    }

    public int getBankLoanMonths() {
        return bankLoanMonths;
    }

    public void setBankLoanMonths(int bankLoanMonths) {
        this.bankLoanMonths = bankLoanMonths;
    }

    public int getMortgage() {
        return mortgage;
    }

    public void setMortgage(int mortgage) {
        this.mortgage = mortgage;
    }

    public double getMortgageIntrest() {
        return mortgageIntrest;
    }

    public void setMortgageIntrest(double mortgageIntrest) {
        this.mortgageIntrest = mortgageIntrest;
    }

    public int getMortgagePayment() {
        return mortgagePayment;
    }

    public void setMortgagePayment(int mortgagePayment) {
        this.mortgagePayment = mortgagePayment;
    }

    public double getMortgageprocent() {
        return mortgageprocent;
    }

    public void setMortgageprocent(double mortgageprocent) {
        this.mortgageprocent = mortgageprocent;
    }

    public int getMortgageMonths() {
        return mortgageMonths;
    }

    public void setMortgageMonths(int mortgageMonths) {
        this.mortgageMonths = mortgageMonths;
    }

    public boolean isGracePeriode10Years() {
        return gracePeriode10Years;
    }

    public void setGracePeriode10Years(boolean gracePeriode10Years) {
        this.gracePeriode10Years = gracePeriode10Years;
    }
}
