package org.kojaydev.materi.oop.learninterface;

public class EmployeeIMPL implements Employee{

    @Override
    public void lembur() {
        System.out.println("Hari ini lembur");
        System.out.println("Status Pegawai = " + STATUS);
    }


}
