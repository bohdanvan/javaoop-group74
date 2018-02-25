package com.bvan.oop.lessons1_2.post;

/**
 * @author bvanchuhov
 */
public class PostRunner {

    public static void main(String[] args) {
        Post p1 = new Post("Hey @amandabynes", "Travolta", 61);
        System.out.println(p1.show());

        Post p2 = new Post("Thank you", "Trump");
        p2.like();
        p2.like();
        System.out.println(p2.toString());

        System.out.println(p1.getLikes());

        p1.addComment("Cool");
        System.out.println(p1.show());
    }
}
