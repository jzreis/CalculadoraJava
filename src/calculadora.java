import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class calculadora extends JFrame implements ActionListener{
	
	JTextField visor = new JTextField();
	JButton[] buttons = new JButton[16];
	int cont=1;
	String sinal="",numero1="",numero2="";
	double numeroAtual=0,proxNumero,resultado;
	public calculadora() {
		super("Calculator");
		frame();
		visor();
		buttons();

	}
	
	
	public void frame() {
		
		this.setSize(400,600);
		this.getContentPane().setBackground(new Color(28, 28, 28));
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setLayout(null);
	}
	
	public void visor() {
		
		visor.setBounds(0,0,400,80);
		visor.setBackground(new Color(60,60,60));
		visor.setFont(new Font("Arial", Font.BOLD, 30));
		visor.setEnabled(false);
		this.setVisible(true);
		this.add(visor);
	}
	
	public void buttons() {
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].setBackground(new Color(60,60,60));
			buttons[i].setFont(new Font("Arial", Font.BOLD, 50));
			buttons[i].setForeground(new Color(255,255,255));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
			this.add(buttons[i]);
			this.setVisible(true);
			
		}
		//posicoes
		int l1=5,l2=105,l3=205,l4=305;
		int c1=90,c2=205,c3=320,c4=435;
		int comp=110,larg=90;
		
		buttons[0].setBounds(l1,c1,larg,comp);
		buttons[0].setText("7");
		buttons[1].setBounds(l2,c1,larg,comp);
		buttons[1].setText("8");
		buttons[2].setBounds(l3,c1,larg,comp);
		buttons[2].setText("9");
		buttons[3].setBounds(l4,c1,larg,comp);
		buttons[3].setText("/");
		buttons[4].setBounds(l1,c2,larg,comp);
		buttons[4].setText("4");
		buttons[5].setBounds(l2,c2,larg,comp);
		buttons[5].setText("5");
		buttons[6].setBounds(l3,c2,larg,comp);
		buttons[6].setText("6");
		buttons[7].setBounds(l4,c2,larg,comp);
		buttons[7].setText("*");
		buttons[8].setBounds(l1,c3,larg,comp);
		buttons[8].setText("1");
		buttons[9].setBounds(l2,c3,larg,comp);
		buttons[9].setText("2");
		buttons[10].setBounds(l3,c3,larg,comp);
		buttons[10].setText("3");
		buttons[11].setBounds(l4,c3,larg,comp);
		buttons[11].setText("-");
		buttons[12].setBounds(l1,c4,larg,comp);
		buttons[12].setText("0");
		buttons[13].setBounds(l2,c4,larg,comp);
		buttons[13].setText(".");
		buttons[14].setBounds(l3,c4,larg,comp);
		buttons[14].setText("=");
		buttons[15].setBounds(l4,c4,larg,comp);
		buttons[15].setText("+");
	}
		
	public void actionPerformed(ActionEvent e) {		
		if(e.getSource()==buttons[0]) {
			if(cont==1) {
				numero1+="7";
				visor.setText(numero1);
			}else {
				numero2+="7";
				visor.setText(numero2);
			}
			
		}if(e.getSource()==buttons[1]) {
			if(cont==1) {
				numero1+="8";
				visor.setText(numero1);
			}else {
				numero2+="8";
				visor.setText(numero2);
			}
		}if(e.getSource()==buttons[2]) {
			if(cont==1) {
				numero1+="9";
				visor.setText(numero1);
			}else {
				numero2+="9";
				visor.setText(numero2);
			}
		}if(e.getSource()==buttons[3]) {
			sinal="dividir";
			cont++;
			numero1="";
			visor.setText("/");
		}if(e.getSource()==buttons[4]) {
			if(cont==1) {
				numero1+="4";
				visor.setText(numero1);
			}else {
				numero2+="4";
				visor.setText(numero2);
			}
		}if(e.getSource()==buttons[5]) {
			if(cont==1) {
				numero1+="5";
				visor.setText(numero1);
			}else {
				numero2+="5";
				visor.setText(numero2);
			}
		}if(e.getSource()==buttons[6]) {
			if(cont==1) {
				numero1+="6";
				visor.setText(numero1);
			}else {
				numero2+="6";
				visor.setText(numero2);
			}
		}if(e.getSource()==buttons[7]) {
			sinal="multiplicar";
			cont++;
			visor.setText("*");
		}if(e.getSource()==buttons[8]) {
			if(cont==1) {
				numero1+="1";
				visor.setText(numero1);
			}else {
				numero2+="1";
				visor.setText(numero2);
			}
		}if(e.getSource()==buttons[9]) {
			if(cont==1) {
				numero1+="2";
				visor.setText(numero1);
			}else {
				numero2+="2";
				visor.setText(numero2);
			}
		}if(e.getSource()==buttons[10]) {
			if(cont==1) {
				numero1+="3";
				visor.setText(numero1);
			}else {
				numero2+="3";
				visor.setText(numero2);
			}
		}if(e.getSource()==buttons[11]) {
			sinal="subtrair";
			cont++;
			visor.setText("-");
		}if(e.getSource()==buttons[12]) {
			if(cont==1) {
				numero1+="0";
				visor.setText(numero1);
			}else {
				numero2+="0";
				visor.setText(numero2);
			}
		}if(e.getSource()==buttons[13]) {
			if(cont==1) {
				numero1+=".";
				visor.setText(numero1);
			}else {
				numero2+=".";
				visor.setText(numero2);
			}
		}if(e.getSource()==buttons[14]) {
			if(sinal.equals("soma")) {
				double num1=Double.parseDouble(numero1);
				double num2=Double.parseDouble(numero2);
				
				resultado=num1+num2;
				visor.setText(""+resultado);
				numero1="";
				numero2="";
				cont=1;
			}else if(sinal.equals("subtrair")) {
				double num1=Double.parseDouble(numero1);
				double num2=Double.parseDouble(numero2);
				
				resultado=num1-num2;
				visor.setText(""+resultado);
				numero1="";
				numero2="";
				cont=1;
			}else if(sinal.equals("dividir")) {
				double num1=Double.parseDouble(numero1);
				double num2=Double.parseDouble(numero2);
				
				resultado=num1*num2;
				visor.setText(""+resultado);
				numero1="";
				numero2="";
				cont=1;
			}else if(sinal.equals("multiplicar")) {
				double num1=Double.parseDouble(numero1);
				double num2=Double.parseDouble(numero2);
				
				resultado=num1*num2;
				visor.setText(""+resultado);
				numero1="";
				numero2="";
				cont=1;
			}
			
		}if(e.getSource()==buttons[15]) {
			sinal="soma";
			cont++;
			visor.setText("+");
		}
		
		
	}
}
