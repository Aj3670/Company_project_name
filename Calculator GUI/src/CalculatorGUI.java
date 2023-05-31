import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame {
    private JTextField num1TextField, num2TextField, resultTextField;

    public CalculatorGUI() {
        setTitle("Scientific Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 350);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));

        JLabel num1Label = new JLabel("First Number:");
        num1TextField = new JTextField();
        JLabel num2Label = new JLabel("Second Number:");
        num2TextField = new JTextField();
        JLabel resultLabel = new JLabel("Result:");
        resultTextField = new JTextField();
        resultTextField.setEditable(false);

        inputPanel.add(num1Label);
        inputPanel.add(num1TextField);
        inputPanel.add(num2Label);
        inputPanel.add(num2TextField);
        inputPanel.add(resultLabel);
        inputPanel.add(resultTextField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4,2));

        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(num1TextField.getText());
                double num2 = Double.parseDouble(num2TextField.getText());
                double result = num1 + num2;
                resultTextField.setText(Double.toString(result));
            }
        });

        JButton subtractButton = new JButton("Subtract");
        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(num1TextField.getText());
                double num2 = Double.parseDouble(num2TextField.getText());
                double result = num1 - num2;
                resultTextField.setText(Double.toString(result));
            }
        });

        JButton multiplyButton = new JButton("Multiply");
        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(num1TextField.getText());
                double num2 = Double.parseDouble(num2TextField.getText());
                double result = num1 * num2;
                resultTextField.setText(Double.toString(result));
            }
        });

        JButton divideButton = new JButton("Divide");
        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(num1TextField.getText());
                double num2 = Double.parseDouble(num2TextField.getText());
                if (num2 != 0) {
                    double result = num1 / num2;
                    resultTextField.setText(Double.toString(result));
                } else {
                    resultTextField.setText("Error: Division by zero");
                }
            }
        });

        JButton sinButton = new JButton("sin");
        sinButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(num1TextField.getText());
                double result = Math.sin(num1);
                resultTextField.setText(Double.toString(result));
            }
        });

        JButton cosButton = new JButton("cos");
        cosButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(num1TextField.getText());
                double result = Math.cos(num1);
                resultTextField.setText(Double.toString(result));
            }
        });

        JButton tanButton = new JButton("tan");
        tanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(num1TextField.getText());
                double result = Math.tan(num1);
                resultTextField.setText(Double.toString(result));
            }
        });
        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);
        buttonPanel.add(sinButton);
        buttonPanel.add(cosButton);
        buttonPanel.add(tanButton);
        
        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

}
