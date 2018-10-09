package mytest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Testlambda {
	/*
	 * lambda �đ���, 1 �����ڲ���Ƚ� 2 �̷߳��� �ô����ڼ򻯴��� ����д�ӿ�����������
	 * 
	  *   �ܹ�ʹ��Lambda�������Ǳ�������Ӧ�ĺ����ӿ�
	 *   Lambda���ʽ��һ�������������ƶϻ��ƣ�����������Ϣ�㹻������£������������ƶϳ�����������ͣ�������Ҫ��ʽָ��
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
