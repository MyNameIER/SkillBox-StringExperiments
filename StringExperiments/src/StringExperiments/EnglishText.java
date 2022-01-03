package StringExperiments;

public class EnglishText {
    public static void main(String[] args) {
        String text = "Sudan's Prime Minister Abdalla Hamdok has resigned after another day of mass protests rocked the capital Khartoum.\n" +
                "\n" +
                "Thousands marched against a recent deal he had done to share power with the army, who staged a coup in October.\n" +
                "\n" +
                "Chanting \"power to the people\", protesters called for a return to full civilian rule. But military forces again responded with force, leaving two people dead.\n" +
                "\n" +
                "Mr Hamdok's decision to quit leaves the army in full control.\n" +
                "\n" +
                "It is another blow to Sudan's fragile attempts at a transition to democratic rule after a popular uprising led to the overthrow of Sudan's long-term authoritarian President Omar al-Bashir in 2019.\n" +
                "\n" +
                "In a televised address, Mr Hamdok said the country was at a \"dangerous turning point that threatens its whole survival\".\n" +
                "\n" +
                "He said he had tried his best to stop the country from \"sliding towards disaster\", but that \"despite everything that has been done to reach a consensus... it has not happened\".";
        String[] sentensec = text.split("\\s");
        for (int i = 1; i < sentensec.length; i++) {
            System.out.println(sentensec[i]);
        }
    }
}
