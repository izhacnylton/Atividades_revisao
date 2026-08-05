package projeto09;

public class ConversorTemperatura {
	
	public double converterCelsius(double tC){
		return (tC * 1.8) + 32;
		}
		
	public double converterFahrenheit(double tF){
		return (tF - 32) / 1.8;
		}
}
