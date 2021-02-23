class laptop extends computerAssets
{
    private static final double largeDepreciation = 0.20, smallDepreciation = 0.25;
    private double insurance, depreciation;
    private int screenSize;
    
    public laptop()
    {
        this("", "", 0, "", "", 0, 0, 0, 0);
    }

    public laptop(String stockCode, String staffNumber, double purchaseCost, String serial, String cpu, double clock, double ram, double insurancePremium, int screenSize)
    {
        super(stockCode, staffNumber, purchaseCost, serial, cpu, clock, ram);
        setInsurance(insurancePremium);
        setScreenSize(screenSize);
    }


    // SET METHODS

    public void setInsurance(double insurance)
    {
        this.insurance = insurance;
    }

    public void setScreenSize(int screenSize)
    {
        if(screenSize == 14 || screenSize == 11)
        {
            this.screenSize = screenSize;
        }
    }
    //GET METHODS

    public double getInsurance()
    {
        return insurance;
    }

    public int getScreensize()
    {
        return screenSize;
    }

    public double getdepreciationRate()
    {
        if(getScreensize()==11)
        {
            return smallDepreciation;
        }

        if(getScreensize()==14)
        {
            return largeDepreciation;
        }
        else
            return 0;
    }

    //ABSTRACT, TOSTRING AND MAIN METHODS 

    public double AnnualDepreciation()
    {
        if(getScreensize() == 11 || getScreensize() == 14)
        {
            depreciation = getPurchaseCost() * getdepreciationRate();
        }

        
        return depreciation;
    }

    public String toString()
    {
        return "Laptop" + super.toString() + ", Screen size: " + getScreensize()  + ", Insurance premium: " + getInsurance() + ", Annual depreciation: " + AnnualDepreciation();
    }

    public int compareTo(computerAssets A){
        if(this.getClass().equals(A.getClass())){
            desktop d = (desktop)A;
            if(this.AnnualDepreciation() == d.AnnualDepreciation()){
                return 0;
            }

            else    
                if(this.AnnualDepreciation()<d.AnnualDepreciation()){
                    return -1;
                }
                else
                 return 1;

        }
        else
            return this.getClass().AnnualDepreciation().compareTo(d.getClass().AnnualDepreciation());
    }

    public static void main(String[] args) 
    {
        laptop lp1 = new laptop("ZC202247", "32165414", 15000, "lkjhaadsf934", "Core i7", 4.2, 16000, 1500, 14);
        laptop lp2 = new laptop("FF193341", "14725896", 10000, "654as6d32131", "Ryzen 5", 4.4, 16000, 750, 11);
        
        System.out.println(lp1.toString());
        System.out.println(lp2.toString());
    }
}