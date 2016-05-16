package model;

public class Calculadora {
	
	public double calcIMC(double peso, double altura){
		 
		altura *= altura;
		return peso / altura;
	
	}
	
	public String calcCond(double imc){
			String c = "";
		if (imc < 16){
				c = "Baixo peso muito grave";
			} else if (imc > 16 && imc < 16.99){
				c = "Baixo peso grave";
			} else if (imc > 17 && imc < 18.49){
				c = "Baixo peso";
			} else if (imc > 18.50 && imc < 24.99){
				c = "Peso normal";
			} else if (imc > 24 && imc < 30){
				c = "Sobrepeso";
			} else if (imc > 30 && imc < 35){
				c = "Obesidade grau I ";
			} else if (imc > 35 && imc < 40){
				c = "Obesidade grau II ";
			} else if (imc > 40 ){				
				c = "Obesidade grau III (obesidade mórbida)";
			}
		
		return c;
	}
}
