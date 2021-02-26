package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.*;

/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class AplicacionGrafica extends JFrame {

	private JPanel contentPane;

	public AplicacionGrafica() {
		setTitle("Tasques UD19");
		setBounds(300, 300, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

	}

	public void ejercicio1() {
		JLabel etiqueta = new JLabel("Escribe un nombre para saludar");
		etiqueta.setBounds(250, 10, 200, 40);
		JTextField texto = new JTextField();
		texto.setBounds(250, 50, 200, 40);
		JButton boton = new JButton();
		boton.setBounds(250, 100, 100, 40);
		boton.setText("¡Saludar!");
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "¡Hola " + texto.getText() + "!");

			}
		});
		contentPane.add(etiqueta);
		contentPane.add(texto);
		contentPane.add(boton);
		setVisible(true);
	}

	public void ejercicio2() {
		JLabel etiqueta = new JLabel("Escribe el titulo de una pelicula");
		etiqueta.setBounds(10, 10, 200, 40);
		JTextField texto = new JTextField();
		texto.setBounds(10, 50, 200, 40);
		JComboBox<String> lista = new JComboBox<>();
		lista.setBounds(250, 100, 100, 40);
		JButton boton = new JButton();
		boton.setBounds(10, 100, 100, 40);
		boton.setText("Añadir");
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (!texto.getText().equals("")) {
					lista.addItem(texto.getText());
				}

			}
		});
		contentPane.add(etiqueta);
		contentPane.add(texto);
		contentPane.add(boton);
		contentPane.add(lista);
		setVisible(true);
	}

	public void ejercicio3() {
		JRadioButton radio1 = new JRadioButton("Windows", true);
		JRadioButton radio2 = new JRadioButton("Linux", false);
		JRadioButton radio3 = new JRadioButton("Mac", false);
		radio1.setBounds(10, 20, 100, 20);
		radio2.setBounds(10, 50, 100, 20);
		radio3.setBounds(10, 80, 100, 20);
		contentPane.add(radio1);
		contentPane.add(radio2);
		contentPane.add(radio3);
		ButtonGroup radioGroup = new ButtonGroup();
		radioGroup.add(radio1);
		radioGroup.add(radio2);
		radioGroup.add(radio3);

		JCheckBox programacion = new JCheckBox("Programacion", false);
		JCheckBox diseño = new JCheckBox("Diseño Grafico", false);
		JCheckBox admin = new JCheckBox("Administración", false);
		programacion.setBounds(10, 130, 100, 20);
		diseño.setBounds(10, 160, 100, 20);
		admin.setBounds(10, 190, 100, 20);
		contentPane.add(programacion);
		contentPane.add(diseño);
		contentPane.add(admin);

		JSlider slider = new JSlider(0, 10);
		slider.setBounds(10, 230, 100, 40);
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(1);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		contentPane.add(slider);

		JButton boton = new JButton("Añadir");
		boton.setBounds(10, 320, 100, 20);
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String sistema;
				String especialidad = "";
				if (radio1.isSelected()) {
					sistema = "Windows";
				} else if (radio2.isSelected()) {
					sistema = "Linux";
				} else {
					sistema = "Mac";
				}
				if (programacion.isSelected()) {
					especialidad = "Programacion ";
				}
				if (diseño.isSelected()) {
					especialidad += " Diseño Grafico ";
				}
				if (admin.isSelected()) {
					especialidad += " Administración";
				}
				JOptionPane.showMessageDialog(null, "Sistema operativo: " + sistema + "\nEspecialidad: " + especialidad
						+ "\nHoras en el ordenador: " + slider.getValue());

			}
		});
		contentPane.add(boton);
		setVisible(true);
	}

	public void ejercicio4() {
		JTextField operando1 = new JTextField();
		JTextField operando2 = new JTextField();
		JTextField resultado = new JTextField();

		JButton suma = new JButton("+");
		JButton resta = new JButton("-");
		JButton multi = new JButton("*");
		JButton divi = new JButton("/");
		JButton igual = new JButton("=");
		JButton salir = new JButton("Salir");

		JLabel errorOperante = new JLabel("No hay un operante seleccionado");
		JLabel errorLetra = new JLabel("No puedes poner letras en los operantes");
		JLabel operante = new JLabel();
		JLabel cerrar = new JLabel("Estas seguro?");

		operando1.setBounds(40, 10, 50, 40);
		operando2.setBounds(140, 10, 50, 40);
		resultado.setBounds(190, 10, 50, 40);
		resultado.setEditable(false);

		suma.setBounds(10, 100, 50, 50);
		resta.setBounds(60, 100, 50, 50);
		multi.setBounds(110, 100, 50, 50);
		divi.setBounds(160, 100, 50, 50);
		igual.setBounds(210, 100, 50, 50);
		salir.setBounds(260, 100, 70, 50);
		operante.setBounds(90, 10, 50, 50);

		suma.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				operante.setText("+");
			}
		});
		resta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				operante.setText("-");
			}
		});
		multi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				operante.setText("*");
			}
		});
		divi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				operante.setText("/");
			}
		});
		igual.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					double num1 = Double.parseDouble(operando1.getText());
					double num2 = Double.parseDouble(operando2.getText());
					double total;
					switch (operante.getText()) {
					case "+":
						total = num1+num2;
						resultado.setText(String.valueOf(total));
						break;
					case "-":
						total = num1-num2;
						resultado.setText(String.valueOf(total));
						break;
					case "*":
						total = num1*num2;
						resultado.setText(String.valueOf(total));
						break;
					case "/":
						total = num1/num2;
						resultado.setText(String.valueOf(total));
						break;
					default:
						errorOperante.setBounds(10, 70, 200, 40);
					}
				} catch(Exception e1){
					errorLetra.setBounds(10, 70, 200, 40);
				}
					

			}
		});
		salir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cerrar.setBounds(10,70,100,40);
				salir.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});

			}
		});

		contentPane.add(operando1);
		contentPane.add(operando2);
		contentPane.add(resultado);
		contentPane.add(suma);
		contentPane.add(resta);
		contentPane.add(multi);
		contentPane.add(divi);
		contentPane.add(igual);
		contentPane.add(salir);
		contentPane.add(operante);
		contentPane.add(cerrar);
		contentPane.add(errorOperante);
		setVisible(true);
	}

}
