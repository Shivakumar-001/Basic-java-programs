// Java Program of JavaBean class 
package com.javacodegeeks.javabean; 
public class Student implements java.io.Serializable 
{ 
private int id; 
private String name; 
public Student() 
    { 
    } 
public void setId(int id) 
    { 
        this.id = id; 
    } 
public int getId() 
    { 
        return id; 
    } 
public void setName(String name) 
    { 
        this.name = name; 
    } 
public String getName() 
    { 
        return name; 
    } 
} 
// Java program to access JavaBean class 
package com.javacodegeeks.javabean; 
public class Test { 
public static void main(String args[]) 
    { 
        Student s = new Student(); // object is created 
        s.setName("JavaCodeGeeks"); // setting value to the object 
        System.out.println(s.getName()); 
    } 
} 

/*Output

JavaCodeGeeks
*/