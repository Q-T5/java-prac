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

import java.util.function.Predicate;

/**
 *
 * @author Bikathi Martin <https://www.github.com/Q-T5> 
 * @date Sep 7, 2022
 */
public class JavaPredicateInterface {
    /**
     * java.util.function.Predicate is a Functional Interface that is designed to improve the
     * readability of code and help to unit-test them separately
     * 
     * METHODS
     * static Predicate isEqual(Object targetRef)- returns a predicate that tests if two arguments are 
     *      equal according to Objects.equals(Object, Object)
     * default predicate and (Predicate other)- returns a predicate that represents a short-circuiting logical AND of this
     *      predicate and another
     * default Predicate negate()- returns a predicate that represents the logical negation (NOT)of this predicate
     * default Predicate or(Predicate other)- returns a predicate that represents a short-circuiting logical OR of this
     *      predicate and another
     * boolean test(T t)- evaluates this predicate on the given argument
     */
    
    //predicate as a function
    public static void pred(int number, Predicate<Integer> predicate) {
        if(predicate.test(number)) {
            System.out.println("Number: " + number);
        }
    }
    
    public static void main(String[] args) {
        //simple predicate example
        Predicate<Integer> lessthan = (i) -> (i < 18);
        System.out.println("Result of test: " + lessthan.test(20));
        
        //predicate chaining
        Predicate<Integer> greaterThanTen = (i) -> (i > 10);
        Predicate<Integer> lessThanTwenty = (i) -> (i < 20);
        Boolean result = greaterThanTen.and(lessThanTwenty).test(21);
        System.out.println("Result of test one: " + result);
        
        Boolean result2 = greaterThanTen.and(lessThanTwenty).negate().test(19);
        System.out.println("Result of test two: " + result2);
        
        //testing the function scope predicate
        pred(10, (i) -> (i > 7));
    }
}
