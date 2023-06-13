package telran.util.tests;
import static telran.util.Arrays.*;

import java.util.Arrays;
import java.util.Comparator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ArraysTest 
{
	Integer[] numbers = {10, 5, -5, 100, 200};
	String[] strings = {"lmn", "a", "ab", "abc","b", "ba"};	
	
@Test
	void bubbleSortComparatorTest() 
	{
		Integer [] expected = {10, 100, 200,-5, 5};
		Integer [] array = {10, 5,-5, 100, 200};
	bubbleSort(array,new EvenOddComparator());
	assertArrayEquals(expected,array);
	}
@Test
	void EvenOddComparatorTest() 
	{
	Comparator<Integer> comp = new EvenOddComparator();
	assertTrue(comp.compare(4, 3) < 0);
	assertTrue(comp.compare(7, 6) > 0);
	assertTrue(comp.compare(5, 5) == 0);
	} 

@Test
	void standartSortEvenOddComparatorTest() 
	{
	Comparator<Integer> comp = new EvenOddComparator();
	Integer[] array = {10, 5, 110, 9, 22, 33};
	Integer[] expected = {10, 110, 22, 5, 9, 33};
	Arrays.sort(array, comp);
	assertArrayEquals(expected, array);
	}
	}