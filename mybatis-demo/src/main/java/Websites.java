
public class Websites {
    private  int id ;
    private String name;
    private  String url;
    private  int alexa;
    private  String country;

    public int getId() {
        return id;
    }

    public Websites(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public Websites(String name, String url, int alexa, String country) {
        this.name = name;
        this.url = url;
        this.alexa = alexa;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getAlexa() {
        return alexa;
    }

    public void setAlexa(int alexa) {
        this.alexa = alexa;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Websites{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", alexa=" + alexa +
                ", country='" + country + '\'' +
                '}';
    }
}