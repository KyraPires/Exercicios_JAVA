package fatec.poo.model;

/**
 *
 * @author Valquiria Pires
 */
public class Aluno {
    private int RA;
    private double NtPrv1;
    private double NtPrv2;
    private double NtTrab1;
    private double NtTrab2;
    private double mProva, mTrab;
    
    public void setRA(int registro){
        RA = registro;    
    }
    public int getRA(){
        return RA;
    }
    public void setNtPrv1(double p1){
        NtPrv1 = p1;
    }
    public double getNtPvr1(){
        return NtPrv1;
    }
    public void setNtPrv2(double p2){
        NtPrv2 = p2;
    }
    public double getNtPrv2(){
        return NtPrv2;
    }
    public void setNtTrab1(double t1){
        NtTrab1 = t1;
    }
    public double getNtTrab1(){
        return NtTrab1;
    }
                
    public void setNtTrab2(double t2){
        NtTrab2 = t2;
    }
    public double getNtTrab2(){
        return NtTrab2;
    }
    //os calculos
    public double calcMediaProva(){
        mProva = (0.75 * NtPrv1 + 2 * NtPrv2)/3;
        return mProva;                
    }
    public double calcMediaTrab(){
        mTrab = 0.25 * (NtTrab1 + NtTrab2)/2;
        return mTrab;
    }
    public double calcMediaFinal(){
        return(mProva + mTrab);
        //return(CalcMediaProva()+CalcMediaTrab());
    }
    public boolean isAprovado(){
        if (calcMediaFinal() >= 6){
            return(true);
        }else{
            return(false);
        }
    }
                
}
