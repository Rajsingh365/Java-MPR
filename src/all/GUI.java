package all;
import java.awt.*;
import java.awt.event.*;

public class GUI extends Frame implements WindowListener, ActionListener{
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
    GUI() {
        setTitle("BudgetSim");

        setLayout(new BorderLayout());

        Panel header = new Panel();
        header.setPreferredSize(new Dimension(100, 53));
        header.setBackground(Color.WHITE);

        Label appName = new Label("BudgetSim");
        appName.setForeground(Color.BLACK); // Set the text color to black
        appName.setFont(new Font("Proxima Nova", Font.BOLD, 30));

        Panel incomeTaker = new Panel();
        incomeTaker.setLayout(null);
        incomeTaker.setBackground(new Color(0x123456));

        Label income = new Label("Income: ");
        Label Luxuries = new Label("Luxuries: ");
        Label rent = new Label("Rent: ");
        Label tax = new Label("Tax: ");
        Label utilities = new Label("Utilities: ");
        Label buffer = new Label("Buffer: ");

        income.setForeground(Color.WHITE);
        Luxuries.setForeground(Color.WHITE);
        rent.setForeground(Color.WHITE);
        tax.setForeground(Color.WHITE);
        utilities.setForeground(Color.WHITE);
        buffer.setForeground(Color.WHITE);

        income.setFont(new Font("Copperplate", Font.BOLD, 20));
        Luxuries.setFont(new Font("Copperplate", Font.BOLD, 20));
        utilities.setFont(new Font("Copperplate", Font.BOLD, 20));
        rent.setFont(new Font("Copperplate", Font.BOLD, 20));
        tax.setFont(new Font("Copperplate", Font.BOLD, 20));
        buffer.setFont(new Font("Copperplate", Font.BOLD, 20));

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

        regularPlans.setFont(new Font("Roboto", Font.BOLD, 20));
        retirementPlans.setFont(new Font("Roboto", Font.BOLD, 20));
        regularPlans.setBounds(150, 400, 150, 30);
        retirementPlans.setBounds(310, 400, 188, 30);

       submitInvestmentCategory = new Button("Submit");
        submitInvestmentCategory.addActionListener(this);
        submitInvestmentCategory.setBounds(250, 450, 200, 50);
        submitInvestmentCategory.setFont(new Font("Futura", Font.BOLD, 25));

        header.add(appName);
        add(header, BorderLayout.NORTH);

        incomeTaker.add(income);
        incomeTaker.add(Luxuries);
        incomeTaker.add(utilities);
        incomeTaker.add(rent);
        incomeTaker.add(tax);
        incomeTaker.add(buffer);

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

        add(incomeTaker, BorderLayout.CENTER);
        setSize(700, 800);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitIncomeInfo) {
            submitIncomeInfo.setEnabled(false);
            // Handle your logic for submitting income information
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

    public static void main(String[] args) {
        GUI gui = new GUI();
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
