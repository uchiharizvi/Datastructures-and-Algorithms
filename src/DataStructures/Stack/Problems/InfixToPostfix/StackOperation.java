package DataStructures.Stack.Problems.InfixToPostfix;

public class StackOperation {
    public int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    public String infixToPostfix(String expression) {
        String result = new String("");
        return "";
    }
}
