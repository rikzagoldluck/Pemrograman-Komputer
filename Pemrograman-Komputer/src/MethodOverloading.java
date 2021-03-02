public class MethodOverloading {
    public static void main(String[] args) {
        saySalam();
        saySalam("Rikza");
        saySalam("Rikza" , 19);
    }

//    Method overloading adalah fitur membuat method dengan nama yang sama,
//      tetapi memiliki syarat jumlah atau tipe data parameter tidak boleh sama
    static void saySalam() {
        System.out.println("Assalamu'alaikum");
    }

    static void saySalam(String nama) {
        System.out.println("Assalamu'alaikum " + nama);
    }
    static void saySalam(String nama, int umur) {
        System.out.println("Assalamu'alaikum " + nama + ",umur saya "+ umur + " tahun");
    }
}
