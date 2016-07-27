import com.google.inject.ImplementedBy
import javax.inject.Singleton

@ImplementedBy(classOf[TestingClass])
trait Testing {

  def testFunc(): String
}

@ Singleton
class TestingClass extends Testing {

  override def testFunc(): String = "test"

}
