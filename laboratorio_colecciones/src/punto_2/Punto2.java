package punto_2;

import java.util.Stack;


public class Punto2 {
   Stack<Object> stack = new Stack<>();

   public void push(Object o){
      if(stack.isEmpty()||o.getClass().equals(stack.peek().getClass())){
         stack.push(o);
      }else{
         System.out.println("El objeto no es de la misma clase que el objeto de la cima");
      }
   }

   public Object pop(){
      return stack.pop();
   }

   public Object peek(){
      return stack.peek();
   }


   public static void main(String[] args) {
      Punto2 stack = new Punto2();
      stack.push((Integer)2);
      stack.push((Integer)3);
      stack.push("La mala pa Ekin");
   }
}
