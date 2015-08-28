
package views.html.forms.items

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object textarea_Scope0 {
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

class textarea extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Field,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, rows: String = "3", label: String = "CHANGEME", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.109*/("""

  """),format.raw/*3.3*/("""<div class="form-group """),_display_(/*3.27*/if(field.hasErrors)/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""has-error""")))}),format.raw/*3.58*/("""">
    <label class="col-sm-2 control-label">"""),_display_(/*4.44*/label),format.raw/*4.49*/("""</label>
    <div class="col-sm-10">
      <textarea class="form-control"
                rows=""""),_display_(/*7.24*/rows),format.raw/*7.28*/("""" 
                id=""""),_display_(/*8.22*/field/*8.27*/.id),format.raw/*8.30*/("""" 
                name=""""),_display_(/*9.24*/field/*9.29*/.name),format.raw/*9.34*/("""" 
                placeholder=""""),_display_(/*10.31*/placeholder),format.raw/*10.42*/("""" 
                >"""),_display_(/*11.19*/field/*11.24*/.value.getOrElse("")),format.raw/*11.44*/("""</textarea>
      <span class="help-block">"""),_display_(/*12.33*/help),format.raw/*12.37*/("""</span>
      <span class="help-block">"""),_display_(/*13.33*/{field.error.map { error => error.message }}),format.raw/*13.77*/("""</span>
    </div>
  </div>
"""))
      }
    }
  }

  def render(field:Field,rows:String,label:String,placeholder:String,help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,rows,label,placeholder,help)

  def f:((Field,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (field,rows,label,placeholder,help) => apply(field,rows,label,placeholder,help)

  def ref: this.type = this

}


}

/**/
object textarea extends textarea_Scope0.textarea
              /*
                  -- GENERATED --
                  DATE: Fri Aug 28 15:42:18 AEST 2015
                  SOURCE: /home/jackson/workspace/notekeeper/app/views/forms/items/textarea.scala.html
                  HASH: ace674f811c399a66516431fac836db405e11944
                  MATRIX: 790->1|993->108|1023->112|1073->136|1100->155|1139->157|1179->167|1251->213|1276->218|1399->315|1423->319|1473->343|1486->348|1509->351|1561->377|1574->382|1599->387|1659->420|1691->431|1739->452|1753->457|1794->477|1865->521|1890->525|1957->565|2022->609
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|42->11|42->11|42->11|43->12|43->12|44->13|44->13
                  -- GENERATED --
              */
          