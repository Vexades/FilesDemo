import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
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
                    person.setFirstName(String.valueOf(wid.firstName));
                    person.setLastName(String.valueOf(wid.lastName));
                    person.setAge(String.valueOf(wid.age));

                }if(obj == widgets.addPerson){
                    System.out.println("Adding");
                    Singleton.getInstance().listaPersoane.add(person);
                }
            }
        };
        widgets.addPerson.setListener(listener);
        widgets.retrievePerson.setListener(listener);
    }
}
