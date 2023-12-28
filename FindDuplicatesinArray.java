import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesinArray {
    public static void main(String[] args) {
        String[] arr = {"java","Python","Ruby","Rust","JavaScript","java"};

        //Bruteforce approach
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].equalsIgnoreCase(arr[j])){
                    System.out.println("The duplicate element is: "+ arr[i]);
                }
            }
        }

        System.out.println("************************************************");

        //Optimised approach
        Set<String> store = new HashSet<>();
        for(String name : arr){
            if(store.add(name) == false){
                System.out.println("The duplicate name is: " + name);
            }
        }
    }
}
