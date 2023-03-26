package com.bridgelabz;

public class PrimeNumbersInRangeUsing2DArray {
	static int num=0;

	int[][] primeNumber = new int[10][25];
	static int range ,range1,range2,range3,range4,range5,range6,range7,range8,range9=0;
	void insert0_100(){
		if(num<=100)
		{
			primeNumber[0][range]=num;
			range++;
		}
	}
	void insert101_200(){
		primeNumber[1][range1]=num;
		range1++;
	}
	void insert201_300(){
		primeNumber[2][range2]=num;
		range2++;

	}
	void insert301_400(){
		primeNumber[3][range3]=num;
		range3++;
	}
	void insert401_500(){
		primeNumber[4][range4]=num;
		range4++;
	}
	void insert501_600(){
		primeNumber[5][range5]=num;
		range5++;
	}
	void insert601_700(){
		primeNumber[6][range6]=num;
		range6++;
	}
	void insert701_800(){
		primeNumber[7][range7]=num;
		range7++;
	}
	void insert801_900(){
		primeNumber[8][range8]=num;
		range8++;
	}
	void insert901_1000(){
		primeNumber[9][range9]=num;
		range9++;
	}

	void prime() {
		System.out.println("Printing prime numbers between 0-1000 ");
		for (int i = 2; i < 1000; i++) {
			num = i;
			print();
		}
	}
	void print(){
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if(!flag)
		{
			if(num<=99){
				insert0_100();
			} else if (num>100 && num <=200) {
				insert101_200();
			} else if (num>=201 && num <=300) {
				insert201_300();
			} else if (num>=301 && num <=400) {
				insert301_400();
			}else if (num>=401 && num <=500) {
				insert401_500();
			}else if (num>=501 && num <=600) {
				insert501_600();
			}else if (num>=601 && num <=700) {
				insert601_700();
			}else if (num>=701 && num <=800) {
				insert701_800();
			}else if (num>=801 && num <=900) {
				insert801_900();
			}else if (num>=901 && num <=1000) {
				insert901_1000();
			}
		}

	}
	void show(){
		for(int i =0;i< primeNumber.length;i++)
		{
			System.out.println("\n");
			System.out.print("Range " + (i+1) + " (");
			System.out.print((i*100) + " - " + ((i+1)*100-1) + "): ");
			for(int j =0;j<25;j++)
			{
				System.out.print(primeNumber[i][j]+" ");
			}
		}
	}
	public static void main(String[] args) {
		PrimeNumbersInRangeUsing2DArray primeNumberRange = new PrimeNumbersInRangeUsing2DArray();
		primeNumberRange.prime();
		primeNumberRange.show();

	}

}
