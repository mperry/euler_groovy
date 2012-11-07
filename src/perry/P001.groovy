package perry

import groovy.transform.TypeChecked

/**
 * Created with IntelliJ IDEA.
 * User: MarkPerry
 * Date: 24/10/12
 * Time: 1:04 AM
 * To change this template use File | Settings | File Templates.
 */


/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 */
@TypeChecked
//@Grapes(
//	@Grab(group='org.functionaljava', module='functionaljava', version='3.0')
//)
class P001 {

	def p () {
		def max = 1000 - 1
		def list = (1..max).findAll { Integer it -> it % 3 == 0 || it % 5 == 0}
		def sum = list.sum()
		println "sum: ${sum}"
		assert(sum == 233168)
	}

}
