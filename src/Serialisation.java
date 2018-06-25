import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class Serialisation {

    public void adaugaInBaza(List<Person> person){
        try{
            FileOutputStream out= new FileOutputStream("src/seri.ser");
            ObjectOutputStream stream  = new ObjectOutputStream(out);
            stream.writeObject(person);
            stream.close();
            out.close();
            System.out.println("Serialisation saved in src/seri.ser");
        }catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }
}



