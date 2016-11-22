package me.Salt.Util;

import net.dv8tion.jda.entities.Guild;
import net.dv8tion.jda.entities.User;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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
