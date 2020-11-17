package LambdaExpression;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpression {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(11);
		arrayList.add(12);
		arrayList.add(13);
		arrayList.add(14);
		arrayList.add(15);

		List<Integer> integerLessThan13 = filter(arrayList, (Integer integer) -> {
			return integer >= 12;
		});

		List<Integer> integergeterthen12 = filter(arrayList, new Filterable() {
			@Override
			public boolean apply(Integer persion) {
				return persion >= 12;
			}
		});

		System.out.print(Arrays.asList(integerLessThan13));
		System.out.print(Arrays.asList(integergeterthen12));
	}

	public static List<Integer> filter(List<Integer> arrayList, Filterable filterable) {
		List<Integer> filterInteger = new ArrayList<>();
		for (Integer persion : arrayList) {
			if (filterable.apply(persion)) {
				filterInteger.add(persion);
			}
		}
		return filterInteger;
	}

}
