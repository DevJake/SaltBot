package me.Salt.Handlers.Games.Alchemy;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;

/**
 * Created by Salt001 on 16/11/2016.
 * The Main class, for the management of the Alchemy game
 */
public class Alchemy {

    private static HashMap<String, String> elements = new HashMap<>();

    /**
     * A constructor for the Alchemy game
     *
     * @throws IOException        IOException
     * @throws URISyntaxException URISyntaxException
     */
    public Alchemy() throws IOException, URISyntaxException {
//        BufferedReader br = new BufferedReader(new FileReader(new File(Alchemy.class.getResource("Elements.txt").toURI())));
//
//        try {
//            String line = br.readLine();
//            HashMap<String, Integer> counter = new HashMap<>();
//            Pattern p = Pattern.compile(":");
//            while (line!=null) {
//                if (Pattern.compile("(.+):(.+):(.+)").matcher(line).matches()){
//                    for (String match : p.split(line)){
//                        if (counter.containsKey(match.toLowerCase())){
//                            counter.replace(match.toLowerCase(), counter.get(match.toLowerCase())+1);
//                        } else {
//                            counter.put(match.toLowerCase(), 1);
//                        }
//                    }
//                    line = br.readLine();
//                } else {
//                    System.out.println("Error: " + line);
//                    break;
//                }
//
//            }
//
////            for (String key : counter.keySet()){
////                System.out.println("Key: " + key + " Value: " + counter.get(key));
////            }
//
//        } finally {
//            br.close();
//        }

    }
}
