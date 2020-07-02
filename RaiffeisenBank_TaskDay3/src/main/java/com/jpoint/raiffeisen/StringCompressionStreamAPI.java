package com.jpoint.raiffeisen;

import com.jpoint.raiffeisen.utils.MyEntry;

import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 * String compression solution with Stream API
 */
public class StringCompressionStreamAPI implements StringCompression {

    /**
     * Static method for string compression
     * @param str : source string
     * @return : compressed string
     */
    public String compress(String str) {
        if (str == null) {
            return null;
        }
        return str.chars().mapToObj(e->(char)e)
                .collect(LinkedList<MyEntry<Character, Integer>>::new, (list, ch) -> {
                    if (list.isEmpty() || !(list.getLast().getKey() == ch))
                    {
                        list.add(new MyEntry<>(ch, 1));
                    } else {
                        MyEntry currentEntry = list.getLast();
                        list.getLast().setValue((Integer)currentEntry.getValue() + 1);
                    }
                }, LinkedList::addAll)
                .stream()
                .map(entry -> {
                    String entryString = "";
                    Integer count = entry.getValue();
                    if (count > 1) {
                        entryString = count.toString();
                    }
                    entryString += entry.getKey().toString();
                    return entryString;
                })
                .collect(Collectors.joining());
    }
}
