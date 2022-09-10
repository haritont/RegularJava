import java.util.regex.Matcher;

public class Regulars {
    public Boolean checkIP(String ip){
        return ip.matches("^([01]?\\d\\d?|2[0-4]|25[0-5])\\.([01]?\\d\\d?|2[0-4]|25[0-5])\\.([01]?\\d\\d?|2[0-4]|25[0-5])\\.([01]?\\d\\d?|2[0-4]|25[0-5])$");
    }
}
