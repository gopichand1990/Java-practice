//convert an infix expression to postfix
import java.util.*;
import java.io.*;
public class Conversion{
 void convert_infix_to_Postfix(String s){
    int len=s.length();
	if(len<=1){
	   return;
	   }(a+b)*c
	Stack<Character> k=new Stack<Character>();
//	System.out.println("size is "+k.size());
   int i;
	HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
	hm.put(')',4);
	hm.put('(',4);
	hm.put('^',3);//m
	hm.put('*',2);
	hm.put('/',2);
	hm.put('+',1);
	hm.put('-',1);//n
    for(i=0;i<len;i++){
        //"a+b*(c^d-e)^(f+g*h)-i";
        if(s.charAt(i)=='^'||s.charAt(i)=='*'||s.charAt(i)=='/'||s.charAt(i)=='+'||s.charAt(i)=='('||s.charAt(i)=='-'){
            System.out.println("value of i is "+s.charAt(i));?/(
			if(k.size() > 0){
				if(k.peek()!='('){
					Integer m=hm.get(k.peek());//1patadi
				   Integer n=hm.get(s.charAt(i));//2kothadi
				   if(m==null||n==null){
				       System.out.println("unknown symbol"+s.charAt(i));
				       return;
				   }
						if(n>m&&s.charAt(i)!='('&&s.charAt(i)!=')'){
						        k.push(s.charAt(i));	
						}
						else{
						    if(k.size()>0){
							System.out.println(k.pop());
						    }
						}
			    }
			   else if(k.peek()=='('){
			      k.push(s.charAt(i));//+*(
			   }
			 else {
			 if(s.charAt(i)==')')
			    {
					while(k.peek()!='('&&k.size()>0){
					System.out.println(k.pop());
					k.pop();
					}
				}
		    }
		 else{
		    // System.out.println("inside else");
			 k.push(s.charAt(i));(
		     //System.out.println("inside else after pushing "+k.peek());
			}
	
	    }	
		else{
		    System.out.println(s.charAt(i));//abcd^e-f
		    //System.out.println("after printing size is "+k.size());
		}
    }
    if(i==len){
    while(k.size()>0){
        System.out.println(k.pop());
    }
    }
 }
 public static void main(String[] args){
   Conversion c=new Conversion();
   String s="a+b*(c^d-e)^(f+g*h)-i";
   c.convert_infix_to_Postfix(s);
   }
}   
//abcd^e-fgh*+^*+i-
//prefix to infix conversion
//compiled
import java.util.*;
public class Conversion1{
   Stack<String> convert_prefix_to_infix(String s){
       Stack<String> k=new Stack<String>();
      int len=s.length();
	  if(len<1){
	    return k ;
	  }
	  for(int i=len-1;i>=0;i--){
	      System.out.println(s.charAt(i));
	    if(s.charAt(i)!='+'&&s.charAt(i)!='-'&&s.charAt(i)!='*'&&s.charAt(i)!='/'&&s.charAt(i)!='^'){
             String n=Character.toString(s.charAt(i));
		     k.push(n);
		     System.out.println(k.peek());
		}
		else{
		   if(k.size()>=2){
		      String m="("+k.pop()+s.charAt(i)+k.pop()+")";
			  k.push(m);
			  
			  System.out.println("after inserting "+k.peek());
		   }
		}
	  }
	 return k;
	}
	public static void main(String[] args){
	 Conversion1 c=new Conversion1();
	 String s="*-A/BC-/AKL";
	 Stack<String> m=new Stack<String>();
	 m=c.convert_prefix_to_infix(s);
	 while(m.size()>0){
	      System.out.println(m.pop());
	 }
	 }
}
//postfix to prfix
import java.util.*;
public class Conversion3{
  Stack<String> convert_postfix_to_prefix(String input){
  Stack<String> s=new Stack<String>();
    for(int i=0;i<input.length();i++){
	   if(input.charAt(i)!='*'&&input.charAt(i)!='/'&&input.charAt(i)!='+'&&input.charAt(i)!='-'&&input.charAt(i)!='^'){
		      String t=Character.toString(input.charAt(i));
			  s.push(t);
		}
		else{
		   if(s.size()>0){
		      String t1=Character.toString(input.charAt(i))+s.pop()+s.pop();
			  s.push(t1);
			  }
          }
    }
    return s;
  }           
public static void main(String[] args){
	 Conversion3 c2=new Conversion3();
	 String s="AB+CD-*";
	 Stack<String> n=new Stack<String>();
	 n=c2.convert_postfix_to_prefix(s);
	 while(n.size()>0){
	      System.out.println(n.pop());
	 }
	 }
}


The stock span problem is a financial problem where we have a series of n daily price quotes for a stock and we need to calculate span of stock’s price for all n days. ?The span Si of the stock’s price on a given day i is defined as the maximum number of consecutive days just before the given day, for which the price of the stock on the current day is less than or equal to its price on the given day.?For example, if an array of 7 days prices is given as {100, 80, 60, 70, 60, 75, 85}, then the span values for corresponding 7 days are {1, 1, 1, 2, 1, 4, 6}



Input: { 10, 4, 5, 90, 120, 80 };  
Output: 1 1 2 4 5 1

import java.util.*;
class stock_Span_Problem{
    void print_stock_span(int[] a){
	   if(a.length()<=1){
	     return;
	   }
	   Stack<Integer> s=new Stack<Integer>();
	   int k;
	   s.push(i);//0 
			 System.out.println(K);
	   for(int i=1;i<=a.length;i++){//1 1 2 
		  if(a[s.peek()]>a[i]){
		       s.push(i);// 0 
			   System.out.println(k);
		  }
		  while(s.size()>=0&&a[s.peek()]<=a[i]){
		     s.pop();
			 }
		   if(s.size()==0){
		      System.out.println(i-s.peek());
			  }
			else{
               System.out.prinln(i+1);
            }			   
           s.push(i);
		}
	}
	public static void main(String[] args){
	    stock_Span_Problem s=new stock_Span_Problem();
	    int a[]={10, 4, 5, 90, 120, 80};
		s.print_stock_span();
		}
}

//compiled

import java.util.*;
public class stock_Span_Problem{
    void print_stock_span(int[] a){
	   if(a.length<=1){
	     return;
	   }
	   Stack<Integer> s=new Stack<Integer>();
	   int k=1;
	   int i=0;
	   s.push(i);//0 
	         System.out.println("element is "+a[i]);
			 System.out.println(k);
	   for(i=1;i<a.length;i++){//1 1 2 
	     int flag=0;
		  if(a[s.peek()]>a[i]){
		       s.push(i);// 0 1
		       System.out.println("element is "+a[i]);
		       flag=1;
			   System.out.println(k);
		  }
		  while(s.size()>0&&a[s.peek()]<=a[i]){
		     s.pop();
			 }
		   if(s.size()==0){
		      System.out.println("element is "+a[i]);
		      System.out.println(i+1);
		      s.push(i);
			  }
			else{
			    if(flag!=1){
               System.out.println("element is "+a[i]);
               System.out.println(i-s.peek());
			    }
            }			   
           s.push(i);
		}
	}
	public static void main(String[] args){
	    stock_Span_Problem s=new stock_Span_Problem();
	    int a[]={10, 4, 5, 90, 120, 80};
		s.print_stock_span(a);
		}
}

//

//Input: [()]{}{[()()]()}
Output: Balanced

Input: [(])
Output: Not Balanced

import java.util.*;
class Balanced_paranthesis{
       bool check_balanced_paranthesis(String s){
	   if(s.length()<0){
	       System.out.println("Enter correct input");
		   return false;
		}
		Stack<Character> k=new stack<Character>();
		 for(int i=0;i<s.length();i++){
		  if(s.charAt[i]=="{"||s.charAt[i]=="("||s.charAt[i]=="["){
		    k.push(s.charAt[i]);//
		  }
		  if(s.charAt[i]=="}"||s.charAt[i]==")"||s.charAt(i)=="]"){
		    if(s.charAt(i)=="}"){
			   Character c='';
			   while(k.size()>0&&c!='{'){
			      c=k.pop();
				 }
				if(s.size()==0){
				   k.push(s.charAt(i));
				}
			}
			if(k.charAt(i)=="]"){
			   Character c='';
			   while(k.size()>0&&c!='['){
			      c=k.pop();[
				 }
			    if(s.size()==0){
				   k.push(s.charAt(i));
			    }
			}
			if(s.charAt(i)==")"){
			   Character c='';
			   while(k.size()>0&&c!='('){
			      c=k.pop();
				}
			   if(s.size()==0){
				   k.push(s.charAt(i));
			   }
			}
		 }
		}
		 if(k.size()>0){
		   return false;
		   }
		  return true;
		}
		public static void main(String[] args){
		   Balanced_paranthesis b=new Balanced_paranthesis();
		   String s="[()]{}{[()()]()}"
		   bool a=b.check_balanced_paranthesis(s);
		   if(a){
		      System.out.println("balanced");
			}
			else{
			  System.out.println("not balanced");
			}
		}
}
//
11 -- 13
13 -- 21
21 -- -1
3 -- -1//3 
class Next_great_element{
    void find_next_greater_element(int[] a){
	   if(a.length()<1){
	      return;
		  }
	   Stack<Integer> s=new Stack<Integer>();
	     
		 int[] b =int[] b[a.length];
		 int j=0;
		 s.push[a[a.length-1]];
		 b[j]=-1;
		 j++;
	   for(int i=length-2;i>=0&&j<length;i--){
	     if(s.peek()>a[i]){
		    s.push[a[i]);
			b[j]=s.peek();
			j++;
			//System.out.pintln(s.peek());
		 }
		 else{
		   while(s.size()>0&&s.peek<=a[i])){
		     s.pop();
			 }
			if(s.size()==0){
			   s.push(a[i]);
			   b[j]=-1;
			   j++;
			   }
			else{
			  b[j]=s.peek();
			  j++;
			  s.push(a[i]);
			  }
		  }
		}
		for(int k=(b.length)-1;k>=0;k++){
		  System.out.println(b[k]);
		  }
    }
	public static void main(String[] args){
	  Next_great_element n=new Next_great_element();
	  int[] a={11,13,21,3};
	  n.find_next_greater_element(a);
	  }
}

// [1, 1, 2, 3, 4, 2, 1]
[-1, -1, 1, 2, 2, 1, -1]
1 3  //1 2 3 4
2 2  //o(n^2)+o(n)
3 1  //o(n)
4 1 

class Check_frequency{
   void print_next_great_frequency_element(int[] a){
       if(a.length()<1){
	      System.out.println("enter valid input");
	   }
	   HashMap<Integer,Integeer> hm=new HashMap<Integer,Integer>();
	   Stack<integer> s=new Stack<Integer>();
	   for(int i=0;i<a.length();i++){
	     if(hm.contains(a[i]){
		     hm.put(a[i],hm.get((a[i])+1));
		 }
		 else{
		    hm.put(a[i],1);
		 }
	   }
	   //stack Number of NGEs to the right
Given an array of n integers and q queries, print the number of next greater elements to the right of the given index element.
Examples:
Input : a[] = {3, 4, 2, 7, 5, 8, 10, 6}  
              q = 2 
              index = 0, 
              index = 5
Output: 4
	   
//
	   
	   
	   
	   
	      
       	   

    	
		      
	      
	    
		   
		
		 
			
				  
				  
		   
		     
		   
		     
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	       
		 


//stock span problem
7. Next Greater Element
Given an array, print the Next Greater Element (NGE) for every element. The Next greater Element for an element x is the first greater element on the right side of x in array. Elements for which no greater element exist, consider next greater element as -1.


Input: 11, 13, 21, 3
Output:
11 -- 13
13 -- 21
21 -- -1
3 -- -1

8. Next Greater Frequency Element
Given an array, for each element find the value of nearest element to the right which is having frequency greater than as that of current element. If there does not exist an answer for a position, then make the value ‘-1’.

Input : a[] = [1, 1, 2, 3, 4, 2, 1] 
Output : [-1, -1, 1, 2, 2, 1, -1]



9. Number of NGEs to the right
Given an array of n integers and q queries, print the number of next greater elements to the right of the given index element.
Examples:
Input : a[] = {3, 4, 2, 7, 5, 8, 10, 6}  
              q = 2 
              index = 0, 
              index = 5
Output: 4 
              1



10. Maximum product of indexes of next greater on left and right
Given an array a[1..N]. For each element at position i (1 <= i <= N). Where
1. L(i) is defined as closest index j such that j < i and a[j] > a[i]. If no such j exists then L(i) = 0.
2. R(i) is defined as closest index k such that k > i and a[k] > a[i]. If no such k exists then R(i) = 0.
LRProduct(i) = L(i)*R(i) .
We need to find an index with maximum LRProduct
Examples:
Input : 1 1 1 1 0 1 1 1 1 1?Output : 24?For {1, 1, 1, 1, 0, 1, 1, 1, 1, 1} all element are same except 0. So only for zero their exist greater element and for others it will be zero. for zero, on left 4th element is closest and greater than zero and on right 6th element is closest and greater. so maximum?product will be 4*6 = 24.
Input : 5 4 3 4 5?Output : 8?For {5, 4, 3, 4, 5}, L[] = {0, 1, 2, 1, 0} and R[]?= {0, 5, 4, 5, 0},?LRProduct = {0, 5, 8, 5, 0} and max in this is 8.



11. The Celebrity Problem
In a party of N people, only one person is known to everyone. Such a person may be present in the party, if yes, (s)he doesn’t know anyone in the party. We can only ask questions like “does A know B? “. Find the stranger (celebrity) in minimum number of questions.
We can describe the problem input as an array of numbers/characters representing persons in the party. We also have a hypothetical function HaveAcquaintance(A, B) which returns true if A knows B, false otherwise. How can we solve the problem.


12. Expression Evaluation

Evaluate an expression represented by a String. Expression can contain parentheses, you can assume parentheses are well-matched. For simplicity, you can assume only binary operations allowed are +, -, *, and /. Arithmetic Expressions can be written in one of three forms:
Infix Notation: Operators are written between the operands they operate on, e.g. 3 + 4 .
Prefix Notation: Operators are written before the operands, e.g + 3 4
Postfix Notation: Operators are written after operands.

 
int main() { 
    cout << evaluate("10 + 2 * 6") << "\n"; 
    cout << evaluate("100 * 2 + 12") << "\n"; 
    cout << evaluate("100 * ( 2 + 12 )") << "\n"; 
    cout << evaluate("100 * ( 2 + 12 ) / 14"); 
    return 0; 
} 

Output:
22
212
1400
100

	     
	    
	  
	  
	  
	 
		      
		

   
		   
		   
     	