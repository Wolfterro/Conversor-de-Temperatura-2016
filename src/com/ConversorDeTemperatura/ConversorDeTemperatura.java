package com.ConversorDeTemperatura;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConversorDeTemperatura extends JFrame {
	
	private String versão = "1.0";

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPanel panel;
	private JRadioButton rdbtnCelsius;
	private JRadioButton rdbtnFahrenheight;
	private JRadioButton rdbtnKelvin;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPanel panel_1;
	private JButton btnConverter;
	private String selecionado;
	
	static String campoCelsius;
	static String campoFahrenheight;
	static String campoKelvin;
	
	/*
	 * Método principal do programa e seleção de aparência do programa de acordo com as janelas do sistema
	 */
	
	public static void main(String[] args) {
		
		try {
		      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		    } catch (ClassNotFoundException e) {
		      e.printStackTrace();
		    } catch (InstantiationException e) {
		      e.printStackTrace();
		    } catch (IllegalAccessException e) {
		      e.printStackTrace();
		    } catch (UnsupportedLookAndFeelException e) {
		      e.printStackTrace();
		    }
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorDeTemperatura frame = new ConversorDeTemperatura();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/*
	 * Método do programa e criação do JFrame
	 */
	
	public ConversorDeTemperatura() {
		setIconImage(new ImageIcon(ConversorDeTemperatura.class.getResource("img/ctemp_icon.png")).getImage());
		setResizable(false);
		setTitle("Conversor de Temperatura 2016 - Versão " + versão);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Temperaturas", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblTemperaturaEmCelsius = new JLabel("Temperatura em Celsius:");
		GridBagConstraints gbc_lblTemperaturaEmCelsius = new GridBagConstraints();
		gbc_lblTemperaturaEmCelsius.anchor = GridBagConstraints.WEST;
		gbc_lblTemperaturaEmCelsius.insets = new Insets(0, 0, 5, 5);
		gbc_lblTemperaturaEmCelsius.gridx = 0;
		gbc_lblTemperaturaEmCelsius.gridy = 0;
		panel.add(lblTemperaturaEmCelsius, gbc_lblTemperaturaEmCelsius);
		
		selecionado = "Celsius";	// Inicialmente selecionado
		
		// Celsius
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblTemperaturaEmFahrenheight = new JLabel("Temperatura em Fahrenheight:");
		GridBagConstraints gbc_lblTemperaturaEmFahrenheight = new GridBagConstraints();
		gbc_lblTemperaturaEmFahrenheight.anchor = GridBagConstraints.WEST;
		gbc_lblTemperaturaEmFahrenheight.insets = new Insets(0, 0, 5, 5);
		gbc_lblTemperaturaEmFahrenheight.gridx = 0;
		gbc_lblTemperaturaEmFahrenheight.gridy = 1;
		panel.add(lblTemperaturaEmFahrenheight, gbc_lblTemperaturaEmFahrenheight);
		
		// Fahrenheight
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTemperaturaEmKelvin = new JLabel("Temperatura em Kelvin:");
		GridBagConstraints gbc_lblTemperaturaEmKelvin = new GridBagConstraints();
		gbc_lblTemperaturaEmKelvin.anchor = GridBagConstraints.WEST;
		gbc_lblTemperaturaEmKelvin.insets = new Insets(0, 0, 0, 5);
		gbc_lblTemperaturaEmKelvin.gridx = 0;
		gbc_lblTemperaturaEmKelvin.gridy = 2;
		panel.add(lblTemperaturaEmKelvin, gbc_lblTemperaturaEmKelvin);
		
		// Kelvin
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 2;
		panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Convers\u00E3o Inicial", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		contentPane.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		rdbtnCelsius = new JRadioButton("Celsius");
		rdbtnCelsius.setSelected(true);
		rdbtnCelsius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selecionado = "Celsius";
				textField.setEditable(true);
				textField_1.setEditable(false);
				textField_2.setEditable(false);
				
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
			}
		});
		GridBagConstraints gbc_rdbtnCelsius = new GridBagConstraints();
		gbc_rdbtnCelsius.anchor = GridBagConstraints.WEST;
		gbc_rdbtnCelsius.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnCelsius.gridx = 0;
		gbc_rdbtnCelsius.gridy = 0;
		panel_1.add(rdbtnCelsius, gbc_rdbtnCelsius);
		buttonGroup.add(rdbtnCelsius);
		
		rdbtnFahrenheight = new JRadioButton("Fahrenheight");
		rdbtnFahrenheight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecionado = "Fahrenheight";
				textField.setEditable(false);
				textField_1.setEditable(true);
				textField_2.setEditable(false);
				
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
			}
		});
		GridBagConstraints gbc_rdbtnFahrenheight = new GridBagConstraints();
		gbc_rdbtnFahrenheight.anchor = GridBagConstraints.WEST;
		gbc_rdbtnFahrenheight.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnFahrenheight.gridx = 0;
		gbc_rdbtnFahrenheight.gridy = 1;
		panel_1.add(rdbtnFahrenheight, gbc_rdbtnFahrenheight);
		buttonGroup.add(rdbtnFahrenheight);
		
		rdbtnKelvin = new JRadioButton("Kelvin");
		rdbtnKelvin.setActionCommand("Kelvin");
		rdbtnKelvin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecionado = "Kelvin";
				textField.setEditable(false);
				textField_1.setEditable(false);
				textField_2.setEditable(true);
				
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
			}
		});
		GridBagConstraints gbc_rdbtnKelvin = new GridBagConstraints();
		gbc_rdbtnKelvin.anchor = GridBagConstraints.WEST;
		gbc_rdbtnKelvin.gridx = 0;
		gbc_rdbtnKelvin.gridy = 2;
		panel_1.add(rdbtnKelvin, gbc_rdbtnKelvin);
		buttonGroup.add(rdbtnKelvin);
		
		btnConverter = new JButton("Converter!");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selecionado == null) {
					JOptionPane.showMessageDialog(null, "Por favor, selecione uma conversão inicial e tente novamente.");
				}
				else if (selecionado == "Celsius") {
					campoCelsius = textField.getText();
					Converter.CelsiusConv();
					textField_1.setText(Converter.resultadoFahrenheightdeCelsius);
					textField_2.setText(Converter.resultadoKelvindeCelsius);
				}
				else if (selecionado == "Fahrenheight") {
					campoFahrenheight = textField_1.getText();
					Converter.FahrenheightConv();
					textField.setText(Converter.resultadoCelsiusdeFahrenheight);
					textField_2.setText(Converter.resultadoKelvindeFahrenheight);
				}
				else if (selecionado == "Kelvin") {
					campoKelvin = textField_2.getText();
					Converter.KelvinConv();
					textField.setText(Converter.resultadoCelsiusdeKelvin);
					textField_1.setText(Converter.resultadoFahrenheightdeKelvin);
				}
				else {
					JOptionPane.showMessageDialog(null, "Ocorreu um erro! Encerre o programa e tente novamente!");
				}
			}
		});
		GridBagConstraints gbc_btnConverter = new GridBagConstraints();
		gbc_btnConverter.fill = GridBagConstraints.BOTH;
		gbc_btnConverter.gridx = 0;
		gbc_btnConverter.gridy = 2;
		contentPane.add(btnConverter, gbc_btnConverter);
	}

}