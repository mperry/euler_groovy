package perry

import groovy.transform.TypeChecked

/**
 * Created with IntelliJ IDEA.
 * User: MarkPerry
 * Date: 24/10/12
 * Time: 1:38 PM
 * To change this template use File | Settings | File Templates.
 */

/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 *
 */
@TypeChecked
class P003 {

	def p() {

		def a = factors(new BigInteger("600851475143"))
		def c = factors(new BigInteger("13195"))
		def high = a.last()
		println high
		assert(high == 6857)
	}

	List<BigInteger> factors(BigInteger i) {
		myfactors(i, BigInteger.ONE, Math.sqrt(i.toDouble()).toBigInteger() + 1, [])
	}

	@TypeChecked
	List<BigInteger> myfactors(BigInteger numerator, BigInteger denominator, BigInteger until,
				   List<BigInteger> factors) {

		while (denominator < until) {
			if (numerator % denominator == 0) {
				factors.add(denominator)
				numerator = (numerator / denominator).toBigInteger()
				denominator = denominator + 1
			} else {
				denominator = denominator + 1
			}
		}
		factors
	}

}
