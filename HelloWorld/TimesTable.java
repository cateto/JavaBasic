class TimesTable
{
	void m1()
	{
		for(int i = 2; i <= 9; i++)
		{
			for(int j = 1; j <= 9; j++)
			{
				System.out.println(i + "x" + j + "=" + (i * j));
			}
		}
	}
	
	void m2()
	{
		for(int j = 1; j <= 9; j++)
		{
			for(int i = 2; i <= 9; i++)
			{
				if(i*j < 10)
				{
					System.out.print(i + "x" + j + "=" + (i * j) + " ");
				}
				else
				{
					System.out.print(i + "x" + j + "=" + (i * j));
				}
				System.out.print("  ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] asd)
	{
		TimesTable tt = new TimesTable();
		//tt.m1(); // Vertical
		tt.m2(); // horizontal
	}
