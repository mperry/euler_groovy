package perry

import groovy.transform.Canonical

/**
 * Created with IntelliJ IDEA.
 * User: MarkPerry
 * Date: 25/10/12
 * Time: 2:24 PM
 * To change this template use File | Settings | File Templates.
 */

/**
 * We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n
 * exactly once; for example, the 5-digit number, 15234, is 1 through 5 pandigital.
 *
 * The product 7254 is unusual, as the identity, 39 186 = 7254, containing multiplicand,
 * multiplier, and product is 1 through 9 pandigital.
 *
 *  Find the sum of all products whose multiplicand/multiplier/product identity can be written
 * as a 1 through 9 pandigital.
 *
 * HINT: Some products can be obtained in more than one way so be sure to only include it once
 * in your sum.
 *
 */
class P032 {


	@Canonical
	public class Tuple3 {
		def a
		def b
		def c

		int size() {
			(a.toString() + b.toString() + c.toString()).size()
		}
	}

	def p() {

		def max = 10**4
//		def max = 200
		def pan = 9
		List result = []
		def b = (1..max).each{
			a -> (a + 1..max).each{ p ->
				def t2 = new Tuple3(a, p, a * p)
				def size = t2.size()
				if (size == pan) {
					result.add(t2)
				}
				if (p % 100 == 0) {
					println t2
				}
				t2
			}
		}
		def c = result.findAll {pandigital(it, pan)}
		def s = c.inject(0){Integer total, Tuple3 t ->
			total + t.c
		}
		println c
		println s
		assert(s == 56370)

	}


	Boolean pandigital(Tuple3 t, Integer n) {
		def s = t.a.toString()+ t.b.toString() + t.c.toString()
		pandigital(s, t.size())
	}

	Boolean pandigital(String s, Integer size) {
		if (s.size() != size) {

			return false
		}
		def n = s.length()
		def a = (1..n).findAll{s.contains(it.toString())}
		a.size() == n
	}

}
