package com.campusdual.classroom;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

  public static Set<String> createHashSet() {
    return new HashSet<>(Arrays.asList("ELEMENT KPRBC", "ELEMENT YPBTM", "ELEMENT AADXU", "ELEMENT RXCGJ",
            "ELEMENT WYMVD", "ELEMENT WFGEJ", "ELEMENT TYGBS", "ELEMENT MAPTK", "ELEMENT GJXVE", "ELEMENT BAFGL"));
  }

  public static Set<String> createTreeSet() {
    return new TreeSet<>(Arrays.asList("ELEMENT KPRBC", "ELEMENT YPBTM", "ELEMENT AADXU", "ELEMENT RXCGJ",
            "ELEMENT WYMVD", "ELEMENT WFGEJ", "ELEMENT TYGBS", "ELEMENT MAPTK", "ELEMENT GJXVE", "ELEMENT BAFGL"));
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
