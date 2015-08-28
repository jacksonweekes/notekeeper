
package views.html.sessions

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[views.forms.LoginForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[views.forms.LoginForm]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.42*/("""

"""),_display_(/*3.2*/main("Login")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
   """),format.raw/*4.4*/("""<div class="well">
      """),_display_(/*5.8*/helper/*5.14*/.form(routes.SessionController.createSession())/*5.61*/ {_display_(Seq[Any](format.raw/*5.63*/("""
         """),_display_(/*6.11*/_fieldset(loginForm)),format.raw/*6.31*/("""
      """)))}),format.raw/*7.8*/("""
   """),format.raw/*8.4*/("""</div>
""")))}))
      }
    }
  }

  def render(loginForm:Form[views.forms.LoginForm]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[views.forms.LoginForm]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Fri Aug 28 15:42:18 AEST 2015
                  SOURCE: /home/jackson/workspace/notekeeper/app/views/sessions/login.scala.html
                  HASH: 6740c6f76faca4ffc12bae22a4032b534e6c8d5a
                  MATRIX: 775->1|910->41|938->44|959->57|998->59|1028->63|1079->89|1093->95|1148->142|1187->144|1224->155|1264->175|1301->183|1331->187
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|36->5|37->6|37->6|38->7|39->8
                  -- GENERATED --
              */
          