package cronometro;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Cronometro implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton botaoIniciar = new JButton("iniciar");
	JButton botaoParar = new JButton("parar");
	JButton botaoReiniciar = new JButton("reiniciar");
	JLabel timeLabel = new JLabel();
	int tempo = 0;
	int segundos = 0;
	int minutos = 0;
	int horas = 0;
	boolean iniciado = false;
	String string_segundos = String.format("%02d", segundos);
	String string_minutos = String.format("%02d", minutos);
	String string_horas = String.format("%02d", horas);
	
	Timer timer = new Timer(1000, new ActionListener() { //frequencia que conta a milisegundos
		public void actionPerformed(ActionEvent e) { //o que o timer vai fazer a cada 1000 milissegundos
			tempo = tempo + 1000;
			horas = (tempo/3600000);
			minutos = (tempo/60000) % 60; //%60 faz com que o cronometro não mostre números acima de 60
			segundos = (tempo/1000) % 60;
			String string_segundos = String.format("%02d", segundos);
			String string_minutos = String.format("%02d", minutos);
			String string_horas = String.format("%02d", horas);
			
			timeLabel.setText(string_horas + ":" + string_minutos + ":" + string_segundos);
		}
	});
	
	Cronometro(){
		
		timeLabel.setText(string_horas + ":" + string_minutos + ":" + string_segundos);
		timeLabel.setBounds(100,100,400,100);
		timeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
		timeLabel.setBorder(BorderFactory.createTitledBorder("Meu cronômetro"));
		timeLabel.setOpaque(true);
		timeLabel.setBackground(null);
		timeLabel.setHorizontalAlignment(JTextField.CENTER);
		timeLabel.setBackground(Color.decode("#71BF75"));
		
		botaoIniciar.setBounds(150,210,110,50);
		botaoIniciar.setFont(new Font("Arial", Font.PLAIN, 20));
		botaoIniciar.setFocusable(false);
		botaoIniciar.addActionListener(this);
		botaoIniciar.setBackground(Color.decode("#B5FFBA"));
		
		botaoReiniciar.setBounds(350,210,110,50);
		botaoReiniciar.setFont(new Font("Arial", Font.PLAIN, 20));
		botaoReiniciar.setFocusable(false);
		botaoReiniciar.addActionListener(this);
		botaoReiniciar.setBackground(Color.decode("#B5FFBA"));
		
		frame.add(botaoIniciar);
		frame.add(botaoReiniciar);
		frame.add(timeLabel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(620,420);
		frame.setLayout(null);
		frame.setVisible(true); //declarar por ultimo porque se adicionar componentes depois pode não funcionar
		frame.getContentPane().setBackground(Color.decode("#195C1D"));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == botaoIniciar) {
			
			if(iniciado == false) {
				iniciado = true;
				botaoIniciar.setText("parar");
				iniciar();
			} else {
				iniciado = false;
				botaoIniciar.setText("iniciar");
				parar();
			}
		}
		if(e.getSource() == botaoReiniciar) {
			iniciado = false;
			botaoIniciar.setText("iniciar");
			reiniciar();
		}
		
	}
	
	void iniciar() {
		timer.start();
	}
	
	void parar() {
		timer.stop();
	}
	
	void reiniciar() {
		timer.stop();
		tempo = 0;
		segundos = 0;
		minutos = 0;
		horas = 0;
		String string_segundos = String.format("%02d", segundos);
		String string_minutos = String.format("%02d", minutos);
		String string_horas = String.format("%02d", horas);
		
		timeLabel.setText(string_horas + ":" + string_minutos + ":" + string_segundos);
		
	}
	
}
