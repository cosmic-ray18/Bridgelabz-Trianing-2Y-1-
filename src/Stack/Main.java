package Stack;

public class Main {
    public static void main(String[] args){
        StackOps st = new StackOps();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);


        st.display();
        System.out.println();
        
        System.out.println("Elements After pop");
        st.pop();
        st.display();
    }
}
