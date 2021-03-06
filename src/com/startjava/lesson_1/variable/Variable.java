package com.startjava.lesson_1.variable;

public class Variable {   
    public static void main(String[] args) {
        //Ниже приведены характеристики моего текущего персонального компьютера
        byte numberOfСpuCores = 2;
        short сpuFrequency = 3200;
        int sizeOfRam = 800000000;
        long ramFrequency = 160000000000L; 
        float totalStorageCapacity = 476.94f;
        double freeStorageCapacity = 268.96;
        boolean windowsSystеm = true;
        char finish = '\u0021';

        System.out.println("Specifications");
        System.out.println("Number of CPU Cores:" + "                     " + numberOfСpuCores);
        System.out.println("CPU Frequency, MHz:" + "                   " + сpuFrequency);
        System.out.println("Size of RAM, Byte:" + "               " + sizeOfRam);
        System.out.println("RAM Frequency, Hz:" + "            " + ramFrequency);
        System.out.println("Total Storage Capacity, GB:" + "         " + totalStorageCapacity);
        System.out.println("Free Storage Capacity, GB:" + "          " + freeStorageCapacity);
        System.out.println("Is Windows operation system?:" + "         " + windowsSystеm);
        System.out.println("Home work is done" + finish);
    }
}