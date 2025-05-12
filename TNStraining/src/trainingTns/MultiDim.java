package trainingTns;
class MD{
	static void printArr(int c[][])
	{
		System.out.println("Arrays:");
		for (int i=0;i<c.length;i++)
		{
			for (int j=0;j<c[i].length;j++) {
				System.out.println(c[i][j]+"");
			}System.out.println();
		}
	}
}
public class MultiDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int c[][]= {{1,2,3},{3,4,5},{1,2,3},{3,4,5},{3,4,5}};
System.out.println("No of rows and cols are:"+c.length);
MD.printArr(c);
	}

}
