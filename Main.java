import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] rows = new String[]{"logo", "mama", "coco", "yes"};
        searchUnique(rows);
        System.out.println(searchAndCount(rows));
        System.out.println(searchAndCountInRow(rows));
    }


        public static Set searchUnique(String[] rows){
            Set<Character> mySet = new HashSet<>();
            for (String element : rows){
                char [] chars = element.toCharArray();
                for (Character character : chars){
                    mySet.add(character);
                }
            }
            return mySet;
        }


            public static Map searchAndCount(String[] rows){
            Map<Character, Integer> myMap = new HashMap<>();
            for (String element : rows){
                char [] chars = element.toCharArray();
                for (Character character : chars){
                    if(myMap.containsKey(character)){
                        Integer value = myMap.get(character) + 1;
                        myMap.put(character, value);
                    }
                    else{
                        myMap.put(character,1);
                    }
                }
            }
            return myMap;
        }



    public static Map searchAndCountInRow(String[] rows){

        Map <String, Integer> secondMap = new HashMap<>();
        for (String element : rows){
            Integer value = 0;
            char [] chars = element.toCharArray();
            Map <Character, Integer> myMap = new HashMap<>();
            for (Character character : chars){
                if (myMap.containsKey(character)){
                    Integer valueSecond = myMap.get(character)+1;
                    myMap.put(character, valueSecond);
                }else{
                    myMap.put(character, 1);
                    value++;
                    secondMap.put(element, value);
                }
                }

            }

        return secondMap;
    }

    }


