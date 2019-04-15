/* Java program to print frequencies of all elements using
HashMap */
import java.util.*;

class HashMapBasic
{
    // This function prints frequencies of all elements
    public static void main (String[] args)
    {
        String a="Blackhawk";
        char arr[] = {'a', 'a', 'x', 'd'};
        // Creates an empty HashMap
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

        // Traverse through the given array
        for (int i = 0; i < a.length(); i++)
        {
            Integer c = hmap.get(a.charAt(i));

            // If this is first occurrence of element
            if (hmap.get(a.charAt(i)) == null)
                hmap.put(a.charAt(i), 1);
                // If elements already exists in hash map
            else
                hmap.put(a.charAt(i), ++c);
        }

        // Print result
        for (Map.Entry m:hmap.entrySet())
            System.out.println("Frequency of " + m.getKey() +
                    " is " + m.getValue());
    }

}
