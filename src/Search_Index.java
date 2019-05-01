import java.util.ArrayList;

public class Search_Index {
    public static void main(String[] args) {

        //ArrayList object
        ArrayList arrList = new ArrayList();

        //adding elements in the list
        arrList.add("100");
        arrList.add("200");
        arrList.add("300");
        arrList.add("400");
        arrList.add("500");

        //searching element "300"
        int index = arrList.indexOf("400");
        if(index == -1)
            System.out.println("Element is not found in the list");
        else
            System.out.println("Element found @ index: " + index);
    }
}
