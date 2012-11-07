package perry

import groovy.transform.TypeChecked

/**
 * Created with IntelliJ IDEA.
 * User: MarkPerry
 * Date: 25/10/12
 * Time: 1:16 PM
 * To change this template use File | Settings | File Templates.
 */


/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that
 * the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 *
 */

@TypeChecked
class P007 {

	def p () {
		def is = new InfiniteSeq()
		def size = 10001
//		def size = 5
		def primes = is.generateUntil([2], new Primes().primeGenerator, { List it ->
			it.size() == size
		})
		def p = primes.last()
		println p
		assert(p == 104743)
	}

}
