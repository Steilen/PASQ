import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str = "Hello, world!";
        Stack<Character> stack = new Stack<>();

        // Добавляем символы в стек
        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        // Извлекаем символы из стека и формируем новый строку
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        System.out.println(reversed.toString());
    }
}