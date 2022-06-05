public class CyclesTheme{
	public static void main(String[] args){
		System.out.println("1. Подсчет суммы четных и нечетных чисел");
		int a = -10;
		int b = 21;
		int x = 0;
		int y = 0;
		int n = a;
		do{
			if(n%2 == 0){
				x++;
			}else{
				y++;
			}
			n++;
		}
		while(n <= b);
		System.out.println("в промежутке [" + a +"," + b + "] сумма четных чисел = " + x + ", а нечетных = " + y);
		System.out.println("");
		
		System.out.println("2. Вывод чисел в интервале между (max и min)");
		int a_2 = 10;
		int b_2 = 5;
		int c_2 = -1;
		int min = 0;
		int max = 0;
		if(a_2 <= b_2){
			if(a_2 <= c_2){
				min = a_2;
			}else{
				min = c_2;
			}
		}else{
			if(b_2 <= c_2){
				min = b_2;
			}else{
				min = c_2;
			}
		}
		if(a_2 >= b_2){
			if(a_2 >= c_2){
				max = a_2;
			}else{
				max = c_2;
			}
		}else{
			if(b_2 >= c_2){
				max = b_2;
			}else{
				max = c_2;
			}
		}
		for(int i = min; i <= max; i++){
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		System.out.println("3. Вывод реверсивного числа и суммы его цифр");
		int number_3 = 1234;
		int s_3 = 0;
		while(number_3 > 0){
			System.out.print(number_3%10);
			s_3 += number_3%10;
			number_3 = number_3/10;
		}
		System.out.println("\nсумма цифр " + s_3);
		System.out.println("");
		
		System.out.println("4. Вывод чисел на консоль в несколько строк");
		int a_4 = 1;
		int b_4 = 24;
		int n_4 = 0;
		for(int i = a_4; i < b_4; i += 2){
			n_4++;
			if(i <= 9){
				System.out.print(" ");
			}
			if(n_4 > 1){
				System.out.print(" ");
			}
			System.out.print(i);
			if(n_4 == 5){
				System.out.println("");
				n_4 = 0;
			}			
		}
		while(n_4 < 5){
			System.out.print("  0");
			n_4++;
		}
		System.out.println("");
		
		System.out.println("5. Проверка количества единиц на четность");
		int number_5 = 3141591;
		int t_5 = number_5;
		int temp_5 = 0;
		while(number_5 != 0){
			if(number_5%10 == 1){
				temp_5++;
			}			
			number_5 = number_5/10;
		}
		if(temp_5%2 == 0){
			System.out.println("число " + t_5 + " содержит " + temp_5 + " четное количество единиц");
		}else{
			System.out.println("число " + t_5 + " содержит " + temp_5 + " нечетное количество единиц");
		}
		System.out.println("");
		
		System.out.println("6. Отображение фигур в консоли");
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 10; j++){
				System.out.print("*");			
			}
			System.out.println("");
		}
		int i_6 = 0;
		int j_6 = 0;
		while(i_6<5){
			while(j_6<5){
				System.out.print("#");
				j_6++;
			}
			System.out.println("");
			i_6++;
			j_6 = i_6;
		}
		i_6 = 0;
		j_6 = 0;
		do{
			//
			if(i_6 < 3){
			do{
				System.out.print("$");
				j_6++;
			}while(j_6 <= i_6);			
			}
			//
			if(i_6 >= 3){
				j_6 = 5-i_6;
			do{
				System.out.print("$");
				j_6--;
			}while(j_6 > 0);
			}
			//
			System.out.println("");
			i_6++;
			j_6 = 0;
		}while(i_6 < 5);
		System.out.println("");
		
		System.out.println("7. Отображение ASCII-символов");
		int i_7 = 0;
		System.out.println(" Dec  Char");
		for(int i = 0; i < 48; i++){			
			if(i%2 == 1){
				if(i <= 9){
					System.out.println("  " + i + "     " + (char)i);
				}else{
				System.out.println(" " + i + "     " + (char)i);
				}				
			}
			
		}
		System.out.println("");
		for(int i = 97; i < 123; i++){			
			if(i%2 == 1){
				if(i < 100){
					System.out.println(" " + i + "     " + (char)i);
				}else{
					System.out.println(i + "     " + (char)i);
				}				
			}
			
		}
		System.out.println("");
		
		System.out.println("8. Проверка, является ли число палиндромом");
		int digit_8 = 1234321;
		int temp_8 = digit_8;
		
		
	}
}