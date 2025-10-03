public class StringOps {
    public static void main(String[] args) {
        
        example1();
        example2();
        example3();
        example4();
    }

    public static void example1() {
        System.out.println("\n=== Ejemplo 1: Comparación de Strings ===");

        String s1 = "Hello World";
        String s2 = new String("Hello World");
        String s3 = "Hello World";

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        System.out.println("¿s1 == s2? " + (s1 == s2));
        System.out.println("¿s2 == s3? " + (s2 == s3));
        System.out.println("¿s1 == s3? " + (s1 == s3));
    }

    public static void example2() {
        System.out.println("\n=== Ejemplo 2: Operaciones con una frase ===");

        String s4 = "The quick brown fox jumped over the lazy dog";

        System.out.println("Longitud: " + s4.length());

        char[] strAsArr = s4.toCharArray();
        System.out.println("Longitud del arreglo: " + strAsArr.length);
        System.out.println("Array como texto: " + new String(strAsArr));
        System.out.println("Primer carácter: " + strAsArr[0]);
        System.out.println("Último carácter: " + strAsArr[strAsArr.length - 1]);

        System.out.println("Índice de 'T': " + s4.indexOf('T'));
        System.out.println("Índice de 'g': " + s4.indexOf('g'));
    }

    public static void example3() {
        System.out.println("\n=== Ejemplo 3: Comparaciones, regex y limpieza ===");

        String s5 = "Washington";
        String s6 = new String("Washington");
        String s7 = "WASHINGTON";

        System.out.println("¿s5.equals(s6)? " + s5.equals(s6));
        System.out.println("¿s5.equals(s7)? " + s5.equals(s7));
        System.out.println("¿s5.equalsIgnoreCase(s7)? " + s5.equalsIgnoreCase(s7));

        System.out.println("s5 en minúsculas: " + s5.toLowerCase());
        System.out.println("s7 en minúsculas: " + s7.toLowerCase());

        System.out.println("¿s5.toLowerCase().equals(s7.toLowerCase())? " +
                s5.toLowerCase().equals(s7.toLowerCase()));

        System.out.println("s5 en mayúsculas: " + s5.toUpperCase());
        System.out.println("s7 en mayúsculas: " + s7.toUpperCase());

        String regexStr = "^W.*";
        System.out.println("¿s5 coincide con ^W.*? " + s5.matches(regexStr));
        System.out.println("¿s7 coincide con ^W.*? " + s7.matches(regexStr));

        String s9 = "     WASHINGTON          ";
        System.out.println("¿s7.equals(s9)? " + s7.equals(s9));

        s9 = s9.strip();  // Elimina espacios en blanco al inicio y al final
        System.out.println("Después de strip: [" + s9 + "]");
        System.out.println("¿s7.equals(s9)? " + s7.equals(s9));
    }


    public static void example4() {
        System.out.println("\n=== Ejemplo 4: Concatenación y Substrings ===");

        String s1 = "Washington";
        String s2 = " DC";

        s1 = s1.concat(s2);
        System.out.println("Después de concat: " + s1);

        s1 = s1.substring(0, 10);
        System.out.println("Después de substring(0, 10): " + s1);

        System.out.println("s1.substring(7, 10): " + s1.substring(7, 10));
        System.out.println("s1.substring(7): " + s1.substring(7));
    }
}
