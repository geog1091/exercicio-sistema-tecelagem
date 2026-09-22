package Tecelagem;

public class Tecelagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Administracao a1= new Administracao("Zé", "123-4", 10000);
        a1.registrarFalta();
        a1.registrarFalta();
        a1.hollerith();
        
        Producao p1= new Producao("Maria", "234-5", 50);
        p1.registrarHorasDiurnas(100);
        p1.registrarHorasNoturnas(100);
        p1.hollerith();
        
        Vendas v1= new Vendas("João", "345-6", 1000);
        v1.registrarVendas(50000);
        v1.registrarVendas(50000);
        v1.hollerith();

	}

}
