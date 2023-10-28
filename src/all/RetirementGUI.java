package all;
import java.awt.*;
import java.awt.event.*;

public class RetirementGUI extends Frame implements ActionListener, WindowListener {
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
        setSize(700, 600);
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

        submitInvestmentInfo = new Button("Submit");
        submitInvestmentInfo.setEnabled(false);
        submitInvestmentInfo.addActionListener(this);
        submitInvestmentInfo.setBounds(270, 450, 200, 50);
        submitInvestmentInfo.setFont(new Font("Futura", Font.BOLD, 25));

        this.add(header, BorderLayout.NORTH);
        header.add(appName);

        this.add(investmentTaker, BorderLayout.CENTER);
        investmentTaker.add(ageRange);
        investmentTaker.add(age18_35);
        investmentTaker.add(age36_60);
        investmentTaker.add(age61_80);
        investmentTaker.add(submitAge);
        investmentTaker.add(stockRangePercentage);
        investmentTaker.add(mutualRangePercentage);
        investmentTaker.add(goldRangePercentage);
        investmentTaker.add(bondRangePercentage);
        investmentTaker.add(savingRangePercentage);
        investmentTaker.add(stockRangePercentageText);
        investmentTaker.add(mutualRangePercentageText);
        investmentTaker.add(goldRangePercentageText);
        investmentTaker.add(bondRangePercentageText);
        investmentTaker.add(savingRangePercentageText);
        investmentTaker.add(submitInvestmentInfo);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle your actions here
    }

    public static void main(String[] args) {
        RetirementGUI gui = new RetirementGUI();
        gui.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
