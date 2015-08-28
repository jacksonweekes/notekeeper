
package views.html.users

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object note_list_Scope0 {
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

class note_list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[models.Note],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(notes: List[models.Note]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""

"""),format.raw/*3.1*/("""<div class="col-md-6">
   """),_display_(/*4.5*/if(notes == null)/*4.22*/ {_display_(Seq[Any](format.raw/*4.24*/("""
      """),format.raw/*5.7*/("""<p>
         There are no notes to display.
      </p>
   """)))}/*8.6*/else/*8.11*/{_display_(Seq[Any](format.raw/*8.12*/("""
      """),format.raw/*9.7*/("""<ul class="post">
      """),_display_(/*10.8*/for(note <- notes) yield /*10.26*/ {_display_(Seq[Any](format.raw/*10.28*/("""
         """),format.raw/*11.10*/("""<li>
            <span>"""),_display_(/*12.20*/note/*12.24*/.getCreateTime.toString),format.raw/*12.47*/("""</span><br />"""),_display_(/*12.61*/note/*12.65*/.getMessage),format.raw/*12.76*/("""
         """),format.raw/*13.10*/("""</li>
      """)))}),format.raw/*14.8*/("""
      """),format.raw/*15.7*/("""</ul>
   """)))}),format.raw/*16.5*/("""

"""),format.raw/*18.1*/("""</div>"""))
      }
    }
  }

  def render(notes:List[models.Note]): play.twirl.api.HtmlFormat.Appendable = apply(notes)

  def f:((List[models.Note]) => play.twirl.api.HtmlFormat.Appendable) = (notes) => apply(notes)

  def ref: this.type = this

}


}

/**/
object note_list extends note_list_Scope0.note_list
              /*
                  -- GENERATED --
                  DATE: Fri Aug 28 15:42:18 AEST 2015
                  SOURCE: /home/jackson/workspace/notekeeper/app/views/users/note_list.scala.html
                  HASH: bdb93757eb22124b42bc48357ade0076d565983d
                  MATRIX: 770->1|891->27|919->29|971->56|996->73|1035->75|1068->82|1144->142|1156->147|1194->148|1227->155|1278->180|1312->198|1352->200|1390->210|1441->234|1454->238|1498->261|1539->275|1552->279|1584->290|1622->300|1665->313|1699->320|1739->330|1768->332
                  LINES: 27->1|32->1|34->3|35->4|35->4|35->4|36->5|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|43->12|43->12|43->12|43->12|43->12|43->12|44->13|45->14|46->15|47->16|49->18
                  -- GENERATED --
              */
          