import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   // StringBuilder word = new StringBuilder();
    String cityName = "stauceni";

        System.out.println(capitalize(cityName));
        System.out.println(scream("a", 5));
        System.out.println(strBuilder("B",8));


    }
    public static String capitalize(String value) {
        return value.substring(0,1).toUpperCase()+value.substring(1);
    }
    public static String strBuilder(String value, int lenght){
        StringBuilder str = new StringBuilder(); // String desing patern
        str.append(value.toUpperCase());
        for (int i = 1; i < lenght ; i++) {
            str.append("-");
            str.append(value);

        }
        return str.append("!").toString();

    }
    public static String scream(String letter, int lenght){
        String word = letter.toUpperCase();
        for (int i = 1; i < lenght; i++) {
           // word += "-"+letter;
        }return word + "!";

    }
}