package org.kojaydev;

import org.kojaydev.materi.array.Array;
import org.kojaydev.materi.learnpackage.motor.Motor;
import org.kojaydev.materi.datatype.NonPrimitive;
import org.kojaydev.materi.datatype.Primitive;
import org.kojaydev.materi.oop.Mobil;
import org.kojaydev.materi.oop.learninheritance.Kucing;
import org.kojaydev.materi.oop.learninterface.EmployeeIMPL;
import org.kojaydev.materi.oop.modifer.KelasA;
import org.kojaydev.materi.oop.modifer.KelasB;
import org.kojaydev.materi.operator.Operator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Primitive primitive = new Primitive(); // Contoh Tipe data reference (primitive)
        NonPrimitive nonPrimitive = new NonPrimitive();
        Operator operator = new Operator();
        Array array = new Array();
        Mobil mobilBmw = new Mobil("BMW", 300000);
        EmployeeIMPL employeeIMPL = new EmployeeIMPL();
        Kucing anggora = new Kucing("Anggora", "Danau");

        System.out.println(anggora);
        anggora.makan();
        anggora.makan("Daging");

//        employeeIMPL.lembur();
//        mobilBmw.setKeteranganStock(false);
//
//        mobilBmw.displaySpec();

//        System.out.println(nonPrimitive.name);
//        System.out.println(operator.multiplication);
//        System.out.println(array.arr[2]);

//        Motor.kenalpotMotor();
    }
}