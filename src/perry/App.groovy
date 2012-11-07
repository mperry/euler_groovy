package perry

/**
 * Created with IntelliJ IDEA.
 * User: MarkPerry
 * Date: 24/10/12
 * Time: 1:05 AM
 * To change this template use File | Settings | File Templates.
 */
@Grapes(
	@Grab(group='org.functionaljava', module='functionaljava', version='3.0')
)
class App {

	static def main(def args) {
		new P010().p()
	}

}
