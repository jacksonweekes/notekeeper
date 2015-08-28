
package views.html.forms.items

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object radiobuttons_Scope0 {
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

class radiobuttons extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,List[String],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "CHANGEME", buttonNameList: List[String], help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.93*/("""

  """),format.raw/*3.3*/("""<div class="form-group """),_display_(/*3.27*/if(field.hasErrors)/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""has-error""")))}),format.raw/*3.58*/("""">
    <label class="col-sm-2 control-label" for=""""),_display_(/*4.49*/field/*4.54*/.id),format.raw/*4.57*/("""">"""),_display_(/*4.60*/label),format.raw/*4.65*/("""</label>
    <div id=""""),_display_(/*5.15*/(field.id + "s")),format.raw/*5.31*/("""" class="col-sm-10" >
      """),_display_(/*6.8*/for(buttonName <- buttonNameList) yield /*6.41*/ {_display_(Seq[Any](format.raw/*6.43*/("""
      """),format.raw/*7.7*/("""<label class="radio-inline">
        <input
          type="radio"
          name=""""),_display_(/*10.18*/field/*10.23*/.name),format.raw/*10.28*/(""""
          id=""""),_display_(/*11.16*/buttonName),format.raw/*11.26*/(""""
          value=""""),_display_(/*12.19*/buttonName),format.raw/*12.29*/(""""
          """),_display_(/*13.12*/if(buttonName == field.value.getOrElse(""))/*13.55*/ {_display_(Seq[Any](format.raw/*13.57*/("""checked""")))}),format.raw/*13.65*/(""" """),format.raw/*13.66*/("""/>
        """),_display_(/*14.10*/buttonName),format.raw/*14.20*/("""
      """),format.raw/*15.7*/("""</label>
      """)))}),format.raw/*16.8*/("""
      """),format.raw/*17.7*/("""<span class="help-block">"""),_display_(/*17.33*/help),format.raw/*17.37*/("""</span>
      <span class="help-block">"""),_display_(/*18.33*/{field.error.map { error => error.message }}),format.raw/*18.77*/("""</span>
    </div>
  </div>
"""))
      }
    }
  }

  def render(field:Field,label:String,buttonNameList:List[String],help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,buttonNameList,help)

  def f:((Field,String,List[String],String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,buttonNameList,help) => apply(field,label,buttonNameList,help)

  def ref: this.type = this

}


}

/**/
object radiobuttons extends radiobuttons_Scope0.radiobuttons
              /*
                  -- GENERATED --
                  DATE: Fri Aug 28 15:42:18 AEST 2015
                  SOURCE: /home/jackson/workspace/notekeeper/app/views/forms/items/radiobuttons.scala.html
                  HASH: 9fc90b0e888fa19e5c91e45827b4745799fdfdb4
                  MATRIX: 797->1|983->92|1013->96|1063->120|1090->139|1129->141|1169->151|1246->202|1259->207|1282->210|1311->213|1336->218|1385->241|1421->257|1475->286|1523->319|1562->321|1595->328|1706->412|1720->417|1746->422|1790->439|1821->449|1868->469|1899->479|1939->492|1991->535|2031->537|2070->545|2099->546|2138->558|2169->568|2203->575|2249->591|2283->598|2336->624|2361->628|2428->668|2493->712
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|36->5|36->5|37->6|37->6|37->6|38->7|41->10|41->10|41->10|42->11|42->11|43->12|43->12|44->13|44->13|44->13|44->13|44->13|45->14|45->14|46->15|47->16|48->17|48->17|48->17|49->18|49->18
                  -- GENERATED --
              */
          