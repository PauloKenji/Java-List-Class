/*

 Paulo Kenji - SP3045382
 Ryan Salomão - SP3044521
 Thiago César - SP3044823
 Henrique Baesa - SP3045048
 Yoane Miyamura - SP3046117
 Isabelle Gomes - SP3045374

*/

public class MainList {
    public static void main(String[] args) {
        ListClass myList = new ListClass<String>();

        myList.addElement("Bola");
        myList.addElement("Armando");
        myList.addElement("Castor");

        System.out.println(myList.getStringOfAllElements());

        myList.sort();

        System.out.println(myList.getStringOfAllElements());

        myList.removeByIndex(2);

        System.out.println(myList.getStringOfAllElements());        

        myList.removeByElement("Bola");

        System.out.println(myList.getStringOfAllElements());  

        myList.update(0, "memers");

        System.out.println(myList.getStringOfAllElements());  

        myList.createHashMapList();
        
    }

    
}
