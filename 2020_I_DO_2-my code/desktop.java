import java.awt.Desktop;

public class desktop extends computerAssets 
{
    private double depreciationValue, residualValue;
    private int usefulLife;
    private String officeNumber;
    

    //CONSTRUCTORS
    public desktop()
    {
        this("", "", 0, "", "", 0, 0, "", 0, 0);
    }

    public desktop(String stockCode, String staffNumber, double pc, String serial, String cpu, double clock, double ram,  String officeCode, double rv, int life)
    {
        super(stockCode, staffNumber,pc, serial, cpu, clock, ram);
        setOfficeNumber(officeCode);
        setResidual(rv);
        setLife(life);
    }
    
    //SET METHODS

    public void setOfficeNumber(String officeNumber)
    {
        this.officeNumber = officeNumber;
    }

    public void setResidual(double residualValue)
    {
        this.residualValue = residualValue;
    }

    public void setLife(int usefulLife)
    {
        this.usefulLife = usefulLife;
    }
    
    //GET METHODS

    public String getOfficeNumber()
    {
        return officeNumber;
    }

    public double getResidualValue()
    {
        return residualValue;
    }

    public int getUsefulLife()
    {
        return usefulLife;
    }

    //MAIN METHOD, ABSTRACT METHOD AND TOSTRING

    public String toString()
    {
        return "Desktop" + super.toString() + ", Office number: " + getOfficeNumber()  + ", Useful life: " + getUsefulLife() + ", Residual value: " + getResidualValue() +  ", Annual depreciation: " + AnnualDepreciation();
    }

    public double AnnualDepreciation()
     {
         depreciationValue = (getPurchaseCost() - getResidualValue())/getUsefulLife();
         return depreciationValue;
     }

    public int compareTo(computerAssets A)
    {
        desktop d;
        if (this.getClass().equals(A.getClass()))
        {
            d = (desktop)A;
            if(this.AnnualDepreciation() == d.AnnualDepreciation()){
                return 0;
            }

            else    
                if(this.AnnualDepreciation()<d.AnnualDepreciation()){
                    return -1;
                }
                else
                 return 1;

        }else
            return this.getClass().AnnualDepreciation().compareTo(d.getClass().AnnualDepreciation());
    }
    public static void main(String[] args) 
    {
        desktop ds1 = new desktop("AC201245", "01234567", 15000, "popIKe245", "EPYC 3900X", 3.9, 64000, "G201", 1000, 7);
        desktop ds2 = new desktop("DD120342", "76543210", 25000, "priNum905", "XEON gold", 3.4, 256000, "G205", 7000, 6);
        System.out.println("Annual deprecition for ds1: " + ds1.AnnualDepreciation());
        System.out.println("Annual deprecition for ds2: " + ds2.AnnualDepreciation());
       
        
    }
}