package com.company;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        //menjumlahkan 2 array
        int[] arrayAngka1 = {8,4,7,6,2,23,7,8,4};
        int[] arrayAngka2 = {9,1,2,7,4,3,1,8,10};


        cetakArray(arrayAngka1,"angka 1");
        cetakArray(arrayAngka2,"angka 2");
        cetakArray(tambahArray(arrayAngka1,arrayAngka2),"hasil 1");

        //menggabungkan 2 array
        cetakArray(gabungArray(arrayAngka1,arrayAngka2),"hasil 2");

        //sortir array tapi kebalik
        Arrays.sort(arrayAngka1);
        cetakArray(arrayAngka1,"sortiran");
        //tampilkan hasilnya
        cetakArray(sortKebalik(arrayAngka1),"kebalik");

        //sortir array tapi kebalik jilid 2
        //logikanya si data itu dibalik, yg didepan jdi di akhir
        //yg diakhir jdi didepan dan yg ditengah gak kemana2
        Arrays.sort(arrayAngka2);
        cetakArray(arrayAngka2,"sortiran 2");
        //tampilkan hasilnya
        cetakArray(sortKebalik2(arrayAngka2),"kebalik 2");
    }

    public static void cetakArray(int[] dataArray,String message){
        System.out.println(message + " = " + Arrays.toString(dataArray));
    }

    private static int[] tambahArray(int[] arrayInt1,int[] arrayInt2){
        int[] arrayHasil = new int[arrayInt1.length];
        for(int i=0;i < arrayInt1.length;i++){
            arrayHasil[i] = arrayInt1[i] + arrayInt2[i];
        }
        return arrayHasil;
    }

    private static int[] sortKebalik(int[] dataArray){
        //sortir dataArray
        Arrays.sort(dataArray);
        //buat array bayangan dg isi sama dg array masukan
        int[] arrayBayangan = Arrays.copyOf(dataArray,dataArray.length);
        //lakukan pengulangan
        for(int i=0;i<dataArray.length;i++) {
            //simpan akhir array di awal array bayangan
            arrayBayangan[i] = dataArray[(dataArray.length-1)-i];
        }
        return arrayBayangan;
    }

    private static int[] sortKebalik2(int[] dataArray){
        //sortir dataArray
        Arrays.sort(dataArray);

        //lakukan pengulangan sampai setengah datanya
        for(int i=0;i<dataArray.length/2;i++) {
            //buat variabel backup untuk menyimpan data array lama
            int backup = dataArray[i];
            //simpan akhir array di awal
            dataArray[i] = dataArray[(dataArray.length-1)-i];
            //simpan data awal array yg ada di backup ke akhir array
            dataArray[(dataArray.length-1)-i] = backup;
        }
        return dataArray;
    }

    private static int[] gabungArray(int[] arrayInt1,int[] arrayInt2){
        //buat array baru untuk menampung data
        int[] hasil = new int[arrayInt1.length+arrayInt2.length];
        //masukan data array 1 ke array baru
        for(int i=0;i < arrayInt1.length;i++){
            hasil[i] = arrayInt1[i];
        }
        //masukan data array2 ke array baru
        for(int i = 0;i < arrayInt2.length;i++){
            hasil[arrayInt2.length + i] = arrayInt2[i];
        }
        //kembalikan nilai array hasil
        return hasil;
    }
}
