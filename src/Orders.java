import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Orders {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        LinkedHashMap<String, TreeMap<String, Integer>> orders = new LinkedHashMap<>();

        Integer ordersCounter = reader.nextInt();

        reader.nextLine();

        for(Integer i = 0; i < ordersCounter;i++){
            String[] input = reader.nextLine().split(" ");

            String customer = input[0];
            Integer amount = Integer.parseInt(input[1]);
            String product = input[2];

            if(!orders.containsKey(product)){
                orders.put(product,new TreeMap<>());
                orders.get(product).put(customer,amount);
            }else {
                if(orders.get(product).containsKey(customer)){
                    Integer tempAmount = orders.get(product).get(customer);
                    tempAmount += amount;
                    orders.get(product).put(customer,tempAmount);
                }else{
                    orders.get(product).put(customer,amount);
                }
            }
        }

        for(String product : orders.keySet()){
            System.out.print(product + ": ");

            String fixedOutput = "";

            for(String customer : orders.get(product).keySet()){
                fixedOutput += String.format("%s %d, ",customer,orders.get(product).get(customer));
            }

            System.out.println(fixedOutput.substring(0, fixedOutput.length() - 2));
        }
    }
}
