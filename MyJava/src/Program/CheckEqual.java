package Program;

public class CheckEqual {

	public static void main(String[] args) {
		int arr1[]={1,2,3,4,5,6,1};
		int arr2[]={1,2,3,4,5,6};
		boolean flag=true;
		//first check the length of the array
		if(arr1.length==arr2.length)
		{
			for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i]!=arr2[i])
				{
					flag=false;
				}
			}
	
		}
		else{
			System.out.println("not equal");
		}
		if(flag){
			System.out.println("array are equall");
		}else{
			System.out.println("arrays are not  equal");
		}
}
}