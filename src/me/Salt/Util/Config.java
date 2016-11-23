package me.Salt.Util;

import net.dv8tion.jda.entities.Guild;
import net.dv8tion.jda.entities.User;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by Salt001 on 21/11/2016.
 */
public class Config { //Config files are written in YAML

    private Pattern p = Pattern.compile("");
    private static File conDir = new File("Data/Config/");
    private enum ConfigType {
        SYSTEM,
        GUILD,
        USER
    }

    public Config(){
        HashMap<String, HashMap<String, List<String>>> lookup = new HashMap<>(); //Header, Sub-header, Data-entry (newlines represented as semicolons)
        Pattern comment = Pattern.compile("\\s*+#.+");
        Pattern header = Pattern.compile("(\\w+\\s*+):(.*+)");
        try {
            BufferedReader in = new BufferedReader(new FileReader(new File("C:\\Users\\jake\\Desktop\\GitHub\\DiscordBot\\src\\me\\Salt\\Util\\test.yml")));
            String read = "";
            String nextLine = in.readLine();
            while (nextLine!=null){
                if (comment.matcher(nextLine).matches()) {
                    read = read + "\n" + nextLine;
                } else if (header.matcher(nextLine).matches()){
                    read = read + "\n" + header.matcher(nextLine).group(1); //TODO: Not working, not sure why. nextLine possibly changing between if-statement and concat to read
                }

                nextLine = in.readLine();
            }

            System.out.println(read);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static HashMap<File, Boolean> createDefaults(){ //Create default configs, ie system configs
        HashMap<File, Boolean> fb = new HashMap<>();
        HashMap<String, String> dirs = new HashMap<>(); //Extended directory from conDir, then the filename
            dirs.put("", "System.yml");

        File f;
        f = new File("");
        for (String key : dirs.keySet()){
            f = new File(conDir + "/" + key);

            if (!f.isDirectory()){
                f.mkdirs();
            }

            f = new File(conDir + "/" + key, dirs.get(key));

            if (!f.isFile()){
                try {
                    f.createNewFile();
                    fb.put(f, f.isFile());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return fb;

    }

    public void createConfig(Guild guild){

    }

    public void createConfig(Guild guild, User user){

    }

    public void readConfig(ConfigType configType){

    }
}
