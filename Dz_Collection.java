package DZ_Collection;

import java.util.*;
public class Dz_Collection {
    static long startTime, endTime;
    static long resultTimeArrayList, resultTimeLinkedList;
    public static void main(String[] args) {
        //������� 1
        System.out.println("������� 1");
        HashMap<Integer, String> numbers = new HashMap<>();

        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");

        System.out.println("����: " + numbers);

        HashMap <String, Integer> swap= peopleReverse(numbers);
        System.out.println("�����: " + swap);
        System.out.println();

        //������� 2
        System.out.println("������� 2");
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        randomArray(arrayList);
        randomArray(linkedList);
        //������ ������ ������� ��� LinkedList
        startTime = System.currentTimeMillis();
        indexEl(linkedList);
        endTime = System.currentTimeMillis();
        resultTimeLinkedList = endTime - startTime;
        //������ ������ ������� ��� ArrayList
        startTime = System.currentTimeMillis();
        indexEl(arrayList);
        endTime = System.currentTimeMillis();
        resultTimeArrayList = endTime - startTime;
        speak();
        System.out.println();

        //������� 3
        System.out.println("������� 3");
        ArrayList<String> name = new ArrayList<>();
        HashSet<String> nameSet = new HashSet<>();
        name.add("Serzh");
        name.add("Danil");
        name.add("Ilya");
        name.add("Vadim");
        name.add("Ilya");
        name.add("Serzh");
        name.add("Katya");
        System.out.println("���� - " + name);
        nameSet.addAll(name);;
        System.out.println("����� - " + nameSet);
    }
    //������� 2 (��� ������)
    // 1000 ��� �������� ������� �� ���������� �������
     public static List<Integer> indexEl (List<Integer> input){
        Random random = new Random();
        for (int i = 0; i<1000; i++){
            int index =  random.nextInt(input.size());
            input.set(index, input.get(index));
        }
        return input;
    }
    //������ 1 000 000 ��������� ���������  ��� ArrayList � LinkedList
    public static List <Integer> randomArray (List<Integer> array) {
        Random random = new Random();
        for (int i = 0; i < 1_000_000; i++) {
            array.add(random.nextInt(20));
            array.add(random.nextInt(20));
        }
        return array;
    }
    //������� ����� speak ��� �����
    public static void speak (){
        System.out.println("����� ���������� linkedList - " + resultTimeLinkedList + "\n����� ���������� ArrayList - " + resultTimeArrayList );
    }
    //������� 1 (��� ������)
    //������� ��������� ����� ��� ������ ������
        public static  HashMap <String, Integer> peopleReverse ( HashMap<Integer,String> hashMap) {
        HashMap<String,Integer> swap = new HashMap<>();
        for (Map.Entry <Integer, String> entry : hashMap.entrySet()){
            swap.put(entry.getValue(), entry.getKey());
        }
        return swap;
        }
    }
