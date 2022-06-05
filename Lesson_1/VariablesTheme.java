public class VariablesTheme {
	public static void main(String[] args){
		
		System.out.println("1. Создание переменных и вывод их значений на консоль");
		byte sign = 32;
		short digit_short = 32000;
		int digit_norm = 900000000;
		long digit_long = 536563569898989889L;
		float digit_float = 3.14f;
		double digit_doubl = 3.141592653f;
		char digit_char = 'Z';
		boolean really = true;
		System.out.println(sign);
		System.out.println(digit_short);
		System.out.println(digit_norm);
		System.out.println(digit_long);
		System.out.println(digit_float);
		System.out.println(digit_doubl);
		System.out.println(digit_char);
		System.out.println(really);
		System.out.println("");
		
		System.out.println("2. Расчет стоимости товара со скидкой");
		int product_X = 100;
		int product_Y = 200;
		double discount = 0.11f;
		double product_discount = (product_X+product_Y)*discount;
		double product_summ = product_discount+product_X+product_Y;
		System.out.println(product_discount);
		System.out.println(product_summ);
		System.out.println("");
		
		System.out.println("3. Вывод на консоль слова JAVA");
		System.out.println("");
		System.out.println("   J    a  v     v  a   ");
		System.out.println("   J   a a  v   v  a a   ");
		System.out.println("J  J  aaaaa  V V  aaaaa ");
		System.out.println(" JJ  a     a  V  a     a");
		System.out.println("");
		
		System.out.println("4. Отображение min и max значений числовых типов данных");
		//
		byte b = 127;
		System.out.println(b);
		b++;
		System.out.println(b);
		b--;
		System.out.println(b);
		//
		short s = 32767;
		System.out.println(s);
		s++;
		System.out.println(s);
		s--;
		System.out.println(s);
		//
		int i = 2147483647;
		System.out.println(i);
		++i;
		System.out.println(i);
		--i;
		System.out.println(i);
		//
		long l = 9223372036854775807L;
		System.out.println(l);
		++l;
		System.out.println(l);
		--l;
		System.out.println(l);
		//
		System.out.println("");
		
		System.out.println("5. Перестановка значений переменных");
		float digit_one = 1.1f;
		float digit_two = 2.2f;
		float exchange = 0;
		System.out.println("с помощью третьей переменной");
		System.out.println("переменная 1 = " + digit_one + " переменная 2 = " + digit_two);
		exchange = digit_one;
		digit_one = digit_two;
		digit_two = exchange;		
		System.out.println("переменная 1 = " + digit_one + " переменная 2 = " + digit_two);
		System.out.println("с помощью арифметических операций");
		digit_one = 1.1f;
		digit_two = 2.2f;
		System.out.println("переменная 1 = " + digit_one + " переменная 2 = " + digit_two);			
		digit_one += 1.1f;
		digit_two -= 1.1f;
		System.out.println("переменная 1 = " + digit_one + " переменная 2 = " + digit_two);
		System.out.println("с помощью побитовой операции ^");
		digit_one = 1.1f;
		digit_two = 2.2f;
		System.out.println("переменная 1 = " + digit_one + " переменная 2 = " + digit_two);
		int one = (int)(digit_one*10);
		int two = (int)(digit_two*10);
		two = two^one;
		one = two^one;
		two = two^one;		
		digit_one = (float)one/10;
		digit_two = (float)two/10;
		System.out.println("переменная 1 = " + digit_one + " переменная 2 = " + digit_two);
		System.out.println("");
		
		System.out.println("6. Вывод символов и их кодов");
		int a = 35;
		b = 38;
		int c = 64;
		int d = 94;
		int e = 95;
		System.out.println(a+" "+(char)a);
		System.out.println(b+" "+(char)b);
		System.out.println(c+" "+(char)c);
		System.out.println(d+" "+(char)d);
		System.out.println(e+" "+(char)e);
		System.out.println("");
		
		System.out.println("7. Произведение и сумма цифр числа");
		a = 345;
		e = a;
		b = 0;
		c = 1;
		b += e%10;
		c *= e%10;
		e /=10;
		b += e%10;
		c *= e%10;
		e /=10;
		b += e;
		c *= e;
		System.out.println("сумма цифр числа " + a + " = " + b);
		System.out.println("произведение цифр числа " + a + " = " + c);
		System.out.println("");
		
		System.out.println("8. Вывод на консоль ASCII-арт Дюка");
		char kk = '/';
		char ko = '\\';
		char np = '_';
		char pr = ' ';
		char sl = '(';
		char sr = ')';
		System.out.println("" + pr + pr + pr + pr + kk + ko);
		System.out.println("" + pr + pr + pr + kk + pr + pr + ko);
		System.out.println("" + pr + pr+ kk + np + sl+ pr + sr + ko);
		System.out.println("" + pr + kk + pr + pr + pr + pr + pr + pr + ko);
		System.out.println("" + kk + np + np  + np + np + kk + ko + np + np + ko);
		System.out.println("");
		
		System.out.println("9. Отображение количества сотен, десятков и единиц числа");
		a = 123;
		int n_100 = a/100;
		int n_10 = (a/10)%10;
		int n_1 = a%10;
		
		System.out.println("Число " + a + " содержит:");
		System.out.println(n_100 + " сотен");
		System.out.println(n_10 + " десятков");
		System.out.println(n_1 + " единиц");
		System.out.println("");
		
		System.out.println("10. Отображение количества сотен, десятков и единиц числа");
		a = 86399;
		int n_H = a/3600;
		int n_M = (a%3600)/60;
		int n_S = a%60;
		System.out.println(n_H + ":" + n_M + ":" + n_S);
	}
	
}