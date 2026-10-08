package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import model.Calculadora;

public class TelaCalculadora {

    public static void main(String[] args) {
        JFrame janela=new JFrame("Calculadora");
        JTextField visor=new JTextField();
        JButton btnZero=new JButton("0");
        JButton btnUm=new JButton("1");
        JButton btnDois=new JButton("2"); 
        JButton btnTres=new JButton("3");
        JButton btnQuatro=new JButton("4");
        JButton btnCinco=new JButton("5");
        JButton btnSeis=new JButton("6");
        JButton btnSete=new JButton("7");
        JButton btnOito=new JButton("8");
        JButton btnNove=new JButton("9");
        JButton btnSoma=new JButton("+");
        JButton btnSubr=new JButton("-");
        JButton btnMult=new JButton("*");
        JButton btnDiv=new JButton("/");
        JButton btnIgual=new JButton("=");
        JButton btnApagar=new JButton("C");
        JPanel painelBotoes=new JPanel();
        painelBotoes.setLayout(new GridLayout(4,4));
        painelBotoes.add(btnZero);
        painelBotoes.add(btnUm);
        painelBotoes.add(btnDois);
        painelBotoes.add(btnTres);
        painelBotoes.add(btnQuatro);
        painelBotoes.add(btnCinco);
        painelBotoes.add(btnSeis);
        painelBotoes.add(btnSete);
        painelBotoes.add(btnOito);
        painelBotoes.add(btnNove);
        painelBotoes.add(btnSoma);
        painelBotoes.add(btnSubr);
        painelBotoes.add(btnMult);
        painelBotoes.add(btnDiv);
        painelBotoes.add(btnIgual);
        painelBotoes.add(btnApagar);
        janela.add(painelBotoes);
        janela.add(visor);
        janela.setLayout(new BorderLayout());
        janela.add(visor,BorderLayout.NORTH);
        janela.add(painelBotoes,BorderLayout.CENTER);
        janela.setSize(300,400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

        
            
    
        btnZero.addActionListener(e ->visor.setText(visor.getText()+ "0"));
        btnUm.addActionListener(e ->visor.setText(visor.getText()+ "1"));
        btnDois.addActionListener(e ->visor.setText(visor.getText()+ "2"));
        btnTres.addActionListener(e ->visor.setText(visor.getText()+ "3"));
        btnQuatro.addActionListener(e ->visor.setText(visor.getText()+ "4"));
        btnCinco.addActionListener(e ->visor.setText(visor.getText()+ "5"));
        btnSeis.addActionListener(e ->visor.setText(visor.getText()+ "6"));
        btnSete.addActionListener(e ->visor.setText(visor.getText()+ "7"));
        btnOito.addActionListener(e ->visor.setText(visor.getText()+ "8"));
        btnNove.addActionListener(e ->visor.setText(visor.getText()+ "9"));

        final double[] num1 = {0};
        final String[] operacao = {""};
       
        btnSoma.addActionListener(e -> {
            if (!visor.getText().isEmpty()) {
                num1[0] = Double.parseDouble(visor.getText());
                operacao[0] = "+";
                visor.setText("");
            }
        });

        btnSubr.addActionListener(e -> {
            if (!visor.getText().isEmpty()) {
                num1[0] = Double.parseDouble(visor.getText());
                operacao[0] = "-";
                visor.setText("");
            }
        });

        btnMult.addActionListener(e -> {
            if (!visor.getText().isEmpty()) {
                num1[0] = Double.parseDouble(visor.getText());
                operacao[0] = "*";
                visor.setText("");
            }
        });

        btnDiv.addActionListener(e -> {
            if (!visor.getText().isEmpty()) {
                num1[0] = Double.parseDouble(visor.getText());
                operacao[0] = "/";
                visor.setText("");
            }
        });

        
        btnApagar.addActionListener(e -> visor.setText(""));


        btnIgual.addActionListener(e -> {
            if (!visor.getText().isEmpty() && !operacao[0].isEmpty()) {
                try{
                int n1 = (int) num1[0];
                int n2 = Integer.parseInt(visor.getText());

                Calculadora calc = new Calculadora(n1,n2);
                double resultado = 0;

                switch (operacao[0]) {
                    case "+":
                        resultado = calc.Somar();
                        break;
                    case "-":
                        resultado = calc.Subtrair();
                        break;
                    case "*":
                        resultado = calc.Mult();
                        break;
                    case "/":
                        resultado = calc.Divisao(n1,n2);
                        break;
                }
        
                if (resultado == (long) resultado) {
                visor.setText(String.format("%d", (long) resultado));
            } else {
                visor.setText(String.valueOf(resultado));
            }

            operacao[0] = ""; 
        } catch (NumberFormatException ex) {
            visor.setText("Erro");
        }

            }
        
        
    });
}
}