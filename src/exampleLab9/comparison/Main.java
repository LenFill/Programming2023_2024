package exampleLab9.comparison;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        System.out.println("Время заполнения ArrayList = " + getRunningTime(arrayList) + " нс");
        System.out.println("Время заполнения LinkedHashSet = " + getRunningTime(linkedHashSet) + " нс");
        System.out.println("Время заполнения LinkedHashMap = " + getMapRunningTime(linkedHashMap) + " нс");
        System.out.println("Время получения ArrayList = " + getArrayListGetTime(arrayList) + " нс");
        System.out.println("Время получения по позиции LinkedHashSet = " + getPositionTime(linkedHashSet) + " нс");
        System.out.println("Время получения по позиции LinkedHashMap = " + getPositionTime(linkedHashMap.values()) + " нс");
        System.out.println("Добавление одного элемента в начало ArrayList = " + getAddTime(arrayList, 0) + " нс");
        System.out.println("Добавление одного элемента в начало LinkedHashSet = " + getSetAddFirstTime(linkedHashSet) + " нс");
        System.out.println("Добавление одного элемента в начало LinkedHashMap = " + getMapAddFirstTime(linkedHashMap) + " нс");
        System.out.println("Удаление одного элемента из начала ArrayList = " + getRemoveTime(arrayList, 0) + " нс");
        System.out.println("Удаление одного элемента из начала LinkedHashSet = " + getSetRemoveFirstTime(linkedHashSet) + " нс");
        System.out.println("Удаление одного элемента из начала LinkedHashMap = " + getMapRemoveFirstTime(linkedHashMap) + " нс");
        System.out.println("Добавление одного элемента в середину ArrayList = " + getAddTime(arrayList, arrayList.size() / 2) + " нс");
        System.out.println("Добавление в середину LinkedHashSet: нет встроенного метода");
        System.out.println("Добавление в середину LinkedHashMap: нет встроенного метода");
        System.out.println("Удаление одного элемента из середины ArrayList = " + getRemoveTime(arrayList, arrayList.size() / 2) + " нс");
        System.out.println("Удаление одного элемента из середины LinkedHashSet = " + getMiddleRemoveTime(linkedHashSet) + " нс");
        System.out.println("Удаление одного элемента из середины LinkedHashMap = " + getMiddleRemoveTime(linkedHashMap.values()) + " нс");
        System.out.println("Добавление одного элемента в конец ArrayList = " + getAddTime(arrayList, arrayList.size()) + " нс");
        System.out.println("Добавление одного элемента в конец LinkedHashSet = " + getSetAddLastTime(linkedHashSet) + " нс");
        System.out.println("Добавление одного элемента в конец LinkedHashMap = " + getMapAddLastTime(linkedHashMap) + " нс");
        System.out.println("Время удаления одного элемента в конце ArrayList = " + getArrayListRemoveTime(arrayList) + " нс");
        System.out.println("Время удаления одного элемента в конце LinkedHashSet = " + getSetRemoveTime(linkedHashSet) + " нс");
        System.out.println("Время удаления одного элемента в конце LinkedHashMap = " + getMapRemoveTime(linkedHashMap) + " нс");
    }
    private static long getRunningTime(Collection<Integer> collection) {
        long start = System.nanoTime();
        for (int i = 0; i < 14_000_000; i++) {
            collection.add(i);
        }
        long end = System.nanoTime();
        return end - start;
    }
    private static long getMapRunningTime(Map<Integer, Integer> map) {
        long start = System.nanoTime();
        for (int i = 0; i < 14_000_000; i++) {
            map.put(i, i);
        }
        long end = System.nanoTime();
        return end - start;
    }
    private static long getArrayListRemoveTime(ArrayList<Integer> list) {
        long start = System.nanoTime();
        list.removeLast();
        long end = System.nanoTime();
        return end - start;
    }

    private static long getSetRemoveTime(LinkedHashSet<Integer> set) {
        long start = System.nanoTime();
        set.removeLast();
        long end = System.nanoTime();
        return end - start;
    }

    private static long getMapRemoveTime(LinkedHashMap<Integer, Integer> map) {
        long start = System.nanoTime();
        map.pollLastEntry();
        long end = System.nanoTime();
        return end - start;
    }
    private static long getArrayListGetTime(ArrayList<Integer> list) {
        int index = list.size() / 2;
        long start = System.nanoTime();
        int value = list.get(index);
        long end = System.nanoTime();
        System.out.println("Полученный элемент: " + value);
        return end - start;
    }
    private static long getAddTime(ArrayList<Integer> list, int index) {
        long start = System.nanoTime();
        list.add(index, -1);
        long end = System.nanoTime();
        list.remove(index);
        return end - start;
    }

    private static long getRemoveTime(ArrayList<Integer> list, int index) {
        long start = System.nanoTime();
        int value = list.remove(index);
        long end = System.nanoTime();
        list.add(index, value);
        return end - start;
    }
    private static long getSetAddFirstTime(LinkedHashSet<Integer> set) {
        long start = System.nanoTime();
        set.addFirst(-1);
        long end = System.nanoTime();
        set.removeFirst();
        return end - start;
    }

    private static long getSetRemoveFirstTime(LinkedHashSet<Integer> set) {
        long start = System.nanoTime();
        int value = set.removeFirst();
        long end = System.nanoTime();
        set.addFirst(value);
        return end - start;
    }

    private static long getMapAddFirstTime(LinkedHashMap<Integer, Integer> map) {
        long start = System.nanoTime();
        map.putFirst(-1, -1);
        long end = System.nanoTime();
        map.pollFirstEntry();
        return end - start;
    }

    private static long getMapRemoveFirstTime(LinkedHashMap<Integer, Integer> map) {
        long start = System.nanoTime();
        Map.Entry<Integer, Integer> entry = map.pollFirstEntry();
        long end = System.nanoTime();
        map.putFirst(entry.getKey(), entry.getValue());
        return end - start;
    }
    private static long getPositionTime(Collection<Integer> collection) {
        int index = collection.size() / 2;
        long start = System.nanoTime();
        Iterator<Integer> iterator = collection.iterator();
        for (int i = 0; i < index; i++) {
            iterator.next();
        }
        int value = iterator.next();
        long end = System.nanoTime();
        System.out.println("Полученный элемент: " + value);
        return end - start;
    }
    private static long getMiddleRemoveTime(Collection<Integer> collection) {
        int index = collection.size() / 2;
        long start = System.nanoTime();
        Iterator<Integer> iterator = collection.iterator();
        for (int i = 0; i <= index; i++) {
            iterator.next();
        }
        iterator.remove();
        long end = System.nanoTime();
        return end - start;
    }
    private static long getSetAddLastTime(LinkedHashSet<Integer> set) {
        long start = System.nanoTime();
        set.addLast(-1);
        long end = System.nanoTime();
        set.removeLast();
        return end - start;
    }

    private static long getMapAddLastTime(LinkedHashMap<Integer, Integer> map) {
        long start = System.nanoTime();
        map.putLast(-1, -1);
        long end = System.nanoTime();
        map.pollLastEntry();
        return end - start;
    }
}

