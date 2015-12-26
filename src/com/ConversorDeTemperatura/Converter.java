package com.ConversorDeTemperatura;

public class Converter {
	
	// Conversão de Celsius para Fahrenheight e Kelvin
	static int campoCelsiusInt;
	static int paraFahrenheightdeCelsius;
	static double paraKelvindeCelsius;
	static String resultadoFahrenheightdeCelsius;
	static String resultadoKelvindeCelsius;
	
	// Conversão de Fahrenheight para Celsius e Kelvin
	static int campoFahrenheightInt;
	static int paraCelsiusdeFahrenheight;
	static double paraKelvindeFahrenheight;
	static String resultadoCelsiusdeFahrenheight;
	static String resultadoKelvindeFahrenheight;
	
	// Conversão de Kelvin para Celsius e Fahrenheight
	static double campoKelvinDouble;
	static double paraCelsiusdeKelvin;
	static double paraFahrenheightdeKelvin;
	static String resultadoCelsiusdeKelvin;
	static String resultadoFahrenheightdeKelvin;
	
	public static void CelsiusConv() {
		campoCelsiusInt = Integer.parseInt(ConversorDeTemperatura.campoCelsius);
		paraFahrenheightdeCelsius = campoCelsiusInt * 9/5 + 32;
		paraKelvindeCelsius = campoCelsiusInt + 273.15;
		
		resultadoFahrenheightdeCelsius = String.valueOf(paraFahrenheightdeCelsius);
		resultadoKelvindeCelsius = String.valueOf(paraKelvindeCelsius);
	}
	
	public static void FahrenheightConv() {
		campoFahrenheightInt = Integer.parseInt(ConversorDeTemperatura.campoFahrenheight);
		paraCelsiusdeFahrenheight = (campoFahrenheightInt - 32) * 5/9;
		paraKelvindeFahrenheight = (campoFahrenheightInt + 459.67) * 5/9;
		
		resultadoCelsiusdeFahrenheight = String.valueOf(paraCelsiusdeFahrenheight);
		resultadoKelvindeFahrenheight = String.valueOf(paraKelvindeFahrenheight);
	}
	
	public static void KelvinConv() {
		campoKelvinDouble = Double.parseDouble(ConversorDeTemperatura.campoKelvin);
		paraCelsiusdeKelvin = campoKelvinDouble - 273.15;
		paraFahrenheightdeKelvin = campoKelvinDouble * 9/5 - 459.67;
		
		resultadoCelsiusdeKelvin = String.valueOf(paraCelsiusdeKelvin);
		resultadoFahrenheightdeKelvin = String.valueOf(paraFahrenheightdeKelvin);
	}
	
	public static void main(String[] args) {
		
	}

}
