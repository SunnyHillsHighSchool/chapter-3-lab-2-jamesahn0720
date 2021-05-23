//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Stack;
import static java.lang.System.*;


class Main {
  public static void main(String[] args) {
    //add test cases  
    SyntaxChecker test = new SyntaxChecker("(abc(*def)");
    System.out.println(test);
    
    test.setExpression("[{}]");
    System.out.println(test);

    test.setExpression("[");
    System.out.println(test);

    test.setExpression("[{<()>}]");
    System.out.println(test);
    
    test.setExpression("{<html[value=4]*(12)>{$x}}");
    System.out.println(test);

    test.setExpression("[one]<two>{three}(four)");
    System.out.println(test);

    test.setExpression("car(cdr(a)(b)))");
    System.out.println(test);

    test.setExpression("car(cdr(a)(b))");
    System.out.println(test);
  }
}
