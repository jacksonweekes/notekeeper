
package views.html.users

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object _fieldset_Scope0 {
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

class _fieldset extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[views.forms.RegisterForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(registerForm: Form[views.forms.RegisterForm]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import views.html.forms.items._

Seq[Any](format.raw/*1.48*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<fieldset>
   <div id="legend">
      <legend>Register</legend>
   </div>

      <!-- Name -->
   """),_display_(/*11.5*/text(registerForm("name"), "Name", "My Name", "Please enter your full name. (required)")),format.raw/*11.93*/("""

      """),format.raw/*13.7*/("""<!-- Email -->
   """),_display_(/*14.5*/text(registerForm("email"), "Email", "My Email", "Please enter your email address. (required)")),format.raw/*14.100*/("""

      """),format.raw/*16.7*/("""<!-- Password -->
   """),_display_(/*17.5*/password(registerForm("password"), "Password", "Password", "Please choose a password. (min 8 characters)")),format.raw/*17.111*/("""

   """),_display_(/*19.5*/password(registerForm("passwordConfirmation"), "Password Confirmation", "Password Confirmation", "Reenter your password")),format.raw/*19.126*/("""

   """),format.raw/*21.4*/("""<div class="form-group">
      <div class="col-sm-offset-2 col-sm-10">
         <button id="submit" type="submit" value="Submit" class="btn btn-primary">Submit</button>
         <button id="cancel" class="btn cancel">Cancel</button>
      </div>
   </div>
</fieldset>"""))
      }
    }
  }

  def render(registerForm:Form[views.forms.RegisterForm]): play.twirl.api.HtmlFormat.Appendable = apply(registerForm)

  def f:((Form[views.forms.RegisterForm]) => play.twirl.api.HtmlFormat.Appendable) = (registerForm) => apply(registerForm)

  def ref: this.type = this

}


}

/**/
object _fieldset extends _fieldset_Scope0._fieldset
              /*
                  -- GENERATED --
                  DATE: Fri Aug 28 15:48:26 AEST 2015
                  SOURCE: /home/jackson/workspace/notekeeper/app/views/users/_fieldset.scala.html
                  HASH: 4a399ef25986903991c9a583b0d6d8086e951276
                  MATRIX: 783->1|955->47|983->82|1010->83|1135->182|1244->270|1279->278|1324->297|1441->392|1476->400|1524->422|1652->528|1684->534|1827->655|1859->660
                  LINES: 27->1|32->1|34->4|35->5|41->11|41->11|43->13|44->14|44->14|46->16|47->17|47->17|49->19|49->19|51->21
                  -- GENERATED --
              */
          