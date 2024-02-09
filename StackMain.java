package deep27;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack=new CustomStack(5);
        stack.push(78);
        stack.push(8);
        stack.push(28);
        stack.push(34);
        stack.push(56);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //if we use here one more pop it will error since size is of 5
        System.out.println();
        DynamicStack quack=new DynamicStack(5);
        quack.push(78);
        quack.push(8);
        quack.push(28);
        quack.push(34);
        quack.push(56);

        System.out.println(quack.pop());
        System.out.println(quack.pop());
        System.out.println(quack.pop());
        System.out.println(quack.pop());
        System.out.println(quack.pop());
        System.out.println(quack.pop());
        //here 6th item will not show error since size is limited
    }
}
