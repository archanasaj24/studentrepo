/*Design method public int getNumberCube(int num), return int value to that method and 
 * result should be into main method.*/

package com.assignment7;

public class Cube
{
    public int getNumberCube(int num)
    {
    	int cube=num*num*num;
    	return cube;
    }
	public static void main(String[] args)
	{
		Cube cube=new Cube();
		int result=cube.getNumberCube(5);
		System.out.println("Cube is: "+result);

	}

}
