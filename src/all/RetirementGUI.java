package all;
import java.awt.*;
import java.awt.event.*;

public class RetirementGUI extends Frame implements ActionListener {
    Panel investmentTaker;
    Checkbox age18_35;
    Checkbox age36_60;
    Checkbox age61_80;
    Button submitAge;
    TextField stockRangePercentageText;
    TextField mutualRangePercentageText;
    TextField goldRangePercentageText;
    TextField bondRangePercentageText;
    TextField savingRangePercentageText;
    Button submitInvestmentInfo;

    public RetirementGUI() {
        setTitle("BudgetSim");

        setLayout(new BorderLayout());

        Panel header = new Panel();
        header.setPreferredSize(new Dimension(100, 53));
        header.setBackground(Color.WHITE);

        Label appName = new Label("BudgetSim");
        appName.setForeground(Color.BLACK);
        appName.setFont(new Font("Proxima Nova", Font.BOLD, 30));
        header.add(appName);

        investmentTaker = new Panel();
        investmentTaker.setLayout(null);
        investmentTaker.setBackground(new Color(0x123456));

        Label ageRange = new Label("Age Range:- ");
        ageRange.setFont(new Font("Proxima Nova", Font.BOLD, 20));
        ageRange.setForeground(Color.WHITE);
        ageRange.setBounds(60, 60, 150, 30);
        investmentTaker.add(ageRange);

        CheckboxGroup plans = new CheckboxGroup();
        age18_35 = new Checkbox("18-35", plans, false);
        age36_60 = new Checkbox("36-60", plans, false);
        age61_80 = new Checkbox("61-80", plans, false);
        age18_35.setBounds(200, 60, 108, 30);
        age36_60.setBounds(310, 60, 108, 30);
        age61_80.setBounds(420, 60, 108, 30);

        age18_35.setFont(new Font("Roboto", Font.BOLD, 20));
        age36_60.setFont(new Font("Roboto", Font.BOLD, 20));
        age61_80.setFont(new Font("Roboto", Font.BOLD, 20));

//        investmentTaker.add(plans);
        investmentTaker.add(age18_35);
        investmentTaker.add(age36_60);
        investmentTaker.add(age61_80);

        submitAge = new Button("Submit");
        submitAge.addActionListener(this);
        submitAge.setBounds(270, 100, 200, 50);
        submitAge.setFont(new Font("Futura", Font.BOLD, 25));
        investmentTaker.add(submitAge);

        Label stockRangePercentage = new Label("Stocks (in %): ");
        Label mutualRangePercentage = new Label("MutualFunds (in %): ");
        Label goldRangePercentage = new Label("Gold (in %): ");
        Label bondRangePercentage = new Label("Bond (in %): ");
        Label savingRangePercentage = new Label("saving: ");

        stockRangePercentage.setForeground(Color.WHITE);
        mutualRangePercentage.setForeground(Color.WHITE);
        goldRangePercentage.setForeground(Color.WHITE);
        bondRangePercentage.setForeground(Color.WHITE);
        savingRangePercentage.setForeground(Color.WHITE);

        stockRangePercentage.setFont(new Font("Copperplate", Font.BOLD, 20));
        mutualRangePercentage.setFont(new Font("Copperplate", Font.BOLD, 20));
        goldRangePercentage.setFont(new Font("Copperplate", Font.BOLD, 20));
        bondRangePercentage.setFont(new Font("Copperplate", Font.BOLD, 20));
        savingRangePercentage.setFont(new Font("Copperplate", Font.BOLD, 20));

        stockRangePercentage.setBounds(20, 200, 200, 50);
        mutualRangePercentage.setBounds(20, 250, 200, 50);
        goldRangePercentage.setBounds(20, 300, 220, 50);
        bondRangePercentage.setBounds(20, 350, 220, 50);
        savingRangePercentage.setBounds(20, 400, 220, 50);

        investmentTaker.add(stockRangePercentage);
        investmentTaker.add(mutualRangePercentage);
        investmentTaker.add(goldRangePercentage);
        investmentTaker.add(bondRangePercentage);
        investmentTaker.add(savingRangePercentage);

        stockRangePercentageText = new TextField("");
        mutualRangePercentageText = new TextField("");
        goldRangePercentageText = new TextField("");
        bondRangePercentageText = new TextField("");
        savingRangePercentageText = new TextField("");

        stockRangePercentageText.setBounds(270, 215, 330, 30);
        mutualRangePercentageText.setBounds(270, 265, 330, 30);
        goldRangePercentageText.setBounds(270, 315, 330, 30);
        bondRangePercentageText.setBounds(270, 365, 330, 30);
        savingRangePercentageText.setBounds(270, 415, 330, 30);

        investmentTaker.add(stockRangePercentageText);
        investmentTaker.add(mutualRangePercentageText);
        investmentTaker.add(goldRangePercentageText);
        investmentTaker.add(bondRangePercentageText);
        investmentTaker.add(savingRangePercentageText);

        submitInvestmentInfo = new Button("Submit");
        submitInvestmentInfo.setEnabled(false);
        submitInvestmentInfo.addActionListener(this);
        submitInvestmentInfo.setBounds(270, 450, 200, 50);
        submitInvestmentInfo.setFont(new Font("Futura", Font.BOLD, 25));

        investmentTaker.add(submitInvestmentInfo);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Frame Re= (Frame)e.getSource();
                Re.dispose();
            }
        });

        this.add(header, BorderLayout.NORTH);
        this.add(investmentTaker, BorderLayout.CENTER);

        setSize(700, 600);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==submitAge){
            submitInvestmentInfo.setEnabled(true);
            if (age18_35.getState()) {
                showMessage("Retirement plan 18-35(age) : Stocks-  50-60% Mutual funds- 20-30% Gold-  5-10% Bonds- 5-10% Saving account- 5-10%");

            } else if (age36_60.getState()) {
                showMessage("Retirement plan 36-60(age) : Stocks-  40-50% Mutual funds- 30-40% Gold-  5-10% Bonds- 10-20% Saving account- 5-10%");
            } else if (age61_80.getState()) {
                showMessage("Retirement plan 61-80(age) : Stocks-  30-40% Mutual funds- 40-50% Gold-  5-10% Bonds- 20-30% Saving account- 10-15%");
            }
        }
        else if(e.getSource()==submitInvestmentInfo){
            new RetirementPlan(Double.parseDouble(stockRangePercentageText.getText()),
                    Double.parseDouble(mutualRangePercentageText.getText()),
                    Double.parseDouble(goldRangePercentageText.getText()),
                    Double.parseDouble(bondRangePercentageText.getText()),
                    Double.parseDouble(savingRangePercentageText.getText()));
            new RetirementOutput();
        }
    }
    private void showMessage(String message) {
        Frame messageFrame = new Frame("Message");
        messageFrame.setSize(400, 200);
        messageFrame.setLayout(new FlowLayout());
        Label label = new Label(message);
        Button okButton = new Button("OK");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageFrame.dispose();
            }
        });
        messageFrame.add(label);
        messageFrame.add(okButton);
        messageFrame.setVisible(true);
    }
}
