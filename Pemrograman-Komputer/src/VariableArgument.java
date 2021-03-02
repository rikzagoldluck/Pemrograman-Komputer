public class VariableArgument {
    public static void main(String[] args) {
        float[] values = {90,90,90,90,90};
        calculactorKelulusan("Fulan", 50,53,35,55,63);
    }

    static void calculactorKelulusan(String nama, float... values){
        var result = 0;
        for (var value : values){
            result += value;
        }
            int finalResult = result / values.length;
        if ( finalResult > 75 ){
            System.out.println("Selamat " + nama + ", Anda lulus dengan nilai " + finalResult );
        }else{
            System.out.println("Mohon maaf " + nama + ", silahkan belajar lebih giat lagi. Nilai anda " + finalResult);
        }
    }
}
