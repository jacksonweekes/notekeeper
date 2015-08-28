
package views.html.sessions

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object session_list_Scope0 {
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

class session_list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.mvc.Http.Context.Implicit._;

Seq[Any](format.raw/*1.21*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<ul>
"""),_display_(/*5.2*/for(userSession <- user.getSessions) yield /*5.38*/ {_display_(Seq[Any](format.raw/*5.40*/("""
    """),_display_(/*6.6*/if(userSession.getId == session().get(Session.SESSION_VAR))/*6.65*/ {_display_(Seq[Any](format.raw/*6.67*/("""
        """),format.raw/*7.9*/("""<li>
            """),_display_(/*8.14*/userSession/*8.25*/.getIpAddress),format.raw/*8.38*/(""" """),format.raw/*8.39*/("""(this session) <br />
            Location: """),_display_(/*9.24*/userSession/*9.35*/.getLocation),format.raw/*9.47*/("""
        """),format.raw/*10.9*/("""</li>
    """)))}/*11.7*/else/*11.12*/{_display_(Seq[Any](format.raw/*11.13*/("""
        """),format.raw/*12.9*/("""<li>
            """),_display_(/*13.14*/userSession/*13.25*/.getIpAddress),format.raw/*13.38*/("""
            """),format.raw/*14.13*/("""<a href=""""),_display_(/*14.23*/routes/*14.29*/.SessionController.deleteSession(userSession.getId)),format.raw/*14.80*/("""">(delete)</a> <br />
            Location: """),_display_(/*15.24*/userSession/*15.35*/.getLocation),format.raw/*15.47*/("""
        """),format.raw/*16.9*/("""</li>
    """)))}),format.raw/*17.6*/("""
""")))}),format.raw/*18.2*/("""
"""),format.raw/*19.1*/("""</ul>"""))
      }
    }
  }

  def render(user:models.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object session_list extends session_list_Scope0.session_list
              /*
                  -- GENERATED --
                  DATE: Fri Aug 28 16:15:03 AEST 2015
                  SOURCE: /home/jackson/workspace/notekeeper/app/views/sessions/session_list.scala.html
                  HASH: b314c5d88a59f379e32afacd030d57141ce34f02
                  MATRIX: 773->1|927->20|954->63|981->64|1012->70|1063->106|1102->108|1133->114|1200->173|1239->175|1274->184|1318->202|1337->213|1370->226|1398->227|1469->272|1488->283|1520->295|1556->304|1585->316|1598->321|1637->322|1673->331|1718->349|1738->360|1772->373|1813->386|1850->396|1865->402|1937->453|2009->498|2029->509|2062->521|2098->530|2139->541|2171->543|2199->544
                  LINES: 27->1|32->1|33->3|34->4|35->5|35->5|35->5|36->6|36->6|36->6|37->7|38->8|38->8|38->8|38->8|39->9|39->9|39->9|40->10|41->11|41->11|41->11|42->12|43->13|43->13|43->13|44->14|44->14|44->14|44->14|45->15|45->15|45->15|46->16|47->17|48->18|49->19
                  -- GENERATED --
              */
          