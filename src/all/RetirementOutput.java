package all;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RetirementOutput extends Frame {
    Panel output;
    RetirementOutput(){
        setTitle("BudgetSim");
        setLayout(new BorderLayout());

        Panel header = new Panel();
        header.setPreferredSize(new Dimension(100, 53));
        header.setBackground(Color.WHITE);

        Label appName = new Label("BudgetSim");
        appName.setForeground(Color.BLACK);
        appName.setFont(new Font("Proxima Nova", Font.BOLD, 30));
        header.add(appName);


        output = new Panel();
        output.setLayout(null);
        output.setBackground(new Color(0x123456));

        Label stock = new Label("Stock: ");
        Label mutualFunds= new Label("Mutual Funds: ");
        Label gold = new Label("Gold: ");
        Label bonds= new Label("Bonds");
        Label savingAccount = new Label("Saving Accounts: ");
        Label total = new Label("Total: ");

        stock.setBounds(20, 50, 200, 50);
        mutualFunds.setBounds(20, 100, 200, 50);
        gold.setBounds(20, 150, 200, 50);
        bonds.setBounds(20, 200, 200, 50);
        savingAccount.setBounds(20, 250, 200, 50);
        total.setBounds(20, 300, 200, 50);

        stock.setFont(new Font("Copperplate", Font.BOLD, 20));
        mutualFunds.setFont(new Font("Copperplate", Font.BOLD, 20));
        gold.setFont(new Font("Copperplate", Font.BOLD, 20));
        bonds.setFont(new Font("Copperplate", Font.BOLD, 20));
        savingAccount.setFont(new Font("Copperplate", Font.BOLD, 20));
        total.setFont(new Font("Copperplate", Font.BOLD, 20));

        stock.setForeground(Color.WHITE);
        mutualFunds.setForeground(Color.WHITE);
        gold.setForeground(Color.WHITE);
        bonds.setForeground(Color.WHITE);
        savingAccount.setForeground(Color.WHITE);
        total.setForeground(Color.WHITE);

        output.add(stock);
        output.add(mutualFunds);
        output.add(gold);
        output.add(bonds);
        output.add(savingAccount);
        output.add(total);

        Label stockText = new Label("₹"+String.valueOf(RetirementPlan.getStockRange()));
        Label mutualFundsText = new Label("₹"+String.valueOf(RetirementPlan.getMutualRange()));
        Label goldText = new Label("₹"+String.valueOf(RetirementPlan.getGoldRange()));
        Label bondsText = new Label("₹"+String.valueOf(RetirementPlan.getBondRange()));
        Label savingAccountText = new Label("₹"+(String.valueOf(RetirementPlan.getSavingRange())));
        Label totalText = new Label("₹"+String.valueOf(RetirementPlan.getTotal()));

        stockText.setFont(new Font("Copperplate", Font.BOLD, 20));
        mutualFundsText.setFont(new Font("Copperplate", Font.BOLD, 20));
        goldText.setFont(new Font("Copperplate", Font.BOLD, 20));
        bondsText.setFont(new Font("Copperplate", Font.BOLD, 20));
        savingAccountText.setFont(new Font("Copperplate", Font.BOLD,20));
        totalText.setFont(new Font("Copperplate", Font.BOLD, 20));

        stockText.setForeground(new Color(0xFFD700));
        mutualFundsText.setForeground(new Color(0xFFD700));
        goldText.setForeground(new Color(0xFFD700));
        bondsText.setForeground(new Color(0xFFD700));
        savingAccountText.setForeground(new Color(0xFFD700));
        totalText.setForeground(new Color(0xFFD700));

        stockText.setBounds(220, 50, 200, 50);
        mutualFundsText.setBounds(220, 100, 200, 50);
        goldText.setBounds(220, 150, 200, 50);
        bondsText.setBounds(220, 200, 200, 50);
        savingAccountText.setBounds(220, 250, 200, 50);
        totalText.setBounds(220, 300, 200, 50);

        output.add(stockText);
        output.add(mutualFundsText);
        output.add(goldText);
        output.add(bondsText);
        output.add(savingAccountText);
        output.add(totalText);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Frame Re= (Frame)e.getSource();
                Re.dispose();
            }
        });

        this.add(header, BorderLayout.NORTH);
        this.add(output, BorderLayout.CENTER);

        setSize(700, 500);
        setVisible(true);
    }
}
