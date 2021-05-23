//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxChecker
{
 private String exp;
 private Stack<Character> symbols;

 public SyntaxChecker()
 {
  exp = "";
   symbols = new Stack<Character>();
 }

 public SyntaxChecker(String s)
 {
   exp = s;
   symbols = new Stack<Character>();
 }
 
 public void setExpression(String s)
 {
  exp = s;
   while(!symbols.empty())
   {
     symbols.pop();
   }
 }
 
 public boolean check(Character c)
  {
    Character opposite = null;
    c = c.charValue();
    switch(c)
    {
      case '}': opposite = '{'; break;
      case ')': opposite = '('; break;
      case '>': opposite = '<'; break;
      case ']': opposite = '['; break;
    }
    return symbols.peek()==opposite;
  }

 public boolean checkExpression()
 {
  for(int i = 0; i < exp.length(); i++)
  {
    char c = exp.charAt(i);
    if(c=='{'||c=='}'||c=='<'||c=='>'||c=='('||c==')'||c=='['||c==']')
    {
      if(!symbols.empty() && check((Character)exp.charAt(i)))
        symbols.pop();
      else
        symbols.push(exp.charAt(i));
    }
  }
  return symbols.empty();
 }

 //write a toString
 public String toString()
  {
    if(checkExpression())
    {
      return exp+" is correct.\n";
    }
    return exp+" is incorrect.\n";
  }
}
