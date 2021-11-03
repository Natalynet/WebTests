import java.util.ArrayList;
import java.util.List;

public class CollectionsTest {

    public static List<String> createListHelper(){
        List<String> al = new ArrayList<>();
        al.add("Tan");
        al.add("Yellow");
        al.add("Orange");
        al.add("Red");
        al.add("Pink");
        al.add("Purple");
        al.add("Blue");

        return al;
    }

    public List<String> removeL(){
        List <String> result = new ArrayList<>();
        for(int i = 0; i < createListHelper().size(); i++){
            if(!createListHelper().get(i).toLowerCase().contains("l")){
                result.add(createListHelper().get(i));
            }
        }
        return result;
    }

    public static List<Integer> helperIntegerList(){
        List <Integer> l = new ArrayList<>();
        for(int i = 100; i <= 1000; i++){
            l.add(i);
        }
        return l;
    }

    public static List <Integer> removeEven(){
        List<Integer> l2 = new ArrayList<>();
        for(int i = 0; i < helperIntegerList().size(); i++){
            if(helperIntegerList().get(i)%2 != 0){
                l2.add(helperIntegerList().get(i));
            }
        }
        return l2;
    }

    public static void main(String[] args) {
        CollectionsTest CT = new CollectionsTest();
        System.out.println(CT.removeL());

    }

}
