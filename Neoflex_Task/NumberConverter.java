import java.lang.StringBuilder;

public class NumberConverter {
    private int sizeOfInt = 8;
    private int bitsNumber = 4;
    private int halfbyte = 0x0F;
    private char[] digits =
            {
            '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
            };

    public static String Converter(int x) {
        StringBuilder builder = new StringBuilder(sizeOfInt);
        builder.setLength(sizeOfInt);
        for (int i = sizeOfInt - 1; i >= 0; --i)
        {
            int j = x & halfbyte;
            builder.setCharAt(i, digits[j]);
            x >>= bitsNumber;
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        int x = 50551;
        String x1 = Converter(x);
        System.out.println(x1);
    }
}