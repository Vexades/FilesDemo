import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.List;

public class Main  {
    public static void main(String[] args) {
        Widgets widgets = new Widgets();
        Person person =  new Person();

        widgets.ui.add(widgets.addPerson);
        widgets.ui.add(widgets.retrieveList);
        widgets.ui.add(widgets.firstName);
        widgets.ui.add(widgets.lastName);
        widgets.ui.add(widgets.age);
        widgets.ui.add(widgets.retrievePerson);
        widgets.ui.setFrame();



        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object obj = e.getSource();
                if(obj instanceof Widgets){
                    Widgets wid = (Widgets)obj;

                    int index = 0;



                }if(obj.equals(widgets.addPerson)){
                    Serialisation ser = new Serialisation();
                    System.out.println("Adding");
                    if(!(widgets.firstName.getText().isEmpty() || widgets.lastName.getText().isEmpty() || widgets.age.getText().isEmpty())){
                        person.setFirstName(String.valueOf(widgets.firstName.getText()));
                        person.setLastName(String.valueOf(widgets.lastName.getText()));
                        person.setAge(String.valueOf(widgets.age.getText()));
                        Singleton.getInstance().listaPersoane.add(person);
                        ser.adaugaInBaza(Singleton.getInstance().getListaPersoane());
                    }else {
                        System.out.println("Check all fields!");
                        }
                    }
                if(obj.equals(widgets.retrievePerson)){
                    Deserialisation des = new Deserialisation();
                    List<Person> person = des.retrageDinBaza(Singleton.getInstance().getListaPersoane());
                    for(Person p: person){
                        System.out.println(p.toString());
                    }
                }
            }
            };
        widgets.addPerson.setListener(listener);
        widgets.retrievePerson.setListener(listener);
    }
}
