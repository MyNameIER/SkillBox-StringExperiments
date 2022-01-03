package StringExperiments;

public class Loader
{
    public static int sum;
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        String newText = text.replaceAll ("[^ 0-9]", "");
        String [] sentensec = newText.split("\\s+");
        for (int i = 1; i < sentensec.length; i++) {
            sum += Integer.parseInt(sentensec[i]);
        }
        System.out.println(sum);
    }
}