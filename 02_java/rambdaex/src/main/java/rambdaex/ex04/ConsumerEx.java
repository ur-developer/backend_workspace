package rambdaex.ex04;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;


public class ConsumerEx {
	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("java");
	
		BiConsumer<String, String> bigConsumer =(t,u) -> System.out.println(t = u);
		bigConsumer.accept("java", "8");
	
		DoubleConsumer doubleConsumer = d -> System.out.println("Java" + d);
		doubleConsumer.accept(8.0);
	
		ObjIntConsumer<String> objIntComsumer = (t, i) -> System.out.println(t + i);
		objIntComsumer.accept("Java", 8);
	}
}
