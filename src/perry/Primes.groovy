package perry

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked

/**
 * Created with IntelliJ IDEA.
 * User: MarkPerry
 * Date: 3/11/12
 * Time: 12:40 AM
 * To change this template use File | Settings | File Templates.
 */
@TypeChecked
class Primes {

//	@TypeChecked
	Closure<Integer> primeGenerator = { List<Integer> l ->
		def start = l.last() + 1
		def stop = false
		while (!stop) {
			if (start % 1000 == 0) {
				println "Testing ${start}"
			}
			def localMax = ((Integer) Math.sqrt(start)) + 1
//			def a = l.findAll{ Integer it -> it <= localMax}.dropWhile{ Integer it -> start % it != 0}
			def b = l.dropWhile { Integer it -> it <= localMax && start % it != 0 }
			if (b.size() == 0) {

				stop = true
			} else if (b.size() > 0 && start % b.head() != 0) {
//				println("found prime n: ${l.size() + 1} prime: ${start}")
				stop = true
			} else {
				// not prime
				start += 1
			}
		}
		start
	}


}
