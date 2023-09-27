//public class JavaSem2 {
//    public static void main(String[] args) {
//        int i;
//        try {
//            i = 10 / 0;
//        } catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//            }
//    }
//}

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//public class JavaSem2 {
//    public static void main(String[] args) {
//        try {
//            FileWriter writer = new FileWriter("text");
//            writer.write("Hello");
//            writer.close();
//
//            FileReader reader= new FileReader("text");
//            String str = "";
//            while (reader.ready()){
//                str += (char)reader.read();
//            }
//            reader.close();
//            System.out.println(str);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}

//public class JavaSem2 {
//    public static void main(String[] args) {
//        String s = "Real Madrid";
//        StringBuilder builder = new StringBuilder("Real");
//        builder.append(" Madrid");
//        System.out.println(builder);
//
//        builder.reverse();
//        System.out.println(builder);
//
//
//        builder.replace(0, builder.length(), "Barcelona");
//        System.out.println(builder);
//    }
//}


//Задание:
//        Объявить строку с текстом, подсчитать количество запятых

//public class JavaSem2 {
//    public static void main(String[] args) {
//        String s = "Real, ,,,,,Madrid,";
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == ',') {
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}

//Задание:
//Задать две строки. Найти все вхождения первой строки во вторую.
//Вывести в консоль количество и индексы начала

//public class JavaSem2 {
//
//        /* Проверяет, является ли строка пустой ("") или нулевой. */
//        public static boolean isEmpty(String s) {
//            return s == null || s.length() == 0;
//        }
//
//        /* Подсчитывает, сколько раз подстрока появляется в большей строке. */
//        public static int countMatches(String text, String str)
//        {
//            if (isEmpty(text) || isEmpty(str)) {
//                return 0;
//            }
//
//            int index = 0, count = 0;
//            while (true)
//            {
//                index = text.indexOf(str, index);
//                if (index != -1)
//                {
//                    count ++;
//                    System.out.print(index);
//                    index += str.length();
//                }
//                else {
//                    break;
//                }
//            }
//
//            return count;
//        }
//
//        public static void main(String[] args)
//        {
//            String text = "AABCCAAADCBBAADBBC";
//            String str = "AA";
//
//            int count = countMatches(text, str);
//            System.out.println(count);
//        }
//    }

//    Вариант 2
//public class JavaSem2 {
//    public static void main(String[] args) {
//        String str2 = "abrjkl asdajkl asdajkl abro";
//        String str1 = "as";
//        int k = 0;
//        int count1 = 0;
//        for (int i = 0; i < str2.length(); i = i + str1.length() + count1) {
//            count1 = str2.indexOf(str1, i);
//            if (count1 == -1) {
//                break;
//            } else {
//                System.out.println(count1);
//                k++;
//            }
//        }
//        System.out.println(k);
//    }
//}

//Задание 2
//        Заполнить строку и StringBuilder 1000ю символами. Сравнить время заполнения

public class JavaSem2 {
    public static void main(String[] args) {
        String str1 = "";

        StringBuilder str2 = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            str1 += Character.getName(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            str2.append(Character.getName(i));
        }

        end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}