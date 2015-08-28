
package views.html.forms.items

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object select_Scope0 {
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

class select extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Field,String,Map[String, Boolean],Boolean,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "CHANGEME", optionMap: Map[String, Boolean], isMultiple: Boolean, help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.117*/("""

  """),format.raw/*3.3*/("""<div class="form-group """),_display_(/*3.27*/if(field.hasErrors)/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""has-error""")))}),format.raw/*3.58*/("""">
    <label class="col-sm-2 control-label" for=""""),_display_(/*4.49*/field/*4.54*/.id),format.raw/*4.57*/("""">"""),_display_(/*4.60*/label),format.raw/*4.65*/("""</label>
    <div class="col-sm-10">
      <select
        class="form-control"
        id=""""),_display_(/*8.14*/field/*8.19*/.id),format.raw/*8.22*/(""""
        name=""""),_display_(/*9.16*/if(isMultiple)/*9.30*/ {_display_(_display_(/*9.33*/(field.name + "[]")))}/*9.54*/else/*9.59*/{_display_(_display_(/*9.61*/field/*9.66*/.name))}),format.raw/*9.72*/(""""
        """),_display_(/*10.10*/if(isMultiple)/*10.24*/ {_display_(Seq[Any](format.raw/*10.26*/("""multiple="multiple"""")))}),format.raw/*10.46*/(""">
        """),_display_(/*11.10*/if(!isMultiple)/*11.25*/ {_display_(Seq[Any](format.raw/*11.27*/("""<option class="blank" value="">Please select a value</option>""")))}),format.raw/*11.89*/("""
        """),_display_(/*12.10*/for((optionName, isSelected) <- optionMap) yield /*12.52*/ {_display_(Seq[Any](format.raw/*12.54*/("""
          """),format.raw/*13.11*/("""<option id=""""),_display_(/*13.24*/optionName),format.raw/*13.34*/("""" value=""""),_display_(/*13.44*/optionName),format.raw/*13.54*/("""" """),_display_(/*13.57*/if(isSelected)/*13.71*/ {_display_(Seq[Any](format.raw/*13.73*/("""selected""")))}),format.raw/*13.82*/(""">"""),_display_(/*13.84*/optionName),format.raw/*13.94*/("""</option>
        """)))}),format.raw/*14.10*/("""
      """),format.raw/*15.7*/("""</select>
      <span class="help-block">"""),_display_(/*16.33*/help),format.raw/*16.37*/("""</span>
      <span class="help-block">"""),_display_(/*17.33*/{field.error.map { error => error.message }}),format.raw/*17.77*/("""</span>
    </div>
  </div>
"""))
      }
    }
  }

  def render(field:Field,label:String,optionMap:Map[String, Boolean],isMultiple:Boolean,help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,optionMap,isMultiple,help)

  def f:((Field,String,Map[String, Boolean],Boolean,String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,optionMap,isMultiple,help) => apply(field,label,optionMap,isMultiple,help)

  def ref: this.type = this

}


}

/**/
object select extends select_Scope0.select
              /*
                  -- GENERATED --
                  DATE: Fri Aug 28 15:42:18 AEST 2015
                  SOURCE: /home/jackson/workspace/notekeeper/app/views/forms/items/select.scala.html
                  HASH: 59a9581b3a908e7f8a850f47466b35a337d2b763
                  MATRIX: 801->1|1012->116|1042->120|1092->144|1119->163|1158->165|1198->175|1275->226|1288->231|1311->234|1340->237|1365->242|1484->335|1497->340|1520->343|1563->360|1585->374|1615->377|1645->398|1657->403|1686->405|1699->410|1727->416|1765->427|1788->441|1828->443|1879->463|1917->474|1941->489|1981->491|2074->553|2111->563|2169->605|2209->607|2248->618|2288->631|2319->641|2356->651|2387->661|2417->664|2440->678|2480->680|2520->689|2549->691|2580->701|2630->720|2664->727|2733->769|2758->773|2825->813|2890->857
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|39->8|39->8|39->8|40->9|40->9|40->9|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|45->14|46->15|47->16|47->16|48->17|48->17
                  -- GENERATED --
              */
          