import java.util.*;
import java.io.*;

/**
 * Created by diksha sharma on 5/23/2016.
 * Problem Statement: Given two linked lists implementing sorted sets, write functions for
 * union, intersection, and set difference of the sets.
 */
public class LLMain
{
    public static void main(String args[])
    {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        l1.add(1);
        l1.add(3);
        l1.add(5);
        l1.add(6);
        l1.add(21);
        l1.add(41);
        l2.add(9);
        l2.add(10);
        l2.add(3);
        l2.add(2);
        l2.add(4);
        l2.add(15);
        l2.add(6);
        l2.add(5);
        l2.add(1);
        Collections.sort(l1);
        System.out.println("List 1: ");
        for(int i=0; i< l1.size(); i++)
        {
            System.out.print(l1.get(i) + "  ");
        }
        System.out.println();
        Collections.sort(l2);
        System.out.println("List 2: ");
        for(int i=0; i< l2.size(); i++)
        {
            System.out.print(l2.get(i) + "  ");
        }
        System.out.println();
        System.out.println();
        intersection(l1, l2);
        union(l1, l2);
        setDifference(l1, l2);

    }

    public static void intersection(LinkedList<Integer> lTemp1, LinkedList<Integer> lTemp2)
    {
        LinkedList<Integer> lResult = new LinkedList<Integer>();

        int iIndex1 = 0;
        int iIndex2 = 0;
        while(iIndex1 < lTemp1.size() && iIndex2 < lTemp2.size())
        {
            if(lTemp1.get(iIndex1) == lTemp2.get(iIndex2))
            {
                lResult.add(lTemp1.get(iIndex1));
                iIndex1++;
                iIndex2++;
            }
            else if(lTemp1.get(iIndex1) > lTemp2.get(iIndex2))
            {
                iIndex2++;
            }
            else if(lTemp1.get(iIndex1) < lTemp2.get(iIndex2))
            {
                iIndex1++;
            }
        }

        System.out.println("Intersection: ");
        for(int i=0; i< lResult.size(); i++)
        {
            System.out.print(lResult.get(i) + "  ");
        }
        System.out.println();
    }

    public static void union(LinkedList<Integer> lTemp1, LinkedList<Integer> lTemp2)
    {
        LinkedList<Integer> lResult = new LinkedList<Integer>();

        int iIndex1 = 0;
        int iIndex2 = 0;
        while(iIndex1 < lTemp1.size() && iIndex2 < lTemp2.size())
        {
            if(lTemp1.get(iIndex1) == lTemp2.get(iIndex2))
            {
                lResult.add(lTemp1.get(iIndex1));
                iIndex1++;
                iIndex2++;
            }
            else if(lTemp1.get(iIndex1) > lTemp2.get(iIndex2))
            {
                lResult.add(lTemp2.get(iIndex2));
                iIndex2++;
            }
            else if(lTemp1.get(iIndex1) < lTemp2.get(iIndex2))
            {
                lResult.add(lTemp1.get(iIndex1));
                iIndex1++;
            }
        }

        if(iIndex1 < lTemp1.size())
        {
            while(iIndex1 < lTemp1.size())
            {
                lResult.add(lTemp1.get(iIndex1));
                iIndex1++;
            }
        }

        if(iIndex2 < lTemp2.size())
        {
            while(iIndex2 < lTemp2.size())
            {
                lResult.add(lTemp2.get(iIndex2));
                iIndex2++;
            }
        }

        System.out.println("Union: ");
        for(int i=0; i< lResult.size(); i++)
        {
            System.out.print(lResult.get(i) + "  ");
        }
        System.out.println();
    }

    public static void setDifference(LinkedList<Integer> lTemp1, LinkedList<Integer> lTemp2)
    {
        LinkedList<Integer> lResult = new LinkedList<Integer>();

        int iIndex1 = 0;
        int iIndex2 = 0;
        while(iIndex1 < lTemp1.size() && iIndex2 < lTemp2.size())
        {
            if(lTemp1.get(iIndex1) == lTemp2.get(iIndex2))
            {
                iIndex1++;
                iIndex2++;
            }
            else if(lTemp1.get(iIndex1) > lTemp2.get(iIndex2))
            {
                iIndex2++;
            }
            else if(lTemp1.get(iIndex1) < lTemp2.get(iIndex2))
            {
                lResult.add(lTemp1.get(iIndex1));
                iIndex1++;
            }
        }

        if(iIndex1 < lTemp1.size())
        {
            while(iIndex1 < lTemp1.size())
            {
                lResult.add(lTemp1.get(iIndex1));
                iIndex1++;
            }
        }

        System.out.println("Set Difference: ");
        for(int i=0; i< lResult.size(); i++)
        {
            System.out.print(lResult.get(i) + "  ");
        }
        System.out.println();
    }
}
