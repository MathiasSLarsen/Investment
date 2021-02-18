package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;


public class Main extends Application implements EventHandler<ActionEvent> {

    //mixed
    Button calculateButton;
    Appartment appartment = new Appartment();
    NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
    Number number;
    double tempDouble;
    Font headLineFont = new Font("Arial",30);

    //text fields
    TextField priceTextField;
    TextField depositTextField;
    TextField improvementsTextField;
    TextField bankLoanPercentTextField;
    TextField bankLoanInterestTextField;
    TextField mortgagePercentTextField;
    TextField mortgageInterestTextField;
    TextField constructionExpertTextField;
    TextField lawyerTextField;
    TextField insuranceTextField;
    TextField salesCounselingTextField;
    TextField rentMonthsTextField;
    TextField rentTextField;
    TextField bankLoanPeriodTextField;
    TextField mortgagePeriodeTextField;
    TextField moldTextField;
    TextField rateTextField;
    TextField electricityTextField;
    TextField waterTextField;
    TextField heatTextField;
    TextField estateTaxTextField;
    TextField maintenancePercentTextField;
    TextField sewerTextField;
    TextField renovationFeeTextField;
    TextField houseInsuranceTextField;
    TextField chimneyTextField;
    TextField snowTextField;
    TextField homeOwnersAssociationTextField;
    TextField connectionFeeTextField;
    TextField pestControlTextField;
    TextField estateValueTaxTextField;
    TextField savingsHomeOwnerTextField;
    TextField improvementsSavingsTextField;
    TextField unexpectedTextField;
    TextField otherExpensesTextField;
    TextField administrationTextField;
    TextField addressTextField;
    TextField zipTextField;
    TextField cityTextField;


    //output labels
    Label mortgageLabel;
    Label loanBankLoanLabel;
    Label bankLoanPaymentLabel;
    Label mortgagePaymentLabel;
    Label totalpaymentLabel;
    Label takeoverCostLabel;
    Label depositOutPutLabel;
    Label totalCashLabel;
    Label rentWithSpending;
    Label resultLabel;
    Label resultYearLabel;
    Label totalDeductibleLabel;
    Label taxLabel;
    Label totalOtherExpenses;
    Label taxInterest;

    //check boxes
    CheckBox gracePeriodeCheckBox;


    @Override
    public void start(Stage primaryStage) throws Exception{

        //mainGrid setup
        GridPane mainGrid = new GridPane();
        mainGrid.setPadding(new Insets(10,10,10,10));
        mainGrid.setVgap(10);
        mainGrid.setHgap(10);

        //labels setup
        Label loanHeadlineLabel = new Label("lån info");
        GridPane.setConstraints(loanHeadlineLabel,0,0);
        loanHeadlineLabel.setFont(headLineFont);

        Label priceLabel = new Label("Boligens pris");
        GridPane.setConstraints(priceLabel,0,1);

        Label depositLabel = new Label("Udbetaling");
        GridPane.setConstraints(depositLabel,0,2);

        Label bankLoanPercentLabel = new Label("Bank lån i %");
        GridPane.setConstraints(bankLoanPercentLabel,0,3);

        Label bankLoanInterestLabel = new Label("Renten på banklånet i %");
        GridPane.setConstraints(bankLoanInterestLabel,0,4);

        Label bankLoanPeriodLabel = new Label("Banklånets løbetid i måneder");
        GridPane.setConstraints(bankLoanPeriodLabel,0,5);

        Label mortgagePercentLabel = new Label("Realkreditlån i %");
        GridPane.setConstraints(mortgagePercentLabel,0,6);

        Label mortgageInterestLable = new Label("Renten på realkreditlånet i %");
        GridPane.setConstraints(mortgageInterestLable,0,7);

        Label mortgagePeriodLabel = new Label("Realkreditlånets løbetid i måneder");
        GridPane.setConstraints(mortgagePeriodLabel,0,8);

        Label rateLabel = new Label("Bidragssats i %");
        GridPane.setConstraints(rateLabel,0,9);

        Label gracePeriodeLabel = new Label("Er der 10 års afdragsfrifehd");
        GridPane.setConstraints(gracePeriodeLabel,0,10);

        Label takeoverHeadLine = new Label("Overtagelses Info");
        GridPane.setConstraints(takeoverHeadLine,0,11);
        takeoverHeadLine.setFont(headLineFont);

        Label constructionExpertLabel = new Label("Byggesagkyndig");
        GridPane.setConstraints(constructionExpertLabel,0,12);

        Label lawyerLabel = new Label("Advokatbistand");
        GridPane.setConstraints(lawyerLabel,0,13);

        Label insuranceLabel = new Label("Ejerskifteforsikring");
        GridPane.setConstraints(insuranceLabel,0,14);

        Label salesCounselingLabel = new Label("Købsmægler");
        GridPane.setConstraints(salesCounselingLabel,0,15);

        Label rentTakeOverLabel = new Label("Måneders husleje");
        GridPane.setConstraints(rentTakeOverLabel,0,16);

        Label improvementsLabel = new Label("Forbedringer i kr");
        GridPane.setConstraints(improvementsLabel,0,17);

        Label moldLabel = new Label("Skimmelsvamps tjeck");
        GridPane.setConstraints(moldLabel,0,18);

        Label operationHeadLineLabel = new Label("Drift");
        GridPane.setConstraints(operationHeadLineLabel,2,0);
        operationHeadLineLabel.setFont(headLineFont);

        Label rentLabel = new Label("Husleje pr månede");
        GridPane.setConstraints(rentLabel,2,1);

        Label electricityLabel = new Label("El");
        GridPane.setConstraints(electricityLabel,2,2);

        Label waterLabel = new Label("Vand");
        GridPane.setConstraints(waterLabel,2,3);

        Label heatLabel = new Label("Varme");
        GridPane.setConstraints(heatLabel,2,4);

        Label estateTaxLabel = new Label("Ejndomsskat");
        GridPane.setConstraints(estateTaxLabel,2,5);

        Label maintenanceLabel = new Label("Vedligeholdelse i % af huslejen");
        GridPane.setConstraints(maintenanceLabel,2,6);

        Label sewerLabel = new Label("Kloak");
        GridPane.setConstraints(sewerLabel,2,7);

        Label renovationFees = new Label("Renovertionssafgifter");
        GridPane.setConstraints(renovationFees,2,8);

        Label houseInsuranceLabel = new Label("Husforsikring");
        GridPane.setConstraints(houseInsuranceLabel,2,9);

        Label chimneyLabel = new Label("Skrostensfejning");
        GridPane.setConstraints(chimneyLabel,2,10);

        Label snowLabel = new Label("Snerydning");
        GridPane.setConstraints(snowLabel,2,11);

        Label homeOwnersAssociationLabel = new Label("Grundejerforening");
        GridPane.setConstraints(homeOwnersAssociationLabel,2,12);

        Label connectionFee = new Label("Tilslutningsafgift");
        GridPane.setConstraints(connectionFee,2,13);

        Label pestControl = new Label("Rottebekæmbelse");
        GridPane.setConstraints(pestControl,2,14);

        Label estateValueTaxLabel = new Label("Ejndonsværdiskat");
        GridPane.setConstraints(estateValueTaxLabel,2,15);

        Label savingsHomeOwner = new Label("Opsparing ejerforening");
        GridPane.setConstraints(savingsHomeOwner,2,16);

        Label improvementsSavings = new Label("Renovertionsopsparing");
        GridPane.setConstraints(improvementsSavings,2,17);

        Label unexpectedLabel = new Label("Uforudsete udgifter");
        GridPane.setConstraints(unexpectedLabel,2,18);

        Label otherExpensesLabel = new Label("Andre faste udgifter");
        GridPane.setConstraints(otherExpensesLabel,2,19);

        Label administrationLabel = new Label("Administration");
        GridPane.setConstraints(administrationLabel,2,20);

        Label addressHeadLineLabel = new Label("Adresse info");
        GridPane.setConstraints(addressHeadLineLabel,4,0);
        addressHeadLineLabel.setFont(headLineFont);

        Label addressLabel = new Label("Adresse ");
        GridPane.setConstraints(addressLabel,4,1);

        Label zipLabel = new Label("Postnummer ");
        GridPane.setConstraints(zipLabel,4,2);

        Label cityLabel = new Label("By ");
        GridPane.setConstraints(cityLabel,4,3);


        //output label setup
        loanBankLoanLabel = new Label();
        GridPane.setConstraints(loanBankLoanLabel,6,1);
        loanBankLoanLabel.setWrapText(true);

        mortgageLabel = new Label();
        GridPane.setConstraints(mortgageLabel,6,2);
        mortgageLabel.setWrapText(true);

        bankLoanPaymentLabel = new Label();
        GridPane.setConstraints(bankLoanPaymentLabel,6,3);
        bankLoanPaymentLabel.setWrapText(true);

        mortgagePaymentLabel = new Label();
        GridPane.setConstraints(mortgagePaymentLabel,6,4);
        mortgagePaymentLabel.setWrapText(true);

        totalpaymentLabel = new Label();
        GridPane.setConstraints(totalpaymentLabel,6,5);

        depositOutPutLabel = new Label();
        GridPane.setConstraints(depositOutPutLabel,6,6);
        depositOutPutLabel.setWrapText(true);

        takeoverCostLabel = new Label();
        GridPane.setConstraints(takeoverCostLabel,6,7);
        takeoverCostLabel.setWrapText(true);

        totalCashLabel = new Label();
        GridPane.setConstraints(totalCashLabel,6,8);
        totalCashLabel.setWrapText(true);

        rentWithSpending = new Label();
        GridPane.setConstraints(rentWithSpending,6,9);
        rentWithSpending.setWrapText(true);

        totalDeductibleLabel = new Label();
        GridPane.setConstraints(totalDeductibleLabel,6,10);
        totalDeductibleLabel.setWrapText(true);

        totalOtherExpenses = new Label();
        GridPane.setConstraints(totalOtherExpenses,6,11);
        totalOtherExpenses.setWrapText(true);

        taxInterest = new Label();
        GridPane.setConstraints(taxInterest,6,12);
        taxInterest.setWrapText(true);

        taxLabel = new Label();
        GridPane.setConstraints(taxLabel,6,13);

        resultLabel = new Label();
        GridPane.setConstraints(resultLabel,6,14);
        resultLabel.setWrapText(true);

        resultYearLabel = new Label();
        GridPane.setConstraints(resultYearLabel,6,15);
        resultYearLabel.setWrapText(true);


        //TextField setup
        priceTextField = new TextField("2000000");
        GridPane.setConstraints(priceTextField,1,1);

        depositTextField = new TextField("5");
        GridPane.setConstraints(depositTextField,1,2);

        bankLoanPercentTextField = new TextField("16,74");
        GridPane.setConstraints(bankLoanPercentTextField,1,3);

        bankLoanInterestTextField = new TextField("6");
        GridPane.setConstraints(bankLoanInterestTextField,1,4);

        bankLoanPeriodTextField = new TextField("120");
        GridPane.setConstraints(bankLoanPeriodTextField,1,5);

        mortgagePercentTextField = new TextField("80");
        GridPane.setConstraints(mortgagePercentTextField,1,6);

        mortgageInterestTextField = new TextField("1");
        GridPane.setConstraints(mortgageInterestTextField,1,7);

        mortgagePeriodeTextField = new TextField("360");
        GridPane.setConstraints(mortgagePeriodeTextField,1,8);

        rateTextField = new TextField("0,7");
        GridPane.setConstraints(rateTextField,1,9);

        constructionExpertTextField = new TextField("8000");
        GridPane.setConstraints(constructionExpertTextField,1,12);

        lawyerTextField = new TextField("8000");
        GridPane.setConstraints(lawyerTextField,1,13);

        insuranceTextField = new TextField("10000");
        GridPane.setConstraints(insuranceTextField,1,14);

        salesCounselingTextField = new TextField("10000");
        GridPane.setConstraints(salesCounselingTextField,1,15);

        rentMonthsTextField = new TextField("3");
        GridPane.setConstraints(rentMonthsTextField,1,16);

        improvementsTextField = new TextField("0");
        GridPane.setConstraints(improvementsTextField,1,17);

        moldTextField = new TextField("6000");
        GridPane.setConstraints(moldTextField,1,18);

        rentTextField = new TextField("5000");
        GridPane.setConstraints(rentTextField,3,1);

        electricityTextField = new TextField("267");
        GridPane.setConstraints(electricityTextField,3,2);

        waterTextField = new TextField("450");
        GridPane.setConstraints(waterTextField,3,3);

        heatTextField = new TextField("500");
        GridPane.setConstraints(heatTextField,3,4);

        estateTaxTextField = new TextField("324");
        GridPane.setConstraints(estateTaxTextField,3,5);

        maintenancePercentTextField = new TextField("6");
        GridPane.setConstraints(maintenancePercentTextField,3,6);

        sewerTextField = new TextField("0");
        GridPane.setConstraints(sewerTextField,3,7);

        renovationFeeTextField = new TextField("235");
        GridPane.setConstraints(renovationFeeTextField,3,8);

        houseInsuranceTextField = new TextField("282");
        GridPane.setConstraints(houseInsuranceTextField,3,9);

        snowTextField = new TextField("0");
        GridPane.setConstraints(snowTextField,3,10);

        chimneyTextField = new TextField("0");
        GridPane.setConstraints(chimneyTextField,3,11);

        homeOwnersAssociationTextField = new TextField("0");
        GridPane.setConstraints(homeOwnersAssociationTextField,3,12);

        connectionFeeTextField = new TextField("0");
        GridPane.setConstraints(connectionFeeTextField,3,13);

        pestControlTextField = new TextField("2");
        GridPane.setConstraints(pestControlTextField,3,14);

        estateValueTaxTextField = new TextField("153");
        GridPane.setConstraints(estateValueTaxTextField,3,15);

        savingsHomeOwnerTextField = new TextField("0");
        GridPane.setConstraints(savingsHomeOwnerTextField,3,16);

        improvementsSavingsTextField = new TextField("1000");
        GridPane.setConstraints(improvementsSavingsTextField,3,17);

        unexpectedTextField = new TextField("500");
        GridPane.setConstraints(unexpectedTextField,3,18);

        otherExpensesTextField = new TextField("0");
        GridPane.setConstraints(otherExpensesTextField,3,19);

        administrationTextField = new TextField("500");
        GridPane.setConstraints(administrationTextField,3,20);

        addressTextField = new TextField("test");
        GridPane.setConstraints(addressTextField,5,1);

        zipTextField = new TextField("2880");
        GridPane.setConstraints(zipTextField,5,2);

        cityTextField = new TextField("test");
        GridPane.setConstraints(cityTextField,5,3);


        //CheckBox setup
        gracePeriodeCheckBox = new CheckBox();
        GridPane.setConstraints(gracePeriodeCheckBox,1,10);
        gracePeriodeCheckBox.setSelected(true);


        // button setup
        calculateButton = new Button("Calculate");
        GridPane.setConstraints(calculateButton,1,20);
        calculateButton.setOnAction(this);

        //add children to grid
        mainGrid.getChildren().addAll(priceLabel,depositLabel,improvementsLabel,bankLoanInterestLabel,
                bankLoanPercentLabel,mortgagePercentLabel,mortgageInterestLable
                ,priceTextField, depositTextField,improvementsTextField,bankLoanInterestTextField,bankLoanPercentTextField,mortgagePercentTextField,mortgageInterestTextField,
                calculateButton, loanBankLoanLabel,mortgageLabel, bankLoanPaymentLabel, mortgagePaymentLabel,gracePeriodeLabel,gracePeriodeCheckBox,
                loanHeadlineLabel,takeoverHeadLine,constructionExpertLabel,constructionExpertTextField,lawyerLabel,lawyerTextField,insuranceLabel,insuranceTextField,salesCounselingLabel,
                salesCounselingTextField,rentTakeOverLabel,rentMonthsTextField,takeoverCostLabel,depositOutPutLabel,totalCashLabel,
                totalpaymentLabel,operationHeadLineLabel,rentLabel,rentTextField,bankLoanPeriodLabel, bankLoanPeriodTextField,
                mortgagePeriodLabel,mortgagePeriodeTextField,moldLabel,moldTextField,rateLabel,rateTextField,
                electricityLabel,waterLabel,heatLabel,estateTaxLabel,maintenanceLabel,sewerLabel,renovationFees,houseInsuranceLabel,chimneyLabel,snowLabel,
                homeOwnersAssociationLabel,connectionFee,pestControl,estateValueTaxLabel,savingsHomeOwner,improvementsSavings,unexpectedLabel,otherExpensesLabel,
                electricityTextField,waterTextField,heatTextField,estateTaxTextField, maintenancePercentTextField,sewerTextField,
                renovationFeeTextField,houseInsuranceTextField,chimneyTextField,snowTextField,homeOwnersAssociationTextField,
                connectionFeeTextField,pestControlTextField,estateValueTaxTextField,savingsHomeOwnerTextField,improvementsSavingsTextField,unexpectedTextField,otherExpensesTextField,
                resultLabel,resultYearLabel,rentWithSpending,totalDeductibleLabel,totalOtherExpenses,taxLabel,taxInterest,administrationLabel,administrationTextField,
                addressHeadLineLabel,addressLabel,zipLabel,cityLabel, addressTextField,zipTextField,cityTextField);



        primaryStage.setTitle("Investment Program");
        primaryStage.setScene(new Scene(mainGrid, 1000, 500));
        primaryStage.setMaximized(true);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if(actionEvent.getSource()==calculateButton){

            setLoanInputFields(); // must run first
            setTakeOverFields(); //must run before appartment.run()
            setOperationInputFields();
            setAddressFields();
            appartment.run();
            setOutputFields(); // must run last
        }
    }

    private void setAddressFields(){
        appartment.setAddress(addressTextField.getText());
        appartment.setZip(Integer.parseInt(zipTextField.getText()));
        appartment.setCity(cityTextField.getText());
    }

    private void setLoanInputFields(){
        //set input values
        appartment.loan.setPrice(Integer.parseInt(priceTextField.getText()));
        appartment.setValue(Integer.parseInt(priceTextField.getText()));
        appartment.loan.setImprovements(Integer.parseInt(improvementsTextField.getText()));
        appartment.loan.setGracePeriode10Years(gracePeriodeCheckBox.isSelected());
        appartment.loan.setBankLoanMonths(Integer.parseInt(bankLoanPeriodTextField.getText()));
        appartment.loan.setMortgageMonths(Integer.parseInt(mortgagePeriodeTextField.getText()));
        appartment.loan.setDeposit(Integer.parseInt(depositTextField.getText()));


        try {
            number = format.parse(bankLoanPercentTextField.getText());
            tempDouble = number.doubleValue();
            appartment.loan.setBankLoanProcent(tempDouble/100);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            number = format.parse(bankLoanInterestTextField.getText());
            tempDouble = number.doubleValue();
            appartment.loan.setBankLoanIntrest(tempDouble/100);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            number = format.parse(mortgagePercentTextField.getText());
            tempDouble = number.doubleValue();
            appartment.loan.setMortgageprocent(tempDouble/100);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            number = format.parse(mortgageInterestTextField.getText());
            tempDouble = number.doubleValue();
            appartment.loan.setMortgageIntrest(tempDouble/100);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            number = format.parse(rateTextField.getText());
            tempDouble = number.doubleValue();
            appartment.loan.setRate(tempDouble/100);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

    private void setTakeOverFields(){

        appartment.takeOver.constructionExpert = Integer.parseInt(constructionExpertTextField.getText());
        appartment.takeOver.lawyer = Integer.parseInt(lawyerTextField.getText());
        appartment.takeOver.incurance = Integer.parseInt(insuranceTextField.getText());
        appartment.takeOver.salesCounseling = Integer.parseInt(salesCounselingTextField.getText());
        int temp = Integer.parseInt(rentMonthsTextField.getText()) * Integer.parseInt(rentTextField.getText());
        appartment.takeOver.setRent(temp);
        appartment.takeOver.setMold(Integer.parseInt(moldTextField.getText()));
    }


    private void setOperationInputFields(){
        appartment.operation.setRent(Integer.parseInt(rentTextField.getText()));
        appartment.operation.setElectricity(Integer.parseInt(electricityTextField.getText()));
        appartment.operation.setWater(Integer.parseInt(waterTextField.getText()));
        appartment.operation.setHeat(Integer.parseInt(heatTextField.getText()));
        appartment.operation.setEstateTax(Integer.parseInt(estateTaxTextField.getText()));
        try {
            number = format.parse(maintenancePercentTextField.getText());
            tempDouble = number.doubleValue();
            tempDouble = tempDouble/100;
            appartment.operation.setMaintenancePercent(tempDouble);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        appartment.operation.setSewer(Integer.parseInt(sewerTextField.getText()));
        appartment.operation.setRenovationFee(Integer.parseInt(renovationFeeTextField.getText()));
        appartment.operation.setHouseInsurance(Integer.parseInt(houseInsuranceTextField.getText()));
        appartment.operation.setChimney(Integer.parseInt(chimneyTextField.getText()));
        appartment.operation.setSnow(Integer.parseInt(snowTextField.getText()));
        appartment.operation.setHomeOwnerAssociation(Integer.parseInt(homeOwnersAssociationTextField.getText()));
        appartment.operation.setConnectionFee(Integer.parseInt(connectionFeeTextField.getText()));
        appartment.operation.setPestControl(Integer.parseInt(pestControlTextField.getText()));
        appartment.operation.setEstateValueTax(Integer.parseInt(estateValueTaxTextField.getText()));
        appartment.operation.setSavingsHomeOwner(Integer.parseInt(savingsHomeOwnerTextField.getText()));
        appartment.operation.setImprovementsSavings(Integer.parseInt(improvementsSavingsTextField.getText()));
        appartment.operation.setUnexpected(Integer.parseInt(unexpectedTextField.getText()));
        appartment.operation.setOtherExpenses(Integer.parseInt(otherExpensesTextField.getText()));
        appartment.operation.setAdministration(Integer.parseInt(administrationTextField.getText()));
    }

    private void setOutputFields(){
        //set output labels
        loanBankLoanLabel.setText(appartment.loan.printBankLoan());
        mortgageLabel.setText(appartment.loan.printMortgage());
        bankLoanPaymentLabel.setText(appartment.loan.printBankLoanPayment());
        mortgagePaymentLabel.setText(appartment.loan.printMortgagePayment());
        takeoverCostLabel.setText(appartment.takeOver.printTakeOverCost());
        depositOutPutLabel.setText(appartment.loan.printDeposit());
        totalCashLabel.setText(appartment.printCash());
        totalpaymentLabel.setText(appartment.loan.printTotalPayment());
        resultLabel.setText(appartment.operation.printResult());
        resultYearLabel.setText(appartment.operation.printResultYear());
        totalDeductibleLabel.setText(appartment.operation.printTotalDeductible());
        totalOtherExpenses.setText(appartment.operation.printTotalotherExpenses());
        taxLabel.setText(appartment.operation.printTax());
        rentWithSpending.setText(appartment.operation.printRentWithSpending());
        taxInterest.setText(appartment.operation.printTaxDeductible());

    }
}
