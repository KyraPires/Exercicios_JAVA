package fatec.poo.model;

/**
 *
 * @author Valquiria Pires
 */
public class Retangulo {
    private double altura;
    private double base;
    private String unidadeMedida;
    
    //Método Construtor
    //- tem o mesmo nome da classe
    //- é chamado após a instanciação do objeto
    //- fornece um estado inicial a partir da
    //  inicialização de uma ou mais atributos
    //  do objeto instanciado 
    public Retangulo(String uniMed){
        unidadeMedida = uniMed;
    }
   
    
    public void setAltura(double a){
        altura=a;
    }
    
     public void setBase(double b){
        base=b;
    }

    public double getAltura() {
        return altura;
    }
    //criado com o botão direito do mouse, -> Inserir código -> getter...
    public String getUnidadeMedida() {
        return unidadeMedida;
    }
    
    public double getBase() {
        return base;
    }
    
    public double calcArea(){
        return(altura * base);
    } 
    
    public double calcPerimetro(){
        return(2 * (altura + base));
    } 
    
    public double calcDiagonal(){
        return(Math.sqrt(Math.pow(altura,2) + Math.pow(base, 2)));
    }     
}
