
package views.html.partials

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object _navbar_Scope0 {
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

class _navbar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<header class="navbar navbar-fixed-top navbar-inverse">
    <div class="container">
        <a href=""""),_display_(/*5.19*/routes/*5.25*/.StaticPageController.index()),format.raw/*5.54*/("""" id="logo">notekeeper</a>
        """),_display_(/*6.10*/if(User.findUserFromSessionID(session.get(models.Session.SESSION_VAR)) != null)/*6.89*/ {_display_(Seq[Any](format.raw/*6.91*/("""
            """),format.raw/*7.13*/("""<nav>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href='"""),_display_(/*9.35*/routes/*9.41*/.SessionController.deleteSession()),format.raw/*9.75*/("""'>Logout</a></li>
                </ul>
            </nav>
        """)))}/*12.11*/else/*12.16*/{_display_(Seq[Any](format.raw/*12.17*/("""
            """),format.raw/*13.13*/("""<nav>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href='"""),_display_(/*15.35*/routes/*15.41*/.UserController.newUser()),format.raw/*15.66*/("""'>Register</a></li>
                    <li><a href='"""),_display_(/*16.35*/routes/*16.41*/.SessionController.newSession()),format.raw/*16.72*/("""'>Login</a></li>
                </ul>
            </nav>
        """)))}),format.raw/*19.10*/("""

    """),format.raw/*21.5*/("""</div>
</header>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object _navbar extends _navbar_Scope0._navbar
              /*
                  -- GENERATED --
                  DATE: Fri Aug 28 15:42:18 AEST 2015
                  SOURCE: /home/jackson/workspace/notekeeper/app/views/partials/_navbar.scala.html
                  HASH: 646d187b967c0b6b589fd128a13d58cda17f5688
                  MATRIX: 751->1|847->3|875->5|1003->107|1017->113|1066->142|1128->178|1215->257|1254->259|1294->272|1417->369|1431->375|1485->409|1572->478|1585->483|1624->484|1665->497|1789->594|1804->600|1850->625|1931->679|1946->685|1998->716|2096->783|2129->789
                  LINES: 27->1|32->1|34->3|36->5|36->5|36->5|37->6|37->6|37->6|38->7|40->9|40->9|40->9|43->12|43->12|43->12|44->13|46->15|46->15|46->15|47->16|47->16|47->16|50->19|52->21
                  -- GENERATED --
              */
          