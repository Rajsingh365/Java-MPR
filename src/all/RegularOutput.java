package all;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RegularOutput extends Frame {
        Panel output;
        RegularOutput(){
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

            Label emergencyFunds = new Label("Emergency Funds: ");
            Label equity= new Label("Equity: ");
            Label gold = new Label("Gold: ");
            Label bonds= new Label("Bonds");
            Label total = new Label("Total: ");

            emergencyFunds.setBounds(20, 50, 200, 50);
            equity.setBounds(20, 100, 200, 50);
            gold.setBounds(20, 150, 200, 50);
            bonds.setBounds(20, 200, 200, 50);
            total.setBounds(20, 250, 200, 50);

            emergencyFunds.setFont(new Font("Copperplate", Font.BOLD, 20));
            equity.setFont(new Font("Copperplate", Font.BOLD, 20));
            gold.setFont(new Font("Copperplate", Font.BOLD, 20));
            bonds.setFont(new Font("Copperplate", Font.BOLD, 20));
            total.setFont(new Font("Copperplate", Font.BOLD, 20));

            emergencyFunds.setForeground(Color.WHITE);
            equity.setForeground(Color.WHITE);
            gold.setForeground(Color.WHITE);
            bonds.setForeground(Color.WHITE);
            total.setForeground(Color.WHITE);

            output.add(emergencyFunds);
            output.add(equity);
            output.add(gold);
            output.add(bonds);
            output.add(total);

            Label emergencyFundsText = new Label("₹"+String.valueOf(-RegularPlan.emergency()));
            Label equityText = new Label("₹"+String.valueOf(-RegularPlan.Equity()));
            Label goldText = new Label("₹"+String.valueOf(-RegularPlan.Gold()));
            Label bondsText = new Label("₹"+String.valueOf(-RegularPlan.Bond()));
            Label totalText = new Label("₹"+String.valueOf(-RegularPlan.Total()));

            emergencyFundsText.setFont(new Font("Copperplate", Font.BOLD, 20));
            equityText.setFont(new Font("Copperplate", Font.BOLD, 20));
            goldText.setFont(new Font("Copperplate", Font.BOLD, 20));
            bondsText.setFont(new Font("Copperplate", Font.BOLD, 20));
            totalText.setFont(new Font("Copperplate", Font.BOLD, 20));

            emergencyFundsText.setForeground(new Color(0xFFD700));
            equityText.setForeground(new Color(0xFFD700));
            goldText.setForeground(new Color(0xFFD700));
            bondsText.setForeground(new Color(0xFFD700));
            totalText.setForeground(new Color(0xFFD700));

            emergencyFundsText.setBounds(220, 50, 200, 50);
            equityText.setBounds(220, 100, 200, 50);
            goldText.setBounds(220, 150, 200, 50);
            bondsText.setBounds(220, 200, 200, 50);
            totalText.setBounds(220, 250, 200, 50);

            output.add(emergencyFundsText);
            output.add(equityText);
            output.add(goldText);
            output.add(bondsText);
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
