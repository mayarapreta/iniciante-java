package Calculator;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class calci {

	private JFrame frame;
	private JTextField textvalor;
	
	double firts;
	double second;
	double result;
	
	String operation;
	String answer;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.setBounds(100, 100, 434, 627);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textvalor = new JTextField();
		textvalor.setFont(new Font("Arial", Font.BOLD, 20));
		textvalor.setHorizontalAlignment(SwingConstants.RIGHT);
		textvalor.setBounds(12, 12, 396, 83);
		frame.getContentPane().add(textvalor);
		textvalor.setColumns(10);
		
		JButton btnac = new JButton("AC");
		btnac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Orgr0) {
				
				textvalor.setText(null);
				
			}
		});
		btnac.setFont(new Font("Arial", Font.BOLD, 19));
		btnac.setBounds(12, 127, 86, 83);
		frame.getContentPane().add(btnac);
		
		JButton btnback = new JButton("\uF0E7");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Orgr0) {
				String back = "null";
				if(textvalor.getText().length()>0);
				StringBuilder str = new StringBuilder(textvalor.getText());
				str.deleteCharAt(textvalor.getText().length()-1);
				back = str.toString();
				textvalor.setText(back);
				
			}
		});
		btnback.setFont(new Font("Wingdings", Font.BOLD, 19));
		btnback.setBounds(120, 129, 96, 83);
		frame.getContentPane().add(btnback);
		
		JButton btndividir = new JButton("/");
		btndividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Orgr0) {
				 firts = Double.parseDouble(textvalor.getText());
				 textvalor.setText("");
				 operation= "btndividir" ;
				
		
			}
		});
		btndividir.setFont(new Font("Arial", Font.BOLD, 19));
		btndividir.setBounds(322, 127, 86, 83);
		frame.getContentPane().add(btndividir);
		
		JButton btnporcento = new JButton("%");
		btnporcento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Orgr0) {
				 firts = Double.parseDouble(textvalor.getText());
				 textvalor.setText("");
				 operation= "btnporcento" ;
				
			}
		});
		btnporcento.setFont(new Font("Arial", Font.BOLD, 19));
		btnporcento.setBounds(226, 127, 86, 83);
		frame.getContentPane().add(btnporcento);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Orgr0) {
				String number = textvalor.getText()+btn7.getText();
				textvalor.setText(number);
			}
		});
		btn7.setFont(new Font("Arial", Font.BOLD, 19));
		btn7.setBounds(12, 222, 86, 83);
		frame.getContentPane().add(btn7); 
	
	
		JButton btn4 = new JButton("4");
       btn4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent Orgr0) {
			String	number = textvalor.getText()+btn4.getText();
			textvalor.setText(number); 
			}
			
			});
		
		btn4.setFont(new Font("Arial", Font.BOLD, 19));
		btn4.setBounds(12, 313, 86, 83);
		frame.getContentPane().add(btn4);
			
	
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent Orgr0) {
			String	number = textvalor.getText()+btn1.getText();
			textvalor.setText(number);
				
			}
		});
		btn1.setFont(new Font("Arial", Font.BOLD, 19));
		btn1.setBounds(12, 403, 86, 83);
		frame.getContentPane().add(btn1);
		
		JButton btnvirgula = new JButton(".");
		btnvirgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Orgr0) {
				String number = textvalor.getText()+btnvirgula.getText();
			     textvalor.setText(number);
				
			}
		});
		btnvirgula.setFont(new Font("Arial", Font.BOLD, 19));
		btnvirgula.setBounds(12, 495, 86, 83);
		frame.getContentPane().add(btnvirgula);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Orgr0) {
    String number = textvalor.getText()+btn8.getText();
     textvalor.setText(number);
			}
		});
		btn8.setFont(new Font("Arial", Font.BOLD, 19));
		btn8.setBounds(120, 222, 86, 83);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Orgr0) {
				String number = textvalor.getText()+btn9.getText();
				textvalor.setText(number);
			}
		});
		btn9.setFont(new Font("Arial", Font.BOLD, 19));
		btn9.setBounds(226, 222, 86, 83);
		frame.getContentPane().add(btn9);
		
		JButton btnmultiplicacao = new JButton("*");
		btnmultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Orgr0) {
				 firts = Double.parseDouble(textvalor.getText());
				 textvalor.setText("");
				 operation= "btnmultiplicacao" ;
				
			}
		});
		btnmultiplicacao.setFont(new Font("Arial", Font.BOLD, 19));
		btnmultiplicacao.setBounds(322, 222, 86, 83);
		frame.getContentPane().add(btnmultiplicacao);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Orgr0) {
				String number = textvalor.getText()+btn5.getText();
				textvalor.setText(number);
			}
		});
		btn5.setFont(new Font("Arial", Font.BOLD, 19));
		btn5.setBounds(120, 313, 86, 83);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Orgr0) {
				String number = textvalor.getText()+btn6.getText();
				textvalor.setText(number);
			}
		});
		btn6.setFont(new Font("Arial", Font.BOLD, 19));
		btn6.setBounds(226, 313, 86, 83);
		frame.getContentPane().add(btn6);
		
		JButton btnmenos = new JButton("-");
		btnmenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Orgr0) {
				 firts = Double.parseDouble(textvalor.getText());
				 textvalor.setText("");
				 operation= "btnmenos" ;
				
				
			}
		});
		btnmenos.setFont(new Font("Arial", Font.BOLD, 19));
		btnmenos.setBounds(322, 313, 86, 83);
		frame.getContentPane().add(btnmenos);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Orgr0) {
				String number = textvalor.getText()+btn2.getText();
				textvalor.setText(number);
			}
		});
		btn2.setFont(new Font("Arial", Font.BOLD, 19));
		btn2.setBounds(120, 403, 86, 83);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Orgr0) {
				String number = textvalor.getText()+btn3.getText();
				textvalor.setText(number);
			}
		});
		btn3.setFont(new Font("Arial", Font.BOLD, 19));
		btn3.setBounds(226, 403, 86, 83);
		frame.getContentPane().add(btn3);
		
		JButton btnmais = new JButton("+");
		btnmais.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent Orgr0) {
				 firts = Double.parseDouble(textvalor.getText());
				 textvalor.setText("");
				 operation= "btnmais" ;
				
			}
		});
		btnmais.setFont(new Font("Arial", Font.BOLD, 19));
		btnmais.setBounds(322, 403, 86, 83);
		frame.getContentPane().add(btnmais);
		
		JButton btnzero = new JButton("0");
		btnzero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Orgr0) {
				String number = textvalor.getText()+btnzero.getText();
				textvalor.setText(number);
			}
		});
		btnzero.setFont(new Font("Arial", Font.BOLD, 19));
		btnzero.setBounds(120, 495, 86, 83);
		frame.getContentPane().add(btnzero);
		
		JButton btnigual = new JButton("=");
		btnigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Orgr0) {
				
			String  answer;
			 second = Double.parseDouble(textvalor.getText());
			 
			if(operation == "btnmais") {
			
			result = firts+second;
			answer = String.format("%.2f", result);
			textvalor.setText(answer);
		}
			else if(operation == "btnmenos")
			{
				result = firts - second;
				answer = String.format("%.2f", result);
				textvalor.setText(answer);
				
			} else if( operation == "btnmultiplicacao")
			{

				result =firts*second;
				answer = String.format("%.2f", result);
				textvalor.setText(answer);
				
			} else if (operation == "btndividir") 
			{
				result = firts/second;
				answer = String.format("%.2f", result);
				textvalor.setText(answer);
				
			} else if (operation == "btnporcento")
			{
				result =firts%second;
				answer = String.format("%.2f", result);
				textvalor.setText(answer);
			}
			
			
				
			}
		});
		btnigual.setFont(new Font("Arial", Font.BOLD, 19));
		btnigual.setBounds(236, 495, 160, 83);
		frame.getContentPane().add(btnigual);
	}
}
