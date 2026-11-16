import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.Font;

public class Main extends JFrame implements ActionListener {

    public Main() {
        super("Calculator");
    }
     
    public JLabel label;
    public JFrame frame;
    public JPanel panel;
    public JPanel panel2;
    public JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonAC,buttonPlus,buttonMinus,buttonMultiply,buttonDivide, buttonEquals;
    public String operation;
    public int num1, num2, result;
        {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1600, 9000);
        frame.setVisible(true);
        
        panel2 = new JPanel();
        frame.add(panel2,BorderLayout.NORTH);
        label = new JLabel("");
        label.setFont(new Font("Arial", Font.PLAIN, 65));
        panel2.add(label);
        panel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel2.setLayout(new GridLayout(2, 1, 10, 10));

        panel = new JPanel();
        frame.add(panel);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setLayout(new GridLayout(0,4, 5, 5));

        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        button0 = new JButton("0");
        buttonAC = new JButton("AC");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonMultiply = new JButton("*");
        buttonDivide = new JButton("/");
        buttonEquals = new JButton("=");

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);
        buttonAC.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonEquals.addActionListener(this);

        panel.add(button7);panel.add(button8);panel.add(button9);panel.add(buttonDivide);
        panel.add(button4);panel.add(button5);panel.add(button6);panel.add(buttonMultiply);
        panel.add(button1);panel.add(button2);panel.add(button3);panel.add(buttonPlus);
        panel.add(buttonAC);panel.add(button0);panel.add(buttonEquals);panel.add(buttonMinus);
        
    }
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() == button1) 
           label.setText(label.getText() + "1");
        if (e.getSource() == button2) 
            label.setText(label.getText() + "2");
        if (e.getSource() == button3) 
            label.setText(label.getText() + "3");
        if (e.getSource() == button4) 
            label.setText(label.getText() + "4");
        if (e.getSource() == button5) 
            label.setText(label.getText() + "5");
        if (e.getSource() == button6) 
            label.setText(label.getText() + "6");
        if (e.getSource() == button7)  
            label.setText(label.getText() + "7");
        if (e.getSource() == button8) 
            label.setText(label.getText() + "8");
        if (e.getSource() == button9) 
            label.setText(label.getText() + "9");
        if (e.getSource() == button0) 
            label.setText(label.getText() + "0");
        if (e.getSource() == buttonAC) 
            label.setText("");
        if (e.getSource() == buttonPlus){
            num1 = Integer.parseInt(label.getText());
            operation = "+";
            label.setText("");}
        if (e.getSource() == buttonMinus){
            num1 = Integer.parseInt(label.getText());
            operation = "-";
            label.setText("");}
        if (e.getSource() == buttonMultiply){
            num1 = Integer.parseInt(label.getText());
            operation = "*";
            label.setText("");}
        if (e.getSource() == buttonDivide){
            num1 = Integer.parseInt(label.getText());
            operation = "/";
            label.setText("");}
        if (e.getSource() == buttonEquals) {
            num2 = Integer.parseInt(label.getText());
            if (operation == "+") 
                result = num1 + num2;
                label.setText(Integer.toString(result));
            if (operation == "-") 
                result = num1 - num2;
                label.setText(Integer.toString(result));
            if (operation == "*") 
                result = num1 * num2;
                label.setText(Integer.toString(result));
            if (operation == "/") 
                result = num1 / num2;
                label.setText(Integer.toString(result));}
            }
    public static void main(String[] args) {
       new Main();
        }
}
    
