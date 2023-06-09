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
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Bikathi Martin <https://www.github.com/Q-T5> 
 * @date Sep 6, 2022
 */
public class JavaListInterface {
    /**
     * JAVA LIST INTERFACE
     * provides utilities to MAINTAIN THE ORDERED COLLECTIONS
     * contains index-based methods to insert, update, delete and search the elements
     * it can have duplicate elements too, and can hold null elements
     * it resides in 'java.util', and inherits the Collection interface
     * it's a factory of the ListIterator interface through which we can iterate the list in
     * forward and backward directions
     * classes that implement this interface are: ArrayList, LinkedList, Stack and Vectors
     * NB: since Java 5, Vectors have been deprecated
     * 
     * METHODS
     * void add(int index, E e)- insert the specified element at the specified position in the list
     * boolean add(E e)- appends the specified element to the end of the list
     * boolean addAll(Collection<? extends E> c)- appends all the elements of the specified collection
     *      to the end of the current collection
     * void clear()- used to remove all the elements from a list
     * boolean equals(Object o)- used to compare the specified object with the elements of a list
     * int hashcode()- used to return the hashcode value for a list
     * E get(int index)- used to fetch the element from that particular position in the list
     * boolean isEmpty()- returns true if a list is empty, else returns false
     * int lastIndexOf(Object o)- returns the index in this list of the last occurrence of the provided
     *      object, else returns a -1 if the object does not exist in the list at all
     * Object[] toArray()- returns an array containing all the elements of the list in the current order
     * <T> T[] toArray(T[] a)- returns a generic containing all the elements of the list in the current order
     * boolean contains(Object o)- returns true if the list contains the specified element
     * boolean containsAll(Collection<?> c)- returns true if the list contains all the elements of the specified
     *      collection
     * int indexOf(Object o)- returns the index in this list of the first occurrence of the provided
     *      object, else returns a -1 if the object does not exist in the list at all
     * E remove(int index)- removes and returns the element present at the specified position in the list
     * boolean remove(Object o)- remove the first occurrence of the specified element
     * boolean removeAll(Collection<?> c)- remove all the elements of the specified collection in the current collection
     * void replaceAll(UnaryOperator<E> operator)- replace all the elements from the list with the specified element
     * void retainAll(Collection<?> c)- used to retain all the elements in the collection that are 
     *      in the argument collection
     * E set(int index, E element)- used to replace the specified element in the list, present at the specified
     *      position
     * void sort(Comparator<? super E> c)- used to sort the elements of the list based on a specified comparator
     * Spliterator<E> spliterator()- used to create a spliterator over the elements in a list
     * List<E> subList(int fromIndex, int toIndex)- returns a list of the elements within the given range
     * int size()- returns the size(number of elements in the list) of a list
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        
        for(String fruit : list) {
            System.out.println("Fruit: " + fruit);
        }
        
        //convert array to a list
        String[] languages = {"Java", "C++", "Python", "Erlang", "Haskell"};
        
        //printing out the array
        System.out.println("Array items: " + Arrays.toString(languages));
        List<String> languagesList = new ArrayList<>();
        for(String lang : languages) {
            languagesList.add(lang);
        }
        
        //printing out the list
        System.out.println("List items: " + languagesList);
        
        //converting a list to an array- let's use the previously created list
        String[] array = languagesList.toArray(new String[languagesList.size()]);
        System.out.println("Converted list to array: " + Arrays.toString(array));
        
        //getting and setting elements in a list
        System.out.println("Getting element at index 1: " + languagesList.get(1));
        languagesList.set(1, "Assembly");
        System.out.println("New languages list: " + languagesList);
        
        //sorting a list- although there are multiple ways to sort a list, we are going to use
        //the Collections.sort() static utility.
        //using our languagesList above:
        Collections.sort(languagesList);
        System.out.println("Sorted languages list: " + languagesList);
        
        //sorting numbers
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(11);
        numbersList.add(23);
        numbersList.add(90);
        numbersList.add(14);
        Collections.sort(numbersList);
        System.out.println("Sorted numbers list: " + numbersList);
        
        /**
         * JAVA LISTITERATOR INTERFACE
         * Is used to traverse the elements in a list backward and foward
         * It is decalared as a generic class ie: 
         *      public interface ListIterator<E> extends Iterator<E>
         * 
         * METHODS
         * void add(E e)- insert the specified element into the list
         * boolean hasNext()- returns true if the list has more elements when traversing in the foward
         *      direction
         * E next()- returns the next element in the list and advances the pointer position foward by one
         * int nextIndex()- returns the index of the element that would be returned by a subsequet call
         *      to next()
         * boolean hasPrevious()- returns true if the list has more elements while traversing the list in the
         *      reverse direction
         * E previous()- returns the previous element in the list and reverts the pointer position back by one
         * E previousIndex()- returns the index of the element that would be returned by a subsequet call
         *      to previous()
         * void remove()- removes the last element in the list that was returned by next() or previous()
         * void set(E e)- replaces the last element in the list returned by next() or previous() with the specified
         *      element
         */
        
        //using the languages list to test listIterator
        ListIterator<String> itr = languagesList.listIterator();
        
        //traversing foward in the list
        System.out.println("Traversing foward... ");
        while(itr.hasNext()) {
            System.out.println("index: " + itr.nextIndex() + " value: " + itr.next());
        }
        
        //traversing backward int the list
        System.out.println("Traversing backward... ");
        while(itr.hasPrevious()) {
            System.out.println("index: " + itr.previousIndex()+ " value: " + itr.previous());
        }
    }
}
