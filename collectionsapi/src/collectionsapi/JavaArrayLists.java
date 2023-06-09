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
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Bikathi Martin <https://www.github.com/Q-T5> 
 * @date Sep 4, 2022
 */
public class JavaArrayLists {
    /**
    * ARRAY LISTS
    * uses a dynamic array to store elements.
    * like an array without a size limit
    * can hold duplicate values
    * implements the List interface and extends the Iterable class
    * maintains insertion order, and is non-sync
    * items can be accessed in a random order, as it is index based
    * it is generic (as of Java 5), and we should use wrapper classes in place of primitives
    * can be declared along with a fixed size, or without a fixed size
    * 
    * METHODS
    * void add(int index, E element)- insert an element into the specified position
    * boolean add(E e)- add an element to the end of the array list
    * boolean addAll(Collection<? extends E> c)- add all the elements of the specified collection
    *       to the end of the list, in the order they came in from the Collection's iterator
    * boolean addAll(int index, Collection<? extends E> c)- insert the elements to the array list starting
    *       from the specified index
    * void clear()- remove all the elements from the list
    * ensureCapacity(int requiredCapacity)- used to enhance the capacity of the array list
    * E get(int index)- used to fetch the element from the list at the specified index
    * isEmpty()- returns true if the array list is empty else false
    * Iterator()
    * listIterator()
    * int lastIndexOf(Object o)- returns the index in the list of the last occurrence of the specified
    *       element, or -1 if the list does not contain this element
    * Object[] toArray()- returns an array containing all of the elements in the list in the current order
    * <T> T[] toArray(T[] a)- returns an array containing all of the elements in the list in the current order
    * Object clone()- return a shallow copy of an array list
    * boolean contains(Object o)- returns true if the list contains the specified element
    * int indexOf(Object o)- returns the index of the first occurrence in the list of the specified object
    *       otherwise -1 if it does not exist
    * E remove(int index)- removes and returns the element the specified index in the list
    * boolean remove(Object o)- used to remove the first occurrence of the specified element
    * boolean removeAll(Collection<?> c)- used to remove all the elements from the list
    * boolean removeIf(Predicate<? super E> filter)- used to remove all the elements from the list
    *       that satisfies the given predicate
    * void removeRange(int fromIndex, int toIndex)- remove all elements that lies within the given range
    * void replaceAll(UnaryOperator<E> operator)- used to replace all the elements in the list with the
    *       specified element
    * void retainAll(Collection<?> c)- used to retain all the elements in the list with the specified element
    * E set(int index, E element)- used to replace the specified element in the list at the specified index
    * void sort(Comparator<? super E> c)- used to sort the elements of the list in the basis of the specified
    *       comparator
    * Spliterator<E> spliterator()- used to create a spliterator over the elements in the list
    * List<E> sublList(int fromIndex, int toIndex)- used to fetch all elements that lies within the given range
    * int size()- returns the number of elements present in the list
    * void trimToSize()- used to trim the capacity of the array list to be the list's current size
    * 
    */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Banana");
        list.add("Grapes");
        list.add("Pineapples");
        
        //print out the list
        System.out.println("List data: " + list);
        
        //iterating over the list using the Iterator
        Iterator iterator = list.iterator(); //get the iterator for this list
        while(iterator.hasNext()) { //checks if the iterator has elements
            System.out.println("Current element[iterator]: " + iterator.next()); //print the element and move to the next
        }
        
        //iterating over the list using the for-each loop
        for(String fruit : list) {
            System.out.println("Current element[for-each]: " + fruit);
        }
        
        //iterating over the list using the forEach method
        //this is a new method that was introduced in Java 8, and makes use of lambdas
        list.forEach(a -> {
            System.out.println("forEach method element: " + a);
        });
        
        //iterating over the list using the forEachRemaining() method
        Iterator <String> iter = list.iterator();
        iter.forEachRemaining(a -> {
            System.out.println("forEachRemaining element: " + a);
        });
        
        //getting and setting elements
        System.out.println("Element at index 1: " + list.get(1)); //get element at index 1
        list.set(1, "Dates");
        System.out.println("Element at index 1: " + list.get(1));
        
        //sorting arraylists
        /**
         * NB: The java.util contains a utility class called Collections.
         *     The class has a static method sort() that can easily sort an ArrayList
         */
        Collections.sort(list); //for a list of String, it's sorted A-Z
        System.out.println("sorted list: " + list);
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(34);
        list2.add(3);
        list2.add(1);
        
        Collections.sort(list2); //for a list of Integers, it sorts 0-9
        System.out.println("Sorted list 2: " + list2);
    }
}
