package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		
		String ray[];
		ray = new String[5];
		ray[0] = "a";
		ray[1] = "b";
		ray[2] = "c";
		ray[3] = "d";
		ray[4] = "e";
		
		//2. print the third element in the array
		System.out.println(ray[2]);
		//3. set the third element to a different value
		ray[2] = "f";
		//4. print the third element again
		//System.out.println(ray[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int x = 0; x<5; x++)
		{
			System.out.println(ray[x]);
		}
		
		//6. make an array of 50 integers
		int rays[];
		rays = new int[50];
		
		//7. use a for loop to make every value of the integer array a random number
		Random num = new Random();
		for(int i = 0; i<50; i++)
		{
			int number = num.nextInt(1000);
			rays[i] = number;
		}
		
		for(int b = 0; b<50; b++)
		{
			System.out.println(rays[b]);
		}
		
		//8. without printing the entire array, print only the smallest number in the array bubble sort
		for(int c = 0; c < 50; c++)
		{
			for(int d =c+1; d<50; d++)
			{
				if(rays[c]>rays[d])
				{
					int hold = rays[c];
					rays[c] = rays[d];
					rays[d] = hold;
				}
			}
		}
		 
		System.out.println("/n/n/n");
		
		System.out.println(rays[0]);
		
		//9 print the entire array to see if step 8 was correct
		
		/*for(int b = 0; b<50; b++)
		{
			System.out.println(rays[b]);
		}*/
		
		//10. print the largest number in the array. bubble sort
		
		System.out.println(rays[49]);
		
		
		
		
		
		
	}
}