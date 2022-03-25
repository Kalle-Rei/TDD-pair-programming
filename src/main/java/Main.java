public class Main {
    public static void main(String[] args) {

    }

    public static double convertToCelsius(double fahrenheit){
        double celsius = (fahrenheit-32)*5/9;
        return celsius;
    }
    public static int celsiusOrFahrenheit(double temperature){
        if (temperature >= 0 && temperature <= 30){
            return 0; //Celsius
        }
        else if (temperature > 30){
            return 1;//Fahrenheit
        }
        else{
            return 2;//invalid input
        }
    }
    public static String celsiusOrFahrenheit2(double temperature){
        if (temperature >= 0 && temperature <= 30){
            return "Celsius"; //Celsius
        }
        else if (temperature > 30){
            return "Fahrenheit";//Fahrenheit
        }
        else{
            return "invalid input";//invalid input
        }
    }
}
