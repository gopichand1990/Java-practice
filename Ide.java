import java.io.*;
import java.util.Scanner;
public class Main{
void heapify(int[] a,int size,int i){
  //create a tree with property root will be at index i left willb eat 2*i+1 right will be at 2*i+2
   int largest=i;
   int l=2*i+1;
   int r=2*i+2;
  //checking if left index value is greater that root if yes changing largest
   if(l<size&&a[l]>a[largest]){
      largest=l;
	  }
   //checking if right index value is greater that root if yes changing largest
   if(r<size&&a[r]>a[largest]){
      largest=r;
   }
   if(largest!=i){
     swap(a[i],largest);
     int temp=a[i];
	 a[i]=largest;
	 largest=temp;
	 heapify(a,size,largest);
	 }
}
void heapsort(int a[],int n){
   //build maxheap
   for(int i=n/2-1;i>=0;i--){
     heapify(a,n,i);
	 }
	 //heapsort
	 for(int j=n-1;j>=0;j--){
	  swap(a[0],a[j]);
	  heapify(a,j,0);
	  }
	 }
void swap(int a,int b){
  int temp=a;
  a=b;
  b=temp;
  }
void print(int a[],int n){
   for(int i=0;i<n;i++){
      System.out.println(a[i]);
	  }
}
}
class B{
public static void main(String args[]){
    Main a=new Main();
   Scanner sc=new Scanner(System.in);
   int size=sc.nextInt();
   int b[]=new int[size];
   for(int i=0;i<size;i++){
      b[i]=sc.nextInt();
	  }
	  a.heapsort(b,size);
	  a.print(b,size);
}
}
//input 3 5 2 6 9
//op:1 3 2 6 9
//https://www.geeksforgeeks.org/binary-tree-data-structure/
