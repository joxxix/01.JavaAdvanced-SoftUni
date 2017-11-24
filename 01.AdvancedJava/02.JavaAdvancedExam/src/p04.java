import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        while (true){
            String word = scan.nextLine();

            if (word.equals("Print")){
                break;
            }
            if (word.contains("%")) {
                if (input.contains(".")){
                    input = input.replace(".", "\\.");
                }

                word = word.replaceAll("%", "[^ ]*");

                try {
                    Pattern pattern = Pattern.compile(word);
                    Matcher matcher = pattern.matcher(input);

                    while (matcher.find()){
                        StringBuilder line = new StringBuilder(matcher.group(0));
                        input = input.replace(matcher.group(), line.reverse());
                    }
                }catch (Exception ex){
                }
            }
            else {
                try{
                    Pattern pattern = Pattern.compile(word);
                    Matcher matcher = pattern.matcher(input);

                    if (matcher.find()){
                        StringBuilder line = new StringBuilder(matcher.group(0));
                        input = input.replaceAll(word, line.reverse().toString());
                    }

                }catch (Exception ex){

                }
            }

        }
        System.out.println(input);

    }
}
