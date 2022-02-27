package segurovida;

public class Segurado {
	public String nome;
	public String nascimento;
	public boolean fumante;
	public String sexo;
	public int profissao;
	public float salario;
	public int idade;
	public float mensalidade;
	public double cobertura;
	
	public void CalcularSeguro()
	{
		//calculo de mensalidade
		mensalidade = salario *  5/100;
	//if para o sexo feminino	
	if (sexo.equals("F")) {
		if (idade >=26 && idade<=45) {
			mensalidade = mensalidade + salario * 1 /100;
		}else if(idade>=46 && idade<=65){
			mensalidade = mensalidade + salario * 2/100;
		}	
	}
	
	//if para o sexo masculino
	if (sexo.equals("M")) {
		if (idade>= 26 && idade<= 45) {
			mensalidade = mensalidade + salario * 2/100;
		}else if (idade >=46 && idade <=65) {
			mensalidade = mensalidade + salario * 3/100;
		}
	}
	//if fumante 
	if (fumante) {
		mensalidade = mensalidade + salario * 2/100;
	}
	//if  para salario1
	if (salario <= 1500) {
		cobertura  = 150000;
	}
	//if  para salario2
	if (salario > 1500 && salario <= 3000) {
		cobertura = 250000;
	}
	//if  para salario3
	if(salario > 3000 && salario <=5000) {
		cobertura = 350000;
	}
	//if  para salario4
	if(salario > 5000) {
		cobertura = 500000;
	}
	
	}
	
}
