import java.util.*;

class Dll {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Alok");
        list.add(0, "SanjaY");
        list.add("Prince");
        list.add("Joel");
        list.add("Kishan");
        System.out.println(list + "\n");
        list.remove(4);
        list.remove("Emil");
        Iterator itr = list.iterator();
        System.out.println("The list, after deletion, contains:");
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
