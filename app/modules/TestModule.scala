package modules

import com.google.inject.AbstractModule

class TestModule() extends AbstractModule {

  override def configure(): Unit = {
    bind(classOf[TestService]).asEagerSingleton()
  }
}