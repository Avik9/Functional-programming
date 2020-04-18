import java.util.*;
import java.util.stream.Collectors;

public class FunctionalUtils
{
    /**
     * @param strings: the input collection of <code>String</code>s.
     * @return a collection of <code>String</code>s that start with a
     * capital letter (i.e., `A' through `Z').
     *
     * Find all the strings and return a list that start with a capital letter while using the Java Streams API()
     *
     */
    public static Collection<String> capitalized(Collection<String> strings)
    {
        return strings.stream().filter(n -> Character.isUpperCase(n.charAt(0))).collect(Collectors.toList());
    }

    /**
     * Find and return the longest <code>String</code> in a given collection of <code>String</code>s.
     *
     * @param strings: the given collection of <code>String</code>s.
     * @param from_start: a <code>boolean</code> flag that decides how ties are broken.
    If <code>true</code>, then the element encountered earlier in
     * the iteration is returned, otherwise the element encountered
     * later is returned.
     * @return the longest <code>String</code> in the given collection,
     * where ties are broken based on <code>from_start</code>.
     *
     * Find all the strings with the largest length while using the Java Streams API()
     *
     * if from_start is true, pick the longest one from the start when there are 2 or more longest equal length string
     * if from_start is false, pick the longest one from the end when there are 2 or more longest equal length string
     *
     */
    public static String longest(Collection<String> strings, boolean from_start)
    {
        return (from_start) ? (strings.stream().reduce((s1, s2) -> s1.length() >= s2.length() ? s1 : s2).orElse(null)) : (strings.stream().reduce((s2, s1) -> s2.length() > s1.length() ? s2 : s1).orElse(null));
    }

    /**
     * Find and return the least element from a collection of given elements that are comparable.
     *
     * @param items: the given collection of elements
     * @param from_start: a <code>boolean</code> flag that decides how ties are broken.
     * If <code>true</code>, then the element encountered earlier in
     * the iteration is returned, otherwise the element encountered
     * later is returned.
     * @param <T>: the type parameter of the collection (i.e., the items are all of type T).
     * @return the least element in <code>items</code>, where ties are
     * broken based on <code>from_start</code>.
     *
     * Call compareTo from Comparable and return the least object.
     *
     */
    public static <T extends Comparable<T>> T least(Collection<T> items, boolean from_start)
    {
        return (from_start) ? (items.stream().reduce((s1, s2) -> s1.compareTo(s2) >= 0 ? s2 : s1).orElse(null)) : (items.stream().reduce((s1, s2) -> s1.compareTo(s2) > 0 ? s2 : s1).orElse(null));
    }

    /**
     * Flattens a map to a stream of <code>String</code>s, where each element in the list
     * is formatted as "key -> value".
     *
     * @param aMap the specified input map.
     * @param <K> the type parameter of keys in <code>aMap</code>.
     * @param <V> the type parameter of values in <code>aMap</code>.
     * @return the flattened list representation of <code>aMap</code>.
     *
     * Return a list of Strings for each key and value.
     *
     */
    public static <K, V> List<String> flatten(Map<K, V> aMap)
    {
        return aMap.entrySet().stream().map(k -> (k.getKey() + " -> " + k.getValue())).collect(Collectors.toList());
    }
 }
