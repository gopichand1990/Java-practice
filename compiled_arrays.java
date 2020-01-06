//sort two sorted arrayhs to third array
import java.io.*;
public class Merge_arrays{
  //{1,2,3,4,5} {1,2,3,4}
	int[] add_two_arrays(int[] a,int[] b){
			int size1=a.length;//4
			int prev1=0,prev2=0;
			int size2=b.length;//4
			int[] result=new int[size1+size2];//8
			    if(size1<=0&&size2<=0){
			       return result;
			    }
				int result_pointer=0;
				int j=prev2;//0
			    int i=prev1;//0
			    while(i<size1&&j<size2||i<size1||j<size2){
							if(a[i]<b[j]&&result_pointer<(size1+size2)){
								result[result_pointer]=a[i];//1 2
								result_pointer++;//2
								i++;//2
							}
						   else if(a[i]==b[j]&&result_pointer<(size1+size2)){
							   result[result_pointer]=a[i];
							   System.out.println(result[result_pointer]);
							   System.out.println("inside equal");
							   result_pointer=result_pointer+1;
							   i++;
							   if(result_pointer<(size1+size2)){
							   result[result_pointer]=b[j];
							   System.out.println(result[result_pointer]);
							   System.out.println("inside equal 2");
							   result_pointer+=1;
							   System.out.println("result cointer is" +result_pointer);
							   j++;
							   System.out.println("i and j is "+i +j +result_pointer);
							   }
							}
							else if(i<size1&&j==size2&&result_pointer<(size1+size2)){
							    System.out.println("inside else if1");
							 result[result_pointer]=a[i];
							 result_pointer++;
							 i++;
							}
							else if(j<size2&&i==size1&&result_pointer<(size1+size2)){
							    System.out.println("insie else if 2");
							    result[result_pointer]=b[j];
							    result_pointer++;
							    j++;
							}
							else{
								if(result_pointer<(size1+size2)){
								result[result_pointer]=b[j];
								result_pointer++;
							     j++;
						    	}
							}
				}
		return result;
	}
	public static void main(String []args){
	   int[] a={1,2,3,4,5};
	   int[] b={1,2,3,4};
	   Merge_arrays m=new Merge_arrays();
	   int[] d=new int[10];
	   d=m.add_two_arrays(a,b);
	   System.out.println(d.length);
	   for(int k=0;k<d.length;k++){
	      System.out.println(a[k]);
		  }
		 }
	}
//remove duplicates and print in same order as they are present
import java.util.*;
public class remove_duplicates{
  void print_identical_elements_array(int[] a){
     int length=a.length;
	 if(length<=1){
	   return;
	 }
	 ArrayList<Integer> al=new ArrayList<Integer>();
	 for(int i=0;i<length;i++){
	     if(!(al.contains(a[i]))){
		    al.add(a[i]);
		 }
	 }
	 for(Integer n:al){
	    System.out.println(n);
	 }
  }
  public static void main(String args[]){
	   remove_duplicates d=new remove_duplicates();
	   int[] a={2,2,3,4,4,5,6,7};
	   d.print_identical_elements_array(a);
		 }
}

//sort array aoring to frquny thy ar present
import java.util.*;
import java.io.*;
//given integer array sort according to their frequency
public class Print_array{
     //sort hashmap based on values
	  public  HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<Integer, Integer> > list = new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<Integer,Integer> >() { 
            public int compare(Map.Entry<Integer,Integer> o1,  
                               Map.Entry<Integer,Integer> o2) 
            { 
                return (o2.getValue()).compareTo(o1.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer,Integer>(); 
        for (Map.Entry<Integer, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
	public  HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm) 
    { 
        Set s=hm.KeySet();
        Iterator i=s.Iterator();
        int i=0;
        while(i.hasNext()){
            if(i==0){
            int key1=(Integer)i.next();
            int value1=(Integer)hm.get(1);
            int temp=value1;
            int temp_key=key1;
            }
            else{
                if(temp)
            }
        }
   HashMap<Integer,Integer> print_array_according_to_frequency(int[] a){
     int length=a.length;
     HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
     if(length<=1){
	   return hm;
	 }
	 for(int i=0;i<length;i++){
	     boolean isKeyPresent = hm.containsKey(a[i]); 
	   if(isKeyPresent){
	      hm.put(a[i],hm.get(a[i])+1);
	   }
	   else{
	     hm.put(a[i],1);
		}
	 }
	return hm; 
}
	
	public static void main(String[] args){
	  Print_array p=new Print_array();
	  HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
	  HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>();
	  int[] a={2,2,3,3,3,4,4,4,4,4,5};
	  h=p.print_array_according_to_frequency(a);
	  h1=p.sortByValue(h);
	  //System.out.println("size is\n"+h1.size());
	  Set setOfKeys = h1.keySet();
            Iterator iterator=setOfKeys.iterator();
            while(iterator.hasNext()){
                 int key=(Integer)iterator.next();
                 //System.out.println("key value is \n"+key);
                 int value=(Integer)h1.get(key);
                 //System.out.println("value pair valie is \n"+value);
                while(value>=1){
				   System.out.println(key);
				     value--;
				}
            }
			}
}

//search_element in rotated sorted array
import java.io.*;
public class Main{
//finding breakpoint
 int find_rotation_index(int[] a){
     int temp=-1;
     int j;
	 for(int i=0;i<a.length;i++){//4 5  1 2 3
	    j=i+1;
		if(j<a.length){
		   if(a[j]<a[i]){
		      temp=j;
			  break;
		   }
	    }
		}
     return temp;
 }
 
 static int binary_search(int[] a,int start_index,int end_index,int k){
      if(start_index>end_index){
          return -1;
      }
      int mid=(start_index+end_index)/2;
      if(k==a[mid]){
          System.out.println("index value is"+mid);
          return mid;
      }
      if(k<a[mid]){
          System.out.println("index value is inside first loop");
          return binary_search(a,k,start_index,mid-1);
      }
      if(k>a[mid]){
           System.out.println("index value is inside 2 loop");
          return binary_search(a,k,mid+1,end_index);
      }
    return -1;
 }
   
   int search_element_rotated_sorted_array(int[] a,int start_index,int last_index,int s,int temp){
       if(start_index > last_index){
		    return -1;
		}
		if(a[temp]==s){
		    return temp;
		}
	   if(s<a[0]){
	       System.out.println("index value is inside 4-1 loop");
	     return binary_search(a,temp,last_index,s);
	   }
	   else{
	   System.out.println("index value is inside 4 loop");
	    return binary_search(a,start_index,temp-1,s);
	   }
	  // return -1;
	 }
	 public static void main(String args[]){
	   Main s=new Main();
	   int[] a={4,5,1,2,3};
	   int m=s.find_rotation_index(a);
	   System.out.println("value of temp is"+m);
	   int k=s.search_element_rotated_sorted_array(a,0,a.length,2,m);
	   System.out.println("value of k is"+k);
		 }
}

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



