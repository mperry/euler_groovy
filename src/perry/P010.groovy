package perry

import groovy.transform.TypeChecked

/**
 * Created with IntelliJ IDEA.
 * User: MarkPerry
 * Date: 3/11/12
 * Time: 12:39 AM
 * To change this template use File | Settings | File Templates.
 */

/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 *
 */
@TypeChecked
class P010 {

	def p() {
		def max = 2 * 10 ** 6
//		def max = 10
		def pg = new Primes().primeGenerator
		def until = { List<Integer> it -> it.last() >= max}
		def c = new InfiniteSeq().generateUntil([2], pg, until)
//		def f = c[0..c.size() - 2]
		def g = c.drop(c.size() - 1)
		def d = g.sum()
		println d
//		1179908154
	}

}
