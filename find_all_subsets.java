//Print all subsets in array
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
 void print_all_subsets_in_array_all(int[] a,int k){
  int length=a.length;  //1 2 3 5 8
  int start_index,end_index;
  //string const_variable;
  int sum=0;
   if(length<1){
     return;
	 }
   for(int i=0;i<length;i++){ 
	     sum=0;
		 start_index=i;
		   for(int j=i;j<length;j++){
			      sum=sum+a[j];
				  if(sum==k){
				     end_index=j;
					 System.out.println(start_index+" "+end_index);
				  }					
			}
	}
 }
	public static void main(String[] args) {
		Main m=new Main();
		int a[]={1,2,3,5,8,2,6,-2,2};
		m.print_all_subsets_in_array_all(a,8);
	}
}


//print all subsets in non negative integer array which sum upto k
public class Main
{
 void print_all_subsets_in_array_nonnegative(int[] a,int k){
  int length=a.length;  //1 2 3 5 8
  int start_index,end_index;
  //string const_variable;
  int sum=0;
   if(length<1){
     return;
	 }
   for(int i=0;i<length;i++){ 
	     sum=0;
		 start_index=i;
		   for(int j=i;j<length;j++){
			      sum=sum+a[j];
				  if(sum>k){
				   break;
				  }
				  if(sum==k){
				     end_index=j;
					 System.out.println(start_index+" "+end_index);
				  }					
			}
	}
}	public static void main(String[] args) {
		Main m=new Main();
		int a[]={1,2,3,5,8,2,6,4,4};
		m.print_all_subsets_in_array_nonnegative(a,8);
	}
}
	
		  
		  