package package6;

public class DeleteArray {

	public class deleteArray {
		public void deleteElement(int[] array, int index) {
			int[] newArray = new int[array.length+1];
			for(int i=0,j=0;i<array.length;i++) {
				if(i!=index) {
					newArray[j++]=array[j];
				}
			}
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	       
		}

	}


}
