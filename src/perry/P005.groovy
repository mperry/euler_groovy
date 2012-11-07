package perry

import groovy.transform.TypeChecked

/**
 * Created with IntelliJ IDEA.
 * User: MarkPerry
 * Date: 25/10/12
 * Time: 9:38 AM
 * To change this template use File | Settings | File Templates.
 */


/*
 * 2520 is the smallest number that can be divided by each of the numbers from
 * 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20?
 *
 */
class P005 {

	def p() {
//		def a = smallestDivisible(10)
//		assert(a == 2520)
		def a = smallestDivisible(20)
		assert(a == 232792560)
		println(a)
	}

	@TypeChecked
	Integer smallestDivisible(Integer n) {
		smallestDivisible(n, n)
	}

//	@TypeChecked
	Closure<Integer> smallestDivisible = { Integer max, Integer num ->
		List<Integer> range = (1..max).toList()
		def remainders = range.findAll{ Integer it -> num % it != 0}
		if (remainders.empty) {
			// all divisible
			num
		} else {
			smallestDivisible.trampoline(max, num + max)
//			smallestDivisible(max, num + max)
		}
//	}
	}.trampoline()

}
