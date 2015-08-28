
package views.html.users

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object user_Scope0 {
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

class user extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.21*/("""

"""),_display_(/*3.2*/main(user.getEmail)/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
   """),format.raw/*4.4*/("""<aside class="col-md-3">
      <section class="user_info">
         <h1>"""),_display_(/*6.15*/user/*6.19*/.getName),format.raw/*6.27*/("""</h1>
         <h2>"""),_display_(/*7.15*/user/*7.19*/.getEmail),format.raw/*7.28*/("""</h2>

         <h3>Current Sessions</h3>
         """),_display_(/*10.11*/views/*10.16*/.html.sessions.session_list(user)),format.raw/*10.49*/("""
      """),format.raw/*11.7*/("""</section>
   </aside>
   <form action=""""),_display_(/*13.19*/routes/*13.25*/.NoteController.createNote()),format.raw/*13.53*/("""" method="post">
      <div class="form-controller col-md-6">
         <textarea rows="3" id="txtArea" name="message">Tell us your thoughts...</textarea>
         <button type="submit" class="btn btn-primary">Post</button>
      </div>
   </form>
   """),_display_(/*19.5*/views/*19.10*/.html.users.note_list(user.getNotes)),format.raw/*19.46*/("""
""")))}))
      }
    }
  }

  def render(user:models.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object user extends user_Scope0.user
              /*
                  -- GENERATED --
                  DATE: Fri Aug 28 16:15:03 AEST 2015
                  SOURCE: /home/jackson/workspace/notekeeper/app/views/users/user.scala.html
                  HASH: 88ca78a0651cf989555a457893601477d50dea80
                  MATRIX: 754->1|868->20|896->23|923->42|962->44|992->48|1091->121|1103->125|1131->133|1177->153|1189->157|1218->166|1297->218|1311->223|1365->256|1399->263|1467->304|1482->310|1531->338|1808->589|1822->594|1879->630
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6|38->7|38->7|38->7|41->10|41->10|41->10|42->11|44->13|44->13|44->13|50->19|50->19|50->19
                  -- GENERATED --
              */
          