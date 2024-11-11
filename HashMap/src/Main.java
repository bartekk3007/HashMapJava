import java.util.HashMap;

public class Main
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Andrzej");
        hashMap.put(4, "Dariusz");
        hashMap.put(3, "Cezary");
        hashMap.put(2, "Bartek");
        hashMap.put(5, null);
        System.out.println(hashMap);
        var value = hashMap.get(1);
        System.out.println(value);
        var valueNotIn = hashMap.getOrDefault(5, "Imie");
        System.out.println(valueNotIn);
        hashMap.forEach((k, v) -> System.out.println(k + " " + v));
        var putResult = hashMap.put(1, "Antoni");
        System.out.println(putResult);

        hashMap.merge(2, "Polska", String::concat);
        hashMap.forEach((k, v) -> System.out.println(k + " " + v));

        hashMap.computeIfPresent(5, (k, v) -> v + "(" + k + ")");
        System.out.println(hashMap.get(1));
    }
}