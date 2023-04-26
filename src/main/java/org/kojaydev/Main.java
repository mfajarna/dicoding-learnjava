package org.kojaydev;

import org.kojaydev.materi.array.Array;
import org.kojaydev.materi.learnpackage.motor.Motor;
import org.kojaydev.materi.datatype.NonPrimitive;
import org.kojaydev.materi.datatype.Primitive;
import org.kojaydev.materi.operator.Operator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Primitive primitive = new Primitive(); // Contoh Tipe data reference (primitive)
        NonPrimitive nonPrimitive = new NonPrimitive();
        Operator operator = new Operator();
        Array array = new Array();

        System.out.println(nonPrimitive.name);
        System.out.println(operator.multiplication);
//        System.out.println(array.arr[2]);

        Motor.kenalpotMotor();
    }
}