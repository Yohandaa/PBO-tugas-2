package com.pbo4;

public class JamSibukApp {
    public static void main(String[] args) {

        // upcasting
        Mahasiswa fairuzikun = new Asdos(1, 24);
        System.out.println(fairuzikun.getNama("Fairuzikun") + fairuzikun.getJamSibuk());

        Dosen raja = new Dosen(5);
        System.out.println(raja.getNama("Raja OP Damanik") + raja.getJamSibuk());

        // upcasting
        Mahasiswa angel = new Asdos(4, 20);
        System.out.println(angel.getNama("Angel-chan") + angel.getJamSibuk());

        Mahasiswa firman = new Mahasiswa(20);
        System.out.println(firman.getNama("Firman") + firman.getJamSibuk());

        Mahasiswa nid = new Mahasiswa(23);
        System.out.println(nid.getNama("Nid to pass this sem") + nid.getJamSibuk());

        Dosen nivotko = new Dosen(3);
        System.out.println(nivotko.getNama("Nivotko") + nivotko.getJamSibuk());

        int totalJamSibuk = fairuzikun.getJamSibuk() + raja.getJamSibuk() + angel.getJamSibuk() + nid.getJamSibuk()
                        + nivotko.getJamSibuk() + firman.getJamSibuk();
        System.out.println("Total jam sibuk elemen fasilkom adalah " + totalJamSibuk);

}
}
