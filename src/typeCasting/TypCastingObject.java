package typeCasting;

class A{ }
class B extends A{ }
class C extends A{ }

public class TypCastingObject {
public static void main(String[] args) {
//RUle1: conversion is valid or not
//type od 'b' and 'c' must have some relationship (either parent to child or child to parent)
//	A a = new B(); 
//	C c = (C) a; //valid as per rule1
////Rule2: assignment is valid or not
////C must be either same or child of 'A'
//	B b = new B();
////	C c1 = (C) b;  //invalid as per rule2 //compile error
//	C c2 = (C) a;  //valid as per rule2 
////Rule3: 
////underlying object type of b must be either same or child of 'C'
//	A a1 = new B();
//	C c3= (C) a;	//invalid as per rule3 //runtime error
//
////rule1, rule2, rule3
//	A a2 = new B();
//	B b1=(B) a; 	//valid as per rule1, rule2, rule3
}
}
