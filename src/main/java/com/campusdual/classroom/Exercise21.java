package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

  public static Set<String> createHashSet() {
    Set<String> set = new HashSet<>();
    set.add("ELEMENT KPRBC");
    set.add("ELEMENT YPBTM");
    set.add("ELEMENT AADXU");
    set.add("ELEMENT RXCGJ");
    set.add("ELEMENT WYMVD");
    set.add("ELEMENT WFGEJ");
    set.add("ELEMENT TYGBS");
    set.add("ELEMENT MAPTK");
    set.add("ELEMENT GJXVE");
    set.add("ELEMENT BAFGL");
    return set;
  }

  public static Set<String> createTreeSet() {
    Set<String> set = new TreeSet<>();
    set.add("ELEMENT KPRBC");
    set.add("ELEMENT YPBTM");
    set.add("ELEMENT AADXU");
    set.add("ELEMENT RXCGJ");
    set.add("ELEMENT WYMVD");
    set.add("ELEMENT WFGEJ");
    set.add("ELEMENT TYGBS");
    set.add("ELEMENT MAPTK");
    set.add("ELEMENT GJXVE");
    set.add("ELEMENT BAFGL");
    return set;
  }

  private static void printSet(Set<String> customSet) {
    for (String s : customSet) {
      System.out.println(s);
    }
  }


  public static boolean addElementToSet(Set<String> set, String elementToAdd) {
    return set.add(elementToAdd);
  }

  public static void main(String[] args) {
    printSet(createHashSet());
    System.out.println();
    printSet(createTreeSet());
  }

}
