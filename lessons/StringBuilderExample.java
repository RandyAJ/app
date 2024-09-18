package lessons;

// Класс для примеров. StringBuilder
public class StringBuilderExample {
    public static void main(String[] args) {
        // StringBuilder
        char ch = 'A';
        String str = new String();
        str = "migo!";
        StringBuilder builder = new StringBuilder();
        builder.append(ch);
        builder.append(str);

        // Попробуй определить сам результаты выполнения выводов в println(). Подсказка: нужно обратиться к API класса и увидеть что методы возвращают
        String resultStr = builder.toString();
        System.out.println(resultStr);
        System.out.println(resultStr.length());

        builder.setCharAt(5, '?');
        String modifiedStr = builder.toString();
        System.out.println(modifiedStr);

        builder.insert(5, "oo!!");
        String modifiedStr2 = builder.toString();
        System.out.println(modifiedStr2);

        builder.delete(0, 4);
        String modifiedStr3 = builder.toString();
        System.out.println(modifiedStr3);

        // StringBuffer
        // *Important: Семантика методов схожа. Разница между StringBuilder и StringBuffer лишь в том что в последнем разрешено добавлять и удалять символы во многих потоках исполнения программы.
        StringBuffer buffer = new StringBuffer();
        buffer.append("StringBuilder, i'm your father! (after JDK 5.0)");
        String strBuffer = buffer.toString();
        System.out.println(strBuffer);
        // ...
    }
}
