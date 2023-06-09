package collectionsapi;

import java.util.Iterator;
import java.util.LinkedList;

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

/**
 *
 * @author Bikathi Martin <https://www.github.com/Q-T5> 
 * @date Sep 5, 2022
 */
public class JavaLinkedLists {
    /**
     * JAVA LINKED LISTS
     * uses a doubly-linked list(a list where we can add or remove elements from both sides) 
     *      to store the elements
     * inherits the AbstractList class and implements the List and Deque interface
     * can contain duplicate elements
     * maintains insertion order
     * is non-sync
     * manipulation is fast because no shifting needs to occur
     * can be used as a list, stack or queue
     * 
     * METHODS
     * boolean add(E e)- used to append the specified element to the end of the list
     * void add(int index, E e)- inserts the element at the specified position in the list
     * boolean addAll(Collection<? extends E> c)- add all the elements of the specified collection
    *       to the end of the list, in the order they came in from the Collection's iterator
    * boolean addAll(int index, Collection<? extends E> c)- insert the elements to the array list starting
    *       from the specified index
    * void addFirst(E e)- inserts the given element at the beginning of the list
    * void addLast(E e)- inserts the given element into the end of the list
    * void clear()- remove elements from a list
    * Object clone()- used to return a shallow copy of an linked list
    * boolean contains(Object o)- returns true if a list contains the given element
    * Iterator<E> descendingIterator()- returns an iterator over the element in a deque in reverse
    *       sequential order
    * E element()- used to retrieve the first element of a list
    * E get(int index)- retrieve the element at the given position in the list
    * E getFirst()- used to return the first element in a list
    * E getLast()- used to return the last element in the list
    * int indexOf(Object o)- returns the index in the list of the last occurrence of the specified
    *       element else returns -1 if the list does not contain the element
    * ListIterator<E> listIterator(int index)- returns a list iterator of the elements in proper
    *       sequential order starting at the specified position in the list
    * boolean offer(E e)- adds the specified element as the last element of a list
    * boolean offerFirst(E e)- inserts the specified element at the front of the list
    * boolean offerLast(E e)- inserts the specified element at the end of a list
    * E peek()- retrieves the first element of the list
    * E peekFirst()- retrieves the first element of a list or returns null if a list is empty
    * E peekLast()- retrieves the last element of a list or returns null if a list is empty
    * E poll()- removes and retrieves the first element of a list
    * E pollFirst()- removes and retrieves the first element of a list or returns null if a list is empty
    * E pollLast()- removes and retrieves the last element of a list or returns null if a list is empty
    * E pop()- pops an element from the stack represented by a list
    * void push(E e)- pushes an element onto a stack represented by a list
    * E remove()- removes and retrieves the first element in the list
    * boolean remove(int index)- removes the element at the specified position in the list
    * E removeFirst()- removes and retrieves the first element from a list
    * boolean removeFirstOccurrence(Object o)- traverses the list from head to tail, removing the
    *       first occurrence of the specified element from the list
    * E removeLast()- removes and returns the last element from the list
    * boolean removeLastOccurrence(Object o)- traverses the list from head to tail, removing the
    *       last occurrence of the specified element from the list
    * E set(int index, E element)- replaces the element at the specified position in the list with a
    *       user-defined one
    * Object[] toArray()- returns an array containing all the elements in a list in their proper sequence
    *       (from first to last)
    * <T> T[] toArray(T[] a)- returns generic an array containing all the elements in a list in their proper sequence
    *       (from first to last)
    * int size()- returns number of elements in the list
     */
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Bikathi");
        linkedList.add("Martin");
        linkedList.add("Munyole");
        linkedList.add("Junior");
        
        Iterator iterator = linkedList.iterator();
        while(iterator.hasNext()) {
            System.out.println("Output: " + iterator.next());
        }
        
        //adding elements to the specified position in the list
        linkedList.add(1, "Jerome");
        System.out.println("List: " + linkedList);
        
        //adding elements of another list into list one
        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.add("Felishia");
        linkedList2.add("Diana");
        
        linkedList.addAll(linkedList2);
        System.out.println("New list one: " + linkedList);
        
        //adding elements of another list into list one at a specific position
        LinkedList<String> linkedList3 = new LinkedList<>();
        linkedList3.add("Roasters");
        linkedList3.add("Shommat");
        
        linkedList.addAll(0, linkedList3);
        System.out.println("New list one: " + linkedList);
        
        //adding element to first position
        linkedList.addFirst("Lokesh");
        System.out.println("New list one: " + linkedList);
        
        //adding element to first position
        linkedList.addLast("Patel");
        System.out.println("New list one: " + linkedList);
        
        //removing a specific element from the list
        linkedList.remove("Roasters");
        System.out.println("New list one: " + linkedList);
        
        //removing the element at the specific element in the list
        linkedList.remove(0);
        System.out.println("New list one: " + linkedList);
        
        //removing the elements of another list from our list
        linkedList.removeAll(linkedList2);
        System.out.println("New list one: " + linkedList);
        
        //removing the element at the first position in the list
        linkedList.removeFirst();
        System.out.println("New list one: " + linkedList);
        
        //removing the element at the last position in the list
        linkedList.removeLast();
        System.out.println("New list one: " + linkedList);
        
        //remove first occurence of element in the list
        linkedList.add("Bikathi");
        System.out.println("New list one: " + linkedList);
        linkedList.removeFirstOccurrence("Bikathi");
        System.out.println("New list one: " + linkedList);
        
        //remove last occurence of element in the list
        linkedList.add("Bikathi");
        System.out.println("New list one: " + linkedList);
        linkedList.removeLastOccurrence("Bikathi");
        System.out.println("New list one: " + linkedList);
        
        //clearing the list
        linkedList.clear();
        System.out.println("New list one: " + linkedList);
        
        //reversing the list elements
        LinkedList<Integer> numberList = new LinkedList<>();
        numberList.add(20);
        numberList.add(93);
        numberList.add(12);
        
        Iterator<Integer> itr = numberList.descendingIterator();
        while(itr.hasNext()) {
            System.out.println("Reversed list: " + itr.next());
        }
    }
}
