/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tecelagem;

/**
 *
 * @author 040069
 */
public class Tecelagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Administracao a1= new Administracao("Zé", "123-4", 10000);
        a1.registrarFalta();
        a1.registrarFalta();
        a1.hollerith();
        
        Producao p1= new Producao("Maria", "234-5", 50);
        p1.registrarHorasDiurnas(100);
        p1.registrarHorasNoturnas(100);
        p1.hollerith();
        
        Vendas v1= new Vendas("João", "345-6", 1000);
        v1.registrarVenda(50000);
        v1.registrarVenda(50000);
        v1.hollerith();
    }
    
}
