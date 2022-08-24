import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMain {
    public static void main(String[] args) {


        List<Map<String, String>> animalList = new ArrayList<Map<String, String>>();
        animalList.add(new HashMap<String, String>() {{
            put("name", "shark");
            put("habitat", "ocean");
        }});
        animalList.add(new HashMap<String, String>() {{
            put("name", "bear");
            put("habitat", "land");
        }});
        animalList.add(new HashMap<String, String>() {{
            put("name", "moose");
            put("habitat", "land");
        }});
        animalList.add(new HashMap<String, String>() {{
            put("name", "frog");
            put("habitat", "swamp");
        }});
        animalList.add(new HashMap<String, String>() {{
            put("name", "jelly fish");
            put("habitat", "ocean");
        }});
        animalList.add(new HashMap<String, String>() {{
            put("name", "heron");
            put("habitat", "swamp");
        }});
        animalList.add(new HashMap<String, String>() {{
            put("name", "whale");
            put("habitat", "ocean");
        }});

        Map<String, List<String>> animalMap = new HashMap<>();

        for (Map<String, String> animal : animalList) {
            String habitat = animal.get("habitat");
            if (!animalMap.containsKey(habitat))
                animalMap.put(habitat, new ArrayList<>() {{
                    add(animal.get("name"));
                }});
            else {
                animalMap.get(habitat).add(animal.get("name"));
            }
        }

        System.out.println();

        animalMap.forEach((key, value) -> {
            System.out.println(key + " : " + String.join(" , ", value));
        });

        System.out.println();
        System.out.println("==============第二題==============");
        System.out.println();

        Map<String, String> capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Thailand", "Bangkok");
        capitalMap.put("UK", "London");
        capitalMap.put("Australia", "Bangkok");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("Egypt", "Cairo");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Italy", "Rome");
        capitalMap.put("Brazil", "Brasilia");

        for (Map.Entry<String, String> key : capitalMap.entrySet()) {
            System.out.println(key.getKey() + " : " + key.getValue());
        }
    }
}
