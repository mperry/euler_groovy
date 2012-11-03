package perry

import groovy.transform.Canonical
import groovy.transform.TypeChecked

/**
 * Created with IntelliJ IDEA.
 * User: MarkPerry
 * Date: 24/10/12
 * Time: 1:16 PM
 * To change this template use File | Settings | File Templates.
 */
@Canonical
@TypeChecked
class InfiniteSeq<T> {

	@TypeChecked
	List<T> generateUntil(List<T> start, Closure<T> gen, Closure<Boolean> until) {
		def list = start
		def ok = !until.call(start)
		while (ok) {
			def item = gen.call(list)
			list.add(item)
			ok = !until.call(list)
		}
		list
	}

}
