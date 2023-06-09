/*
 * Copyright 2022 Bikathi Martin <https://www.github.com/Q-T5>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package collectionsapi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Bikathi Martin <https://www.github.com/Q-T5> 
 * @date Sep 7, 2022
 */
public class JavaHashSet {
    /**
     * JAVA HASH SETS
     * used to create a collection that uses a hash table for storage
     * inherits the AbstractSet class which in turn implements the Set interface. The Set interface then
     *      inherits Collection which extends the Iterable interface
     * they store elements using a mechanism called hashing
     * contain unique elements only
     * is non-synced
     * it can hold null elements
     * 
     * insertion order is not maintained as elements are inserted on the basis
     *      of their hashcode
     * is the best approach for search operations
     * the default capacity for a hashset is 16, and the load factor is 0.75
     * 
     * NB: the key difference between a List and a Set is that a List can contain duplicate
     *     elements whereas Sets contain unique elements only
     *  
     * 
     * METHODS
     * boolean add(E e)- adds the specified element to the set if it's not already present
     * void clear()- removes all the elements from the hash set
     * Object clone()- returns a shallow copy of the HashSet, though the elements themselves
     *      are not cloned
     * boolean contains(Object o)- used to return true if the set contains the specified element
     * boolean isEmpty()- returns true if the set contains no elements
     * Iterator<E> iterator()- used to return an iterator over the elements in this set
     * boolean remove(Object o)- removes the specified element from this set if present
     * int size()- used to return number of elements in the set
     * Spliterator<E> spliterator()- used to create a late-binding and fail-fast spliterator
     *      over the elements in the set
     */
    public static void main(String[] args) {
        //example hashset
        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        //in this example, we will proove hashsets do not accept duplicate elements
        HashSet<String> setB = new HashSet<>();
        setB.add("Bikathi");
        setB.add("Martin");
        setB.add("Bikathi");
        setB.add("Munyole");
        setB.add(null);
        
        //if we print the contents of the hashset, we see that it only has
        //unique entries i.e, 'Bikathi' is inserted only once
        Iterator<String> itrB = setB.iterator();
        while(itrB.hasNext()) {
            System.out.println("Set B: " + itrB.next());
        }
        
        //removing elements
        set.remove("One");
        System.out.println("New set one: " + set);
        
        //removing all elements from the set
        set.addAll(setB);
        System.out.println("New set one: " + set);
        set.removeAll(setB);
        System.out.println("New set one: " + set);
        
        //creating hashsets of other collections
        ArrayList<String> list = new ArrayList<>();
        list.add("Bikathi");
        list.add("Martin");
        list.add("Munyole");
        
        HashSet<String> setC = new HashSet<>(list);
        System.out.println("Contents of setC: " + setC);
    }
}
