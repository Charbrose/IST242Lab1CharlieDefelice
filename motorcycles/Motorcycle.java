/**
 * Project: Motorcycle Project
 * Purpose Details: Representing Motorcycle Objects
 * Course: IST 242
 * Author: Charlie Defelice
 * Date Developed: January 17, 2024
 * Last Date Changed: January 21, 2024
 * Rev: 1.3
 */

package motorcycles;

public class Motorcycle
{
    //Fields
    private String brand;
    private String model;
    private int year;
    private double price;

    //Constructor
    public Motorcycle(String brand, String model, int year, double price)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    //Getter methods
    public String getBrand()
    {
        return brand;
    }

    public String getModel()
    {
        return model;
    }

    public int getYear()
    {
        return year;
    }

    public double getPrice()
    {
        return price;
    }

    //Setter methods
    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public static void main(String[] args)
    {
        //Creating Motorcycle Objects
        Motorcycle bike1 = new Motorcycle("Honda", "CBR500R", 2022, 7000.00);
        Motorcycle bike2 = new Motorcycle("Kawasaki", "Ninja 650", 2021, 7500.00);
        Motorcycle bike3 = new Motorcycle("Yamaha", "YZF-R6", 2023, 10000.00);

        //Using setter methods
        bike1.setBrand("Suzuki");
        bike2.setModel("GSX-R750");
        bike3.setYear(2022);
        bike3.setPrice(11000.00);

        //Using getter methods to print updated object values
        System.out.println("Motorcycle 1: " + bike1.getBrand() + " " + bike1.getModel() + " (" + bike1.getYear() + ") - $" + bike1.getPrice());

        System.out.println("Motorcycle 2: " + bike2.getBrand() + " " + bike2.getModel() + " (" + bike2.getYear() + ") - $" + bike2.getPrice());

        System.out.println("Motorcycle 3: " + bike3.getBrand() + " " + bike3.getModel() + " (" + bike3.getYear() + ") - $" + bike3.getPrice());
    }
}
