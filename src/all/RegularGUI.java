package all;
import java.awt.*;
import java.awt.event.*;

public class RegularGUI extends Frame implements ActionListener{
    Panel investmentTaker;
    Checkbox age18_35;
    Checkbox age36_60;
    Checkbox age61_80;
    Button submitAge;
    TextField equityRangePercentageText;
    TextField goldRangePercentageText;
    TextField bondRangePercentageText;
    Button submitInvestmentInfo;

    public RegularGUI() {
        setTitle("BudgetSim");
        setSize(700, 800);
        setLayout(new BorderLayout());

        Panel header = new Panel();
        header.setPreferredSize(new Dimension(100, 53));
        header.setBackground(Color.WHITE);

        Label appName = new Label("BudgetSim");
        appName.setForeground(Color.BLACK);
        appName.setFont(new Font("Proxima Nova", Font.BOLD, 30));

        investmentTaker = new Panel();
        investmentTaker.setLayout(null);
        investmentTaker.setBackground(new Color(0x123456));

        Label ageRange = new Label("Age Range:- ");
        ageRange.setFont(new Font("Proxima Nova", Font.BOLD, 20));
        ageRange.setForeground(Color.WHITE);
        ageRange.setBounds(60, 60, 150, 30);

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

        submitAge = new Button("Submit");
        submitAge.addActionListener(this);
        submitAge.setBounds(270, 100, 200, 50);
        submitAge.setFont(new Font("Futura", Font.BOLD, 25));

        Label equityRangePercentage = new Label("Equity (in %): ");
        Label goldRangePercentage = new Label("Gold (in %): ");
        Label bondRangePercentage = new Label("Bond (in %): ");

        equityRangePercentage.setForeground(Color.WHITE);
        goldRangePercentage.setForeground(Color.WHITE);
        bondRangePercentage.setForeground(Color.WHITE);

        equityRangePercentage.setFont(new Font("Copperplate", Font.BOLD, 20));
        goldRangePercentage.setFont(new Font("Copperplate", Font.BOLD, 20));
        bondRangePercentage.setFont(new Font("Copperplate", Font.BOLD, 20));

        equityRangePercentage.setBounds(20, 200, 200, 50);
        goldRangePercentage.setBounds(20, 250, 200, 50);
        bondRangePercentage.setBounds(20, 300, 200, 50);

        equityRangePercentageText = new TextField("");
        goldRangePercentageText = new TextField("");
        bondRangePercentageText = new TextField("");

        equityRangePercentageText.setBounds(270, 215, 330, 30);
        goldRangePercentageText.setBounds(270, 265, 330, 30);
        bondRangePercentageText.setBounds(270, 315, 330, 30);

        submitInvestmentInfo = new Button("Submit");
        submitInvestmentInfo.addActionListener(this);
        submitInvestmentInfo.setBounds(270, 450, 200, 50);
        submitInvestmentInfo.setEnabled(false);
        submitInvestmentInfo.setFont(new Font("Futura", Font.BOLD, 25));

             addWindowListener(new WindowAdapter() {
                 @Override
                 public void windowClosing(WindowEvent e) {
                     Frame rg=(Frame)e.getSource();
                     rg.dispose();
                 }
             });
        this.add(header, BorderLayout.NORTH);
        header.add(appName);

        this.add(investmentTaker, BorderLayout.CENTER);
        investmentTaker.add(ageRange);
        investmentTaker.add(age18_35);
        investmentTaker.add(age36_60);
        investmentTaker.add(age61_80);
        investmentTaker.add(submitAge);
        investmentTaker.add(equityRangePercentage);
        investmentTaker.add(goldRangePercentage);
        investmentTaker.add(bondRangePercentage);
        investmentTaker.add(equityRangePercentageText);
        investmentTaker.add(goldRangePercentageText);
        investmentTaker.add(bondRangePercentageText);
        investmentTaker.add(submitInvestmentInfo);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitAge) {
            submitAge.setEnabled(false);
            submitInvestmentInfo.setEnabled(true);
            if (age18_35.getState()) {
                showMessage("        Regular plan 18-35(age): Equity-  50-60% Gold-  20-25 Bonds- 10-15%");

            } else if (age36_60.getState()) {
                showMessage("        Regular plan 36-60(age): Equity-  40-50% Gold-  40-50% Bonds- 10-20%");
            } else if (age61_80.getState()) {
                showMessage("        Regular plan 61-80(age): Equity-  30-40% Gold-  50-55% Bonds- 5-10%");
            }
        }

        if (e.getSource() == submitInvestmentInfo) {
            new RegularPlan(Double.parseDouble(equityRangePercentageText.getText()),Double.parseDouble(goldRangePercentageText.getText()),Double.parseDouble(bondRangePercentageText.getText()));
            new RegularOutput();
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