package perry

import groovy.transform.TypeChecked

/**
 * Created with IntelliJ IDEA.
 * User: MarkPerry
 * Date: 24/10/12
 * Time: 2:29 PM
 * To change this template use File | Settings | File Templates.
 */


/*
 * A palindromic number reads the same both ways. The largest palindrome made from
 * the product of two 2-digit numbers is 9009 = 91 ? 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 */

@TypeChecked
class P004 {

	def min = 100
	def max = 999
	def p() {
		List<Integer> nums = (min..max).toList()
//		def nums = (min..max)
		def nums2 = nums.collect { Integer it ->
			List<Integer> b = ((it + 1)..max).toList()
			b.collect {
				Integer a -> it * a
			}
		}.flatten()
		def c = nums2.findAll{isPalindrome(it.toString())}
		def a = c.sort()
		def b = a.last()
		println(b)
		assert(b == 906609)
	}

	boolean isPalindrome(String s) {
		s.reverse().equals(s)
	}

}
