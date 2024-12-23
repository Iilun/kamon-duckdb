package modules

import org.apache.pekko.actor.ActorSystem
import play.api.Logging
import play.api.db.Database
import play.api.inject.ApplicationLifecycle

import javax.inject.Inject
import scala.concurrent.ExecutionContext

class TestService @Inject()(lifecycle: ApplicationLifecycle)(
  implicit ec: ExecutionContext,
  system: ActorSystem,
  database: Database
) extends Logging {
  logger.info("Started")
}
