
public class MainList {
    public static void main(String[] args) {
        ListClass myList = new ListClass<String>();

        myList.addElement("uepa");
        myList.addElement("sla");
        myList.addElement("sasagueio");

        myList.removeByIndex(1);

        System.out.println(showAllElement(myList));

        myList.removeByElement("uepa");
        
        System.out.println(showAllElement(myList));

        myList.update(0, "memers");

        System.out.println(showAllElement(myList));
    }

    public static String showAllElement(ListClass list){
        String stringOfAllElements = "";

        for(int i = 0; i < list.getSize(); i++){
            stringOfAllElements += list.getElementById(i)+" ";
        }
        
        return stringOfAllElements; 
    }
    
}