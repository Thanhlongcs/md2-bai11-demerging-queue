import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class Main {
    public static void  suLyOldList(Queue<Person> listNu, Queue<Person> listNam, ArrayList<Person> listPerson){
        for (int i = 0; i < listPerson.size(); i++) {
            Person holder = listPerson.get(i);
            if (holder.getGender().equals("nu")){
                listNu.add(holder);
            }else {
                listNam.add(holder);
            }
        }
    }
    public static ArrayList newList(Queue<Person> listNu, Queue<Person> listNam){
        ArrayList<Person> newListPerson = new ArrayList<>();
        for (Person p:
                listNu) {
            newListPerson.add(p);
        }
        for (Person p:
                listNam) {
            newListPerson.add(p);
        }
        return newListPerson;
    }
    public static ArrayList inputData(){
        ArrayList<Person> listPerson = new ArrayList<>();
        Person person1 = new Person("mot","nam","1990");
        Person person2 = new Person("hai","nu","1991");
        Person person3 = new Person("ba","nu","1992");
        Person person4 = new Person("bon","nam","1993");
        Person person5 = new Person("nam","nu","1994");
        listPerson.add(person1);
        listPerson.add(person2);
        listPerson.add(person3);
        listPerson.add(person4);
        listPerson.add(person5);
        return listPerson;
    }
    public static void showData(ArrayList<Person> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ten: " +list.get(i).getName()+ ", gioi tinh: "+list.get(i).getGender() + ", năm sinh: "+ list.get(i).getDayOfBirth());
        }
    }
    public static void main(String[] args) {
        Queue<Person> listNu = new LinkedList<>();
        Queue<Person> listNam = new LinkedList<>();
        ArrayList<Person> listPerson = inputData();
        suLyOldList(listNu,listNam,listPerson);
        ArrayList<Person> newListPerSon = newList(listNu, listNam);
        showData(newListPerSon);
    }

}