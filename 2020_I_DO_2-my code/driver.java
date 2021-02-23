public class driver
{
    public static void main(String[] args) 
    {
        laptop lp1 = new laptop("ZC202247", "32165414", 15000, "lkjhaadsf934", "Core i7", 4.2, 16000, 1500, 14);
        laptop lp2 = new laptop("FF193341", "14725896", 10000, "654as6d32131", "Ryzen 5", 4.4, 16000, 750, 11);
        
        System.out.println(lp1.toString());
        System.out.println(lp2.toString());

        desktop ds1 = new desktop("AC201245", "01234567", 15000, "popIKe245", "EPYC 3900X", 3.9, 64000, "G201", 1000, 7);
        desktop ds2 = new desktop("DD120342", "76543210", 25000, "priNum905", "XEON gold", 3.4, 256000, "G205", 7000, 6);
        
        System.out.println(ds1.toString());
        System.out.println(ds2.toString());
    }
}