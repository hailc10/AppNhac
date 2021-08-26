package lechihai.lch.appnhac.Service;

public class APIService {
    private static String base_url = "https://mp3zing1.000webhostapp.com/Server/";

    public static Dataservice getService(){
        return APIRetrofitClient.getClient(base_url).create(Dataservice.class);
    }
}
