package perry

import fj.data.Stream
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
class P001 {

	@TypeChecked
	def p () {
		def l = (1..1000)
		def l2 = l.findAll { Integer it -> it % 3 == 0 || it % 5 == 0}
		def sum = l2.sum()
		println "sum: ${sum}"
		assert(sum == 234168)
	}

}
