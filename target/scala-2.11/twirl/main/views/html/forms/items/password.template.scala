
package views.html.forms.items

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object password_Scope0 {
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

class password extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label:String = "CHANGEME", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.88*/("""

  """),format.raw/*3.3*/("""<div class="form-group """),_display_(/*3.27*/if(field.hasErrors)/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""has-error""")))}),format.raw/*3.58*/("""">
    <label class="col-sm-2 control-label">"""),_display_(/*4.44*/label),format.raw/*4.49*/("""</label>
    <div class="col-sm-10">
      <input
        type="password"
        class="form-control"
        id=""""),_display_(/*9.14*/field/*9.19*/.id),format.raw/*9.22*/(""""
        name=""""),_display_(/*10.16*/field/*10.21*/.name),format.raw/*10.26*/(""""
        value=""""),_display_(/*11.17*/field/*11.22*/.value.getOrElse("")),format.raw/*11.42*/(""""
        placeholder=""""),_display_(/*12.23*/placeholder),format.raw/*12.34*/("""" />
      <span class="help-block">"""),_display_(/*13.33*/help),format.raw/*13.37*/("""</span>
      <span class="help-block">"""),_display_(/*14.33*/{field.error.map { error => error.message }}),format.raw/*14.77*/("""</span>
    </div>
  </div>
"""))
      }
    }
  }

  def render(field:Field,label:String,placeholder:String,help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,placeholder,help)

  def f:((Field,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,placeholder,help) => apply(field,label,placeholder,help)

  def ref: this.type = this

}


}

/**/
object password extends password_Scope0.password
              /*
                  -- GENERATED --
                  DATE: Fri Aug 28 15:42:18 AEST 2015
                  SOURCE: /home/jackson/workspace/notekeeper/app/views/forms/items/password.scala.html
                  HASH: 4ff6a9aa2bc1919d16a5b0698a634701d308973e
                  MATRIX: 783->1|964->87|994->91|1044->115|1071->134|1110->136|1150->146|1222->192|1247->197|1389->313|1402->318|1425->321|1469->338|1483->343|1509->348|1554->366|1568->371|1609->391|1660->415|1692->426|1756->463|1781->467|1848->507|1913->551
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|44->13|44->13|45->14|45->14
                  -- GENERATED --
              */
          