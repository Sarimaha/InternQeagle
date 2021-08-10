package com.collections.practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class HasDupli 
{
public static void main(String[] args)
{
	int[] data = {1,3,8,3,11,5,6,4,7,6,7};
Set<Integer> store = new LinkedHashSet<>();

for (int name : data) {
    if (store.add(name) == false) {
        System.out.println("found a duplicate element in array : "
                + name);
    }
}
}}