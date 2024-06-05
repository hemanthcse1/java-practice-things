package com.hemanth.javathings.setinterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetBasics {

    public static void main(String[] args){

        System.out.print("\n\n----------------HashSet Implementation-------------------\n\n");
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Hello");
        hashSet.add("Hemanth");
        hashSet.add("Kumar");
        hashSet.add("N V");


        Iterator<String> iterateSet = hashSet.iterator();
        while (iterateSet.hasNext()){
            System.out.print(iterateSet.next()+" ");
        }

        System.out.println("Size of the hashset -> "+hashSet.size());
        System.out.println("Is hashSet empty -> "+hashSet.isEmpty());
        System.out.println("is hashSet contains Anil -> "+hashSet.contains("Anil"));
        System.out.println("Is hashSet contains Hemanth -> "+hashSet.contains("Hemanth"));
        System.out.println("HashCode -> "+hashSet.hashCode());

        Set<String> sampleHashSet = new HashSet<>();
        sampleHashSet.add("Hemanth");
        sampleHashSet.add("Kumar");

        System.out.println("Retain all -> ");
        hashSet.retainAll(sampleHashSet);
        System.out.println(hashSet);

        System.out.println("Is hashSet contains sampleHashSet -> "+hashSet.containsAll(sampleHashSet));
        System.out.println("Remove Hemanth from hashSet -> "+hashSet.remove("Hemanth"));
        System.out.println("Clear sampleHashSet -> ");
        sampleHashSet.clear();
        System.out.println(sampleHashSet);

        System.out.print("\n\n----------------TreeSet implementation ----------------\n\n");
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Hello");
        treeSet.add("Hemanth");
        treeSet.add("Kumar");
        treeSet.add("N V");

        Iterator<String> iterateTreeSet = treeSet.iterator();
        while (iterateTreeSet.hasNext()){
            System.out.print(iterateTreeSet.next()+" ");
        }

    }
}
