import java.util.regex.Matcher;

public class Regulars {
    public Boolean checkIP(String ip){
        return ip.matches("^([01]?\\d\\d?|2[0-4]|25[0-5])\\.([01]?\\d\\d?|2[0-4]|25[0-5])\\.([01]?\\d\\d?|2[0-4]|25[0-5])\\.([01]?\\d\\d?|2[0-4]|25[0-5])$");
    }
    public Boolean checkGUID(String guid){
        return guid.matches("^([0-9a-fA-F]){8}-([0-9a-fA-F]){4}-([0-9a-fA-F]){4}-([0-9a-fA-F]){4}-([0-9a-fA-F]){12}$");
    }
    public Boolean checkURL(String url){
        return url.matches("^(http|https):\\/\\/(www.)?([A-Z0-9a-z][!-^a-z]{0,254}[A-Z0-9a-z])\\.([a-z]){2,6}$");
    }
    public Boolean checkPassword(String pass){
        return pass.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[\\w]{8,}$");
    }
}
