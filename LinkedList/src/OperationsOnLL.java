import java.util.*;

public class OperationsOnLL {
    public static void main(String[] args){
        LinkedList<String> ll = new LinkedList<>();

        //Adding Element

        // ll.add("I");
        // ll.add("Harsh");
        // ll.add(1, "am");

        // System.out.println(ll);

        //Updating Element

        // ll.add("Geeks");
        // ll.add("Geeks");
        // ll.add("Geeks");
        // System.out.println("Initial LL " + ll);

        // ll.set(1, "for");
        // System.out.println("Updated LL " + ll);

        //Removing element

        // ll.add("Geeks");
        // ll.add("Geeks");
        // ll.add(1, "for");
        // System.out.println("Initial LL " + ll);

        // ll.remove(1);
        // System.out.println("After the index removal " + ll);

        // ll.remove("Geeks");
        // System.out.println("After the Object Removal " + ll);

        //Iterating LinkedList

        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1, "for");

        for(int i = 0; i < ll.size(); i++){
            System.out.print(ll.get(i)+ " ");
        }
        System.out.println();

        for(String str : ll)
            System.out.print(str + " ");
    }
}
