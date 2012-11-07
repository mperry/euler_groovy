package perry

import groovy.transform.TypeChecked

/**
 * Created with IntelliJ IDEA.
 * User: MarkPerry
 * Date: 25/10/12
 * Time: 1:11 PM
 * To change this template use File | Settings | File Templates.
 */


/*
 * 	The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 *
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 552 = 3025
 *
 * Hence the difference between the sum of the squares of the first ten natural
 * numbers and the square of the sum is 3025 - 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred natural
 * numbers and the square of the sum.
 */

@TypeChecked
class P006 {

	def p() {
		int max = 100
		def sumSquares = sumSquares(max)
		def squareSums = squareSum(max)
		def diff = squareSums - sumSquares
		println(diff)
		assert(diff == 25164150)
	}

	Integer squareSum(Integer n) {
		List<Integer> range = (1..n).toList()
		Integer s = (Integer) range.sum()
		(s ** 2).toInteger()
	}

	Integer sumSquares(Integer n) {
		List<Integer> r = (1..n)
		(Integer) r.collect{Integer it -> it ** 2}.sum()
	}

}
