import java.util.*;
import java.util.function.Function;

public class Tests {

    public static void main(String a[]){

        List<String> strings1 = Arrays.asList("whatever", "may", "happen", ",", "a", "PROPER", "code", "should",
                "NEVER", "crash", "due", "2", "garbage", "like", " ", "))-",
                "or a", "element.", "~", "Someone", "Famous");

        System.out.println(FunctionalUtils.capitalized(strings1));

        System.out.println(FunctionalUtils.longest(strings1, false));

//        // 1.1.1 - Capitalized Strings
//        System.out.println("\n-- CAPITALIZED STRING --\n");
//        part_one_one();
//
//        // 1.1.2 - Longest String
//        System.out.println("\n-- LONGEST STRING --\n");
//        part_one_two();
//
//        // 1.1.3 - Least Element
//        System.out.println("\n-- LEAST ELEMENT --\n");
//        part_one_three();
//
//        // 1.1.4 - Flatten Map
//        System.out.println("\n-- FLATTEN --\n");
//        part_one_four();
//
//        // 1.2 - Zip
//        System.out.println("\n-- ZIP --\n");
//        part_two_zip();
//
//        // 1.2 - Composition
//        System.out.println("\n-- COMPOSITION --\n");
//        part_two_comp();
    }

    // 1.1.1 - Capitalized Strings
//    private static void part_one_one(){
//        // Test 1.
//        List<String> strings1 = new ArrayList<>(Arrays.asList("sam", "Alex", "MAX", "-", " ", "a b a", "$@!se"));
//        System.out.println(FunctionalUtils.capitalized(strings1));
//
//        // Test 2.
//        List<String> strings2 = new ArrayList<>(Arrays.asList(" "));
//        System.out.println(FunctionalUtils.capitalized(strings2));
//
//        // Test 3.
//        List<String> strings3 = new ArrayList<>(Arrays.asList());
//        System.out.println(FunctionalUtils.capitalized(strings3));
//
//    }
//
//    // 1.1.2 - Longest String
//    private static void part_one_two(){
//        // Test 1.
//        List<String> strings1 = new ArrayList<>(Arrays.asList("I", "still", "struggle", "."));
//        System.out.println(FunctionalUtils.longest(strings1, false));
//
//        // Test 2.
//        List<String> strings2 = new ArrayList<>(Arrays.asList("Make", "the", "shot", "."));
//        System.out.println(FunctionalUtils.longest(strings2, false));
//        System.out.println(FunctionalUtils.longest(strings2, true));
//
//        // Test 3.
//        List<String> strings3 = new ArrayList<>(Arrays.asList("cat", "bat", "hat", "sat", "fat"));
//        System.out.println(FunctionalUtils.longest(strings3, false));
//        System.out.println(FunctionalUtils.longest(strings3, true));
//
//        // Test 4.
//        List<String> strings4 = new ArrayList<>(Arrays.asList());
//        System.out.println(FunctionalUtils.longest(strings3, false));
//    }
//
//    // 1.1.3 - Least Element
//    private static void part_one_three(){
//
//        // Test 1.
//        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 2, 1, 5, 0, 8 , 3, -5));
//        System.out.println(FunctionalUtils.least(numbers, false));
//
//        // Test 2.
//        List<String> strings = new ArrayList<>(Arrays.asList("felix", "the", "cat", "ate", "a", "bat"));
//        System.out.println(FunctionalUtils.least(strings, false));
//
//    }
//
//    // 1.1.4 - Flatten.
//    private static void part_one_four(){
//
//        // Test 1.
//        HashMap map = new HashMap();
//        map.put("lol", "Laugh out loud");
//        map.put("ik", "I know");
//        map.put("wth", "What the heck");
//        map.put("ffs", "For fudge's sake");
//
//        System.out.println(FunctionalUtils.flatten(map));
//
//        // Test 2.
//        HashMap map2 = new HashMap();
//        System.out.println(FunctionalUtils.flatten(map2));
//    }
//
//    // 1.2 - Zip.
//    private static void part_two_zip(){
//
//        // Test 1
//        ArrayList bifunctions1 = new ArrayList<>(Arrays.<FunctionalOperations.NamedBiFunction<Double, Double, Double>>asList(
//                FunctionalOperations.add,
//                FunctionalOperations.subtract
//        ));
//
//        List doubles1 = new ArrayList(Arrays.asList(2.00, 4.5, 3.0));
//
//        System.out.println("Is your answer (3.5)?");
//        System.out.println(FunctionalOperations.zip(doubles1, bifunctions1));
//
//        // Test 2
//        bifunctions1 = new ArrayList<>(Arrays.<FunctionalOperations.NamedBiFunction<Double, Double, Double>>asList(
//                FunctionalOperations.multiply,
//                FunctionalOperations.add,
//                FunctionalOperations.divide,
//                FunctionalOperations.multiply,
//                FunctionalOperations.add
//        ));
//
//        doubles1 = new ArrayList(Arrays.asList(-1.0, -2.0, 3.5, 0.5, 2.0));
//
//        System.out.println("Is your answer (22)?");
//        System.out.println(FunctionalOperations.zip(doubles1, bifunctions1));
//
//        // Test 3
//        bifunctions1 = new ArrayList<>(Arrays.<FunctionalOperations.NamedBiFunction<Double, Double, Double>>asList(
//                FunctionalOperations.multiply,
//                FunctionalOperations.add
//        ));
//
//        doubles1 = new ArrayList(Arrays.asList(-1.0));
//
//        System.out.println("Is your answer (-1.0)?");
//        System.out.println(FunctionalOperations.zip(doubles1, bifunctions1));
//
//        // Test 4
//        bifunctions1 = new ArrayList<>(Arrays.<FunctionalOperations.NamedBiFunction<Double, Double, Double>>asList(
//                FunctionalOperations.multiply,
//                FunctionalOperations.add
//        ));
//
//        doubles1 = new ArrayList(Arrays.asList());
//
//        System.out.println("Is your answer (null)?");
//        System.out.println(FunctionalOperations.zip(doubles1, bifunctions1));
//
//    }
//
//    // 1.2 - Compose
//    private static void part_two_comp(){
//
//        // Test 1
//        Function<Character, String> func1 = character -> {
//            String result = "";
//            int count = character - 'a' + 1;
//            for (int i = 0; i < count; i++) {
//                result += character;
//            }
//            return result;
//        };
//
//        Function<String, Integer> func2 = String::length;
//        FunctionalOperations.FunctionComposition<Character, String, Integer> op = new FunctionalOperations.FunctionComposition<>();
//        Function<Character, Integer> compose = op.composition.apply(func1, func2);
//        System.out.println("Is your answer (4)?");
//        System.out.println(compose.apply('d'));
//
//        // Test 2
//
//        Function<Integer, Integer> func3 = integer -> {
//            return integer % 5;
//        };
//
//        Function<Integer, String> func4 = integer -> {
//            String[] strings = {"Zero", "One", "Two", "Three", "Four"};
//            return strings[integer];
//        };
//
//        FunctionalOperations.FunctionComposition<Integer, Integer, String> op2 = new FunctionalOperations.FunctionComposition<>();
//        Function<Integer, String> compose2 = op2.composition.apply(func3, func4);
//
//        System.out.println("Is your answer (Zero)?");
//        System.out.println(compose2.apply(15));
//
//        System.out.println("Is your answer (Three)?");
//        System.out.println(compose2.apply(23));
//
//        // Mu Test cases
//
//        System.out.println("\n\nMy Test Cases:\n---------------------------------------------------------------------------------------------------------\n\n");
//
//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("avik");
//        strings.add("atharva");
//        strings.add("samarpan");
//        strings.add("gaurav");
//        strings.add("max");
//        strings.add("ajay");
//        strings.add("nafi");
//
//        strings.add("Avik");
//        strings.add("Ajay");
//        strings.add("Atharva");
//        strings.add("Gaurav");
//        strings.add("Max");
//        strings.add("Nafi");
//        strings.add("Samarpan");
//
//        strings.add("cat");
//        strings.add("man");
//        strings.add("dog");
//        strings.add("cat");
//        strings.add("Ajay");
//
//        System.out.println("Printing out only the capitalized strings:");
//
//        String s;
//
//        Collection<String> returned = FunctionalUtils.capitalized(strings);
//
//        for (String x: returned)
//        {
//            System.out.println(x);
//        }
//
//
//        System.out.println("\nPrinting out the longest string when from_start is true:");
//
//        s = FunctionalUtils.longest(strings, true);
//
//        System.out.println(s);
//
//
//        System.out.println("\nPrinting out the longest string when from_start is false:");
//
//        s = FunctionalUtils.longest(strings, false);
//
//        System.out.println(s);
//
//
//        System.out.println("\nPrinting out the least string when from_start is true:");
//
//        s = FunctionalUtils.least(strings, true);
//
//        System.out.println(s);
//
//
//        System.out.println("\nPrinting out the least string when from_start is false:");
//
//        s = FunctionalUtils.least(strings, false);
//
//        System.out.println(s);
//
//        Map m = new HashMap();
//
//        m.put("avik", "Avik");
//        m.put("ajay", "Ajay");
//        m.put("atharva", "Atharva");
//        m.put("gaurav", "Gaurav");
//        m.put("max", "Max");
//        m.put("samarpan", "Samarpan");
//        m.put("nafi", "Nafi");
//
//        System.out.println("\nPrinting out the flattened HashMap:");
//
//        returned = FunctionalUtils.flatten(m);
//
//        for (String x: returned)
//        {
//            System.out.println(x);
//        }
//
//        List<FunctionalOperations.NamedBiFunction<Double, Double, Double>> bifunctions = new LinkedList<>();
//        bifunctions.add(FunctionalOperations.add);
//        bifunctions.add(FunctionalOperations.multiply);
//        bifunctions.add(FunctionalOperations.add);
//        bifunctions.add(FunctionalOperations.divide);
//
//        List<Double> arguments = new LinkedList<Double>();
//        arguments.add(1.0);
//        arguments.add(1.0);
//        arguments.add(3.0);
//        arguments.add(0.0);
//        arguments.add(4.0);
//
//        double x = FunctionalOperations.zip(arguments, bifunctions);
//
//        System.out.println("x = " + x);
//    }
}
