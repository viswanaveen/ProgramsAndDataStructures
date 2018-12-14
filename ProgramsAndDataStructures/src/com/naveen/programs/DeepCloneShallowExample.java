package com.naveen.programs;

import java.util.Arrays;  

public class DeepCloneShallowExample implements Cloneable {  
    public int x;  
   
    public String toString() {  
        return String.valueOf(x);  
    }  
   
    public Object clone () {  
        try {  
            return super.clone();  
        } catch (CloneNotSupportedException e) {  
            throw new InternalError();  
        }  
    }  
   
    public static DeepCloneShallowExample[] shallowCopy(DeepCloneShallowExample[] array) {  
        return (DeepCloneShallowExample[]) array.clone();  
    }  
   
    public static DeepCloneShallowExample[] deepCopy(DeepCloneShallowExample[] array) {  
    	DeepCloneShallowExample[] result =  shallowCopy(array);  
        for(int i=0; i<result.length; ++i)  
            result[i] = (DeepCloneShallowExample) result[i].clone();  
        return result;  
    }  
   
    public static void main(String[] args) {  
    	DeepCloneShallowExample[] array1 = {new DeepCloneShallowExample()};  
    	DeepCloneShallowExample[] array2 = shallowCopy(array1);  
    	DeepCloneShallowExample[] array3 = deepCopy(array1);  
        array1[0].x++;  
        System.out.println("array1=" + Arrays.asList(array1));  
        System.out.println("array2=" + Arrays.asList(array2));  
        System.out.println("array3=" + Arrays.asList(array3));  
    }  
}  