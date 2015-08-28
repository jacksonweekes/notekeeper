
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Notekeeper")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""

   """),format.raw/*5.4*/("""<div class="center jumbotron">
      <h1>Notekeeper</h1>

      <p>
         Notekeeper is a simple application built in Java on the
         <a href="https://playframework.com/">Play! Framework</a>. It was created by
         <a href="https://www.linkedin.com/in/jacksonweekes">Jackson Cleary</a>.
         The source can be found on
         <a href="https://github.com/jacksonweekes/notekeeper">github.</a>
      </p>.
      <p>
         While you are welcome to use it to store notes, it is really just intended as a
         simple example application to demonstrate basic session management(register, login/logout
         and remote session management). When new sessions are created, the application also
         calls to the ip-api.com json api to discover the approximate location of the ip address.
      </p>
      <p>
         It also demonstrates the use of some Play! features such as form validation and submission,
         a custom authenticator as well as the use of Ebean to communicate with a relational database.
         There are also a number of JUnit tests included in the github repository.
         Anyone is free to use the source for this application as the basis of their own project. If
         you would like to contact me, send me a message on twitter @jacksonweekes.
      </p>
      <a href='"""),_display_(/*28.17*/routes/*28.23*/.UserController.newUser()),format.raw/*28.48*/("""' class="btn btn-lg btn-primary">Sign up now!</a>
   </div>
""")))}),format.raw/*30.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Fri Aug 28 16:22:55 AEST 2015
                  SOURCE: /home/jackson/workspace/notekeeper/app/views/index.scala.html
                  HASH: b58d9b85d886dd56e5fce0437a3c75a7b9c1b042
                  MATRIX: 745->1|857->18|885->21|911->39|950->41|981->46|2339->1378|2354->1384|2400->1409|2491->1470
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|59->28|59->28|59->28|61->30
                  -- GENERATED --
              */
          