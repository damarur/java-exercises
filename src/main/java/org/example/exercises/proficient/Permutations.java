package org.example.exercises.proficient;

public class Permutations {

    /**
     * Design a program that could accept words and determine if the current word is a permutation of a previously submitted word.
     * <p>
     * A permutation is any arrangement of the same letters in a different order
     * <p>
     * E.g.
     * User: GOD
     * Response: GOD: No permutations found
     * User: DOG
     * Response: DOG: GOD
     * User: HELP
     * Response: HELP: No permutations found
     * User: PHEL
     * Response: PHEL: HELP
     * User: GDO
     * Response: GDO: GOD, DOG
     **/
    public static void main(String[] args) {
        System.out.println(permutations("GOD"));
        System.out.println(permutations("DOG"));
        System.out.println(permutations("HELP"));
        System.out.println(permutations("PHEL"));
        System.out.println(permutations("GOO"));
        System.out.println(permutations("GDO"));
    }

    private static String permutations(String input) {
        return "No permutations found";
    }

}
