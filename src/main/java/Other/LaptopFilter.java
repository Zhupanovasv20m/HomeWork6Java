//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//        Создать множество ноутбуков (Set).
//        Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map или в Сет. Например:
//        “Введите цифру, соответствующую необходимому критерию:
//        1 - цвет
//        2 - бренд
package Other;
import java.util.*;
public class LaptopFilter {
    public static void main(String[] args) {
        SetOfLaptop l1 = new SetOfLaptop(1, "Черный", "Lenovo");
        SetOfLaptop l2 = new SetOfLaptop(2, "Белый", "HP");
        SetOfLaptop l3 = new SetOfLaptop(3, "Серый", "Asus");
        SetOfLaptop l4 = new SetOfLaptop(4, "Красный", "Lenovo");

            System.out.println("Введите цифру, соответствующую необходимому критерию: ");
            System.out.println("1 - цвет");
            System.out.println("2 - бренд");
            Scanner a = new Scanner(System.in,"ibm866");
            Integer choice = a.nextInt();
            if(choice == 1){
                System.out.println("Введите цвет ноутбука: ");
                Scanner color = new Scanner(System.in);
                String cl = color.nextLine().toLowerCase();
                if(cl.equals("Черный")){
                    System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l3.toString() + "\n" + l4.toString() + "\n");
                }else if(cl.equals("Белый")){
                    System.out.printf(l1.toString() + "\n" + l3.toString());
                }else if(cl.equals("Серый")){
                    System.out.printf(l2.toString() + "\n" + l4.toString());
                }else System.out.println("По вашему запросу ничего не найдено");
                color.close();

            }else if(choice == 2){

                System.out.printf("Введите бренд ноутбука на английском: ");
                Scanner brand = new Scanner(System.in);
                String br = brand.nextLine().toLowerCase();
                if(br.equals("Lenovo")){
                    System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString() + "\n" + l3.toString() + "\n");
                }else if(br.equals("Asus")){
                    System.out.printf(l1.toString() + "\n" + l3.toString()+ "\n");
                }else if(br.equals("HP")){
                    System.out.printf(l2.toString() + "\n" + l4.toString()+ "\n");
                }else System.out.println("По вашему запросу ничего не найдено");
                brand.close();
            }
            a.close();
    }

}

