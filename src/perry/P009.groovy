package perry

import groovy.transform.Canonical
import groovy.transform.TypeChecked

/**
 * Created with IntelliJ IDEA.
 * User: MarkPerry
 * Date: 2/11/12
 * Time: 11:15 PM
 * To change this template use File | Settings | File Templates.
 */
/**
 * A Pythagorean triplet is a set of three natural numbers, a b c, for which
 *
 * a ^ 2 + b ^ 2 = c ^ 2
 *
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 *
 * Find the product abc.
 *
 */
@TypeChecked
class P009 {
	int sum = 1000

	boolean pyth(Integer a, Integer b, Integer c) {
		a ** 2 + b ** 2 == c ** 2
	}

	def p() {
		def a = (1..sum).collect{ Integer a ->
			(a + 1..sum).collect{ Integer b ->
				new MyTuple(a, b, sum - a - b)
			}
		}
		def b = a.flatten().findAll{ MyTuple t ->
			t.a <= t.b && t.b <= t.c && pyth(t.a, t.b, t.c)
		}
		println b
		assert(b.first() == new MyTuple(200, 375, 425))
	}

	@Canonical
	class MyTuple {
		Integer a
		Integer b
		Integer c
	}

}
