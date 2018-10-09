package mytest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Testlambda {
	/*
	 * lambda 的應用, 1 匿名内部类比较 2 线程方面 好处在于简化代码 不用写接口名、方法名
	 * 
	  *   能够使用Lambda的依据是必须有相应的函数接口
	 *   Lambda表达式另一个依据是类型推断机制，在上下文信息足够的情况下，编译器可以推断出参数表的类型，而不需要显式指名
	 */

	public static void main(String[] args) {
		List<String> names = Arrays.asList("ba", "jerry", "jane");
		Collections.sort(names, (o1, o2) -> {
			if (o1 == null) {
				return -1;
			}
			if (o2 == null) {
				return 1;
			}
			return o1.length() - o2.length();

		});

		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});

		/*
		 * new Thread(() -> { System.out.println(names.toString()); }).start();
		 */
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(names.toString());
			}
		}).start();
		;
		// System.out.println(names.toString());
	}

}
