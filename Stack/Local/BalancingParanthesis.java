package Stack.Local;

public class BalancingParanthesis<T> {
    StackNode top = null;

    boolean isEmpty() {return top == null;}

    T displayTop_Peek(){
        if(!isEmpty()){
            System.out.println(("Peek Top: "+top.data+ " is the latest"));
            return (T) top.data;
        } else{
            System.out.println("Peek Top:- Operation cannot be done, Stack empty!");
        }
        return null;
    }

    void insertHead_Push(T data){
        StackNode newNode = new StackNode(data);
        newNode.next = top;
        top = newNode;
    }

    void deleteHead_pop(){
        if(!isEmpty()){
            System.out.println(("Detele Top: "+top.data+ " is the latest"));
            top = top.next;
            return;
        } else{
            System.out.println("Delete Top:- Operation cannot be done, Stack empty!");
        }
    }

    void balanceParanthesis(T expression){
        top = null;
        String expressionString = expression.toString();
        String onlyBrackets = expressionString.replaceAll("[^\\(\\)\\[\\]\\{\\}]", "");
        System.out.println("Clean result: " + onlyBrackets);
        String[] data = onlyBrackets.split("");
        int len = onlyBrackets.length();
        boolean isBalanced = true;
        for(int i = 0 ; i < len; i++){
            if(data[i].equals("{") || data[i].equals("[") || data[i].equals("(")){
                insertHead_Push((T)data[i]);
            }else if ((data[i].equals("}") && "{".equals(displayTop_Peek())) ||
                    (data[i].equals("]") && "[".equals(displayTop_Peek())) ||
                    (data[i].equals(")") && "(".equals(displayTop_Peek()))) {
                deleteHead_pop();
            } else {
               isBalanced = false;
               break;
            }
        }

        if(isEmpty() && isBalanced){
            System.out.println("The paranthesis are balanced");
        }else{
            System.out.println("The paranthesis are not balanced");
        }
    }

    public static void main(String[] args){
        BalancingParanthesis<String> stack = new BalancingParanthesis<>();
        System.out.println("1st expression");
        stack.balanceParanthesis("{[()]}");
        System.out.println("***************");
        System.out.println("2nd expression");
        stack.balanceParanthesis("{[(])}");
        System.out.println("***************");
        System.out.println("3rd expression");
        stack.balanceParanthesis("((a+b)*c)");
        System.out.println("***************");
        System.out.println("4th expression");
        stack.balanceParanthesis("())[]");
        System.out.println("***************");
    }
}
