package analytics;

public class DataBase extends БазаДаних{
    public String getUserData(){
        return отриматиДаніКористувача();
    }

    public String getStatData(){
        return отриматиСтатистичніДані();
    }
}
