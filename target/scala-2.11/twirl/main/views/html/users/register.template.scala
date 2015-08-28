
package views.html.users

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object register_Scope0 {
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

class register extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[views.forms.RegisterForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(registerForm: Form[views.forms.RegisterForm]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.48*/("""

"""),_display_(/*3.2*/main("Register")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""

   """),format.raw/*5.4*/("""<div class="well">
   """),_display_(/*6.5*/helper/*6.11*/.form(routes.UserController.createUser())/*6.52*/ {_display_(Seq[Any](format.raw/*6.54*/("""
      """),_display_(/*7.8*/_fieldset(registerForm)),format.raw/*7.31*/("""
   """)))}),format.raw/*8.5*/("""
   """),format.raw/*9.4*/("""</div>

""")))}))
      }
    }
  }

  def render(registerForm:Form[views.forms.RegisterForm]): play.twirl.api.HtmlFormat.Appendable = apply(registerForm)

  def f:((Form[views.forms.RegisterForm]) => play.twirl.api.HtmlFormat.Appendable) = (registerForm) => apply(registerForm)

  def ref: this.type = this

}


}

/**/
object register extends register_Scope0.register
              /*
                  -- GENERATED --
                  DATE: Fri Aug 28 15:42:18 AEST 2015
                  SOURCE: /home/jackson/workspace/notekeeper/app/views/users/register.scala.html
                  HASH: f65164728de53c902ac267cda1a90a1f6338cf7e
                  MATRIX: 781->1|922->47|950->50|974->66|1013->68|1044->73|1092->96|1106->102|1155->143|1194->145|1227->153|1270->176|1304->181|1334->185
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|37->6|37->6|37->6|37->6|38->7|38->7|39->8|40->9
                  -- GENERATED --
              */
          