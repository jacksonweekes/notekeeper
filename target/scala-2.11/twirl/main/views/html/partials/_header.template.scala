
package views.html.partials

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object _header_Scope0 {
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

class _header extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<head>
    <title>"""),_display_(/*4.13*/title),format.raw/*4.18*/("""</title>
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*5.55*/routes/*5.61*/.Assets.versioned("images/favicon.png")),format.raw/*5.100*/("""">
    <script src=""""),_display_(/*6.19*/routes/*6.25*/.Assets.versioned("javascripts/jquery-1.9.0.min.js")),format.raw/*6.77*/("""" type="text/javascript"></script>

    <!-- Bootstrap -->
    <title>"""),_display_(/*9.13*/title),format.raw/*9.18*/("""</title>
        <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

        <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href=""""),_display_(/*15.35*/routes/*15.41*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.82*/("""">

        <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>"""))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


}

/**/
object _header extends _header_Scope0._header
              /*
                  -- GENERATED --
                  DATE: Fri Aug 28 15:42:18 AEST 2015
                  SOURCE: /home/jackson/workspace/notekeeper/app/views/partials/_header.scala.html
                  HASH: e6ccd0a44e83fb08f3a634e2cb73b2f76cbb7325
                  MATRIX: 758->1|868->16|896->18|941->37|966->42|1055->105|1069->111|1129->150|1176->171|1190->177|1262->229|1359->300|1384->305|1753->647|1768->653|1830->694
                  LINES: 27->1|32->1|34->3|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|40->9|40->9|46->15|46->15|46->15
                  -- GENERATED --
              */
          