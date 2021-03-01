public class HelloWorld {
    public static String name = "Rikza";
    public static int umur = 19;

    public static void main(String[] args) {
        salam(HelloWorld.name, HelloWorld.umur);
    }

    public static void salam(String name, int umur){
        System.out.println("Assalamu'alaikum, nama saya  "+ name + ", umur saya " +umur);
    }
}
