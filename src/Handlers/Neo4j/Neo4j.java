package Handlers.Neo4j;

/**
 * Created by 15122390 on 21/11/2016.
 */
public class Neo4j {

    private static String white = "";

    private static String[] whiteCards = white.split("\n");


    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        for (String card : whiteCards) {
            card = card.replace("\"", "\\\"");
            card = card.replace("_______", "_");


            sb.append("\"" + card + "\" + ");
        }

        System.out.println(sb.toString());
    }

}
