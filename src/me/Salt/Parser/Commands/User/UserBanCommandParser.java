package me.Salt.Parser.Commands.User;

/**
 * Created by zuezy on 05/11/2016.
 */
public class UserBanCommandParser {

    public UserBanCommandContainer parse() {

        /**
         try {
         banDuration = new SimpleDateFormat("yyyyMMdd").parse(banDuration.toString());
         } catch (ParseException e) {
         e.printStackTrace();
         }
         **/

        return new UserBanCommandContainer();
    }
}
