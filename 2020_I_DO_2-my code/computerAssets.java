abstract class computerAssets  implements Comparable<computerAssets>
{
    private double  purchaseCost, cpuSpeed, ramAmount;
    private String stockCode, staffNumber, serialNumber, cpuType;
    public abstract double AnnualDepreciation();

    public computerAssets()
    {
        this("", "", 0, "", "", 0, 0);
    }

    public computerAssets(String stockCode, String staffNumber, double purchaseCost, String serial, String cpu, double cpuClock, double ram)
    {
        
        setStockCode(stockCode);
        setStaffNumber(staffNumber);
        setPurchaseCost(purchaseCost);
        setSerialNumber(serial);
        setCpuType(cpu);
        setCpuSpeed(cpuClock);
        setRamAmount(ram);
    }

    //SET METHODS

    public void setCpuSpeed(double cpuSpeed)
    {
        this.cpuSpeed = cpuSpeed;
    }

    public void setRamAmount(double ramAmount)
    {
        this.ramAmount = ramAmount;
    }

    public void setSerialNumber(String serialNumber)
    {
        this.serialNumber = serialNumber;
    }

    public void setCpuType(String cpuType)
    {
        this.cpuType = cpuType;
    }
 
   public void setStaffNumber(String staffNumber)
   {
       this.staffNumber = staffNumber;
   }
    
    public void setStockCode(String stockCode)
    {
        this.stockCode = stockCode;
    }
    public void setPurchaseCost(double purchaseCost)
    {
        this.purchaseCost = purchaseCost;
    }

    //GET METHODS 

    public String getStaffNumber()
    {
        return staffNumber;
    }
    public String getStockCode()
    {
        return stockCode;
    }
    public double getPurchaseCost()
    {
        return purchaseCost;
    }

    public String getSerialNumber()
    {
        return serialNumber;
    }

    public String getCpuType()
    {
        return cpuType;
    }

    public double getCpuClockSpeed()
    {
        return cpuSpeed;
    }

    public double getRamAmount()
    {
        return ramAmount;
    }

    //toString method

    public String toString()
    {
        return " Stock code: " + getStockCode() + ", Staff Number: " + getStaffNumber() + ", Purchase Cost: " + getPurchaseCost() + ", Serial number: " + getSerialNumber() + ", CPU type: " + getCpuType() + ", Clock speed: " + getCpuClockSpeed() + " GHZ, Ram amount: " + getRamAmount() + " MB";
    }
}