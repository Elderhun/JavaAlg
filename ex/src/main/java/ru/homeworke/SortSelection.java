package ru.homeworke;

import java.util.Arrays;
import java.util.Random;


public class SortSelection {

    public static void main(String[] args) {
        int size = 5;
        NoteBook[] noteBooks = getNotebooks(size);
        NoteBook[] noteBooks1 = new NoteBook[size];
        System.arraycopy(noteBooks,0,noteBooks1,0,noteBooks.length);
        NbComp comp = new NbComp();

        Var.MergeSort.sort(noteBooks1,comp);
        System.out.println(Arrays.toString(noteBooks1));

    }


    private static NoteBook[] getNotebooks(int l){
        Random r = new Random();
        NoteBook[] noteBooks = new NoteBook[l];
        for (int i = 0; i < noteBooks.length; i++) {
            noteBooks[i] = new NoteBook.Builder()
                    .setPrice(Fac.price[r.nextInt(0, Fac.price.length-1)])
                    .setRam(Fac.ram[r.nextInt(0, Fac.ram.length-1)])
                    .setBrand(NoteBook.Brand.randomBrand())
                    .build();
        }
        return noteBooks;
    }

}