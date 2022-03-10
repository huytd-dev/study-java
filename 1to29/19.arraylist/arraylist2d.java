import java.util.*;
public class arraylist2d {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> grocerArrayList = new ArrayList<>();
        ArrayList<String> bakeArrayList = new ArrayList<>();
        bakeArrayList.add("ot");
        bakeArrayList.add("cachua");
        bakeArrayList.add("dualeo");
        bakeArrayList.add("hanh");
        bakeArrayList.add("thit");

        ArrayList<String> produceArrayList = new ArrayList<>();
        produceArrayList.add("zz");
        produceArrayList.add("bb");
        produceArrayList.add("cc");
        produceArrayList.add("tt");
        ArrayList<String> drinkArrayList = new ArrayList<>();
        drinkArrayList.add("cola");
        drinkArrayList.add("pepsi");
        drinkArrayList.add("mirinda");
        drinkArrayList.add("sting");
        grocerArrayList.add(bakeArrayList);
        grocerArrayList.add(drinkArrayList);
        grocerArrayList.add(produceArrayList);
        // tra ve array va cac phang tu trong do
        // System.out.println(bakeArrayList);//[ot, cachua, dualeo, hanh, thit]
        // System.out.println(bakeArrayList.get(2));// tra ve phan tu can tim dualeo
        // System.out.println(produceArrayList);//[zz, bb, cc, tt]
        // System.out.println(drinkArrayList);//[cola, pepsi, mirinda, sting]
        System.out.println(grocerArrayList);
         //[[ot, cachua, dualeo, hanh, thit], [cola, pepsi, mirinda, sting], [zz, bb, cc, tt]]
         System.out.println(grocerArrayList.get(2));//[zz, bb, cc, tt]
         System.out.println(grocerArrayList.get(2).get(0));// zz
        }
    
}
