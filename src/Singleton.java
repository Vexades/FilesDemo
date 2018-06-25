import java.util.ArrayList;
import java.util.List;

public class Singleton {
    List<Person> listaPersoane = new ArrayList<>();

    private static Singleton singleton = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return singleton;
    }

    public List<Person> getListaPersoane() {
        return listaPersoane;
    }

    public void setListaPersoane(List<Person> listaPersoane) {
        this.listaPersoane = listaPersoane;
    }
}
