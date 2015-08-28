
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.mvc.Http.Context.Implicit.flash

Seq[Any](format.raw/*1.32*/("""
   """),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>

   <html>
      """),_display_(/*7.8*/partials/*7.16*/._header(title)),format.raw/*7.31*/("""
   """),format.raw/*8.4*/("""<body>
      """),_display_(/*9.8*/partials/*9.16*/._navbar()),format.raw/*9.26*/("""
   """),format.raw/*10.4*/("""<div class="container">
      """),_display_(/*11.8*/if(!flash.isEmpty)/*11.26*/ {_display_(Seq[Any](format.raw/*11.28*/("""
         """),format.raw/*12.10*/("""<div id="mainflash">
         """),_display_(/*13.11*/flash()/*13.18*/.map/*13.22*/ { case (k, v) =>_display_(Seq[Any](format.raw/*13.39*/("""
         """),format.raw/*14.10*/("""<div class="""),_display_(/*14.22*/k),format.raw/*14.23*/(""">"""),_display_(/*14.25*/v),format.raw/*14.26*/("""</div>
         """)))}),format.raw/*15.11*/("""
         """),format.raw/*16.10*/("""</div>
      """)))}),format.raw/*17.8*/("""
      """),_display_(/*18.8*/content),format.raw/*18.15*/("""
      """),_display_(/*19.8*/partials/*19.16*/._footer()),format.raw/*19.26*/("""
   """),format.raw/*20.4*/("""</div>
   </body>
   </html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Aug 28 15:42:18 AEST 2015
                  SOURCE: /home/jackson/workspace/notekeeper/app/views/main.scala.html
                  HASH: 4345547e6e021d3aa38c5c05adbef42c20c42ac6
                  MATRIX: 748->1|916->31|946->80|973->81|1032->115|1048->123|1083->138|1113->142|1152->156|1168->164|1198->174|1229->178|1286->209|1313->227|1353->229|1391->239|1449->270|1465->277|1478->281|1533->298|1571->308|1610->320|1632->321|1661->323|1683->324|1731->341|1769->351|1813->365|1847->373|1875->380|1909->388|1926->396|1957->406|1988->410
                  LINES: 27->1|32->1|33->3|34->4|37->7|37->7|37->7|38->8|39->9|39->9|39->9|40->10|41->11|41->11|41->11|42->12|43->13|43->13|43->13|43->13|44->14|44->14|44->14|44->14|44->14|45->15|46->16|47->17|48->18|48->18|49->19|49->19|49->19|50->20
                  -- GENERATED --
              */
          