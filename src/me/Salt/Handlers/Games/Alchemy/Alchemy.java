package me.Salt.Handlers.Games.Alchemy;

import java.io.*;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.regex.Pattern;

/**
 * Created by Salt001 on 16/11/2016.
 */
public class Alchemy {

    private static HashMap<String, String> elements = new HashMap<>();

    public Alchemy() throws IOException, URISyntaxException {
        BufferedReader br = new BufferedReader(new FileReader(new File(Alchemy.class.getResource("Elements.txt").toURI())));

        try {
            String line = br.readLine();
            HashMap<String, Integer> counter = new HashMap<>();
            Pattern p = Pattern.compile(":");
            while (line!=null) {
                if (Pattern.compile("(.+):(.+):(.+)").matcher(line).matches()){
                    for (String match : p.split(line)){
                        if (counter.containsKey(match.toLowerCase())){
                            counter.replace(match.toLowerCase(), counter.get(match.toLowerCase())+1);
                        } else {
                            counter.put(match.toLowerCase(), 1);
                        }
                    }
                    line = br.readLine();
                } else {
                    System.out.println("Error: " + line);
                    break;
                }

            }

            for (String key : counter.keySet()){
                System.out.println("Key: " + key + " Value: " + counter.get(key));
            }
        } finally {
            br.close();
        }

    }
}
