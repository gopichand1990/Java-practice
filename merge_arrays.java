//arrays practice
//given two sorted arrays merge them into a single array
class merge_arrays{
  //{1,2,3,4} {4,5,6}
	int[] add_two_arrays(int[] a,int[] b){
			int size1=a.length;
			int prev1=0,prev2=0;
			int size2=b.length;
			if(a>=0&&b>=0){
			   return;
			}
				int result_pointer=0;
				int[] result=new int[size1+size2];
				for(int i=prev1;i<size1;i++){
						for(int j=prev2;j<size2;j++){
							if(a[i]<b[j]&&result_pointer<(size1+size2)){
								result[result_pointer]=a[i];//1 2
								result_pointer++;//2
								prev1=i+1;//2
							}
						   else if(a[i]==b[j]&&result_pointer<(size1+size2)){
							   a[result_pointer]=a[i];
							   result_pointer=result_pointer+1;
							   prev1=i+1;
							   a[result_pointer]=b[j];
							   result_pointer+=1;
							   prev2=j+1;
							}
							else{
								if(result_pointer<(size1+size2)){
								a[result_pointer]=a[j];
								result_pointer++;
								prev2=j+1;
							}
						}
				}
	}
	class B{
	public static void main(String args[]){
	   int[] a={1,2,3,4,5};
	   int[] b={1,2,3,4,5};
	   merge_arrays m=new merge_arrays();
	   int[] d=new int[10];
	   d=m.add_two_arrays(a,b);
	   for(int k=0;k<d.length;k++){
	      System.out.println(a[k]);
		  }
		 }
		 
//remove duplicates and print in same order as they are present

 import java.util.*;
class remove_duplicates{
  void print_identical_elements_array(int[] a){
     int length=a.length;
	 if(length<=1){
	   return;
	 }
	 ArrayList<Integer> al=new ArrayList<Integer>();
	 for(int i=0;i<length;i++){
	     if(!(al.contains(a[i])){
		    al.add(a[i]);
		 }
	 }
	 for(Integer n:al){
	    System.out.println(n);
	 }
  }
  public static void main(String args[]){
	   remove_duplicates d=new remove_duplicates();
	   int[] a={1,2,3,4,5,1,2,3,4,5};
	   d.add_two_arrays(a);
		 }
}

//given integer array sort according to their frequency
class print_array{
     //sort hashmap based on values
	  public  HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<Integer, Integer> > list = 
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
            public int compare(Map.Entry<Integer, Integer> o1,  
                               Map.Entry<Integer, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<Integer, Integer> temp = new LinkedHashMap<,Integer Integer>(); 
        for (Map.Entry<Integer, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
   HashMap<Integer,Integer> print_array_according_to_frequency(int[] a){
     int length=a.length;
     if(length<=1){
	   return;
	 }
	 HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	 for(int i=0;i<length;i++){
	   if(hm.contains(a[i]){
	      hm.put(a[i],hm.get(a[i])+1);
	   }
	   else{
	     hm.put(a[i],1);
		}
	 }
	return hm; 
}
	
	public static void main(String[] args){
	  print_array p=new Print_array();
	  HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
	  HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>();
	  int[] a={2,2,3,3,3,4,5};
	  h=p.print_array_according_to_frequency(a);
	  h1=sortByValue(h);
	  Set setOfKeys = h1.keySet();
            Iterator iterator=setOfKeys.iterator();
            while(iterator.hasNext()){
                 int key=(Integer)iterator.next();
                 int value=(Integer)h1.get(key);
                while(value>1){
				   sysytem.out.println(key);
				     value--;
				}
            }
			}
}	 

//search an element in rotated sorted array	 
class search_element{
//finding breakpoint
  int temp=-1;
	 for(int i=0;i<length;i++){
	    j=i+1;
		if(j<length){
		   if(a[j]<a[i]){
		      temp=j;
			  break;
		   }
	    }
		}
   int search_element_rotated_sorted_array(int[] a,int start_index,int last_index,int s){
     int length=a.length();
	 if(length<1){
	   return -1;
	   }
	   if(temp=-1){
	      return -1;
		  }
	  else if(a[temp]==s){
		  return s;
		  }
	  else if(s<a[i]){
	   search_element_rotated_sorted_array(a,temp,length-1);
	  }
	 else{
	   search_element_rotated_sorted_array(a,0,temp-1);
	 }
	 }
	 public static void main(String args[]){
	   search_element s=new search_element();
	   int[] a={4,5,1,2,3};
	   s.add_two_arrays(a,2);
		 }
}

//find permutations of string
/*import java.util.*;

public class Permutations
{				//abcd
  static String add_substring_At_index_of_sizeone (String input, String s1,
						   int k)
  {
			int l = s1.length ();
			String modified_string = "";
			String temp = "", temp1 = "";
				if (k < l)
					{
                      for (int i = k; i < l; i++)
	                   {
                         temp = temp + input.charAt (i);
                       } 
                      for (int j = 0; j < k; j++)
	                   {
                          temp1 = temp + input.charAt (j);
	                   } 
                    modified_string = temp1 + s1 + temp;   
               }
    return modified_string;
  }
  
 
static ArrayList < String > find_permutations_of_string (String s)
  {
    
int length = s.length ();
    
ArrayList < String > al = new ArrayList < String > ();
    
if (length < 1)
      {
	
return al;
      
}
    
      /*abcde
         ab ba
         cab cba acb bca abc bac
         dcab cdab cadb cabd */ 
      String initial = Character.toString (s.charAt (0));
    
String k1 = Character.toString (s.charAt (0));
    
int index_pointer = 1;
    
int count = 2;
    
 
al.add (k1);
    
 
for (int m = 0; m < k1.length () + 1; m++)
      {
	
String k2 = al.get (0);
	
while (index_pointer < k1.length ())
	  {
	    
String k3 = Character.toString (s.charAt (index_pointer + 1));
	    
String temp = add_substring_At_index_of_sizeone (k1, k3, m);
	    
al.add (temp);
	    
al.remove (k2);
	  
}
      
}
    
return al;
  
}
public static void main (String args[])
{
  
Permutations p = new Permutations ();
  
String s = "abcde";
  
ArrayList < String > al1 = new ArrayList < String > ();
  
al1 = p.find_permutations_of_string (s);

for (String n:al1)
    {
      
System.out.println (n);
    
 
}

}

}*/
//find permutations of string
/*
a
a
ab 
ab ba
abc
a b c
ab ac ba bc ca cb
abc acb bac cab cba
abcd
a b c d
ab ac ad bc bd ba cd ca cb da db dc
abc abd acb acd adb adc bca bcd bda bdc bac bad cda cdb cab cad
 
a bcde
a b c d e
ab ac ad ae bc bd be
abc abd abe acd ace ade bcd bde 
*/
import java.util.*;
public class Permutations{
    public static ArrayList<String> print_All_Prmutations_of_String(String s){
        //System.out.println("input "+s);
        String m="",l="";
        ArrayList<String> al=new ArrayList<String>();
        ArrayList<String> al1=new ArrayList<String>();
        //ArrayList<String> al2=new ArrayList<String>();
	   if(s.length()<1){
	      //System.out.println("provide correct input");
	      return al;
		  }
	   if(s.length()==1){
	       al.add(s);
	       return al;
	   }
		
		for(int i=0;i<s.length();i++){
		   // System.out.println("inside for loop");
		         l=s.substring(0,i)+s.substring(i+1,s.length());
		         //System.out.println("value of l inside else "+l);
		    // System.out.println("value of i is "+s.charAt(i));
		     //System.out.println("value of l is"+l);
		     al1=print_All_Prmutations_of_String(l);
		      m=String.valueOf(s.charAt(i));
		      for(String j:al1){
		          String h=m+j;
		          al.add(h);
		      }
		      
		      
		}
	 return al;
    }
		  
	
	public static void main(String[] args){
	     Permutations p=new Permutations();
	     String s="abcde";
	     ArrayList<String> al2=new ArrayList<String>();
	   al2=p.print_All_Prmutations_of_String(s);
	   System.out.println("No of results are: "+al2.size());
	    for(String u:al2){
	         System.out.println(u);
	    }
	    
	}
}
        	     
        	     

        	     
        	     
        	     
        	     
        	     
        	     
        	     

	
		
		
 
		  
		  
   





		  
		  
	       
	 
			
			
			
	   
	    
	       
	    
	   
	   	   
	   
	   
	   


//check two strings are anagrams or not
  class Anagrams{
    bool check_strings_are_anagrams(String s,String s1){
	  int s_length=s.length;
	  int s1_length=s1.length();
	  if(s_length!=s1.length||s_length<1||s1_length<1){
	     return;
	  }
	  HashMap<Character,Integer> h=new HashMap<Character,Integer>();
	  HashMap<Character,Integer> h1=new HashMap<Character,Integer>();
	  for(int i=0;i<s_length;i++){
	     if(!h.contains(s.charAt(i)){
		    h.put(s.charAt(i),1);
			}
		 else{
		    h.put(s.charAt(i),h.get(s.charAt(i)+1));
			}
	  }
	  	for(int j=0;i<s1_length;j++){
	     if(!h1.contains(s.charAt(j)){
		    h1.put(s.charAt(j),1);
			}
		 else{
		    h1.put(s.charAt(j),hm.get(s.charAt(j)+1));
			}
	    }
	  if(h1.equals(h2)){
	     return true;
		 }
	  return false;
	 }
	 public static void main(String[] args){
	   Anagrams a=new Anagrams();
	   String s="abcd";
	   String s1="bcda"
	   bool b=a.check_strings_are_anagrams(s,s1);
	   if(b==true){
	      System.out.println("Anagrams");
		  }
		  else{
		  System.out.println("Not anagrams");
		  }
      }
}


abc
a b c
ab ac bc ba ca cb
abc acb bca bac cab cba

India@123

	     
	  
	   
	   
	 
	 
		
	 
	 
	 
	 
		     
		      
	 
      
			
	    
     
     
   

	   
	
		    
		     
		    
		     
