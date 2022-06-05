public class IfElseStatementTheme{
	public static void main(String[] args){
		System.out.println("1. Перевод псевдокода на язык Java");
		int age = 35;
		boolean sexMan = true;
		double height = 1.7;
		String name = "Dohn";
		if(age > 20){
			System.out.println("20 есть - уже можно");
		}else{
			System.out.println("еще мал пока");
		}
		if(!sexMan){
			System.out.println("Какая женщина!!!");
		}
		if(height<1.80){
			System.out.println("Ты длинный!");
		}else{
			System.out.println("Ты ростом не вышел");
		}
		char fName = name.charAt(0);
		if(fName == 'M'){
			System.out.println("мя на М");
		}else if(fName == 'I'){
			System.out.println("мя на I");
		}else{
			System.out.println("Обычное имя");
		}
		System.out.println("");
	
		System.out.println("2. Поиск max и min числа");
		int digit_a = 147;
		int digit_b = 357;
		if(digit_a>digit_b){
			System.out.println(digit_a + " - max");
			System.out.println(digit_b + " - min");
		}
		if(digit_a<digit_b){
			System.out.println(digit_b + " - max");
			System.out.println(digit_a + " - min");
		}
		if(digit_a==digit_b){
			System.out.println("Числа равны");
		}
		System.out.println("");
	
		System.out.println("3. Работа с числом");
		int d_a = 2544;
		if(d_a == 0){
			System.out.println("число является нулем");
		}else{
			System.out.println("число является не нулем");
			if(d_a%2 == 0){
				System.out.println("число является четным");
			}else{
				System.out.println("число является не четным");
			}
			if(d_a > 0){
				System.out.println("число является положительным");
			}else{
				System.out.println("число является отрицательным");
			}
		}
		System.out.println("");
	
		System.out.println("4. Поиск одинаковых цифр в числах");
		int N = 481;
		int M = 421;
		int a = 0;
		int b = 0;
		int c = 0;
		boolean a1 = N%10 == M%10;
		boolean b2 = (N/10)%10 == (M/10)%10;
		boolean c3 = N/100 == M/100;
		if(a1){
			a = N%10;
		}
		if(b2){
			b = (N/10)%10;
		}
		if(c3){
			c = N/100;
		}
		if(a1||b2||c3){
			if(a1&&b2&&c3){
				System.out.println("в числах " + N + " и " + M + " одинаковые цифры " + a + b + c + " стоят в 1, 2, 3, разрядах");
			}
			if(a1&&(!b2)&&(!c3)){
				System.out.println("в числах " + N + " и " + M + " одинаковая цифра " + a + " стоит в 1 разряде");
			}
			if((!a1)&&(b2)&&(!c3)){
				System.out.println("в числах " + N + " и " + M + " одинаковая цифра " + b + " стоит в 2 разряде");
			}
			if((!a1)&&(!b2)&&c3){
				System.out.println("в числах " + N + " и " + M + " одинаковая цифра " + c + " стоит в 3 разряде");
			}
			//
			if((a1)&&(b2)&&(!c3)){
				System.out.println("в числах " + N + " и " + M + " одинаковые цифры " + a + b + " стоят в 1, 2 разрядах");
			}
			if((!a1)&&(b2)&&(c3)){
				System.out.println("в числах " + N + " и " + M + " одинаковые цифры " + b + c + " стоят в 2, 3 разрядах");
			}
			if((a1)&&(!b2)&&(c3)){
				System.out.println("в числах " + N + " и " + M + " одинаковые цифры " + a + c + " стоят в 1, 3 разрядах");
			}
			//
		}else{
			System.out.println("в числах " + N + " и " + M + " нет одинаковых цифр");
		}
		System.out.println("");
		
		System.out.println("5. Определение буквы, числа или символа по их коду");
		char art = '\u0057';
		boolean artS = art >= 'a' && art <= 'z';
		boolean artB = art >= 'A' && art <= 'Z';
		boolean artD = art >= '0' && art <= '9';
		if(artS){
			System.out.println(art + " это маленькая буква");
		}else if(artB){
			System.out.println(art + " это большая буква");
		}else if(artD){
			System.out.println(art + " это цифра");
		}else{
			System.out.println(art + " это не буква и не число");
		}
		System.out.println("");
		
		System.out.println("6. Определение суммы вклада и начисленных банком %");
		double deposit = 300000;
		double percent = 0;
		if(deposit < 100000){
			percent = 5;
		}else if(deposit <= 300000){
			percent = 7;
		}else{
			percent = 10;
		}
		
		System.out.println("сумму вклада " + deposit);
		System.out.println("начисленный % " + percent);
		percent *= 0.01*deposit;
		System.out.println("итоговая сумма с % " + (deposit + percent));
		System.out.println("");
		
		System.out.println("7. Определение оценки по предметам");
		int history = 59;
		int programm = 91;
		int historyO = 0;
		int programmO = 0;
		if(history > 91){
			historyO = 5;
		}else if(history > 73){
			historyO = 4;
		}else if(history > 60){
			historyO = 3;
		}else if(history <= 60){
			historyO = 2;
		}
		if(programm > 91){
			programmO = 5;
		}else if(programm > 73){
			programmO = 4;
		}else if(programm > 60){
			programmO = 3;
		}else if(programm <= 60){
			programmO = 2;
		}
		System.out.println(historyO + " оценка история");
		System.out.println(programmO + " оценка программирование");
		System.out.println("средний балл оценок по предметам " + ((double)(programmO+historyO))/2);
		System.out.println("средний % по предметам " + ((double)(programm+history))/2);
		System.out.println("");
		
		System.out.println("8. Расчет прибыли");
		int rent = 5000;
		int sale = 13000;
		int costPrice = 9000;
		System.out.println("прибыль за год: " + (sale-rent-costPrice)*12);
		System.out.println("");
		
		System.out.println("9. Определение существования треугольника");
		int s1 = 3;
		int s2 = 4;
		int s3 = 5;
		int k1 = 0;
		int k2 = 0;
		int gip = 0;
		boolean g1 = s1*s1 == s2*s2 + s3*s3;
		if(g1){
			gip = s1;
			k1 = s2;
			k2 = s3;
		}
		boolean g2 = s2*s2 == s1*s1 + s3*s3;
		if(g2){
			gip = s2;
			k1 = s1;
			k2 = s3;
		}
		boolean g3 = s3*s3 == s1*s1 + s2*s2;
		if(g3){
			gip = s3;
			k1 = s1;
			k2 = s2;
		}
		if(g1||g2||g3){
			System.out.println("катеты треугольника " + k1 + " и " + k2 + " гипотенуза " + gip);
			System.out.println("площадь треугольника " + (k1*k2)/2);
			System.out.println("A\n");
		}else{
			System.out.println("треугольник с такими длинами сторон не существует");
			System.exit(0);
		}
		System.out.println("");
		
		System.out.println("10. Подсчет количества банкнот");
		costPrice = 567;
		int usd_10_o = 5;
		int u_100 = 0;
		int u_10 = 0;
		int u_1 = 0;
		int tempUSD = costPrice;
		if(costPrice > 100){
			u_100 = costPrice/100;
			costPrice -= u_100*100;
		}
		if(costPrice >= 50){
			costPrice -= 50;
			u_10 = 5;			
		}else{
			if(costPrice >= 10&&costPrice < 50){
				u_10 = costPrice/10;
				costPrice -= u_10*10;
			}
		}
		u_1 = costPrice;
		costPrice = 0;
		costPrice = u_100*100 + u_10*10 + u_1*1;
		System.out.println("банкнота 100 USD - " + u_100);		
		System.out.println("банкнота 10 USD - " + u_10);		
		System.out.println("банкнота 1 USD - " + u_1);
		System.out.println("посчитанная исходная сумма - " + costPrice);
		
		
	}
	
}