package control;

import java.text.DecimalFormat;

public class CalculadoraIMC {
	
	public String calcularIMC(double altura, double peso, String sexo, int idade){
		//calculo do IMC da pessoa
		DecimalFormat df = new DecimalFormat("#.##");
		altura *= altura;
		double imc = Double.parseDouble( df.format(peso / altura).replaceAll( "," , "." ));
		
		String c = "";
		
		if (idade < 20){
			if (sexo == "feminino"){
				switch(idade){
				case 2:
					if (imc > 14 && imc < 15){
						c = "Baixo Peso";
					} else if (imc > 15 && imc < 18){
						c = "Peso Normal";
					} else if (imc > 18 && imc < 19){
						c = "Sobrepeso";
					} else if (imc > 20){
						c = "Obesidade";
					}
					break;
				case 4:
					if (imc > 13.7 && imc < 14.1){
						c = "Baixo Peso";
					} else if (imc > 14.2 && imc < 17){
						c = "Peso Normal";
					} else if (imc > 17 && imc < 18){
						c = "Sobrepeso";
					} else if (imc > 18){
						c = "Obesidade";
					}
					break;
				case 6:
					if (imc > 13.2 && imc < 13.9){
						c = "Baixo Peso";
					} else if (imc > 13.9 && imc < 17){
						c = "Peso Normal";
					} else if (imc > 17 && imc < 18.9){
						c = "Sobrepeso";
					} else if (imc > 18.9){
						c = "Obesidade";
					}
					break;
				case 8:
					if (imc > 13.3 && imc < 14){
						c = "Baixo Peso";
					} else if (imc > 14 && imc < 18.1){
						c = "Peso Normal";
					} else if (imc > 18.1 && imc < 19.6){
						c = "Sobrepeso";
					} else if (imc > 19.6){
						c = "Obesidade";
					}
					break;
				case 10:
					if (imc > 13.9 && imc < 14.4){
						c = "Baixo Peso";
					} else if (imc > 14.4 && imc < 20){
						c = "Peso Normal";
					} else if (imc > 20 && imc < 23){
						c = "Sobrepeso";
					} else if (imc > 23){
						c = "Obesidade";
					}
					break;
				case 12:
					if (imc > 14.5 && imc < 15.1){
						c = "Baixo Peso";
					} else if (imc > 15.1 && imc < 21.2){
						c = "Peso Normal";
					} else if (imc > 21.2 && imc < 25){
						c = "Sobrepeso";
					} else if (imc > 25){
						c = "Obesidade";
					}
					break;
				case 14:
					if (imc > 15.1 && imc < 16.1){
						c = "Baixo Peso";
					} else if (imc > 16.1 && imc < 23.2){
						c = "Peso Normal";
					} else if (imc > 23.1 && imc < 27){
						c = "Sobrepeso";
					} else if (imc > 27){
						c = "Obesidade";
					}
					break;
				case 16:
					if (imc > 16.1 && imc < 17.5){
						c = "Baixo Peso";
					} else if (imc > 17.5 && imc < 24.3){
						c = "Peso Normal";
					} else if (imc > 24.3 && imc < 30){
						c = "Sobrepeso";
					} else if (imc > 30){
						c = "Obesidade";
					}
					break;
				case 18:
					if (imc > 17.1 && imc < 18.1){
						c = "Baixo Peso";
					} else if (imc > 18.1 && imc < 25.3){
						c = "Peso Normal";
					} else if (imc > 25.3 && imc < 30.1){
						c = "Sobrepeso";
					} else if (imc > 30.1){
						c = "Obesidade";
					}
					break;
				case 20:
					if (imc > 17.3 && imc < 18.5){
						c = "Baixo Peso";
					} else if (imc > 18.5 && imc < 26.2){
						c = "Peso Normal";
					} else if (imc > 26.2 && imc < 31.2){
						c = "Sobrepeso";
					} else if (imc > 31.2){
						c = "Obesidade";
					}
					break;
				}
			} else if (sexo == "masculino"){
				switch(idade){
				case 2:
					if (imc > 14.5 && imc < 15){
						c = "Baixo Peso";
					} else if (imc > 15 && imc < 18){
						c = "Peso Normal";
					} else if (imc > 18 && imc < 19.1){
						c = "Sobrepeso";
					} else if (imc > 19.1){
						c = "Obesidade";
					}
					break;
				case 4:
					if (imc > 13.8 && imc < 14.5){
						c = "Baixo Peso";
					} else if (imc > 14.5 && imc < 17){
						c = "Peso Normal";
					} else if (imc > 17 && imc < 18){
						c = "Sobrepeso";
					} else if (imc > 18){
						c = "Obesidade";
					}
					break;
				case 6:
					if (imc > 13.8 && imc < 14){
						c = "Baixo Peso";
					} else if (imc > 14 && imc < 17){
						c = "Peso Normal";
					} else if (imc > 17 && imc < 18.1){
						c = "Sobrepeso";
					} else if (imc > 18.1){
						c = "Obesidade";
					}
					break;
				case 8:
					if (imc > 13.5 && imc < 14.1){
						c = "Baixo Peso";
					} else if (imc > 14.1 && imc < 18.9){
						c = "Peso Normal";
					} else if (imc > 18.9 && imc < 20){
						c = "Sobrepeso";
					} else if (imc > 20){
						c = "Obesidade";
					}
					break;
				case 10:
					if (imc > 13.9 && imc < 14.4){
						c = "Baixo Peso";
					} else if (imc > 14.4 && imc < 19.1){
						c = "Peso Normal";
					} else if (imc > 19.1 && imc < 22){
						c = "Sobrepeso";
					} else if (imc > 22){
						c = "Obesidade";
					}
					break;
				case 12:
					if (imc > 14.5 && imc < 15.1){
						c = "Baixo Peso";
					} else if (imc > 15.1 && imc < 21.2){
						c = "Peso Normal";
					} else if (imc > 21.2 && imc < 25){
						c = "Sobrepeso";
					} else if (imc > 25){
						c = "Obesidade";
					}
					break;
				case 14:
					if (imc > 15.8 && imc < 16.4){
						c = "Baixo Peso";
					} else if (imc > 16.4 && imc < 22.4){
						c = "Peso Normal";
					} else if (imc > 22.4 && imc < 26){
						c = "Sobrepeso";
					} else if (imc > 26){
						c = "Obesidade";
					}
					break;
				case 16:
					if (imc > 16.9 && imc < 17.9){
						c = "Baixo Peso";
					} else if (imc > 17.9 && imc < 24.1){
						c = "Peso Normal";
					} else if (imc > 24.1 && imc < 27.3){
						c = "Sobrepeso";
					} else if (imc > 27.3){
						c = "Obesidade";
					}
					break;
				case 18:
					if (imc > 18 && imc < 18.9){
						c = "Baixo Peso";
					} else if (imc > 18.9 && imc < 25.5){
						c = "Peso Normal";
					} else if (imc > 25.5 && imc < 28.9){
						c = "Sobrepeso";
					} else if (imc > 28.9){
						c = "Obesidade";
					}
					break;
				case 20:
					if (imc > 18.9 && imc < 19.9){
						c = "Baixo Peso";
					} else if (imc > 19.9 && imc < 27){
						c = "Peso Normal";
					} else if (imc > 27 && imc < 30.2){
						c = "Sobrepeso";
					} else if (imc > 30.2){
						c = "Obesidade";
					}
					break;
				
			}
		}
		
		if (idade >= 20 || idade <= 65){
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
		}
		
		if (idade > 65){
			if (sexo == "feminino"){
				if (imc < 21.9){
					c = "Baixo peso";
				} else if (imc > 22 && imc < 27){
					c = "Peso Normal";
				} else if (imc > 27 && imc < 32){
					c = "Sobrepeso";
				} else if (imc > 32 && imc < 37){
					c = "Obesidade grau I";
				} else if (imc > 37 && imc < 41){
					c = "Obesidade grau II";
				} else if (imc > 42){
					c = "Obesidade grau III (obesidade mórbida)";
				}
			} else if (sexo == "masculino"){
				if (imc < 21.9){
					c = "Baixo peso";
				} else if (imc > 22 && imc < 27){
					c = "Peso Normal";
				} else if (imc > 27 && imc < 30){
					c = "Sobrepeso";
				} else if (imc > 30 && imc < 35){
					c = "Obesidade grau I";
				} else if (imc > 35 && imc < 40){
					c = "Obesidade grau II";
				} else if (imc > 40){
					c = "Obesidade grau III (obesidade mórbida)";
				}
			}
		}
	}
		return c;
	}
  
}
