class Heapsort{
void heapify(int[] a,int size,int i){
  //create a tree with property root will be at index i left willb eat 2*i+1 right will be at 2*i+2
   int largest=i;
   int l=2*i+1;
   int r=2*r+1;
  //checking if left index value is greater that root if yes changing largest
   if(l<size&&a[l]>a[lagest]){
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
   for(i=n/2-1;i>=0;i--){
     heapify(a,n,i)
	 }
	 //heapsort
	 for(i=n-1;i>=0;i--){
	  swap(a[0],a[i]);
	  heapify(a,i,0);
	  }
	 }
void swap(int a,int b){
  int temp=a;
  a=b;
  b=temp;
  }
 }
void print(int a[],int n){
   for(int i=0;i<n;i++){
      cout<<a[i];
	  }
}
public static void main(String args[]){
    Heapsort a=new Heapsort();
   Scanner sc=new Scanner(System.in);
   int size=sc.nextInt();
   int b[]=new int[size];
   for(int i=0;i<size;i++){
      b[i]=sc.nextInt();
	  }
	  a.heapsort(b,size);
	  a.print(b,n);
}
https://www.geeksforgeeks.org/binary-tree-data-structure/