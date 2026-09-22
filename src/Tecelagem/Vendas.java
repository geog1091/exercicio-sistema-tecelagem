package Tecelagem;

public class Vendas extends Funcionario {

public double totVendas;

public Vendas(String nome, String rg, double salBase) {
	super(nome, rg, salBase);
	totVendas = 0;
}

public void registrarVendas(double num) {
	totVendas += num;
}

public double comissao() {
	return totVendas * 0.03;
}

@Override
public void novoMes() {
	totVendas = 0;
}

@Override
public double salarioLiquido() {
	return salBase + comissao();
}

@Override
public void hollerith() {
	super.hollerith();
	System.out.println("Total de Vendas: " + totVendas + "\n" + 
						"Total de Comissão: " + comissao() + "\n");
}

}
