package com.ConversorDeTemperatura;

public class Converter {
	
	// Conversão de Celsius para Fahrenheit e Kelvin
	static double campoCelsiusDouble;
	static double paraFahrenheitdeCelsius;
	static double paraKelvindeCelsius;
	static String resultadoFahrenheitdeCelsius;
	static String resultadoKelvindeCelsius;
	
	// Conversão de Fahrenheit para Celsius e Kelvin
	static double campoFahrenheitDouble;
	static double paraCelsiusdeFahrenheit;
	static double paraKelvindeFahrenheit;
	static String resultadoCelsiusdeFahrenheit;
	static String resultadoKelvindeFahrenheit;
	
	// Conversão de Kelvin para Celsius e Fahrenheit
	static double campoKelvinDouble;
	static double paraCelsiusdeKelvin;
	static double paraFahrenheitdeKelvin;
	static String resultadoCelsiusdeKelvin;
	static String resultadoFahrenheitdeKelvin;
	
	public static void CelsiusConv() {
		campoCelsiusDouble = Double.parseDouble(ConversorDeTemperatura.campoCelsius);
		paraFahrenheitdeCelsius = campoCelsiusDouble * 9/5 + 32;
		paraKelvindeCelsius = campoCelsiusDouble + 273.15;
		
		resultadoFahrenheitdeCelsius = String.valueOf(paraFahrenheitdeCelsius);
		resultadoKelvindeCelsius = String.valueOf(paraKelvindeCelsius);
	}
	
	public static void FahrenheitConv() {
		campoFahrenheitDouble = Double.parseDouble(ConversorDeTemperatura.campoFahrenheit);
		paraCelsiusdeFahrenheit = (campoFahrenheitDouble - 32) * 5/9;
		paraKelvindeFahrenheit = (campoFahrenheitDouble + 459.67) * 5/9;
		
		resultadoCelsiusdeFahrenheit = String.valueOf(paraCelsiusdeFahrenheit);
		resultadoKelvindeFahrenheit = String.valueOf(paraKelvindeFahrenheit);
	}
	
	public static void KelvinConv() {
		campoKelvinDouble = Double.parseDouble(ConversorDeTemperatura.campoKelvin);
		paraCelsiusdeKelvin = campoKelvinDouble - 273.15;
		paraFahrenheitdeKelvin = campoKelvinDouble * 9/5 - 459.67;
		
		resultadoCelsiusdeKelvin = String.valueOf(paraCelsiusdeKelvin);
		resultadoFahrenheitdeKelvin = String.valueOf(paraFahrenheitdeKelvin);
	}
	
	public static void main(String[] args) {
		
	}

}
