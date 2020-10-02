
package fatec.poo.model;

/**
 *
 * @author Valquiria Pires
 */
public class GameShop {
    
    
    private int codigo, idade;
    private double qtdeHoras;

    public GameShop(int codigo, int idade) {
        this.codigo = codigo;
        this.idade = idade;
    }   
       
    public void comprar(double qh){
       qtdeHoras += qh;
    }
    public void jogar( double qh){
       qtdeHoras -= qh;
    }
    public void brinde(){
       qtdeHoras = qtdeHoras * 2; //qtdeHoras *= 2
    }    
    
    public int getCodigo(){
        return codigo;
    }
    public double getQtdeHoras() {
        return qtdeHoras;
    }
    public int getIdade() {
        return idade;
    }
   
   
}
