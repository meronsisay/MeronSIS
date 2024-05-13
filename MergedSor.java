package package5;

public class MergedSor {
	package package5;

public class MergedSort {
	static void mergeSort(int[] arr) {
		int size=arr.length;
			if(size<2) {
				return;
			}
			int midIndex= size/2;
			int[] leftHalf= new int[midIndex];
			int[] rightHalf=new int[size-midIndex];
			for(int i=0;i<midIndex;i++) {
				leftHalf[i]=arr[i];
			}
			for(int i=midIndex;i<arr.length;i++) {
				rightHalf[i]=arr[i];
			}
			mergeSort(leftHalf);
			mergeSort(rightHalf);
		
		} public static void merge(int[] arr,int[] leftHalf, int[] rightHalf) {
			int lsize= leftHalf.length;
			int rsize=leftHalf.length;
			int i=0;
			int j=0;
			int k=0;
			while(i<lsize && j<rsize) {
			   if(leftHalf[i]<=rightHalf[j]) {
				   arr[k]=leftHalf[i];
				   i++;
			   } else {
				   arr[k]=rightHalf[j];
				   j++;
			   }
			   k++;
			} while(i< lsize) {
				arr[k]=leftHalf[i];
				i++;
				k++;
			} while(j< rsize) {
				arr[k]=rightHalf[j];
				j++;
				k++;
			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	 
		}

	}


}
