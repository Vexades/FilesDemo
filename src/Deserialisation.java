import java.io.*;
import java.util.List;

public class Deserialisation  {

    public void retrageDinBaza(List<Person> person){
        List<Person>  listaDeserializata = Singleton.getInstance().getListaPersoane();
        try{
            FileInputStream out= new FileInputStream("src/seri.ser");
            ObjectInputStream stream  = new ObjectInputStream(out);
            listaDeserializata= (List<Person>)stream.readObject();
            stream.close();
            out.close();
            System.out.println("Serialisation saved in src/seri.ser");
        }catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }
}
