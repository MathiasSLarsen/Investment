package sample;

public class TakeOver {

    int constructionExpert = 0;
    int lawyer = 0;
    int incurance = 0;
    int salesCounseling = 0;
    int rent = 0;
    int takeOverCost = 0;
    int mold = 0;


    public void run(){
        calculateTakeOverCost();
    }

    public String printTakeOverCost(){
        return "Overtagelses omkostninger = "+takeOverCost;
    }

    private void calculateTakeOverCost(){
        takeOverCost = constructionExpert+lawyer+incurance+salesCounseling+rent+mold;
    }


    public int getMold() {
        return mold;
    }

    public void setMold(int mold) {
        this.mold = mold;
    }

    public int getTakeOverCost() {
        return takeOverCost;
    }

    public void setTakeOverCost(int takeOverCost) {
        this.takeOverCost = takeOverCost;
    }

    public int getConstructionExpert() {
        return constructionExpert;
    }

    public void setConstructionExpert(int constructionExpert) {
        this.constructionExpert = constructionExpert;
    }

    public int getLawyer() {
        return lawyer;
    }

    public void setLawyer(int lawyer) {
        this.lawyer = lawyer;
    }

    public int getIncurance() {
        return incurance;
    }

    public void setIncurance(int incurance) {
        this.incurance = incurance;
    }

    public int getSalesCounseling() {
        return salesCounseling;
    }

    public void setSalesCounseling(int salesCounseling) {
        this.salesCounseling = salesCounseling;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }
}
