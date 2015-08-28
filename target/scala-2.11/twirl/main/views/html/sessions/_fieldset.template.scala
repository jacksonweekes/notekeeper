
package views.html.sessions

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

class _fieldset extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[views.forms.LoginForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[views.forms.LoginForm]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import views.html.forms.items._

Seq[Any](format.raw/*1.42*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<fieldset>
   <div id="legend">
      <legend>Login</legend>
   </div>

   <!-- email -->
   """),_display_(/*11.5*/text(loginForm("email"), "Email", "My Email", "Please enter your email address.")),format.raw/*11.86*/("""

   """),format.raw/*13.4*/("""<!-- password -->
   """),_display_(/*14.5*/password(loginForm("password"), "Password", "Password", "Please enter your password.")),format.raw/*14.91*/("""

   """),_display_(/*16.5*/if(loginForm.hasGlobalErrors)/*16.34*/ {_display_(Seq[Any](format.raw/*16.36*/("""
      """),format.raw/*17.7*/("""<p class="error">
         """),_display_(/*18.11*/loginForm/*18.20*/.globalError.message),format.raw/*18.40*/("""
      """),format.raw/*19.7*/("""</p>
   """)))}),format.raw/*20.5*/("""

   """),format.raw/*22.4*/("""<div class="form-group">
      <div class="col-sm-offset-2 col-sm-10">
         <button id="submit" type="submit" value="Submit" class="btn btn-primary">Submit</button>
         <button id="cancel" class="btn cancel">Cancel</button>
      </div>
   </div>
</fieldset>"""))
      }
    }
  }

  def render(loginForm:Form[views.forms.LoginForm]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[views.forms.LoginForm]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


}

/**/
object _fieldset extends _fieldset_Scope0._fieldset
              /*
                  -- GENERATED --
                  DATE: Fri Aug 28 15:42:18 AEST 2015
                  SOURCE: /home/jackson/workspace/notekeeper/app/views/sessions/_fieldset.scala.html
                  HASH: 8c4d1393c47c56ef73b312e213371c6e1f933d3b
                  MATRIX: 783->1|949->41|977->76|1004->77|1124->171|1226->252|1258->257|1306->279|1413->365|1445->371|1483->400|1523->402|1557->409|1612->437|1630->446|1671->466|1705->473|1744->482|1776->487
                  LINES: 27->1|32->1|34->4|35->5|41->11|41->11|43->13|44->14|44->14|46->16|46->16|46->16|47->17|48->18|48->18|48->18|49->19|50->20|52->22
                  -- GENERATED --
              */
          