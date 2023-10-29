package all;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends Frame implements ActionListener {
    TextField incomeText;
    TextField LuxuriesText;
    TextField rentText;
    TextField taxText;
    TextField utilitiesText;
    TextField bufferText;
    Button submitIncomeInfo;
    CheckboxGroup plansGroup;
    Checkbox retirementPlans;
    Checkbox regularPlans;
    Button submitInvestmentCategory;
    Panel incomeTaker;

    GUI() {
        setTitle("BudgetSim");

        setLayout(new BorderLayout());

        Panel header = new Panel();
        header.setPreferredSize(new Dimension(100, 53));
        header.setBackground(Color.WHITE);

        Label appName = new Label("BudgetSim");
        appName.setForeground(Color.BLACK); // Set the text color to black
        appName.setFont(new Font("Proxima Nova", Font.BOLD, 30));

        incomeTaker = new Panel();
        incomeTaker.setLayout(null);
        incomeTaker.setBackground(new Color(0x123456));
//        incomeTaker.setOpaque(false); // Make the panel transparent

        Label income = new Label("Income: ");
        Label Luxuries = new Label("Luxuries: ");
        Label rent = new Label("Rent: ");
        Label tax = new Label("Tax: ");
        Label utilities = new Label("Utilities: ");
        Label buffer = new Label("Buffer: ");

        income.setBounds(20, 0, 100, 50);
        Luxuries.setBounds(20, 50, 100, 50);
        rent.setBounds(20, 100, 100, 50);
        tax.setBounds(20, 150, 100, 50);
        utilities.setBounds(20, 200, 100, 50);
        buffer.setBounds(20, 250, 100, 50);

        income.setFont(new Font("Copperplate", Font.BOLD, 20));
        Luxuries.setFont(new Font("Copperplate", Font.BOLD, 20));
        utilities.setFont(new Font("Copperplate", Font.BOLD, 20));
        rent.setFont(new Font("Copperplate", Font.BOLD, 20));
        tax.setFont(new Font("Copperplate", Font.BOLD, 20));
        buffer.setFont(new Font("Copperplate", Font.BOLD, 20));

        income.setForeground(Color.WHITE);
        Luxuries.setForeground(Color.WHITE);
        rent.setForeground(Color.WHITE);
        tax.setForeground(Color.WHITE);
        utilities.setForeground(Color.WHITE);
        buffer.setForeground(Color.WHITE);

        incomeTaker.add(income);
        incomeTaker.add(Luxuries);
        incomeTaker.add(utilities);
        incomeTaker.add(rent);
        incomeTaker.add(tax);
        incomeTaker.add(buffer);

        incomeText = new TextField();
        LuxuriesText = new TextField();
        rentText = new TextField();
        taxText = new TextField();
        utilitiesText = new TextField();
        bufferText = new TextField();

        incomeText.setBounds(140, 15, 200, 30);
        LuxuriesText.setBounds(140, 65, 200, 30);
        rentText.setBounds(140, 115, 200, 30);
        taxText.setBounds(140, 165, 200, 30);
        utilitiesText.setBounds(140, 215, 200, 30);
        bufferText.setBounds(140, 265, 200, 30);

        submitIncomeInfo = new Button("Submit");
        submitIncomeInfo.addActionListener(this);
        submitIncomeInfo.setBounds(250, 320, 200, 50);
        submitIncomeInfo.setFont(new Font("Futura", Font.BOLD, 25));

        plansGroup = new CheckboxGroup();
        regularPlans = new Checkbox("Regular Plan", plansGroup, false);
        retirementPlans = new Checkbox("Retirement Plan", plansGroup, false);
        regularPlans.setVisible(false);
        retirementPlans.setVisible(false);
        regularPlans.setFont(new Font("Roboto", Font.BOLD, 20));
        retirementPlans.setFont(new Font("Roboto", Font.BOLD, 20));
        regularPlans.setBounds(150, 400, 150, 30);
        retirementPlans.setBounds(310, 400, 188, 30);

        submitInvestmentCategory = new Button("Submit");
        submitInvestmentCategory.addActionListener(this);
        submitInvestmentCategory.setBounds(250, 450, 200, 50);
        submitInvestmentCategory.setFont(new Font("Futura", Font.BOLD, 25));
        submitInvestmentCategory.setVisible(false);

        addWindowListener(new WindowAdapter() {
            @Override


            public void windowClosing(WindowEvent e)
            {
                Frame frame = (Frame) e.getSource();
                frame.dispose();
            }
        });

        this.add(header, BorderLayout.NORTH);
        header.add(appName);
        this.add(incomeTaker, BorderLayout.CENTER);

        incomeTaker.add(incomeText);
        incomeTaker.add(LuxuriesText);
        incomeTaker.add(utilitiesText);
        incomeTaker.add(rentText);
        incomeTaker.add(taxText);
        incomeTaker.add(bufferText);
        incomeTaker.add(submitIncomeInfo);
        incomeTaker.add(regularPlans);
        incomeTaker.add(retirementPlans);
        incomeTaker.add(submitInvestmentCategory);

        setSize(700, 800);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitIncomeInfo) {
            submitIncomeInfo.setEnabled(false);
            new Budget(Double.parseDouble(rentText.getText()),
                    Double.parseDouble(taxText.getText()),
                    Double.parseDouble(utilitiesText.getText()),
                    Double.parseDouble(LuxuriesText.getText()),
                    Double.parseDouble(bufferText.getText()));
            submitInvestmentCategory.setVisible(true);
            regularPlans.setVisible(true);
            retirementPlans.setVisible(true);
        } else if (e.getSource() == submitInvestmentCategory) {
            if (plansGroup.getSelectedCheckbox() == regularPlans) {
                this.dispose();
                new RegularGUI();
            } else if (plansGroup.getSelectedCheckbox() == retirementPlans) {
                this.dispose();
                new RetirementGUI();
            }
        }
    }
}