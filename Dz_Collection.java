package DZ_Collection;

import java.util.*;
public class Dz_Collection {
    static long startTime, endTime;
    static long resultTimeArrayList, resultTimeLinkedList;
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        HashMap<Integer, String> numbers = new HashMap<>();

        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");

        System.out.println("Было: " + numbers);

        HashMap <String, Integer> swap= peopleReverse(numbers);
        System.out.println("Стало: " + swap);
        System.out.println();

        //Задание 2
        System.out.println("Задание 2");
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        randomArray(arrayList);
        randomArray(linkedList);
        //Делаем замеры времени для LinkedList
        startTime = System.currentTimeMillis();
        indexEl(linkedList);
        endTime = System.currentTimeMillis();
        resultTimeLinkedList = endTime - startTime;
        //Делаем замеры времени для ArrayList
        startTime = System.currentTimeMillis();
        indexEl(arrayList);
        endTime = System.currentTimeMillis();
        resultTimeArrayList = endTime - startTime;
        speak();
        System.out.println();

        //Задание 3
        System.out.println("Задание 3");
        ArrayList<String> name = new ArrayList<>();
        HashSet<String> nameSet = new HashSet<>();
        name.add("Serzh");
        name.add("Danil");
        name.add("Ilya");
        name.add("Vadim");
        name.add("Ilya");
        name.add("Serzh");
        name.add("Katya");
        System.out.println("Было - " + name);
        nameSet.addAll(name);;
        System.out.println("Стало - " + nameSet);
    }
    //Задание 2 (Доп методы)
    // 1000 раз выбираем элемент по случайному индексу
     public static List<Integer> indexEl (List<Integer> input){
        Random random = new Random();
        for (int i = 0; i<1000; i++){
            int index =  random.nextInt(input.size());
            input.set(index, input.get(index));
        }
        return input;
    }
    //Делаем 1 000 000 рандомных элементов  для ArrayList и LinkedList
    public static List <Integer> randomArray (List<Integer> array) {
        Random random = new Random();
        for (int i = 0; i < 1_000_000; i++) {
            array.add(random.nextInt(20));
            array.add(random.nextInt(20));
        }
        return array;
    }
    //Сделаем метод speak как вывод
    public static void speak (){
        System.out.println("Время выполнения linkedList - " + resultTimeLinkedList + "\nВремя выполнения ArrayList - " + resultTimeArrayList );
    }
    //Задание 1 (Доп методы)
    //Сделаем отдельный метод для замены ключей
        public static  HashMap <String, Integer> peopleReverse ( HashMap<Integer,String> hashMap) {
        HashMap<String,Integer> swap = new HashMap<>();
        for (Map.Entry <Integer, String> entry : hashMap.entrySet()){
            swap.put(entry.getValue(), entry.getKey());
        }
        return swap;
        }
    }
