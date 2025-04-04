package Q1_Q2;


import java.util.Scanner;

class Temperature
{
    private double celsius;

    public Temperature()
    {

    }

    public  Temperature(double celsius)
    {
        this.celsius = celsius;
    }

    public void setFahrenheit(double fahrenheit)
    {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }

    public void  setCelsius(double celsius)
    {
        this.celsius = celsius;
    }

    public double toCelsius()
    {
        return celsius;
    }

    public double toFahrenheit()
    {
        return celsius * 9 / 5 + 32;
    }
}

public class Q1_Main {

    public static void main(String[] args) {
        Temperature temp = new Temperature();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        temp.setFahrenheit(sc.nextDouble());
        System.out.println("Temperature in Celsius: " + temp.toCelsius());
    }
}
