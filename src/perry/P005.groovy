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
@TypeChecked
class P005 {

	def p() {

		def a = smallestDivisible(10)
		println(a)
//		assert(a == 232792560)
	}

	int smallestDivisible(Integer n) {
		smallestDivisible(n, n)
//		smallestDivisible(n, n).trampoline()
	}

	int smallestDivisible(Integer upto, Integer num) {

		List<Integer> range = (1..upto).toList()
		def remainders = range.findAll{ Integer it -> num % it != 0}
//		def remainders = a.findAll{it != 0}
		if (remainders.empty) {
			// all divisible
			num

		} else {
			smallestDivisible(upto, num + upto)
		}
	}

}
