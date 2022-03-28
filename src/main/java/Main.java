public class Main {
    public static void main(String[] args) {
        double temp = convertToCelsius(104);
        System.out.println(temp);

    }

    public static double convertToCelsius(double fahrenheit){
        double celsius = (fahrenheit-32)*5/9;
        return celsius;
    }

    public static String celsiusOrFahrenheit(double temperature){
        if (temperature >= 0 && temperature <= 30){
            return "Celsius";
        }
        else if (temperature > 30){
            return "Fahrenheit";
        }
        else{
            return "invalid input";
        }
    }
}
