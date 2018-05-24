//Fabio Cervi de Mello
//Done
//Test 1

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class oddNumber
{
	ArrayList<Integer> array = new ArrayList<Integer>();

	void input(Integer n)
	{
		int i;
		int num;
		Scanner input = new Scanner(System.in);
		for (i = 0; i < n; i++)
		{
			System.out.println("Type an int bigger than 0: ");
			num = input.nextInt();
			array.add(num);
		}
	}

	void sort()
	{
		Collections.sort(array);
	}

	int oddNumber(Integer n)
	{
		int i, aux1, aux2;
		int odd = -1;
		int aux = 0;

		//checks the start of the array
		i = 0;
		if(array.get(i) != array.get(i + 1))
		{
			odd = array.get(i);
			aux = 1;
			System.out.println("The odd number is: " + odd);
			return 0;
		}

		//checks the end of the array
		if(array.get(n - 1) != array.get(n - 2))
		{
			odd = array.get(n - 1);
			aux = 1;
			System.out.println("The odd number is: " + odd);
			return 0;
		}

		i = 0;
		while(((array.get(i)) == (array.get(i + 1))) && (aux == 0))
		{
			i = i + 2;
			if (i > n)
			{
				i = n;
				break;
			}
		}

		if((array.get(i) != array.get(i + 1)) && (aux == 0))
			if((array.get(i + 1)) == (array.get(i + 2)))
				odd = array.get(i);
		
		System.out.println("The odd number is: " + odd);

		return 1;
	}
}

class Program
{
	public static void main(String args[])
	{
		oddNumber number = new oddNumber();

		Integer i, j;
		Integer n = 0;
		Integer s = 0;
		Integer aux;
		Integer num = 0;
		Integer length;

		length = args.length;

		if (length == 0)
		{
			System.out.println("Please run again with the size of th array as an argument.");
			System.exit(0);			
		}

		n = Integer.parseInt(args[0]);

		if (n % 2 == 0)
		{
			System.out.println("The size of the array must be odd, please run again.");
			System.exit(0);
		}

		number.input(n);

		number.sort();

		number.oddNumber(n);

	}
}


